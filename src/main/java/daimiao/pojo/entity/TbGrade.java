package daimiao.pojo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_grade
 * @author 
 */
@Data
public class TbGrade implements Serializable {
    private Integer id;

    private Double chinese;

    private Double math;

    private Double english;

    private String stuNum;

    private static final long serialVersionUID = 1L;
}