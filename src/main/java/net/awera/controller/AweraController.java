package net.awera.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import net.awera.model.AweraMessage;
import net.awera.service.AweraService;
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

    public static final String ACCOUNT_SID = "ACf805a41a39c4a3e90e8955d9b42b513c";
    public static final String AUTH_TOKEN = "290fd73ee59e844ec600b60aede1cb42";
    private String twiloNumber = "+16194040149";


    @RequestMapping(value = "/v1" ,method = RequestMethod.GET)
    public String startService() {

        return "Awera service started , v 0.0.1";
    }

    @RequestMapping(value = "/sms", method = RequestMethod.POST)
    public String sendMessage(@RequestBody AweraMessage aweraMessage) {

        System.out.println("the to number is  " + aweraMessage.getToNumber());
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(aweraMessage.getToNumber()),
                new PhoneNumber(twiloNumber),aweraMessage.toString()).create();
        aweraService.saveMessage(aweraMessage);
        return message.getSid();
    }

}
