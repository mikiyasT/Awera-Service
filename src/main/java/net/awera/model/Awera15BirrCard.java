package net.awera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by m0t00d3 on 9/19/17.
 */
@Entity
@Table(name="15_birr_card_table")
public class Awera15BirrCard {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Card_Id")
    private Long cardId;

    @Column(name = "Card_no")
    private String cardNumber;

    @Column(name = "Used")
    private String used;

    @Column(name = "status")
    private String status;

    @Column(name = "used_at")
    private Date usedAt;

    @Column(name = "handlingStation")
    private String handlingStation;


    public Awera15BirrCard() {

    }

    public Awera15BirrCard(String cardNumber, String used, String status, Date usedAt, String handlingStation) {
        this.cardNumber = cardNumber;
        this.used = used;
        this.status = status;
        this.usedAt = usedAt;
        this.handlingStation = handlingStation;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUsedAt() {
        return usedAt;
    }

    public void setUsedAt(Date usedAt) {
        this.usedAt = usedAt;
    }

    public String getHandlingStation() {
        return handlingStation;
    }

    public void setHandlingStation(String handlingStation) {
        this.handlingStation = handlingStation;
    }
}
