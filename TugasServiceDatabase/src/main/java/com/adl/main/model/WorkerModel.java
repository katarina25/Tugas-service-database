package com.adl.main.model;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "worker")
public class WorkerModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int worker_id;
	
	private String First_name;
	private String Last_name;
	private int salary;
	private LocalDateTime Joining_date;
	private String department;
	
}
