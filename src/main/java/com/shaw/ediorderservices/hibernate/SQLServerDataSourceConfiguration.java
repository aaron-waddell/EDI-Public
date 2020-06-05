package com.shaw.ediorderservices.hibernate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shaw.ediorderservices.persistance.AuditorAwareImpl;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
@EnableJpaRepositories(basePackages = "com.shaw.ediorderservices.persistance.sqlserver.dao",
        entityManagerFactoryRef = "sqlEntityManagerFactory",
        transactionManagerRef= "sqlTransactionManager")
public class SQLServerDataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.sql")
    public DataSourceProperties sqlDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.sql.configuration")
    public DataSource sqlDataSource() {
        return sqlDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    @Bean(name = "sqlEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean sqlEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(sqlDataSource())
				.persistenceUnit("sqlPU")
                .packages("com.shaw.ediorderservices.persistance.sqlserver.entity")
                .build();
    }

    @Bean
    @Primary
    public PlatformTransactionManager sqlTransactionManager(
            final @Qualifier("sqlEntityManagerFactory") LocalContainerEntityManagerFactoryBean sqlEntityManagerFactory) {
        return new JpaTransactionManager(sqlEntityManagerFactory.getObject());
    }

    @Bean
    AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }

}
