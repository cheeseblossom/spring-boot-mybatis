package playground.cheeseblossom.mybatis.provider;

import org.apache.ibatis.jdbc.SQL;

public class PersonProvider {

  public String selectPersonLike() {
    return new SQL() {
      {
        SELECT("A.first_name", "A.last_name");
        FROM("PERSON A");
        WHERE("A.first_name like '%'" + " #{first_name} " + "'%'");
        ORDER_BY("A.first_name");
      }
    }.toString();
  }
}
