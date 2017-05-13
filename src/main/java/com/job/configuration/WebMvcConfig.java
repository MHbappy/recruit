package com.job.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.persistence.EntityManagerFactory;

@Configuration
public class WebMvcConfig {

//	@Autowired
//	private EntityManagerFactory entityManagerFactory;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

//		@Bean
//		public SessionFactory getSessionFactory() {
//			if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
//				throw new NullPointerException("factory is not a hibernate factory");
//			}
//			return entityManagerFactory.unwrap(SessionFactory.class);
//		}

}