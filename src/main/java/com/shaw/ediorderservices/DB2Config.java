package com.shaw.ediorderservices;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = {"com.shaw.ediorderservices.persistance.db2.dao"}, 
    entityManagerFactoryRef = "db2EntityManager", 
    transactionManagerRef = "db2TransactionManager"
)
public class DB2Config 
{
    @Autowired
	private ServiceConfig config;
    
    @Bean(name = "db2EntityManager")
    public LocalContainerEntityManagerFactoryBean db2EntityManager(EntityManagerFactoryBuilder builder) 
    {
    	String[] orms = {"db2/queries.xml"};
    	
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", config.getDb2Dialect());
        properties.put("hibernate.default_schema", config.getDb2Schema());
        properties.put("hibernate.hbm2ddl.auto",config.getDb2DdlAuto());
        properties.put("hibernate.show_sql",config.getShowSql());
        properties.put("hibernate.format_sql",config.getFormatSql());
    	
    	return builder
    				.dataSource(db2DataSource())
    				.properties(properties)
    				.mappingResources(orms)
    				.packages(new String[] { "com.shaw.ediorderservices.persistance.db2.entity"
    										,"com.shaw.ediorderservices.persistance.sqlserver.entity"
    				})
    				.persistenceUnit("db2PU")
    				.build();
    }
    
    @Bean(name = "db2Datasource")
    @ConfigurationProperties(prefix = "db2.datasource")
    public DataSource db2DataSource() 
    {
    	return DataSourceBuilder.create().build();
    }
    
    @Bean(name = "db2TransactionManager")
    public PlatformTransactionManager db2TransactionManager(@Qualifier("db2EntityManager") EntityManagerFactory entityManagerFactory) 
    {
    	return new JpaTransactionManager(entityManagerFactory);
    }
    
}