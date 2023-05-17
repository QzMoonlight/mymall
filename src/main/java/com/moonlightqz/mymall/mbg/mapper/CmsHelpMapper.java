package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.CmsHelp;
import com.moonlightqz.mymall.mbg.model.CmsHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(CmsHelp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(CmsHelp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<CmsHelp> selectByExampleWithBLOBs(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<CmsHelp> selectByExample(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    CmsHelp selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") CmsHelp row, @Param("example") CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("row") CmsHelp row, @Param("example") CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") CmsHelp row, @Param("example") CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(CmsHelp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(CmsHelp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(CmsHelp row);
}