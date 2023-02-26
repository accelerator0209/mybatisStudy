package daimiao;

import daimiao.dao.TbGradeDao;
import daimiao.dao.TbStudentDao;
import daimiao.pojo.entity.TbGrade;
import daimiao.pojo.entity.TbStudent;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisDemo {
    public static void main(String[] args) {
        //加载配置文件获取Mybatis的配置
        InputStream resourceAsStream = MybatisDemo.class.getClassLoader().getResourceAsStream("mybatis/mybatis-config.xml");
        //创建SqlSession对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //根据工厂得到SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //根据SqlSession 获得Dao
        TbStudentDao mapper = sqlSession.getMapper(TbStudentDao.class);
        TbStudent tbStudent = mapper.selectByPrimaryKey(11);
        System.out.println(tbStudent);
        TbGradeDao mapper1 = sqlSession.getMapper(TbGradeDao.class);
        TbGrade tbGrade = mapper1.selectByPrimaryKey(18);
        System.out.println(tbGrade);
    }
}
