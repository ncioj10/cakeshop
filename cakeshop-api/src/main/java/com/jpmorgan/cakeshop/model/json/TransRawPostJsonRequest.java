/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpmorgan.cakeshop.model.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = TransactionRawDeserializer.class)
public class TransRawPostJsonRequest {


    private String data;


    /**
     * @return the raw transaction data to get
     */
    public String getData() {
        return data;
    }

    /**
     * @param data set the raw transaction data
     */
    public void setData(String data) {
        this.data = data;
    }

}
