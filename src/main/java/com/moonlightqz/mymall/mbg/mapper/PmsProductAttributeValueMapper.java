package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.PmsProductAttributeValue;
import com.moonlightqz.mymall.mbg.model.PmsProductAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(PmsProductAttributeValue row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(PmsProductAttributeValue row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<PmsProductAttributeValue> selectByExample(PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    PmsProductAttributeValue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") PmsProductAttributeValue row, @Param("example") PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") PmsProductAttributeValue row, @Param("example") PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(PmsProductAttributeValue row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(PmsProductAttributeValue row);
}