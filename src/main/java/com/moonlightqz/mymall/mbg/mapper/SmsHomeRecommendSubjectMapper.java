package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.SmsHomeRecommendSubject;
import com.moonlightqz.mymall.mbg.model.SmsHomeRecommendSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeRecommendSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(SmsHomeRecommendSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(SmsHomeRecommendSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<SmsHomeRecommendSubject> selectByExample(SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") SmsHomeRecommendSubject row, @Param("example") SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") SmsHomeRecommendSubject row, @Param("example") SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(SmsHomeRecommendSubject row);
}