package com.summer.monica.model.routing;

import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Balancer {
  private String tag;
  private List<String> selector;

}
