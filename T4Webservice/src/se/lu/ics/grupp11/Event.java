/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp11;

public class Event  implements java.io.Serializable {
    private int eventId;

    private java.lang.String location;

    private java.lang.String eventTime;

    private int openSlots;

    private java.lang.String note;

    private se.lu.ics.grupp11.User owner;

    private java.lang.String eventName;

    public Event() {
    }

    public Event(
           int eventId,
           java.lang.String location,
           java.lang.String eventTime,
           int openSlots,
           java.lang.String note,
           se.lu.ics.grupp11.User owner,
           java.lang.String eventName) {
           this.eventId = eventId;
           this.location = location;
           this.eventTime = eventTime;
           this.openSlots = openSlots;
           this.note = note;
           this.owner = owner;
           this.eventName = eventName;
    }


    /**
     * Gets the eventId value for this Event.
     * 
     * @return eventId
     */
    public int getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this Event.
     * 
     * @param eventId
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the location value for this Event.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Event.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the eventTime value for this Event.
     * 
     * @return eventTime
     */
    public java.lang.String getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this Event.
     * 
     * @param eventTime
     */
    public void setEventTime(java.lang.String eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the openSlots value for this Event.
     * 
     * @return openSlots
     */
    public int getOpenSlots() {
        return openSlots;
    }


    /**
     * Sets the openSlots value for this Event.
     * 
     * @param openSlots
     */
    public void setOpenSlots(int openSlots) {
        this.openSlots = openSlots;
    }


    /**
     * Gets the note value for this Event.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Event.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the owner value for this Event.
     * 
     * @return owner
     */
    public se.lu.ics.grupp11.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Event.
     * 
     * @param owner
     */
    public void setOwner(se.lu.ics.grupp11.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the eventName value for this Event.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this Event.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventId == other.getEventId() &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            this.openSlots == other.getOpenSlots() &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getEventId();
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        _hashCode += getOpenSlots();
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "Event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "EventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "EventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "OpenSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "EventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
