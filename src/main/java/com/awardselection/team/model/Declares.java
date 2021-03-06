package com.awardselection.team.model;

import lombok.Data;

@Data
public class Declares {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column declares.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private Integer id;//申报id 自动生成
    private Integer comId;//申报公司id，不需要用户自己填，登录的时候已经取到了
    private Integer awardId;//要申报的奖项id 下拉列表填
    private String submission;//申报的备注
    private String attachment;//文件上传的路径
    private Integer status;//申报状态，是否审核


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column declares.id
     *
     * @return the value of declares.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column declares.id
     *
     * @param id the value for declares.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column declares.com_id
     *
     * @return the value of declares.com_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getComId() {
        return comId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column declares.com_id
     *
     * @param comId the value for declares.com_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setComId(Integer comId) {
        this.comId = comId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column declares.award_id
     *
     * @return the value of declares.award_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getAwardId() {
        return awardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column declares.award_id
     *
     * @param awardId the value for declares.award_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column declares.submission
     *
     * @return the value of declares.submission
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getSubmission() {
        return submission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column declares.submission
     *
     * @param submission the value for declares.submission
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setSubmission(String submission) {
        this.submission = submission == null ? null : submission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column declares.attachment
     *
     * @return the value of declares.attachment
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column declares.attachment
     *
     * @param attachment the value for declares.attachment
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column declares.status
     *
     * @return the value of declares.status
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column declares.status
     *
     * @param status the value for declares.status
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}