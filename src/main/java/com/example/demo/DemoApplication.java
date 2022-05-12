package com.example.demo;

import com.example.demo.train.Train;
import com.example.demo.train.TrainService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(TrainService trainService){
		return args -> {
			ObjectMapper mapper =  new ObjectMapper();
			InputStream inputStream = TypeReference.class.getResourceAsStream("/trains.json");
			try{
				List<Train> trains = mapper.readValue(inputStream,new TypeReference<List<Train>>(){});
				trainService.save(trains);
				System.out.println("Trains Save");
			} catch(IOException e){
				System.out.println("Usable save " + e.getMessage());
		}
	};
	}
}
