package daimiao.pojo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_student
 * @author 
 */
@Data
public class TbStudent implements Serializable {
    private Integer stuId;

    private String stuNum;

    private String stuName;

    private String stuAge;

    private String stuSex;

    private String stuClass;

    private static final long serialVersionUID = 1L;
}