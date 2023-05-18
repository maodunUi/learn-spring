package cn.maodun.anno.service.impl;

import cn.maodun.anno.dao.CityDao;
import cn.maodun.anno.service.CityService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author DELL
 * @date 2022/9/19
 */
@Service("cityService")
public class CityServiceImpl implements CityService {

    @Resource(name = "cityDao")
    private CityDao cityDao;

    public void query() {
        cityDao.query();
    }

}
