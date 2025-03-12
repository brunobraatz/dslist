package com.portbrunobraatz.dslist.repositories;

import com.portbrunobraatz.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
