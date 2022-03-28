package com.yj.auto.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.yj.auto.project.dto.ProjectTreeInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
@Component
public class HttpUtil {

    @Resource
    RestTemplate restTemplate;

    public String httpGet(String url, Map<String,String> param, Map<String,String> header){
        String httpUrl = url;
        HttpHeaders headers = new HttpHeaders();
        if(header.size()>0){
            Set<String> HeaderKeys = header.keySet();
            for(String key:HeaderKeys){
                headers.add(key,header.get(key));
            }
        }
        if(param.size()>0){
            String data = "";
            Set<String> paramsKey = param.keySet();
            for(String key:paramsKey){
                data += "&"+key+"="+param.get(key);
            }
            httpUrl +="?"+data.substring(1);
        }
        log.info("url: "+url);
        log.info("headers: "+headers);
        log.info("param: "+param);
        HttpEntity<String> requestEntity = new HttpEntity<>(null,headers);
        ResponseEntity<String> resEntity = restTemplate.exchange(httpUrl, HttpMethod.GET, requestEntity, String.class);
        log.info("resEntity.getBody(): "+resEntity.getBody());
        return resEntity.getBody();
    }

    public String httpPost(String url,Map<String,String> param,Map<String,String> header){
        HttpHeaders httpHeaders = new HttpHeaders();
        for(Map.Entry<String,String> map:header.entrySet()){
            httpHeaders.add(map.getKey(),map.getValue());
        }
        JSONObject jsonObject = new JSONObject();
        for(Map.Entry<String,String> map:param.entrySet()){
            jsonObject.put(map.getKey(),map.getValue());
        }
        log.info("url: "+url);
        log.info("headers: "+httpHeaders);
        log.info("param: "+param);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, jsonObject, String.class);
        log.info("responseEntity.getBody(): "+responseEntity.getBody());
        return responseEntity.getBody();
    }
}
