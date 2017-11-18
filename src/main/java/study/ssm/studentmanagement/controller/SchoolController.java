package study.ssm.studentmanagement.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import study.ssm.studentmanagement.model.School;
import study.ssm.studentmanagement.service.SchoolService;

@Controller
@RequestMapping("/school")
public class SchoolController {
	
	@Resource
	private SchoolService schoolService;
	
	@ResponseBody
	@RequestMapping(value="", method = RequestMethod.POST, produces="application/json; charset='UTF-8'")
	public School addSchool(School school) {
		return schoolService.addSchool(school);
	}
}
