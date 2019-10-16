package com.jzlatevski.test001;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    public void should_return_zakisback_when_param_is_not_null() {
        HelloController HelloController = new HelloController();
        String result = HelloController.index("zakisback");

        assertThat (result).isEqualTo("Hello zakisback");
    }
}
