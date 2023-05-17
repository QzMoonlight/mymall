package com.moonlightqz.mymall.mbg.model;

import java.io.Serializable;

public class PmsProductAttributeCategory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute_category.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute_category.name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute_category.attribute_count
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer attributeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute_category.param_count
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer paramCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_attribute_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.id
     *
     * @return the value of pms_product_attribute_category.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.id
     *
     * @param id the value for pms_product_attribute_category.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.name
     *
     * @return the value of pms_product_attribute_category.name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.name
     *
     * @param name the value for pms_product_attribute_category.name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.attribute_count
     *
     * @return the value of pms_product_attribute_category.attribute_count
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.attribute_count
     *
     * @param attributeCount the value for pms_product_attribute_category.attribute_count
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.param_count
     *
     * @return the value of pms_product_attribute_category.param_count
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getParamCount() {
        return paramCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.param_count
     *
     * @param paramCount the value for pms_product_attribute_category.param_count
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attributeCount=").append(attributeCount);
        sb.append(", paramCount=").append(paramCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}