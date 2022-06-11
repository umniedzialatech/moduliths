package tech.umniedziala.moduleA;

import org.junit.jupiter.api.Test;
import org.moduliths.test.ModuleTest;
import org.springframework.beans.factory.annotation.Autowired;
import tech.umniedziala.moduleA.internal.InternalComponentA;
import tech.umniedziala.moduleB.ComponentB;

@ModuleTest
public class ModuleATests {

    @Autowired
    private InternalComponentA internalComponentA;

    @Autowired
    private ComponentB componentB; // this bean will not be initialized because it is in a different module.

    @Test
    void moduleTests() {
        // intentionally left empty
    }
}
