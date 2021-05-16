package playground.cheeseblossom.mybatis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import playground.cheeseblossom.mybatis.domain.Person;
import playground.cheeseblossom.mybatis.mapper.PersonMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class PersonService {

  private final PersonMapper personMapper;

  @Transactional(readOnly = true)
  public Map<String, List<Person>> find(String str) {
    List<Person> persons = personMapper.selectPersonLike(str);
    Map<String, List<Person>> result = new HashMap<>();
    result.put("result", persons);
    return result;
  }
}
