package com.shaw.ediorderservices.hibernate;

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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//    basePackages = "com.shaw.ediorderservices.persistance.sqlserver.dao", 
//    entityManagerFactoryRef = "sqlEntityManager", 
//    transactionManagerRef = "sqlTransactionManager"
//)
public class H2Config 
{
    @Autowired
	private ServiceConfig config;
    
    @Primary 
    @Bean(name = "sqlEntityManager")
    public LocalContainerEntityManagerFactoryBean db2EntityManager(EntityManagerFactoryBuilder builder) 
    {
//    	String[] orms = {"db2/queries.xml"};
    	
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", config.getH2Dialect());
        properties.put("hibernate.hbm2ddl.auto", "create");
        properties.put("hibernate.default_schema", config.getSqlSchema());
        properties.put("hibernate.show_sql",config.getShowSql());
        properties.put("hibernate.format_sql",config.getFormatSql());
    	
    	return builder
    				.dataSource(sqlDataSource())
    				.properties(properties)
//    				.mappingResources(orms)
    				.packages(new String[] { "com.shaw.ediorderservices.persistance.sqlserver.entity" })
    				.persistenceUnit("sqlPU")
    				.build();
    }
    
    @Primary 
    @Bean(name = "sqlDatasource")
    @ConfigurationProperties(prefix = "h2.datasource")
    public DataSource sqlDataSource() 
    {
    	return DataSourceBuilder.create().build();
    }
    
    @Primary 
    @Bean(name = "sqlTransactionManager")
    public PlatformTransactionManager sqlTransactionManager(@Qualifier("sqlEntityManager") EntityManagerFactory entityManagerFactory) 
    {
    	return new JpaTransactionManager(entityManagerFactory);
    }
    
}