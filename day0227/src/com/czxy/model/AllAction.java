package com.czxy.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjian1@itcast.cn
 * @date 2018/12/27
 * @infos 功能描述接口
 */
public interface AllAction {

    /**
     * 本方法用于读取file文件中的同学信息，注意返回值！
     * @param file
     * @return
     */
    ArrayList<Student> readStudentFile(File file);


    /**
     * 将readStudentFile方法将接收的集合中的所有同学信息覆盖保存到students.cz的文件中
     * @param students
     * @return 0 表示保存失败  1 表示保存成功
     */
    int saveToFile(ArrayList<Student> students);


    /**
     * 向student.cz文件添加同学信息
     * @return 返回0 表示添加失败 返回1 表示添加成功
     * TODO 如果添加进来的同学信息已经存在，则不进行添加，且本方法返回0，
	 * 		如果不存在，则将student信息追加保存到student.cz文件中
     */
    int addStudent(Student student);

    /**
     * 查询同学录中所有同学信息保存到List集合并返回
     * @return
     */
    List<Student> allQuery();

    /**
     * 根据姓名查询同学信息
     * @param name 需要查询的同学姓名
     * @return 如果存在返回Student对象，不存在则返回null
     */
    Student nameQuery(String name);

    /**
     * 根据手机号码查询同学信息
     * @param phone 需要查询的同学手机号码
     * @return
     */
    Student phoneQuery(String phone);

    /**
     * 根据手机号码查询同学信息
     * @param phone 需要查询的同学手机号码 type = 0 表示模糊查询，
     *          例如：phone=152,type=0,则返回所有手机号包含152的学生信息。
	 *				  phone=152,type=1,则返回所有手机号等于152的学生信息。	
     * @return
     */
    ArrayList<Student> phoneQuery(String phone, int type);

    /**
     * 根据性别进行查询同学信息
     * @param sex 性别信息
     * @return 返回所有符合要求的同学信息
     */
    ArrayList<Student> sexQuery(String sex);

    /**
     * 修改student.cz文件中的同学信息
     * @param student 需要修改的同学信息
     * @return 0 表示有对应学生数据并修改成功 1 表示操作失败
     * TODO 实现效果：只修改对应学生的信息，其他数据保持不变。
     */
    int updateStudentInfos(Student student);


    /**
     * 删除同学录中某个同学的信息，其他数据保持不变。
     * @param student 需要删除的同学信息
     * @return 0 表示有对应学生数据并删除成功 1 表示操作失败
     */
    int removeStudentInfos(Student student);

}
