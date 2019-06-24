package com.summer.monica.model;

import com.summer.monica.model.policy.LevelPolicy;
import com.summer.monica.model.policy.SystemPolicy;
import java.util.Map;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Policy {
  private Map<String, LevelPolicy> levels;
  private SystemPolicy system;

}
