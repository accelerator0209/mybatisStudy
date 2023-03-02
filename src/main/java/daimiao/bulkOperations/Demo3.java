package daimiao.bulkOperations;

import daimiao.DaoFactory;
import daimiao.dao.TbGradeDao;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.entity.TbGrade;
import daimiao.pojo.entity.TbStudent;

//插入
public class Demo3 {
    public static void main(String[] args) {
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        TbStudent student = new TbStudent();
        student.setStuAge("21");
        student.setStuSex("男");
        student.setStuName("魏无忌");

        if(dao.insertSelective(student)==1){//插入成功
            TbGradeDao dao1 = DaoFactory.getDao(TbGradeDao.class);
            TbGrade grade = new TbGrade();
            grade.setChinese(90.5);
            grade.setEnglish(87.0);
            grade.setMath(92.5);
            int i = dao1.insertSelective(grade);
            if(i==1){
                System.out.println("插入成功");
            }
        }
    }
}
