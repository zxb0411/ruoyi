package com.ruoyi.web.controller.statistic;


import com.ruoyi.statistic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//@RestController
@Controller

public class StudentController {
    @Autowired(required = false)
    public StudentService studentService;
    @RequestMapping("/sta/Stu")
    public String findStudentBySex(Integer a, Model model){
//        性别
        Integer boy = studentService.findStudentBySex(0);
        model.addAttribute("sexboy", boy);
        Integer girl = studentService.findStudentBySex(1);
        model.addAttribute("sexgirl", girl);
        System.out.println("男:"+boy+","+"女"+girl);
//        院校层次 jbv=985 ree=211 ybb=一本本科 rbb=二本本科 zk=专科 gz=高职
        Integer jbv = studentService.findLevalBySchool(0);
        model.addAttribute("lvjbv", jbv);
        Integer ree = studentService.findLevalBySchool(1);
        model.addAttribute("lvree", ree);
        Integer ybb = studentService.findLevalBySchool(2);
        model.addAttribute("lvybb", ybb);
        Integer rbb = studentService.findLevalBySchool(3);
        model.addAttribute("lvrbb", rbb);
        Integer zk = studentService.findLevalBySchool(4);
        model.addAttribute("lvzk", zk);
        Integer gz = studentService.findLevalBySchool(5);
        model.addAttribute("lvgz", gz);
        System.out.println("985:"+jbv+","+"211:"+ree+","+"一本本科:"+ybb+","+"二本本科:"+rbb+","+"专科:"+zk+","+"高职:"+gz);

//        学历 博士=BS 硕士=SS 本科=BK 专科=ZK
        Integer BS = studentService.findProfessionBySchool(0);
        model.addAttribute("PBS", BS);
        Integer SS = studentService.findProfessionBySchool(1);
        model.addAttribute("PSS", SS);
        Integer BK = studentService.findProfessionBySchool(2);
        model.addAttribute("PBK", BK);
        Integer ZK = studentService.findProfessionBySchool(3);
        model.addAttribute("PZK", ZK);
        System.out.println("博士:"+BS+","+"硕士:"+SS+","+"本科:"+BK+","+"专科:"+ZK);

//        外语水平 英语四级=enfour 英语六级=ensix 日语二级=jptwo 日语三级=jpthree 无=nonelg
        Integer enfour = studentService.findLanguageByStudent(1);
        model.addAttribute("ENF", enfour);
        Integer ensix = studentService.findLanguageByStudent(2);
        model.addAttribute("ENS", ensix);
        Integer jptwo = studentService.findLanguageByStudent(4);
        model.addAttribute("JPTW", jptwo);
        Integer jpthree = studentService.findLanguageByStudent(8);
        model.addAttribute("JPTH", jpthree);
        Integer nonelg = studentService.findLanguageByStudent(16);
        model.addAttribute("NON", nonelg);
        System.out.println("英语四级:"+enfour+","+"英语六级:"+ensix+","+"日语二级:"+jptwo+","+"日语三级:"+jpthree+","+"无:"+nonelg);

//        期望薪资 min=4K以下 low=4-6K mid=6-8K max=8K以上
        Integer min = studentService.findMoneyByStudent(0);
        model.addAttribute("Min", min);
        Integer low = studentService.findMoneyByStudent(1);
        model.addAttribute("Low", low);
        Integer mid = studentService.findMoneyByStudent(2);
        model.addAttribute("Mid", mid);
        Integer max = studentService.findMoneyByStudent(3);
        model.addAttribute("Max", max);
        System.out.println("4K以下:"+min+","+"4-6K:"+low+","+"6-8K:"+mid+","+"8K以上:"+max);

        //        就业意向地
        Integer YT = studentService.findWhereByStudent(0);
        model.addAttribute("Yt", YT);
        Integer OTHER = studentService.findWhereByStudent(1);
        model.addAttribute("Other", OTHER);
        System.out.println("烟台:"+YT+","+"其他"+OTHER);
        return "/sta/tongji";
    }

}
