package tech.umniedziala;

import org.junit.jupiter.api.Test;
import org.moduliths.docs.Documenter;
import org.moduliths.model.Modules;

import java.io.IOException;

import static org.moduliths.docs.Documenter.Options.ElementsWithoutRelationships.*;

public class DocumentationTests {

    @Test
    void documentation() throws IOException {
        Modules modules = Modules.of(TestApplication.class);
        Documenter documenter = new Documenter(modules);
        Documenter.Options options = Documenter.Options.defaults()
                .withElementsWithoutRelationships(VISIBLE);
        documenter.writeModulesAsPlantUml(options);
        documenter.writeModuleCanvases(Documenter.CanvasOptions.defaults().withApiBase("{javadoc}"));
    }
}
