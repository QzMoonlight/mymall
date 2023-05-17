package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.OmsCartItem;
import com.moonlightqz.mymall.mbg.model.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(OmsCartItem row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(OmsCartItem row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    OmsCartItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") OmsCartItem row, @Param("example") OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") OmsCartItem row, @Param("example") OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(OmsCartItem row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(OmsCartItem row);
}