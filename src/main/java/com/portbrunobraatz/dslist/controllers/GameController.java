package com.portbrunobraatz.dslist.controllers;

import com.portbrunobraatz.dslist.DTO.GameMinDTO;
import com.portbrunobraatz.dslist.entities.Game;
import com.portbrunobraatz.dslist.sevices.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
