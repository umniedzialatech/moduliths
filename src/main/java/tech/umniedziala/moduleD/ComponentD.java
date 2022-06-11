package tech.umniedziala.moduleD;

import org.springframework.stereotype.Component;
import tech.umniedziala.moduleC.ComponentC;

@Component
public class ComponentD {

    private ComponentC componentC;

    public ComponentD(ComponentC componentC) {
        this.componentC = componentC;
    }
}
