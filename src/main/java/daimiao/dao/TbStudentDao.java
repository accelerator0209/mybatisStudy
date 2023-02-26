package daimiao.dao;

import daimiao.pojo.entity.TbStudent;
import daimiao.pojo.query.StudentsQuery;
import daimiao.pojo.vo.StudentsVo;

import java.util.List;

public interface TbStudentDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    TbStudent selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);

    List<StudentsVo> selectByQuery(StudentsQuery studentsQuery);
}