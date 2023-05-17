package com.moonlightqz.mymall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberRuleSetting implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.continue_sign_day
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer continueSignDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.continue_sign_point
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer continueSignPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.consume_per_point
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private BigDecimal consumePerPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.low_order_amount
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private BigDecimal lowOrderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.max_point_per_order
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer maxPointPerOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_rule_setting.type
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_rule_setting
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.id
     *
     * @return the value of ums_member_rule_setting.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.id
     *
     * @param id the value for ums_member_rule_setting.id
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.continue_sign_day
     *
     * @return the value of ums_member_rule_setting.continue_sign_day
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.continue_sign_day
     *
     * @param continueSignDay the value for ums_member_rule_setting.continue_sign_day
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.continue_sign_point
     *
     * @return the value of ums_member_rule_setting.continue_sign_point
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.continue_sign_point
     *
     * @param continueSignPoint the value for ums_member_rule_setting.continue_sign_point
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.consume_per_point
     *
     * @return the value of ums_member_rule_setting.consume_per_point
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.consume_per_point
     *
     * @param consumePerPoint the value for ums_member_rule_setting.consume_per_point
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.low_order_amount
     *
     * @return the value of ums_member_rule_setting.low_order_amount
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.low_order_amount
     *
     * @param lowOrderAmount the value for ums_member_rule_setting.low_order_amount
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.max_point_per_order
     *
     * @return the value of ums_member_rule_setting.max_point_per_order
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.max_point_per_order
     *
     * @param maxPointPerOrder the value for ums_member_rule_setting.max_point_per_order
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_rule_setting.type
     *
     * @return the value of ums_member_rule_setting.type
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_rule_setting.type
     *
     * @param type the value for ums_member_rule_setting.type
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_rule_setting
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
        sb.append(", continueSignDay=").append(continueSignDay);
        sb.append(", continueSignPoint=").append(continueSignPoint);
        sb.append(", consumePerPoint=").append(consumePerPoint);
        sb.append(", lowOrderAmount=").append(lowOrderAmount);
        sb.append(", maxPointPerOrder=").append(maxPointPerOrder);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}