package edu.aspire.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages="edu.aspire.daos")
public class SpringJdbcConfig {
	/*@Bean
	public DataSource dataSource() { //auto configured by spring boot
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("manager");
		bds.setInitialSize(10);
		bds.setMaxActive(15);
		return bds;
	}*/

	/*@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) { //auto configured by spring boot
		return new JdbcTemplate(ds);
	}*/
	
	/*@Bean(name = "empdao" )
	public EmployeeDao empDao(){ //autodiscovered by spring
		return new EmployeeDaoImpl();
	}*/
}
