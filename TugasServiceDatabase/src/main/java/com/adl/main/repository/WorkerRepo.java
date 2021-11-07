package com.adl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adl.main.model.WorkerModel;

@Repository
public interface WorkerRepo extends JpaRepository<WorkerModel, Integer> {

	@Query(value="SELECT department, count(first_name) as jumlah from worker group by department = ?1",nativeQuery = true)
	WorkerModel getAllWorkerDepar(String department);
	
	@Query(value="SELECT first_name,last_name,salary from worker where salary in (select salary from worker group by salary having count(*)>1) = ?1",nativeQuery = true)
	WorkerModel getWorkerGaji(String salary);
	
	@Query(value="select * from worker order by salary desc limit 5 = ?1",nativeQuery = true)
	WorkerModel getWorkerSalary(String salary);
}
