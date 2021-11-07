package com.adl.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "title")
public class TitleModel {

	@Id
	private int workerRefId;
	
	private String workerTitle;
	private LocalDateTime AffectedFrom;
	
}
