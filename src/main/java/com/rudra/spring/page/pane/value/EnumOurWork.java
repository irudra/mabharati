package com.rudra.spring.page.pane.value;

public enum EnumOurWork implements IEnumPage {
    EDUCATION("education", "Education"),
    SELFHELP("selfhelp", "Self Help Group"),
    GAUPROTECTION("gauprotection", "Gau Protection Group"),
    SOCIALCONCERN("socialconcern", "Other Social Concern"),
    HOWWE("howwe", "How We work"),
    BEWITHUS("bewithus", "Be with Us"),
    SUGGESTION("suggestion", "Suggestion");
    private String name;
    private String value;

    private EnumOurWork(String n, String v) {
        setName(n);
        setValue(v);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
