package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.PmsProductAttribute;
import com.moonlightqz.mymall.mbg.model.PmsProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(PmsProductAttribute row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(PmsProductAttribute row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    PmsProductAttribute selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") PmsProductAttribute row, @Param("example") PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") PmsProductAttribute row, @Param("example") PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(PmsProductAttribute row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(PmsProductAttribute row);
}