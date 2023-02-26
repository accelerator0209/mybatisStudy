package daimiao.dao;

import daimiao.pojo.entity.TbGrade;

public interface TbGradeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbGrade record);

    int insertSelective(TbGrade record);

    TbGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbGrade record);

    int updateByPrimaryKey(TbGrade record);
}