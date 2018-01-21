//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.02 at 09:10:35 AM CEST 
//


package io.cloudtrust.keycloak.liquibaseAdapter.pojo.liquibase;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.liquibase.org/xml/ns/dbchangelog}tableNameAttribute"/>
 *       &lt;attribute name="columnNames" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="constraintName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tablespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disabled" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *       &lt;attribute name="deferrable" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *       &lt;attribute name="initiallyDeferred" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "addUniqueConstraint")
public class AddUniqueConstraint {

    @XmlAttribute(name = "columnNames", required = true)
    protected String columnNames;
    @XmlAttribute(name = "constraintName")
    protected String constraintName;
    @XmlAttribute(name = "tablespace")
    protected String tablespace;
    @XmlAttribute(name = "disabled")
    protected String disabled;
    @XmlAttribute(name = "deferrable")
    protected String deferrable;
    @XmlAttribute(name = "initiallyDeferred")
    protected String initiallyDeferred;
    @XmlAttribute(name = "catalogName")
    protected String catalogName;
    @XmlAttribute(name = "schemaName")
    protected String schemaName;
    @XmlAttribute(name = "tableName", required = true)
    protected String tableName;

    /**
     * Gets the value of the columnNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnNames() {
        return columnNames;
    }

    /**
     * Sets the value of the columnNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnNames(String value) {
        this.columnNames = value;
    }

    /**
     * Gets the value of the constraintName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * Sets the value of the constraintName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintName(String value) {
        this.constraintName = value;
    }

    /**
     * Gets the value of the tablespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTablespace() {
        return tablespace;
    }

    /**
     * Sets the value of the tablespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTablespace(String value) {
        this.tablespace = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabled(String value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the deferrable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferrable() {
        return deferrable;
    }

    /**
     * Sets the value of the deferrable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferrable(String value) {
        this.deferrable = value;
    }

    /**
     * Gets the value of the initiallyDeferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiallyDeferred() {
        return initiallyDeferred;
    }

    /**
     * Sets the value of the initiallyDeferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiallyDeferred(String value) {
        this.initiallyDeferred = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

}
