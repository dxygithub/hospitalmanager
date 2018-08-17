package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UnitsGroupMapper;
import com.dyhc.hospitalmanager.pojo.UnitsGroup;
import com.dyhc.hospitalmanager.service.UnitsGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author duxiaoyu
 * 单位分组维护业务实现
 */
@Service("unitsGroupServiceImpl")
public class UnitsGroupServiceImpl implements UnitsGroupService {


    @Resource(name = "unitsGroupMapper")
    private UnitsGroupMapper unitsGroupMapper;

    /**
     * 根据单位编号查询所属的所有分组
     * @param unitsId 单位编号
     * @return
     */
    public List<UnitsGroup> getUnitsGroupList(String unitsId) {
        return this.unitsGroupMapper.getUnitsGroupList(unitsId);
    }

    /**
     * 新增单位分组信息
     * @param unitsGroup
     * @return
     */
    public int addUnitsGroup(UnitsGroup unitsGroup) {
        int result=0;
        try {
            result=this.unitsGroupMapper.addUnitsGroup(unitsGroup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 修改单位分组信息
     * @param unitsGroup
     * @return
     */
    public int updUnitsGroup(UnitsGroup unitsGroup) {
        int result=0;
        try {
            result=this.unitsGroupMapper.updUnitsGroup(unitsGroup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据分组Id删除该分组
     * @param unitsGroupId
     * @return
     */
    public int delUnitsGroup(String unitsGroupId) {
        int result=0;
        try {
            result=this.unitsGroupMapper.delUnitsGroup(unitsGroupId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据单位分组编号获取单位分组信息
     * @param unitsGroupId
     * @return
     */
    public UnitsGroup getUnitsGroup(String unitsGroupId) {
        UnitsGroup unitsGroup=null;
        try {
            unitsGroup=this.unitsGroupMapper.getUnitsGroup(unitsGroupId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unitsGroup;
    }

    /**
     * 获取最指定单位下的最后一个分组编号,并返回新的分组编号
     * @return
     */
    public String getNewUbitsGroupId(String unitId) {
        String newUnitGroupId="";
        try {
            //获取指定单位下的最后一个分组编号
            String unitsGroupId=this.unitsGroupMapper.getNewUbitsGroupId(unitId);
            if(unitsGroupId!=null){
                String lastTwoNumber=unitsGroupId.substring(4);//截取编号最后两位数字
                Integer parseLastTwoNumber=Integer.parseInt(lastTwoNumber)+1;
                //生成新的分组编号后两位数字
                String newLastTwoNumber=String.format("%02d",parseLastTwoNumber);
                //获取到新的分组编号
                newUnitGroupId=unitId+newLastTwoNumber;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newUnitGroupId;
    }
}
