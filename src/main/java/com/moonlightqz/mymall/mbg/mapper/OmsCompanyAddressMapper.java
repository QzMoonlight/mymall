package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.OmsCompanyAddress;
import com.moonlightqz.mymall.mbg.model.OmsCompanyAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCompanyAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(OmsCompanyAddress row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(OmsCompanyAddress row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<OmsCompanyAddress> selectByExample(OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    OmsCompanyAddress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") OmsCompanyAddress row, @Param("example") OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") OmsCompanyAddress row, @Param("example") OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(OmsCompanyAddress row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(OmsCompanyAddress row);
}