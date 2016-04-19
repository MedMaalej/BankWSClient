/**
 * CompteBancaireDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.iit.service;

public class CompteBancaireDTO  implements java.io.Serializable {
    private tn.iit.service.ClientDTO client;

    private long rib;

    private float solde;

    public CompteBancaireDTO() {
    }

    public CompteBancaireDTO(
           tn.iit.service.ClientDTO client,
           long rib,
           float solde) {
           this.client = client;
           this.rib = rib;
           this.solde = solde;
    }


    /**
     * Gets the client value for this CompteBancaireDTO.
     * 
     * @return client
     */
    public tn.iit.service.ClientDTO getClient() {
        return client;
    }


    /**
     * Sets the client value for this CompteBancaireDTO.
     * 
     * @param client
     */
    public void setClient(tn.iit.service.ClientDTO client) {
        this.client = client;
    }


    /**
     * Gets the rib value for this CompteBancaireDTO.
     * 
     * @return rib
     */
    public long getRib() {
        return rib;
    }


    /**
     * Sets the rib value for this CompteBancaireDTO.
     * 
     * @param rib
     */
    public void setRib(long rib) {
        this.rib = rib;
    }


    /**
     * Gets the solde value for this CompteBancaireDTO.
     * 
     * @return solde
     */
    public float getSolde() {
        return solde;
    }


    /**
     * Sets the solde value for this CompteBancaireDTO.
     * 
     * @param solde
     */
    public void setSolde(float solde) {
        this.solde = solde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompteBancaireDTO)) return false;
        CompteBancaireDTO other = (CompteBancaireDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            this.rib == other.getRib() &&
            this.solde == other.getSolde();
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
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        _hashCode += new Long(getRib()).hashCode();
        _hashCode += new Float(getSolde()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompteBancaireDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.iit.tn/", "compteBancaireDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.iit.tn/", "clientDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rib");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
