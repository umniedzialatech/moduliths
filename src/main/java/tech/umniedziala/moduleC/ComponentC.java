package tech.umniedziala.moduleC;


import org.springframework.stereotype.Component;
import tech.umniedziala.moduleD.ComponentD;

@Component
public class ComponentC {

    private ComponentD componentD;

    public ComponentC(ComponentD componentD) {
        this.componentD = componentD;
    }

}
