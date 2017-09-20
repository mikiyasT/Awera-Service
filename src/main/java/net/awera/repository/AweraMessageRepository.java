package net.awera.repository;

import net.awera.model.Awera15BirrCard;
import net.awera.model.AweraMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by m0t00d3 on 9/19/17.
 */
@Repository
public interface AweraMessageRepository extends JpaRepository<AweraMessage,Integer> {


    List<AweraMessage> findAll();

    AweraMessage findByMessageId(int id);

    AweraMessage save(AweraMessage message);

    //int update(AweraMessage message);

    void delete(int id);

}
