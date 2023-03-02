package daimiao.bulkOperations;
//批量查询学生：根据学生的id集合来批量查询学生

import daimiao.DaoFactory;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.vo.StudentsVo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        Collection<Integer> list = Arrays.asList(1,4,5);
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        List<StudentsVo> results = dao.selectByIds(list);
        System.out.println(results);
    }
}
