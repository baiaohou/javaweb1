package com.lagou.bean;

/**
 * @author baiaohou
 * @create 2020-08-31 8:35 PM
 */
public class Student {
    private String sid;
    private String sname;
    private String sex;
    private String birthday;
    private String email;
    private String note;

    public Student() {
    }

    public Student(String sname, String sex, String birthday, String email, String note) {
        this.sname = sname;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.note = note;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String toStringRow() {
        return "<tr>" +
                "<td>" + sid + "</td>" +
                "<td>" + sname + "</td>" +
                "<td>" + sex + "</td>" +
                "<td>" + birthday + "</td>" +
                "<td>" + email + "</td>" +
                "<td>" + note + "</td>" +
                "</tr>";
    }

    public String toStringRowBold() {
        return "<tr>" +
                "<td><b><u>" + sid + "</td>" +
                "<td><b><u>" + sname + "</td>" +
                "<td><b><u>" + sex + "</td>" +
                "<td><b><u>" + birthday + "</td>" +
                "<td><b><u>" + email + "</td>" +
                "<td><b><u>" + note + "</td>" +
                "</tr>";
    }
}
