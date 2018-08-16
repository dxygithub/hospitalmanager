package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.DeskMapper;
import com.dyhc.hospitalmanager.pojo.Desk;
import com.dyhc.hospitalmanager.service.DeskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deskServiceImpl")
public class DeskServiceImpl implements DeskService {

    @Resource(name = "deskMapper")
    private DeskMapper deskMapper;

    /**
     * wwm
     * 查询所有科室
     * @return
     * @throws Exception
     */
    @Override
    public List<Desk> getDeskList() throws Exception {
        return deskMapper.getDeskList();
    }

    @Override
    public int addDesk(Desk desk) throws Exception{
        //获取最后一个科室编号
        String deskId = deskMapper.selLastDeskId();
        //转换为Integer
        Integer integerDeskId = Integer.parseInt(deskId);
        integerDeskId+=1;
        //如果小于二位数，新增一位数
        if(integerDeskId<10)
            deskId="0"+integerDeskId;
        else
            deskId=integerDeskId.toString();

        desk.setDeskId(deskId);
        return deskMapper.addDesk(desk);
    }

    /**
     * 修改科室
     * @param desk 科室对象
     * @return 执行行数
     */
    @Override
    public int updDesk(Desk desk) throws Exception{
        return deskMapper.updDesk(desk);
    }

    @Override
    public int delDesk(String deskId) throws Exception{
        return deskMapper.delDesk(deskId);
    }

    @Override
    public Desk selDeksById(String deskId) throws Exception{
        return deskMapper.selDeksById(deskId);
    }
}