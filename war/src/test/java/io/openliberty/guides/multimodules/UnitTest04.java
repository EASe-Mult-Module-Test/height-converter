package io.openliberty.guides.multimodules;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UnitTest04 {

    @Test
    public void passTest() {
    }

    @Test
    public void failTest() {
        //fail("Unit test fail");
    }

    @Test
    public void errorTest() throws Exception {
        //throw new Exception("Unit test error");
    }

    @Ignore
    @Test
        public void skipTest() {
    }
}
