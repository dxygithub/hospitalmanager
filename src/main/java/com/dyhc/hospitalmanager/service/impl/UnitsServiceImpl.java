package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UnitsMapper;
import com.dyhc.hospitalmanager.pojo.Units;
import com.dyhc.hospitalmanager.service.UnitsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单位信息维护业务实现
 * @author duxiaoyu
 */
@Service("unitsServiceImpl")
public class UnitsServiceImpl implements UnitsService {

    @Resource(name = "unitsMapper")
    private UnitsMapper unitsMapper;

    /**
     * 查询所有单位
     * @return
     */
    public List<Units> getAllUnitsList() {
        List<Units> units=null;
        try {
            units=this.unitsMapper.getAllUnitsList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return units;
    }

    /**
     * 添加单位
     * @param units
     * @return
     */
    public int addUnits(Units units) {
        int result=0;
        try {
            result=this.unitsMapper.addUnits(units);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 修改
     * @param units
     * @return
     */
    public int updUnits(Units units) {
        int result=0;
        try {
            result=this.unitsMapper.updUnits(units);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据单位编号，删除该单位
     * @param unitsId 单位id
     * @return
     */
    public int delUnits(String unitsId) {
        int result=0;
        try {
            result=this.unitsMapper.delUnits(unitsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
