package daimiao.pojo.query;

import lombok.Data;

@Data
public class StudentQuery1 {
    private String stuName,stuAge;
    public StudentQuery1(){};
    public StudentQuery1(String stuName, String stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }
}
