package com.yupi.springbootinit.service;

import com.yupi.springbootinit.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author C5311821
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-04-08 18:56:30
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
        void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
