package asg.dev.abc30.webmodel.test;

import org.junit.jupiter.api.Test;

public class TestEnvProfile {
    @Test
    public void getEnvProfile() {
        System.out.println("Target Host: " + System.getenv("TEST_HOST"));
    }

}
