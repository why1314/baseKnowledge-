package com.czxy.exam;

import com.czxy.model.AllAction;
import com.czxy.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author zhangjian1@itcast.cn
 * @date 2018/12/27
 * @infos
 */
public class CzxyExam implements AllAction {
    public static void main(String[] args) {
//        File file = new File("source\\students.cz");
//        ArrayList<Student> students = new CzxyExam().readStudentFile(file);
//        System.out.println(students);
//        System.out.println(new CzxyExam().saveToFile(students));
//        Student stu = new Student("张", "男", "13220082222");
        System.out.println(new CzxyExam().removeStudentInfos(new Student("张三", "na", "13220082222")));
    }

    /**
     * 本方法用于读取file文件中的同学信息，注意返回值！
     *
     * @param file
     * @return
     */
    @Override
    public ArrayList<Student> readStudentFile(File file) {
        ArrayList<Student> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String str = null;
            while ((str = br.readLine()) != null) {
                String[] split = str.split(";");
                list.add(new Student(split[0], split[1], split[2]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 将readStudentFile方法将接收的集合中的所有同学信息覆盖保存到students.cz的文件中
     *
     * @param students
     * @return 0 表示保存失败  1 表示保存成功
     */
    @Override
    public int saveToFile(ArrayList<Student> students) {
//       0 表示保存失败  1 表示保存成功
        int num = 1;
        String str = null;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("source\\students.cz"))) {
            for (Student stu : students) {
                str = stu.getName() + ";" + stu.getSex() + ";" + stu.getPhone();
                bw.write(str);
                bw.newLine();
            }

        } catch (IOException e) {
            num = 0;
            e.printStackTrace();
        }

        return num;
    }

    /**
     * 向student.cz文件添加同学信息
     *
     * @return 返回0 表示添加失败 返回1 表示添加成功
     * TODO 如果添加进来的同学信息已经存在，则不进行添加，且本方法返回0，
     * 如果不存在，则将student信息追加保存到student.cz文件中
     */
    @Override
    public int addStudent(Student student) {
        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
//        遍历查询到的学员集合，看是否已存在
        for (Student stu : stuList) {
            if (Objects.equals(student, stu)) {
                return 0;
            }
        }
//        调用保存方法
        return saveToFile(stuList);

//        当学员不存在时，进行追加写入
//        String str = null;
//        int num = 0;
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("source\\students.cz", true))) {
//            str = student.getName() + ";" + student.getSex() + ";" + student.getPhone();
//            bw.write(str);
//            bw.newLine();
//            num++;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return num;
    }

    /**
     * 查询同学录中所有同学信息保存到List集合并返回
     *
     * @return
     */
    @Override
    public List<Student> allQuery() {
//        调用第一个方法
        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
        return stuList;
    }

    /**
     * 根据姓名查询同学信息
     *
     * @param name 需要查询的同学姓名
     * @return 如果存在返回Student对象，不存在则返回null
     */
    @Override
    public Student nameQuery(String name) {
//        调用第一个方法
//        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
//        遍历集合
        List<Student> stuList = allQuery();
        for (Student stu : stuList) {
//            判断姓名是否相同 相同者返回
            if (Objects.equals(name, stu.getName())) {
                return stu;
            }
        }
        return null;
    }

    /**
     * 根据手机号码查询同学信息
     *
     * @param phone 需要查询的同学手机号码
     * @return 如果存在返回Student对象，不存在则返回null
     */
    @Override
    public Student phoneQuery(String phone) {
        //        调用第一个方法
        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
//       遍历集合 判断手机号是否相同 相同者返回学生对象
        for (Student stu : stuList) {
            if (Objects.equals(phone, stu.getPhone())) {
                return stu;
            }
        }
        return null;
    }

    /**
     * 根据手机号码查询同学信息
     *
     * @param phone 需要查询的同学手机号码 type = 0 表示模糊查询，
     *              例如：phone=152,type=0,则返回所有手机号包含152的学生信息。
     *              phone=152,type=1,则返回所有手机号等于152的学生信息。
     * @return
     */
    @Override
    public ArrayList<Student> phoneQuery(String phone, int type) {
//        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
        List<Student> stuList = allQuery();
        ArrayList<Student> list = new ArrayList<>();
        for (Student stu : stuList) {
            if (type == 0 && stu.getPhone().contains(phone)) {
                list.add(stu);
            }
            if (type == 1 && stu.getPhone().startsWith(phone)) {
                list.add(stu);
            }
        }
        return list;
    }

    /**
     * 根据性别进行查询同学信息
     *
     * @param sex 性别信息
     * @return 返回所有符合要求的同学信息
     */
    @Override
    public ArrayList<Student> sexQuery(String sex) {
        List<Student> stuList = allQuery();
//        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
        ArrayList<Student> list = new ArrayList<>();
        for (Student stu : stuList) {
            if (Objects.equals(stu.getSex(), sex)) {
                list.add(stu);
            }
        }
        return list;
    }

    /**
     * 修改student.cz文件中的同学信息
     *
     * @param student 需要修改的同学信息
     * @return 0 表示有对应学生数据并修改成功 1 表示操作失败
     * TODO 实现效果：只修改对应学生的信息，其他数据保持不变。
     */
    @Override
    public int updateStudentInfos(Student student) {
        List<Student> stuList = allQuery();
//        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
//        ArrayList<Student> list = new ArrayList<>();
        int num = 1;
        for (Student stu : stuList) {
            if (Objects.equals(stu.getName(), student.getName())) {
                num--;
//                list.add(student);
                stu.setSex(student.getSex());
                stu.setPhone(student.getPhone());
            }
        }
         saveToFile((ArrayList<Student>) stuList);
//        String str = null;
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("source\\students.cz"))) {
//            for (Student stu : list) {
//                str = stu.getName() + ";" + stu.getSex() + ";" + stu.getPhone();
//                bw.write(str);
//                bw.newLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (num == 0) {
//            System.out.println("修改成功");
//        } else {
//            System.out.println("操作失败");
//
//        }
//
        return num;
    }

    /**
     * 删除同学录中某个同学的信息，其他数据保持不变。
     *
     * @param student 需要删除的同学信息
     * @return 0 表示有对应学生数据并删除成功 1 表示操作失败
     */
    @Override
    public int removeStudentInfos(Student student) {
        List<Student> stuList = allQuery();
//        ArrayList<Student> stuList = readStudentFile(new File("source\\students.cz"));
        ArrayList<Student> list = new ArrayList<>();
        int num = 1;
        for (Student stu : stuList) {
            if (!Objects.equals(stu.getName(), student.getName())) {
                list.add(stu);
            } else {
                num--;
            }
        }
        saveToFile(list);
//        String str = null;
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("source\\students.cz"))) {
//            for (Student stu : list) {
//                str = stu.getName() + ";" + stu.getSex() + ";" + stu.getPhone();
//                bw.write(str);
//                bw.newLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        if (num == 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("操作失败");

        }

        return num;

    }
}
