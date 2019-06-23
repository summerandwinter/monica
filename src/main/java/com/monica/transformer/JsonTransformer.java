package com.monica.transformer;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */

public class JsonTransformer implements ResponseTransformer {

  private Gson gson = new Gson();

  @Override
  public String render(Object model) {
    return gson.toJson(model);
  }

}
