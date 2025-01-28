package com.portbrunobraatz.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portbrunobraatz.dslist.dto.GameMinDTO;
import com.portbrunobraatz.dslist.entities.Game;
import com.portbrunobraatz.dslist.repositories.GameRepository;

//Service é o componente responsável por implementar a regra de negócio

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	
	}

	
}
