package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.SmsHomeNewProduct;
import com.moonlightqz.mymall.mbg.model.SmsHomeNewProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeNewProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(SmsHomeNewProduct row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(SmsHomeNewProduct row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<SmsHomeNewProduct> selectByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    SmsHomeNewProduct selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") SmsHomeNewProduct row, @Param("example") SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") SmsHomeNewProduct row, @Param("example") SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(SmsHomeNewProduct row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(SmsHomeNewProduct row);
}