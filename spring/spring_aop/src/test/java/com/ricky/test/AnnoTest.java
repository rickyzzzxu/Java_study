package com.ricky.test;

import com.ricky.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext-anno.xml")
public class AnnoTest {

    @Autowired
    private TargetInterface target;
    @Test
    public void test() {
        target.save();
    }
}
