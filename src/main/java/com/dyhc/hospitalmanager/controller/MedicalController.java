package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.pojo.RoleInfo;
import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import com.dyhc.hospitalmanager.service.MedicalService;
import com.dyhc.hospitalmanager.util.Commons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MedicalController {

    @Resource(name = "medicalServiceImpl")
    private MedicalService medicalService;

    /**
     * 获取用户单另的体检项
     * @param testNumber   用户编号
     * @return
     */
    @RequestMapping(value = "/medical.do")
    @ResponseBody
    public Map<String, Object> getUserTestInfolist(String testNumber) {
        List<Medical> info = medicalService.selMedicaltestNumber(testNumber);
        for (Medical u: info) {
            if (u.getTestStatus()==0){
                u.setStatus("未检查");
            }else {
                u.setStatus("已检查");
            }
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "错误提示");
        map.put("data", info);

        return map;
    }

    @GetMapping("/getMadical")
    @ResponseBody
    public List<MedicalConditional> getMadical(String testNumber) {
        return medicalService.getMadical(testNumber);
    }

    /**
     * 获取用户组合项的下体检项
     * @param testNumber
     * @return
     */
    @GetMapping("/getCom")
    @ResponseBody
    public List<MedicalConditional> getCom(String testNumber) {
        return medicalService.getCom(testNumber);
    }

    /**
     * 获取用户套餐下的单另体检项
     * @param testNumber
     * @return
     */
    @GetMapping("/getPackageMedical")
    @ResponseBody
    public List<MedicalConditional> getPackageMedical(String testNumber) {
        return medicalService.getPackageMedical(testNumber);
    }


    /**
     * 获取用户套餐下的组合项下的体检项
     * @param testNumber
     * @return
     */
    @GetMapping("/getPackageCom")
    @ResponseBody
    public List<MedicalConditional> getPackage(String testNumber) {
        return medicalService.getPackage(testNumber);
    public List<MedicalConditional> getPackageCom(String testNumber) {
        return medicalService.getPackageCom(testNumber);
    }

    /**
     * 根据用户编号查询该科室下的所有体检项
     * @param testNumber 用户编号
     * @return
     */
    @GetMapping("/getUserDeskMedicalByTestNumber")
    @ResponseBody
    public List<MedicalConditional> getUserDeskMedicalByTestNumber(String testNumber, HttpSession session) {
        RoleInfo roleInfo = (RoleInfo) session.getAttribute(Commons.loginRoleInfo.toString());
        return medicalService.getUserDeskMedicalByTestNumber(testNumber,roleInfo.getDeskId());
    }
}