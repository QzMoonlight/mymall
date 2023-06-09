package com.moonlightqz.mymall.mbg.model;

import java.io.Serializable;

public class SmsHomeBrand implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_brand.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_brand.brand_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_brand.brand_name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private String brandName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_brand.recommend_status
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer recommendStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_brand.sort
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_home_brand
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_brand.id
     *
     * @return the value of sms_home_brand.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_brand.id
     *
     * @param id the value for sms_home_brand.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_brand.brand_id
     *
     * @return the value of sms_home_brand.brand_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_brand.brand_id
     *
     * @param brandId the value for sms_home_brand.brand_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_brand.brand_name
     *
     * @return the value of sms_home_brand.brand_name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_brand.brand_name
     *
     * @param brandName the value for sms_home_brand.brand_name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_brand.recommend_status
     *
     * @return the value of sms_home_brand.recommend_status
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_brand.recommend_status
     *
     * @param recommendStatus the value for sms_home_brand.recommend_status
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_brand.sort
     *
     * @return the value of sms_home_brand.sort
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_brand.sort
     *
     * @param sort the value for sms_home_brand.sort
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
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
        sb.append(", brandId=").append(brandId);
        sb.append(", brandName=").append(brandName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}