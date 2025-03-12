package com.portbrunobraatz.dslist.repositories;

import com.portbrunobraatz.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
