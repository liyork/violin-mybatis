package com.wolf;

import java.util.List;

/**
 * <b>功能</b>
 *
 * @author 李超
 * @Date 2015/6/17
 */
public class Class {

	//定义实体类的属性，与class表中的字段对应
	private int id;            //id===>c_id
	private String name;    //name===>c_name

	/**
	 * class表中有一个teacher_id字段，所以在Classes类中定义一个teacher属性，
	 * 用于维护teacher和class之间的一对一关系，通过这个teacher属性就可以知道这个班级是由哪个老师负责的
	 */
	private Teacher teacher;

	//使用一个List<Student>集合属性表示班级拥有的学生
	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		String result =  "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher+"]===>";
		for (Student student : students) {
			result += student.toString();
		}
		return result;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
