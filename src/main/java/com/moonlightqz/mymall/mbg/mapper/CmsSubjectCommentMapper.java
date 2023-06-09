package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.CmsSubjectComment;
import com.moonlightqz.mymall.mbg.model.CmsSubjectCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(CmsSubjectComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(CmsSubjectComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<CmsSubjectComment> selectByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    CmsSubjectComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") CmsSubjectComment row, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") CmsSubjectComment row, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(CmsSubjectComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(CmsSubjectComment row);
}