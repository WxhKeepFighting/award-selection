package com.awardselection.team.model;

public class AwardsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awards_type.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awards_type.type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awards_type.id
     *
     * @return the value of awards_type.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awards_type.id
     *
     * @param id the value for awards_type.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awards_type.type
     *
     * @return the value of awards_type.type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awards_type.type
     *
     * @param type the value for awards_type.type
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}