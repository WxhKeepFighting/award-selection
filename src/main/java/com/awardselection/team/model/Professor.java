package com.awardselection.team.model;

public class Professor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column professor.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column professor.name
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column professor.type_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column professor.account
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column professor.password
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column professor.id
     *
     * @return the value of professor.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column professor.id
     *
     * @param id the value for professor.id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column professor.name
     *
     * @return the value of professor.name
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column professor.name
     *
     * @param name the value for professor.name
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column professor.type_id
     *
     * @return the value of professor.type_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column professor.type_id
     *
     * @param typeId the value for professor.type_id
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column professor.account
     *
     * @return the value of professor.account
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column professor.account
     *
     * @param account the value for professor.account
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column professor.password
     *
     * @return the value of professor.password
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column professor.password
     *
     * @param password the value for professor.password
     *
     * @mbg.generated Mon Jun 15 21:02:33 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}