package playground.cheeseblossom.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import playground.cheeseblossom.mybatis.domain.Person;
import playground.cheeseblossom.mybatis.provider.PersonProvider;

import java.util.List;

public interface PersonMapper {

  @SelectProvider(type = PersonProvider.class, method = "selectPersonLike")
  List<Person> selectPersonLike(@Param("first_name") String firstName);
}
