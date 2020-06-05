package com.shaw.ediorderservices.hibernate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.shaw.ediorderservices.persistance.db2.dao",
        entityManagerFactoryRef = "db2EntityManagerFactory",
        transactionManagerRef= "db2TransactionManager")
public class DB2DataSourceConfiguration {

    @Bean
    @ConfigurationProperties("app.datasource.db2")
    public DataSourceProperties db2DataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.db2.configuration")
    public DataSource db2DataSource() {
        return db2DataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    @Bean(name = "db2EntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(db2DataSource())
				.mappingResources("db2/queries.xml")
				.persistenceUnit("db2PU")
                .packages("com.shaw.ediorderservices.persistance.db2.entity")
                .build();
    }

    @Bean
    public PlatformTransactionManager db2TransactionManager(
            final @Qualifier("db2EntityManagerFactory") LocalContainerEntityManagerFactoryBean db2EntityManagerFactory) {
        return new JpaTransactionManager(db2EntityManagerFactory.getObject());
    }

}
