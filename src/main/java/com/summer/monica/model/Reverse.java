package com.summer.monica.model;

import com.summer.monica.model.reverse.Bridge;
import com.summer.monica.model.reverse.Portal;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Reverse {
  private List<Bridge> bridges;
  private List<Portal> portals;

}
