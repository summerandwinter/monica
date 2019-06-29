

import java.util.regex.Pattern;

/**
 * @author summerandwinter
 * @date 2019/6/28
 */
public class Test {

  public static void main(String[] args) {
    String path = "/appaaa/app/111.js";
    System.out.println(Pattern.matches("^((?!/api).)*(/[\\w]*)*", "/api/apsi"));
    System.out.println(Pattern.matches("^/([^api]|a(?!pi)|(?!<a)p(?!i)|(?<!ap)i)+[\\w]*(/|\\w+)+", path));
  }
}
