package com.summer.monica.model.transport;

import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Http {
  private List<String> host;
  private String path;

}
