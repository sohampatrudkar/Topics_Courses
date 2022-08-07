package io.soham.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring","Spring Framework","Spring Framework Description"),
//			new Topic("java","Core Java","Core Java Description"),
//			new Topic("javascript","Javascript","Javascript Description")
//			));

	public List<Course> getAllCourses(String topicId) {
		// return topics;
		List<Course> courses = new ArrayList<>();
		courses = courseRepository.findByTopicId(topicId);
		return courses;

	}

	public Optional<Course> getTopic(String id) {
		// return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);

	}

	public void updateCourse(Course course) {
//		for(int i=0; i< topics.size(); i++) {
//			Topic t= topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		courseRepository.save(course);

	}

	public void deleteCourse(String id) {
		// topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteAll();
	}

	public Optional<Course> getCourse(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
