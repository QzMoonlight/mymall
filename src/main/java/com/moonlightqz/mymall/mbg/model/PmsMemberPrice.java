package com.moonlightqz.mymall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsMemberPrice implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.product_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.member_level_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long memberLevelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private BigDecimal memberPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.member_level_name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private String memberLevelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.id
     *
     * @return the value of pms_member_price.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.id
     *
     * @param id the value for pms_member_price.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.product_id
     *
     * @return the value of pms_member_price.product_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.product_id
     *
     * @param productId the value for pms_member_price.product_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.member_level_id
     *
     * @return the value of pms_member_price.member_level_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.member_level_id
     *
     * @param memberLevelId the value for pms_member_price.member_level_id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.member_price
     *
     * @return the value of pms_member_price.member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.member_price
     *
     * @param memberPrice the value for pms_member_price.member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.member_level_name
     *
     * @return the value of pms_member_price.member_level_name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.member_level_name
     *
     * @param memberLevelName the value for pms_member_price.member_level_name
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
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
        sb.append(", productId=").append(productId);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}