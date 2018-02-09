package com.vishwas.springbootexample.dbconnetion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService ; 
	
	@RequestMapping ("/getTopics")
	public List<Topic> getTopics()
	{
		return topicService.getTopicList();
	}
	
	@RequestMapping (method=RequestMethod.POST,value="/addTopic")
	public String addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
		
	}
	
	@RequestMapping (method=RequestMethod.PUT,value="/updateTopic/{id}")
	public String updateTopic(@RequestBody Topic topic ,@PathVariable String id) {
		return topicService.updateTopic(topic, id);
		
	}
	

}
