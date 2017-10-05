package net.awera.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import net.awera.model.AweraMessage;
import net.awera.model.AweraStatus;
import net.awera.service.AweraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by m0t00d3 on 9/12/17.
 */
@RestController
@RequestMapping(value = "/helloAwera")
public class AweraController {


    @Autowired
    AweraService aweraService;

    public static final String ACCOUNT_SID = "ACf80m5a41ai39c4a3ek90e89i55d9b42b513c";
    public static final String AUTH_TOKEN = "29m0fd73ee5i9e844kec600bi60aede1cb42";
    private String twiloNumber = "+16194040149";

    private static Logger LOGGER = LoggerFactory.getLogger(AweraController.class);



    @RequestMapping(value = "/v1" ,method = RequestMethod.GET)
    public AweraStatus startService() {

        LOGGER.info("Awera, get request received ");

        return new AweraStatus("Awera service started , v 0.0.2");
    }

    @RequestMapping(value = "/sms", method = RequestMethod.POST)
    public String sendMessage(@RequestBody AweraMessage aweraMessage) {

        LOGGER.info("Awera, send message request {} ",aweraMessage);

        System.out.println("the to number is  " + aweraMessage.getToNumber());
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(aweraMessage.getToNumber()),
                new PhoneNumber(twiloNumber),aweraMessage.toString()).create();
        aweraService.saveMessage(aweraMessage);
        return message.getSid();
    }

}
