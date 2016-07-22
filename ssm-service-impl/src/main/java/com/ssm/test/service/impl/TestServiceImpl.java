package com.ssm.test.service.impl;

import com.ssm.test.bean.TestBean;
import com.ssm.test.dao.TestDao;
import com.ssm.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author maoxian
 * @pachage com.ssm.test.service.impl.
 * @description {TODO}功能描述.
 * @date 16/7/21 下午1:04
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    public Integer insert(TestBean tb) {
        return this.testDao.insert(tb);
    }
}
