package com.example.EmployeeManagementSystem;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
public class DataSourceConfig {

	@SuppressWarnings("unchecked")
	@Bean
	public EntityManagerFactoryBuilder entityManagerFactoryBuilder(@Qualifier("dataSource1") DataSource dataSource) {
		return new EntityManagerFactoryBuilder(new HibernateJpaVendorAdapter(), (Map<String, ?>) dataSource, null);
	}

	@Primary
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier("dataSource1") DataSource dataSource,
			EntityManagerFactoryBuilder builder) {
		return builder.dataSource(dataSource).packages("com.example.EmployeeManagementSystem")
				.persistenceUnit("primary").build();
	}

	@Primary
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

	@Bean(name = "dataSource1")
	public DataSource dataSource1() {
		return DataSourceBuilder.create().url("jdbc:h2:mem:testdb1").username("sa").password("")
				.driverClassName("org.h2.Driver").build();
	}

	@Bean(name = "dataSource2")
	public DataSource dataSource2() {
		return DataSourceBuilder.create().url("jdbc:h2:mem:testdb2").username("sa").password("")
				.driverClassName("org.h2.Driver").build();
	}

	@Bean(name = "jdbcTemplate1")
	public JdbcTemplate jdbcTemplate1(@Qualifier("dataSource1") DataSource ds) {
		return new JdbcTemplate(ds);
	}

	@Bean(name = "jdbcTemplate2")
	public JdbcTemplate jdbcTemplate2(@Qualifier("dataSource2") DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
