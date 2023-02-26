package daimiao.pojo.query;

import lombok.Data;

@Data
public class StudentsQuery {
    private String stuNum,stuName,stuAge,stuSex,stuClass;
    private Integer page=1;//当前的页码，默认设置为1
    private Integer limit=2;//每页展示的行数
    //偏移量：（page-1）* limit
    private Integer start;

    public Integer getStart() {
        return (page-1)*limit;
    }
}
