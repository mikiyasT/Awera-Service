package net.awera.service;

import net.awera.model.Awera15BirrCard;
import net.awera.model.AweraMessage;
import org.springframework.stereotype.Service;

/**
 * Created by m0t00d3 on 9/19/17.
 */
@Service
public interface AweraService {

    Awera15BirrCard find15BirrCardById(int id);

    Awera15BirrCard save15BirrCard(Awera15BirrCard card);

    //int update15BirrCard(Awera15BirrCard message);

    AweraMessage findMessageById(int id);

    AweraMessage saveMessage(AweraMessage message);

    //int updateMessage(AweraMessage message);

}
