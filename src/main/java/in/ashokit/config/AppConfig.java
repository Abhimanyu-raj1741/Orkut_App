package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.util.AppSecurity;

@Configuration
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("AppConfig :: Constructor ");
	}
	@Bean
	public AppSecurity security() {
		AppSecurity se = new AppSecurity();
		// logic 
		return se;
	}
}
