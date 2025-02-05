package com.portbrunobraatz.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portbrunobraatz.dslist.dto.GameMinDTO;
import com.portbrunobraatz.dslist.entities.Game;
import com.portbrunobraatz.dslist.services.GameService;

@RestController	
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;	
	}

}
