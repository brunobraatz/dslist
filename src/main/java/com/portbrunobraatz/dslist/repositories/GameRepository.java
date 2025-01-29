package com.portbrunobraatz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portbrunobraatz.dslist.entities.Game;

//Repository é o objeto responsável por fazer consultas no banco de dados
public interface GameRepository extends JpaRepository<Game, Long>{

}
