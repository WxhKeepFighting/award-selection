package com.awardselection.team.model;

public class Awards {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awards.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awards.name
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awards.type_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private Integer typeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awards.id
     *
     * @return the value of awards.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awards.id
     *
     * @param id the value for awards.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awards.name
     *
     * @return the value of awards.name
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awards.name
     *
     * @param name the value for awards.name
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awards.type_id
     *
     * @return the value of awards.type_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awards.type_id
     *
     * @param typeId the value for awards.type_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}