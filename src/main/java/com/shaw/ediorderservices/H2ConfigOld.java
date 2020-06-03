package com.shaw.ediorderservices;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

//@Configuration
public class H2ConfigOld {

    @Primary 
    @Bean(name = "h2Datasource")
    public DataSource h2DataSource() {
      return new EmbeddedDatabaseBuilder()
              .setType(EmbeddedDatabaseType.H2)
              .build();
  }

    @Primary 
    @Bean(name = "h2FactoryBean")
    public LocalContainerEntityManagerFactoryBean factoryBean() {
      LocalContainerEntityManagerFactoryBean factory =
              new LocalContainerEntityManagerFactoryBean();
      factory.setDataSource(h2DataSource());
      factory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
      //comment the following line if you want to use default META-INF/persistence.xml
//      factory.setPersistenceXmlLocation("db2/queries.xml");
      Properties properties = new Properties();
      properties.setProperty("javax.persistence.schema-generation.database.action", "create");
      factory.setJpaProperties(properties);
      return factory;
  }
}