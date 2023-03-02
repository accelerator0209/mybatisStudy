package daimiao.parameterMatching.single;

import daimiao.DaoFactory;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.entity.TbStudent;

//单个参数，基本数据类型或String
//基本数据类型和String类型时,
//Dao中的方法的形式参数名称随，mapper文件中#{}中接收参数的名称随意
public class Demo {
    public static void main(String[] args) {
        TbStudentDao dao = DaoFactory.getDao(TbStudentDao.class);
        TbStudent student= dao.selectById(1);
    }
}
