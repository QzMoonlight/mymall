package com.moonlightqz.mymall.mbg.mapper;

import com.moonlightqz.mymall.mbg.model.PmsAlbum;
import com.moonlightqz.mymall.mbg.model.PmsAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    long countByExample(PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByExample(PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insert(PmsAlbum row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int insertSelective(PmsAlbum row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    List<PmsAlbum> selectByExample(PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    PmsAlbum selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExampleSelective(@Param("row") PmsAlbum row, @Param("example") PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByExample(@Param("row") PmsAlbum row, @Param("example") PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKeySelective(PmsAlbum row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Wed May 10 16:50:35 CST 2023
     */
    int updateByPrimaryKey(PmsAlbum row);
}