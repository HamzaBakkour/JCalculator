package com.hamza.temp;
import com.hazelcast.client.config.ClientConfig;
import java.beans.BeanProperty;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
// import main.java.com.hamza.temp;


@SpringBootApplication
@EnableCaching
public class TempApplication {
	// private static final String constant = "constant";
	public static void main(String[] args) {
		SpringApplication.run(TempApplication.class, args);
	}
	@BeanProperty
	public ClientConfig hazelcastClientConfig() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getNetworkConfig().addAddress("hazelcast");
		return clientConfig;
	}
}
