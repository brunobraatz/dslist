package com.portbrunobraatz.dslist.sevices;

import com.portbrunobraatz.dslist.DTO.GameDTO;
import com.portbrunobraatz.dslist.DTO.GameMinDTO;
import com.portbrunobraatz.dslist.entities.Game;
import com.portbrunobraatz.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
}
