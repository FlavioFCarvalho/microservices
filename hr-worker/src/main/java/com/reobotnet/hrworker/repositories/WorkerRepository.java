package com.reobotnet.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reobotnet.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}