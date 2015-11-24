/**
 * CtConDlgRIG4Rq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.com.grupobbva.pf.rig4;

public class CtConDlgRIG4Rq  implements java.io.Serializable {
    private pe.com.grupobbva.xsd.ps9.CtHeaderRq header;

    private pe.com.grupobbva.pf.rig4.CtBodyRq data;

    public CtConDlgRIG4Rq() {
    }

    public CtConDlgRIG4Rq(
           pe.com.grupobbva.xsd.ps9.CtHeaderRq header,
           pe.com.grupobbva.pf.rig4.CtBodyRq data) {
           this.header = header;
           this.data = data;
    }


    /**
     * Gets the header value for this CtConDlgRIG4Rq.
     * 
     * @return header
     */
    public pe.com.grupobbva.xsd.ps9.CtHeaderRq getHeader() {
        return header;
    }


    /**
     * Sets the header value for this CtConDlgRIG4Rq.
     * 
     * @param header
     */
    public void setHeader(pe.com.grupobbva.xsd.ps9.CtHeaderRq header) {
        this.header = header;
    }


    /**
     * Gets the data value for this CtConDlgRIG4Rq.
     * 
     * @return data
     */
    public pe.com.grupobbva.pf.rig4.CtBodyRq getData() {
        return data;
    }


    /**
     * Sets the data value for this CtConDlgRIG4Rq.
     * 
     * @param data
     */
    public void setData(pe.com.grupobbva.pf.rig4.CtBodyRq data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CtConDlgRIG4Rq)) return false;
        CtConDlgRIG4Rq other = (CtConDlgRIG4Rq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CtConDlgRIG4Rq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobbva.com.pe/pf/rig4/", "ctConDlgRIG4Rq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupobbva.com.pe/pf/rig4/", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobbva.com.pe/xsd/ps9/", "ctHeaderRq"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupobbva.com.pe/pf/rig4/", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobbva.com.pe/pf/rig4/", "ctBodyRq"));
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
