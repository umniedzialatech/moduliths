package tech.umniedziala.moduleA;

import org.springframework.stereotype.Component;
import tech.umniedziala.moduleA.internal.InternalComponentA;

@Component
public class ComponentA {

    private final InternalComponentA internalComponentA;

    public ComponentA(InternalComponentA internalComponentA) {
        this.internalComponentA = internalComponentA;
    }
}
