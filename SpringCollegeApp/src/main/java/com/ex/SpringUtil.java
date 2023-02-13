package com.ex;

import java.util.Properties;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.ex")
@EnableWebMvc
public class SpringUtil {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/practice");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(getDataSource());
		Properties pr=new Properties();
		pr.put("hibernate.show_sql", "true");
		pr.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		pr.put("hibernate.hbm2ddl.auto", "update");
		lsf.setHibernateProperties(pr);
		lsf.setAnnotatedClasses(College.class);
		return lsf;
	}
}
