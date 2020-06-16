package com.awardselection.team.mapper;

import com.awardselection.team.model.AwardsType;
import com.awardselection.team.model.AwardsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardsTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    long countByExample(AwardsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int deleteByExample(AwardsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int insert(AwardsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int insertSelective(AwardsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    List<AwardsType> selectByExample(AwardsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    AwardsType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") AwardsType record, @Param("example") AwardsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int updateByExample(@Param("record") AwardsType record, @Param("example") AwardsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int updateByPrimaryKeySelective(AwardsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awards_type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    int updateByPrimaryKey(AwardsType record);
}