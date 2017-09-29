package com.jpmorgan.cakeshop.model;

import com.jpmorgan.cakeshop.error.APIException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectRawTransactionRequest {





    private final String data;



    public DirectRawTransactionRequest(String data) throws APIException {

        this.data = data;


    }

    public Object toGethArgs() {
        return data;

    }

  public String getData() {
    return data;
  }

  @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }



}
