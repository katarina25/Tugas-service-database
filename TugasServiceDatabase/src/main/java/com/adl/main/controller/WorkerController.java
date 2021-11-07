package com.adl.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.ResponseWorker;
import com.adl.main.model.WorkerModel;
import com.adl.main.repository.WorkerRepo;

@RestController
public class WorkerController<JSONArray> {
	@Autowired
	WorkerRepo WoRep;
	
	@GetMapping("/")
	public List <WorkerModel> getAllWorker() {
		
		WorkerModel worker = new WorkerModel();
		List<WorkerModel> lstWorker = WoRep.findAll();
	 	return lstWorker;
	}
	 @GetMapping("/gaji")
	  public WorkerModel getWorkerSalary(@RequestParam(value="salary") String salary) { 
		  WorkerModel worker = WoRep.getWorkerSalary(salary);
		  return worker; 
	  }
	
	  @GetMapping("/search")
	  public WorkerModel getWorkerGaji(@RequestParam(value="gaji") String salary) { 
		  WorkerModel worker = WoRep.getWorkerGaji(salary);
		  return worker; 
	  }
	 
	
	@GetMapping("/department")
	public List<WorkerModel> getAllWorkerDepar() {
		
		WorkerModel workDep = new WorkerModel();
		List<WorkerModel> lstDep = WoRep.findAll();
		return lstDep;
	}
	
	
	/*
	 * @GetMapping("/department") public ResponseEntity<String>
	 * getAllWorkerByDepar(@RequestParam(value="department") String department) {
	 * List<ResponseWorker> lstWorker = WoRep.getWorkerByDepar(department);
	 * 
	 * 
	 * for (ResponseWorker WorkerModel : lstWorker) { JSONObject obj = new
	 * JSONObject(); obj.put("firstName", WorkerModel.getFirst_name());
	 * obj.put("lastName", WorkerModel.getLast_name()); obj.put("department",
	 * WorkerModel.getDepartment()); list.put(obj); }
	 * 
	 * return
	 * ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
	 * .body(list.toString());
	 * 
	 * }
	 */
	
	@PostMapping("/all")
	public List<WorkerModel> saveManyWorker(@RequestBody List<WorkerModel> worker) {
		return WoRep.saveAll(worker);
	}
	
	@PostMapping("/")
	public WorkerModel saveWorker(@RequestBody WorkerModel worker) {
		return WoRep.save(worker);
	}
	
	@DeleteMapping("/")
	public String deleteWorker(@RequestParam("id") int worker_id) {
		WoRep.deleteById(worker_id);
		return "delete berhasil";
	}
	
	@PatchMapping("/")
	public WorkerModel updateWorkerModel(@RequestBody WorkerModel worker) {
		return WoRep.save(worker);
	}
	
	
	
}
