package com.vishwas.springbootexample.dbconnetion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	/*private List<Topic> topicList = Arrays.asList(new Topic ("1","Java","Java learning"),new Topic("2","Spring Boot","Spring Boot learning"));
	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

	public List<Topic> getTopics(){
		
		return this.topicList;
		
		
	}*/
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopicList() {
		List <Topic> list= new ArrayList <Topic>();
		topicRepository.findAll().forEach(list::add);
		return list;
	}

	public String addTopic(Topic topic) {
		topicRepository.save(topic);
		return "Topic added";
	}

	public String deleteTopic(String id) {
		topicRepository.delete(id);
		return "Topic deleted";
	}

	public String updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
		return "Topic saved";
	}

	

}
