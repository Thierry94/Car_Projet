package com.cars.rentApp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cars.rentApp.beans.Car;
import com.cars.rentApp.beans.Person;
import com.cars.rentApp.beans.Rent;
import com.cars.rentApp.beans.Van;
import com.cars.rentApp.repository.CarRepository;
import com.cars.rentApp.repository.PersonRepository;
import com.cars.rentApp.repository.RentRepository;
import com.cars.rentApp.repository.VanRepository;

@SpringBootApplication
public class RentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, RentRepository rentRepository,
			CarRepository carRepository, VanRepository vanRepository) {
		return (args) -> {
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			//////////////////////////////////////////////////////////////////
			Date date1 = simpleDateFormat.parse("2018-09-09");
			Date date2 = simpleDateFormat.parse("2015-09-09");
			//////////////////////////////////////////////////////////////////
			Person person1 = new Person("amadou");
			Person person2 = new Person("martin");
			personRepository.save(person1);
			personRepository.save(person2);
			//////////////////////////////////////////////////////////////////
			Car car1 = new Car("12-DD-33", 5);
			car1.setPrice(5000f);
			car1.setRented(false);
			car1.setModel("Tesla");
			Car car2 = new Car("12-FF-33", 8);
			car2.setPrice(7000f);
			car2.setRented(false);
			car2.setModel("Audi");
			Van van1 = new Van("23-CC-12", 7000);
			van1.setPrice(4000f);
			van1.setRented(false);
			van1.setModel("Mercedes");
			Van van2 = new Van("23-KK-12", 8000);
			van2.setPrice(5000f);
			van2.setRented(false);
			van2.setModel("Volvo");
			carRepository.save(car1);
			vanRepository.save(van1);
			carRepository.save(car2);
			vanRepository.save(van2);
            //////////////////////////////////////////////////////////////////
			Rent rent1 = new Rent(new Date(), date1, person1);
			Rent rent2 = new Rent(new Date(), date2, person2);
			rent1.setVehicule(car1);
			rent2.setVehicule(van1);
			rentRepository.save(rent1);
			rentRepository.save(rent2);
			//////////////////////////////////////////////////////////////////
		};

	}
}
