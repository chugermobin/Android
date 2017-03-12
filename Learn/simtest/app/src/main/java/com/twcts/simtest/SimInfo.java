/*
 * Copyright (c) 2016.
 *  諸葛魔斌科技創作室 版權所有
 *  ChuGerMoBin Technology Creative Studio All Rights Reserved.
 */

package com.twcts.simtest;

/**
 * Created by chugermobin on 2016/10/19.
 */

public class SimInfo {
    private int id_;
    private String display_name;
    private String icc_id;
    private int slot;

    public SimInfo(int id_, String display_name, String icc_id, int slot) {
        this.id_ = id_;
        this.display_name = display_name;
        this.icc_id = icc_id;
        this.slot = slot;
    }

    public int getId_() {
        return id_;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public String getIcc_id() {
        return icc_id;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "SimInfo{" +
                "id_=" + id_ +
                ", display_name='" + display_name + '\'' +
                ", icc_id='" + icc_id + '\'' +
                ", slot=" + slot +
                '}';
    }
}
