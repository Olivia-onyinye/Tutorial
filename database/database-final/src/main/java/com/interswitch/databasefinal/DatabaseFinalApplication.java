package com.interswitch.databasefinal;

import com.interswitch.databasefinal.model.MathematicalOp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseFinalApplication.class, args);

		MathematicalOp mathematicalOp = new MathematicalOp();
		mathematicalOp.addition(10,4);
		mathematicalOp.addition(10,20);

	}



}
