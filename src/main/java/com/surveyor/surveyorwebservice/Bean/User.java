package com.surveyor.surveyorwebservice.Bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @param: none
 * @description: 对应数据表的User类
 * @author: KingJ
 * @create: 2018-11-17 17:01
 **/
@Entity
@Data
@Table(name = "user")
public class User {

    /* 用户ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    /* 用户名 */
    @Column(name = "name")
    private String name;

    /* 用户密码 */
    @Column(name = "password")
    private String password;

    /* 手机号 */
    @Column(name = "phone_number")
    private String phoneNumber;

    /* 邮箱 */
    @Column(name = "email")
    private String email;

    @Column(name = "order_id")
    private int orderId;

    public User(){
    }


    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

}
