package com.dyhc.hospitalmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/Advicedescription")
    public String toAdvicedescription(){
        return "Advicedescription";
    }

    @RequestMapping("/CombinationInfo")
    public String toCombinationInfo(){
        return "combinationInfo";
    }

    @RequestMapping("/Commonresults")
    public String toCommonresults(){
        return "commonresults";
    }


    @RequestMapping("/DepartmentInfo")
    public String toDepartmentInfo(){
        return "departmentInfo";
    }

    @RequestMapping("/Jobs")
    public String toJobs(){
        return "jobs";
    }

    @RequestMapping("/Jobsgroup")
    public String toJobsgroup(){
        return "jobsgroup";
    }

    @RequestMapping("/Login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/Managedepart")
    public String toManagedepart(){
        return "managedepart";
    }

    @RequestMapping("/Managerindex")
    public String toManagerindex(){
        return "managerindex";
    }

    @RequestMapping("/Managerlogin")
    public String toManagerlogin(){
        return "managerlogin";
    }

    @RequestMapping("/NursePre")
    public String toNursePre(){
        return "nursePre";
    }

    @RequestMapping("/NursePrint")
    public String toNursePrint(){
        return "nursePrint";
    }

    @RequestMapping("/NurseRegistration")
    public String toNurseRegistration(){
        return "nurseRegistration";
    }

    @RequestMapping("/Package")
    public String toPackage(){
        return "package";
    }

    @RequestMapping("/PackageInfo")
    public String toPackageInfo(){
        return "packageInfo";
    }

    @RequestMapping("/Personalpackage")
    public String toPersonalpackage(){
        return "personalpackage";
    }

    @RequestMapping("/PhysicalinfoManager")
    public String toPhysicalinfoManager(){
        return "PhysicalinfoManager";
    }

    @RequestMapping("/Physicalreport")
    public String toPhysicalreport(){
        return "Physicalreport";
    }

    @RequestMapping("/PhysicalresultSummer")
    public String toPhysicalresultSummer(){
        return "PhysicalresultSummer";
    }

    @RequestMapping("/Tollgatecharge")
    public String toTollgatecharge(){
        return "Tollgatecharge";
    }

    @RequestMapping("/Tollgaterefund")
    public String toTollgaterefund(){
        return "Tollgaterefund";
    }

    @RequestMapping("/Totalcheck")
    public String toTotalcheck(){
        return "totalcheck";
    }
}