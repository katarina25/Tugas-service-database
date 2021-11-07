package com.adl.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "bonus")
public class BonusModel {

	@Id	
	private int workerRefId;
	
	private LocalDateTime Bonus_Date;
	private int Bonus_Amount;
	
	
}
