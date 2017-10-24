package com.vines.service;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class UserControllerTest {

  public void testPost() throws Exception {
    // 直接字符串拼接
    StringBuilder builder = new StringBuilder();
    // xml数据存储
    builder.append("<todo><id>1</id><completed>true</completed><desc>hello</desc></todo>");
//    builder.append("{\"id\":\"1\",")
//            .append("\"completed\":\"true\",")
//            .append("\"desc\":\"hello\"}");
    String data = builder.toString();
    System.out.println(data);
    String url = "http://localhost:8443/single.xml";
    CloseableHttpClient httpClient = HttpClients.createDefault();
    HttpPost httpPost = new HttpPost(url);
    httpPost.setEntity(new StringEntity(data, "text/xml","utf-8"));
    CloseableHttpResponse response = httpClient.execute(httpPost);
    HttpEntity entity = response.getEntity();
    String content = EntityUtils.toString(entity);
    System.out.println("content:" + content);
  }
  public static void main(String[] args)throws Exception{
    new UserControllerTest().testPost();
  }
}