package net.awera.model;

/**
 * Created by m0t00d3 on 9/13/17.
 */

public class AweraMessage {

    private String toNumber;
    private String shortMessage;
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
