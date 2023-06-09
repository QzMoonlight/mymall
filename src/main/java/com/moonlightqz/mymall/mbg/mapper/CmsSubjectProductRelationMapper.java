package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.CmsSubjectProductRelation;
import com.moonlightqz.mymall.mbg.model.CmsSubjectProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(CmsSubjectProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(CmsSubjectProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<CmsSubjectProductRelation> selectByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") CmsSubjectProductRelation row, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") CmsSubjectProductRelation row, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(CmsSubjectProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(CmsSubjectProductRelation row);
}