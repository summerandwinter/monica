package com.summer.monica.model;

import com.summer.monica.model.routing.Balancer;
import com.summer.monica.model.routing.Rule;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Routing {

  private String domainStrategy;
  private List<Rule> rules;
  private List<Balancer> balancers;

}
