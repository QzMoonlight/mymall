package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.UmsResourceCategory;
import com.moonlightqz.mymall.mbg.model.UmsResourceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<UmsResourceCategory> selectByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    UmsResourceCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") UmsResourceCategory row, @Param("example") UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") UmsResourceCategory row, @Param("example") UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(UmsResourceCategory row);
}