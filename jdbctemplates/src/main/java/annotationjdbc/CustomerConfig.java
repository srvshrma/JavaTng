package annotationjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="annotationjdbc")
public class CustomerConfig {
	@Bean
	public DataSource dataSource() {
		
		return new DriverManagerDataSource("jdbc:h2:tcp://localhost/~/test","sa","");
		
		
	}
	@Bean
	public JdbcTemplate jt(DataSource dataSource) {
		return new JdbcTemplate(dataSource());
		
	}

}
