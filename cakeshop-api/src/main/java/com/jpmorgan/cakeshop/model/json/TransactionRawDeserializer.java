/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpmorgan.cakeshop.model.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class TransactionRawDeserializer extends JsonDeserializer<TransRawPostJsonRequest> {

    @Override
    public TransRawPostJsonRequest deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {

      TransRawPostJsonRequest request = new TransRawPostJsonRequest();
        JsonNode node = jp.getCodec().readTree(jp);


        if (null != node.get("data")) {
            request.setData(node.get("data").textValue());
        }



        return request;
    }

}
