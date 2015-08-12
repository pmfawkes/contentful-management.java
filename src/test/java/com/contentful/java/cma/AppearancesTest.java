package com.contentful.java.cma;

import com.contentful.java.cma.model.CMAAppearance;
import com.contentful.java.cma.model.CMAContentType;
import com.contentful.java.cma.model.CMAField;
import com.contentful.java.cma.model.CMAWidget;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class AppearancesTest {

    @Test
    public void fetchesOne() {
        CMAClient client = new CMAClient.Builder()
                .setAccessToken("d0696f99c12d01216e73ab31a50e03c8918623d76833e614610e72a2808cd13b")
                .build();

        CMAContentType contentType = client.contentTypes().fetchOne("b4ya27r6y2em", "artefact-image");
        CMAField field = null;
        for (CMAField f: contentType.getFields()) {
            if (f.getName().equals("Colour Palette")) {
                field = f;
            }
        }



        CMAAppearance appearance = client.appearances().fetchOne("b4ya27r6y2em", "artefact-image");
        CMAWidget widget = null;
        for (CMAWidget w: appearance.getWidgets()) {
            if (w.getId().equals(field.getId())) {

            }
        }


        assertThat(appearance.getContentTypeId(), is("artefact-image"));
    }
}
