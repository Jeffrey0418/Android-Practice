package com.a116042018022.greendao.entity.greendao;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "CET4_ENTITY".
 */
@Entity
public class CET4Entity {

    @Id(autoincrement = true)
    private Long id;
    private String word;
    private String english;
    private String china;
    private String sign;

    @Generated(hash = 413105732)
    public CET4Entity() {
    }

    public CET4Entity(Long id) {
        this.id = id;
    }

    @Generated(hash = 1296110788)
    public CET4Entity(Long id, String word, String english, String china, String sign) {
        this.id = id;
        this.word = word;
        this.english = english;
        this.china = china;
        this.sign = sign;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChina() {
        return china;
    }

    public void setChina(String china) {
        this.china = china;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}
