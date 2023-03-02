package daimiao.bulkOperations;

import daimiao.DaoFactory;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.entity.TbStudent;
import daimiao.pojo.vo.StudentsVo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//批量查询
public class Demo2 {
    public static void main(String[] args) {
        //集合中的泛型是对象
        TbStudent stu1 = new TbStudent();
        stu1.setStuId(1);
        TbStudent stu2 = new TbStudent();
        stu2.setStuId(2);
        TbStudent stu3 = new TbStudent();
        stu3.setStuId(3);
        //这里将集合作为参数不太好
        List<TbStudent> students = Arrays.asList(stu1,stu2,stu3);
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        List<StudentsVo> results = dao.selectByObject(students);
        //java8新特性 stream
//        List<Integer> ids = students.stream().map((stu) -> stu.getStuId()).collect(Collectors.toList());
        //方法引用
        List<Integer> ids = students.stream().map(TbStudent::getStuId).collect(Collectors.toList());
        List<StudentsVo> studentsVos = dao.selectByIds(ids);
        System.out.println(studentsVos);

    }
}
