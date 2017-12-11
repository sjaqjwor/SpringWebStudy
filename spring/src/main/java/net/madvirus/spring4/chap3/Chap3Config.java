package net.madvirus.spring4.chap3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;

@Configuration
//@ImportResource("classpath:config.xml")
public class Chap3Config {

	@Bean
	@Qualifier("order")
	public SearchClientFactoryBean order(){
	SearchClientFactoryBean scfb = new SearchClientFactoryBean();
	scfb.setServer("10.20.30.40");
	scfb.setContentTpye("json");
	scfb.setPort(8080);
	return scfb;

	}



	@Bean
	@Qualifier("order1")
	public SearchClientFactoryBean order1(){
		SearchClientFactoryBean scfb = new SearchClientFactoryBean();
		scfb.setServer("10.20.30.40");
		scfb.setContentTpye("json");
		scfb.setPort(8080);
		return scfb;

	}

}
