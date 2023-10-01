package com.groupomar.facturadigital;

import com.groupomar.facturadigital.models.service.UploadFileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturaDigitalApplication implements CommandLineRunner {

	@Autowired
	UploadFileServiceImpl uploadFileService;
	public static void main(String[] args) {
		SpringApplication.run(FacturaDigitalApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		uploadFileService.deleteAll();
		uploadFileService.init();
	}
}
