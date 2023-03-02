package daimiao.parameterMatching.single;

import daimiao.DaoFactory;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.query.StudentQuery1;
import daimiao.pojo.vo.StudentsVo;

import java.util.List;

//单个参数查询不是基本数据类型或是String类型时
public class Demo1 {
    public static void main(String[] args) {
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        StudentQuery1 stu = new StudentQuery1("小美", "20");
        List<StudentsVo> list = dao.selectByQuery1(stu);
        System.out.println(list);
    }
}
