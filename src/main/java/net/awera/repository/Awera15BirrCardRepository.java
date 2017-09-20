package net.awera.repository;

import net.awera.model.Awera15BirrCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by m0t00d3 on 9/19/17.
 */
@Repository
public interface Awera15BirrCardRepository  extends JpaRepository<Awera15BirrCard, Integer>{

    List<Awera15BirrCard> findAll();

    Awera15BirrCard findByCardId(int id);

    Awera15BirrCard save(Awera15BirrCard card);

    //int update(Awera15BirrCard card);


}
