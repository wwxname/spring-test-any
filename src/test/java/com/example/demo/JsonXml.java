package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

class User {
    public String name;
    public Integer age;

    User() {

    }

    public String getDogName(){
        return this.name;
    }
}

public class JsonXml {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("wwx");
        list.add("wwj");
        HashMap map = new HashMap();
        map.put("name", "wwx");
        map.put("age", "23");
        User user = new User();

        user.name = "demo";
        user.age = 23;
        String s1 = JSONObject.toJSONString(user);
        System.err.println(s1);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String s = objectMapper .writeValueAsString(user);
            String s2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.err.println(s2);
            System.err.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String Array2Json(Object array) throws RuntimeException {
        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            result = mapper.writeValueAsString(array);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
        return result;
    }

    public static String wrapSuccessString(String status, String jsonSource) {
        String result = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            ObjectNode node = mapper.createObjectNode();
            node.put("status", status);
            node.put("value", mapper.readTree(jsonSource));

            result = mapper.writeValueAsString(node);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
