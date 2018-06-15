/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author DAM
 */
public class User {
    private String username;
    private String pass;
    private int age;

    public User() {
    }

    public User(String username, String pass, int age) {
        this.username = username;
        this.pass = pass;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", pass=" + pass + ", age=" + age + '}';
    }
}
