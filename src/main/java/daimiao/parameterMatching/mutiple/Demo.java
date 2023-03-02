package daimiao.parameterMatching.mutiple;

import daimiao.DaoFactory;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.vo.StudentsVo;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        List<StudentsVo> list = dao.selectByMultiParams("魏无忌","21");
    }
}
