package com.contentful.java.cma.model;

import java.util.Map;

public class CMAWidget {

    public enum Id {
        singleLine, dropdown, markdown, entryLinksEditor
    }

    private String id;
    private String widgetType;
    private Id widgetId;
    private String fieldId;
    private Map<?, ?> widgetParams;

    public String getId() {
        return id;
    }

    public CMAWidget setId(String id) {
        this.id = id;
        return this;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public CMAWidget setWidgetType(String widgetType) {
        this.widgetType = widgetType;
        return this;
    }

    public Id getWidgetId() {
        return widgetId;
    }

    public CMAWidget setWidgetId(Id widgetId) {
        this.widgetId = widgetId;
        return this;
    }

    public String getFieldId() {
        return fieldId;
    }

    public CMAWidget setFieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    public Map<?, ?> getWidgetParams() {
        return widgetParams;
    }

    public CMAWidget setWidgetParams(Map<?, ?> widgetParams) {
        this.widgetParams = widgetParams;
        return this;
    }
}
