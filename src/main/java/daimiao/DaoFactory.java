package daimiao;

import daimiao.dao.TbStudentDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class DaoFactory {
    public static <T> T getDao(Class<T> tClass){
        //加载配置文件获取Mybatis的配置
        InputStream resourceAsStream = MybatisDemo.class.getClassLoader().getResourceAsStream("mybatis/mybatis-config.xml");
        //创建SqlSession对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //根据工厂得到SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //根据SqlSession 获得Dao
        T mapper = sqlSession.getMapper(tClass);
        return mapper;
    }
}

