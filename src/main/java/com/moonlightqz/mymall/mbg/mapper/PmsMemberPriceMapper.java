package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.PmsMemberPrice;
import com.moonlightqz.mymall.mbg.model.PmsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMemberPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(PmsMemberPrice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(PmsMemberPrice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    PmsMemberPrice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") PmsMemberPrice row, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") PmsMemberPrice row, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(PmsMemberPrice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(PmsMemberPrice row);
}