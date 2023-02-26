package daimiao.dynamic;

import daimiao.DaoFactory;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.query.StudentsQuery;
import daimiao.pojo.vo.StudentsVo;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //最终的目的是获得xxxDao接口的实例
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        //将查询封装成一个对像
        StudentsQuery studentsQuery = new StudentsQuery();
        studentsQuery.setPage(2);
        studentsQuery.setStuNum("2");
        studentsQuery.setStuName("");
        List<StudentsVo> studentsVoList = dao.selectByQuery(studentsQuery);
    }
}
