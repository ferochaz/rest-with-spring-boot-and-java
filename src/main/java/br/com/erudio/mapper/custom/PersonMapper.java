package br.com.erudio.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.model.Person;

@Service
public class PersonMapper {

	
	public PersonVOV2 convertEntityToVO(Person person) {
		
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		
		return vo;
	}
	
	
	
public Person convertVOtoEntity(PersonVOV2 personVO) {
		
		Person entity = new Person();
		entity.setId(personVO.getId());
		entity.setAddress(personVO.getAddress());
		//person.setBirthDay(new Date());
		entity.setFirstName(personVO.getFirstName());
		entity.setLastName(personVO.getLastName());
		entity.setGender(personVO.getGender());
		
		return entity;
	}
}
