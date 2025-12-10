package org.apache.commons.cli;

/* loaded from: classes6.dex */
public class UnrecognizedOptionException extends ParseException {
    private static final long serialVersionUID = -252504690284625623L;
    private final String option;

    public UnrecognizedOptionException(String str) {
        this(str, null);
    }

    public String getOption() {
        return this.option;
    }

    public UnrecognizedOptionException(String str, String str2) {
        super(str);
        this.option = str2;
    }
}
