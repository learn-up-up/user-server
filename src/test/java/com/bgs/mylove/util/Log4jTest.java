package com.bgs.mylove.util;

import com.bgs.mylove.UserServerApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;

/**
 * <pre>
 * *********************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * *********************************************
 *  Version       Date      Author    Desc
 *   v1.0     2018-04-25      wujianwen  ${添加描述}
 *
 * *********************************************
 * </pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest/*(classes = UserServerApplication.class)*/
@AutoConfigureMockMvc
public class Log4jTest {
	private static final Logger logger = LogManager.getLogger(Log4jTest.class);

	@Rule
	public OutputCapture output = new OutputCapture();

	@Autowired
	private MockMvc mvc;

	@Test
	public void testLogger(){
		logger.info("hello world");
		this.output.expect(containsString("hello world"));
	}

}
