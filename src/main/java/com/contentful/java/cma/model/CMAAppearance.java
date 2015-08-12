package com.contentful.java.cma.model;

import java.util.List;

public class CMAAppearance extends StatefulResource {

    String title;
    String contentTypeId;
    List<CMAWidget> widgets;

    public String getTitle() {
        return title;
    }

    public CMAAppearance setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public CMAAppearance setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
        return this;
    }

    public List<CMAWidget> getWidgets() {
        return widgets;
    }

    public CMAAppearance setWidgets(List<CMAWidget> widgets) {
        this.widgets = widgets;
        return this;
    }
}
