package net.awera.service;

import net.awera.model.Awera15BirrCard;
import net.awera.model.AweraMessage;
import net.awera.repository.Awera15BirrCardRepository;
import net.awera.repository.AweraMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by m0t00d3 on 9/19/17.
 */
@Service
public class AweraServiceImpl implements AweraService {


    @Autowired
    Awera15BirrCardRepository cardRepository;

    @Autowired
    AweraMessageRepository messageRepository;


    @Override
    public Awera15BirrCard find15BirrCardById(int id) {
        return cardRepository.findByCardId(id);
    }

    @Override
    public Awera15BirrCard save15BirrCard(Awera15BirrCard card) {
        return cardRepository.save(card);
    }

   /* @Override
    public int update15BirrCard(Awera15BirrCard card) {
        return cardRepository.update(card);
    }*/

    @Override
    public AweraMessage findMessageById(int id) {
        return messageRepository.findByMessageId(id);
    }

    @Override
    public AweraMessage saveMessage(AweraMessage message) {
        return messageRepository.save(message);
    }

   /* @Override
    public int updateMessage(AweraMessage message) {
        return messageRepository.update(message);
    }*/
}
