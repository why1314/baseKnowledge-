package com.itheima.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author wz
 * @create 2019-02-13 9:19
 */
//public boolean add(E e)添加功能 返回值为boolean类型 参数是泛型
//public boolean addAll(Collection<?> c)
//public void clear();
//public boolean contains()
public class Demo01 {
    public static void main(String[] args) {
//        Collection<String> list = new ArrayList<String>();
//        list.add("ajgdh");
//        list.add("ahsdgfukas");
//        list.add("12612");
//        System.out.println(list);
//     多态
//        Collection<Integer> arrayList = new ArrayList<>();
//        arrayList.add(10);
//        arrayList.add(33);
//        System.out.println(arrayList);
        Collection<Person> listPerson = new ArrayList<Person>();

        listPerson.add(new Student("ahdfka"));
        listPerson.add(new Person("hafd"));
        Student s1 = new Student("ww");
        Student s2 = new Student("qq");
        Student s3 = new Student("ee");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        listPerson.addAll(students);
//        Iterator<Person> it = listPerson.iterator();//迭代器最好只是循环查询，修改时会找出并发异常
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        Student s4 = new Student("ww");
        Student s5 = new Student("qq");
        Student s6 = new Student("ee");
        ArrayList<Student> s = new ArrayList<>();
        s.add(s4);
        s.add(s5);
        s.add(s6);

        for (Student stu : s) {
            System.out.println(stu+"---------");
        }
        System.out.println(listPerson.removeAll(s));
        System.out.println(listPerson.containsAll(s));
        Iterator<Person> it1 = listPerson.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
//        listPerson.clear();
//        s.clear();
        System.out.println(s);
        System.out.println(listPerson.size());

    }

}
