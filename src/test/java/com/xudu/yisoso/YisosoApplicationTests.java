package com.xudu.yisoso;

import cn.hutool.http.HttpUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YisosoApplicationTests {

    @Test
    void testHutoolHttpUtil() {

        String url = "https://www.baidu.com";
        String result = HttpUtil.get(url);
        System.out.println(result);

    }

}

