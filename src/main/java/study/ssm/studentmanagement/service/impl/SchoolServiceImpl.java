package study.ssm.studentmanagement.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import study.ssm.studentmanagement.dao.SchoolMapper;
import study.ssm.studentmanagement.model.School;
import study.ssm.studentmanagement.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
	
	@Resource
	private SchoolMapper schoolMapper;
	
	@Override
	public School addSchool(School school) {
		schoolMapper.insertSelective(school);
		return school;
	}

}
