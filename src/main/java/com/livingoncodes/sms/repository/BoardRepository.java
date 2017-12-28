package com.livingoncodes.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livingoncodes.sms.entity.Board;

public interface BoardRepository extends JpaRepository<Board ,Long> {

	public Board findByName(String name);
	
}

