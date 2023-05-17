package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.CmsHelpCategory;
import com.moonlightqz.mymall.mbg.model.CmsHelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(CmsHelpCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(CmsHelpCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    CmsHelpCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") CmsHelpCategory row, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") CmsHelpCategory row, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(CmsHelpCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(CmsHelpCategory row);
}