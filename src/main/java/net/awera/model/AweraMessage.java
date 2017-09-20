package net.awera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by m0t00d3 on 9/13/17.
 */

@Entity
@Table(name = "AweraMessage")
public class AweraMessage {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "message_id")
    private int messageId;

    @Column(name = "to_number")
    private String toNumber;

    @Column(name = "message")
    private String shortMessage;

    @Column(name = "card_no")
    private String cardNumber;

    public AweraMessage() {

    }

    public AweraMessage(String shortMessage, String cardNumber, String toNumber) {
        this.toNumber = toNumber;
        this.shortMessage = shortMessage;
        this.cardNumber = cardNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return shortMessage + " - " + cardNumber;
    }
}
