package net.zt.funcode.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import net.zt.funcode.components.lifecycle.TestBFPP;

@Configuration
@ComponentScan({"net.zt.funcode.components", "net.zt.funcode.components.lifecycle"})
public class AppConfig {
	
	

}
