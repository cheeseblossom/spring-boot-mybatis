package playground.cheeseblossom.mybatis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import playground.cheeseblossom.mybatis.domain.Person;
import playground.cheeseblossom.mybatis.service.PersonService;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class IndexController {

  private final PersonService personService;

  @GetMapping("/")
  public ModelAndView index() {
    ModelAndView mv = new ModelAndView("/index");
    Map<String, List<Person>> result = personService.find("a");
    mv.addObject("result", result);
    return mv;
  }
}
