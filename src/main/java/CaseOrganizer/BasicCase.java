package app.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


class DateAdapter extends XmlAdapter <String, Date> {
    private final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public Date unmarshal (String xml) throws Exception {
        return dateFormat.parse(xml);
    }

    @Override
    public String marshal (Date object) throws Exception {
        return dateFormat.format(object);
    }

}


@XmlRootElement(name = "case")
@XmlAccessorType(XmlAccessType.FIELD)
public class BasicCase {

    Boolean isPriority = false;
    Boolean isActive = false;
    Boolean isArchived = false;
    Boolean isPending = false;

    String company;
    String from;
    String concerning;
    String inspectionPeriod;
    String plannedEndDate;
    String caseNumber;
    String letterNumber;
    String correspondenceDescription;
    String remaining;
    String deliveryMethod;
    String plannedReplyDate;
    String deliveryConfirmation;
    String hearing;
    String comments;

    @XmlJavaTypeAdapter(DateAdapter.class)
    Date dateReceived;
    Integer replyDeadline;

    @XmlElementWrapper(name = "links")
    @XmlElement(name = "link")
    List<String> links = new ArrayList<String>();


    public BasicCase () { }


    public void setCompany (String company) {
        this.company = company;
    }

    public String getCompany () {
        return company;
    }


    public void setFrom (String from) {
        this.from = from;
    }

    public String getFrom () {
        return from;
    }


    public void setConcerning (String concerning) {
        this.concerning = concerning;
    }

    public String getConcerning () {
        return concerning;
    }


    public void setInspectionPeriod (String inspectionPeriod) {
        this.inspectionPeriod = inspectionPeriod;
    }

    public String getInspectionPeriod () {
        return inspectionPeriod;
    }


    public void setPlannedEndDate (String plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public String getPlannedEndDate () {
        return plannedEndDate;
    }


    public void setCaseNumber (String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getCaseNumber () {
        return caseNumber;
    }


    public void setLetterNumber (String letterNumber) {
        this.letterNumber = letterNumber;
    }

    public String getLetterNumber () {
        return letterNumber;
    }


    public void setCorrespondenceDescription (String correspondenceDescription) {
        this.correspondenceDescription = correspondenceDescription;
    }

    public String getCorrespondenceDescription () {
        return correspondenceDescription;
    }


    public void setRemaining (String remaining) {
        this.remaining = remaining;
    }

    public String getRemaining () {
        return remaining;
    }


    public void setDeliveryMethod (String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryMethod () {
        return deliveryMethod;
    }


    public void setPlannedReplyDate (String plannedReplyDate) {
        this.plannedReplyDate = plannedReplyDate;
    }

    public String getPlannedReplyDate () {
        return plannedReplyDate;
    }


    public void setDeliveryConfirmation (String deliveryConfirmation) {
        this.deliveryConfirmation = deliveryConfirmation;
    }

    public String getDeliveryConfirmation () {
        return deliveryConfirmation;
    }


    public void setHearing (String hearing) {
        this.hearing = hearing;
    }

    public String getHearing () {
        return hearing;
    }


    public void setComments (String comments) {
        this.comments = comments;
    }

    public String getComments () {
        return comments;
    }


    public void setDateReceived (Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Date getDateReceived () {
        return dateReceived;
    }


    public void setReplyDeadline (Integer replyDeadline) {
        this.replyDeadline = replyDeadline;
    }

    public Integer getReplyDeadline () {
        return replyDeadline;
    }


    public void setLinks (List<String> links) {
        this.links = links;
    }

    public List<String> getLinks () {
        return links;
    }

}
