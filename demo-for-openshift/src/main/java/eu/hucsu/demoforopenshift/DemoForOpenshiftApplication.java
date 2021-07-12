package eu.hucsu.demoforopenshift;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoForOpenshiftApplication {

	Logger log = LoggerFactory.getLogger(DemoForOpenshiftApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoForOpenshiftApplication.class, args);
	}



	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "OpenShift") String name) {
		log.info("Name: "+name);
		return String.format("Hello %s!", name);
	}
}
