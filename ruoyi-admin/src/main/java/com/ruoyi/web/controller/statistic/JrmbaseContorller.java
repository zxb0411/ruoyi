package com.ruoyi.web.controller.statistic;


import com.ruoyi.statistic.domain.JmrBase;
import com.ruoyi.statistic.service.IJmrBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller

public class JrmbaseContorller {
    @Autowired private IJmrBaseService iJmrBaseService;
    @RequestMapping("/sta/Com")
    public  String  find(Model model,JmrBase j){
     List<JmrBase> list=iJmrBaseService.selectJmrBaseList(j);

     List<Long> nameList=list.stream().map(JmrBase::getJmrSexValue).collect(Collectors.toList());
     List<Long> jmrLevelList=list.stream().map(JmrBase::getJmrLevelValue).collect(Collectors.toList());
     List<Long> jmrProfessionValueList=list.stream().map(JmrBase::getJmrProfessionValue).collect(Collectors.toList());
     List<Long> jmrHistoryValueList=list.stream().map(JmrBase::getJmrHistoryValue).collect(Collectors.toList());
     List<Long> jmrRangeValueList=list.stream().map(JmrBase::getJmrRangeValue).collect(Collectors.toList());
     List<Long> jmrPositionValueList=list.stream().map(JmrBase::getJmrPositionValue).collect(Collectors.toList());
     List<Long> jmrCityValueList=list.stream().map(JmrBase::getJmrCityValue).collect(Collectors.toList());


     List<Long> l1=nameList.stream().distinct().collect(Collectors.toList());
     List<Long> l2=jmrLevelList.stream().distinct().collect(Collectors.toList());
     List<Long> l3=jmrProfessionValueList.stream().distinct().collect(Collectors.toList());
     List<Long> l4=jmrHistoryValueList.stream().distinct().collect(Collectors.toList());
     List<Long> l5=jmrRangeValueList.stream().distinct().collect(Collectors.toList());
     List<Long> l6=jmrPositionValueList.stream().distinct().collect(Collectors.toList());
     List<Long> l7=jmrCityValueList.stream().distinct().collect(Collectors.toList());

     for (int i = 0; i < l1.size(); i++) {
             Long c = l1.get(i);
             int a = Collections.frequency(nameList, c);
             model.addAttribute("sex" + i, a);
         }

        for (int i = 0; i < l2.size(); i++) {
            Long c = l2.get(i);
            int a = Collections.frequency(nameList, c);
            model.addAttribute("level" + i, a);

        }
        for (int i = 0; i < l3.size(); i++) {
            Long c = l3.get(i);
            int a = Collections.frequency(nameList, c);
            model.addAttribute("profession" + i, a);
        }
        for (int i = 0; i < l4.size(); i++) {
            Long c = l4.get(i);
            int a = Collections.frequency(nameList, c);
            model.addAttribute("history" + i, a);

        }
        for (int i = 0; i < l5.size(); i++) {
            Long c = l5.get(i);
            int a = Collections.frequency(nameList, c);
            model.addAttribute("range" + i, a);
        }
        for (int i = 0; i < l6.size(); i++) {
            Long c = l6.get(i);
            int a = Collections.frequency(nameList, c);
            model.addAttribute("position" + i, a);
        }
        for (int i = 0; i < l7.size(); i++) {
            Long c = l7.get(i);
            int a = Collections.frequency(nameList, c);
            model.addAttribute("city" + i, a);
        }
     return  "/sta/Com";

    }
}
