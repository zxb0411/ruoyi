import com.ruoyi.company.domain.Company_JmrJob;
import com.ruoyi.company.domain.Company_JmrStudent;
import com.ruoyi.company.domain.Company_JmrSmrBase;
import com.ruoyi.company.domain.Company_JmrStudentMatchResult;
import com.ruoyi.company.service.Company_IJmrSmrBaseService;
import com.ruoyi.company.service.Company_IJmrJobService;
import com.ruoyi.company.service.Company_IJmrStudentMatchResultService;
import com.ruoyi.company.service.Company_IJmrStudentService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

//@ContextConfiguration
//@SpringBootTest(classes = RuoYiApplication.class)
//@RunWith(SpringRunner.class)
public class TestClass {

    @Autowired
    private Company_IJmrStudentService jmrStudentService;
    @Autowired
    private Company_IJmrJobService jmrJobService;
    @Autowired
    private Company_IJmrSmrBaseService jmrBaseService;
    @Autowired
    private Company_IJmrStudentMatchResultService studentMatchResultService;
    @Test
    public void TestOne(){
        Company_JmrJob companyJmrJob = jmrJobService.selectJmrJobById(1);
        //System.out.println("jmrJob = " + jmrJob);
        List<Company_JmrStudent> lists = jmrStudentService.selectJmrStudentList(null);
        //System.out.println("jmrStudents W= " + lists);
        //System.out.println(lists.get(0).getsEPosition().equals(jmrJob.getjPoId()));
        Company_JmrStudent comCompanyJmrStudent = lists.get(0);
        Company_JmrSmrBase result=new Company_JmrSmrBase();//匹配结果实例表
        float num=0;
        //判断匹配数据 并存放在匹配结果表中JmrStudentMatchResult中 每次存储在数据库此表中一次
        if(comCompanyJmrStudent.getsEPosition().equals(companyJmrJob.getjPoId())){//判断岗位id
            result.setSmr_position_value(1);
            num+=12.5;
        }else{result.setSmr_position_value(0);}
        if(comCompanyJmrStudent.getsSex().equals(companyJmrJob.getjSex())){//判断性别
            result.setSmr_sex_value(1);
            num+=12.5;
        }else{result.setSmr_sex_value(0);}
        if(comCompanyJmrStudent.getsEHistory().equals(companyJmrJob.getjEHistory())){//判断学历
            result.setSmr_history_value(1);
            num+=12.5;;
        }else{result.setSmr_history_value(0);}
        if(comCompanyJmrStudent.getsCLevel().equals(companyJmrJob.getjCLevel())){//判断院校层次
            result.setSmr_level_value(1);
            num+=12.5;
        }else{result.setSmr_level_value(0);}
        if(comCompanyJmrStudent.getsFLanguage().equals(companyJmrJob.getjFLanguage())){//判断外语水平
            result.setSmr_language_value(1);
            num+=12.5;
        }else{result.setSmr_language_value(0);}
        if(comCompanyJmrStudent.getsProfession().equals(companyJmrJob.getjPrId())){//判断专业
            result.setSmr_profession_value(1);
            num+=12.5;
        }else{result.setSmr_profession_value(0);}
        if( comCompanyJmrStudent.getsSRange().equals(companyJmrJob.getjSRange())){//判断薪资范围
            result.setSmr_range_value(1);
            num+=12.5;
        }else{ result.setSmr_range_value(0); }
        if(comCompanyJmrStudent.getsECity().equals(companyJmrJob.getjECity())){//判断就业意向地
            result.setJmr_city_value(1);
            num+=12.5;
        }else{result.setJmr_city_value(1);}

        jmrBaseService.save(result);
        Integer smr_id = result.getSmr_b_id();//存储的评价表返回的id

        Company_JmrStudentMatchResult studentMatchResult=new Company_JmrStudentMatchResult();
        studentMatchResult.setSmrCId(companyJmrJob.getjCId().intValue());//存储企业id
        studentMatchResult.setSmrJId(companyJmrJob.getjPoId());//存储岗位id
        studentMatchResult.setSmrSId(comCompanyJmrStudent.getsId().intValue());//学生id
        studentMatchResult.setSmrRId(1);//简历id
        studentMatchResult.setSmrBId(smr_id);//评价表返回的id
        studentMatchResult.setSmrValue((int)num);
        int i1 = studentMatchResultService.insertJmrStudentMatchResult(studentMatchResult);//存储匹配好的信息
        System.out.println("匹配分数："+num);
        System.out.println(i1);
    }
}
