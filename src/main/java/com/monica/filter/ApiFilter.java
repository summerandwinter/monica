package com.monica.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Filter;
import spark.Request;
import spark.Response;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
public class ApiFilter  implements Filter {

  private static final Logger log = LoggerFactory.getLogger(ApiFilter.class);
  @Override
  public void handle(Request request, Response response) throws Exception {
     log.info("api call");
  }
}
