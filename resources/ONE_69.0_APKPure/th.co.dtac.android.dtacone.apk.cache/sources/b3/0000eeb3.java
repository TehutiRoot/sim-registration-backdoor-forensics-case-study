package org.apache.commons.cli;

/* loaded from: classes6.dex */
public class ParseException extends Exception {
    private static final long serialVersionUID = 9112808380089253192L;

    public ParseException(String str) {
        super(str);
    }

    public static ParseException wrap(Throwable th2) throws UnsupportedOperationException {
        if (!(th2 instanceof UnsupportedOperationException)) {
            if (th2 instanceof ParseException) {
                return (ParseException) th2;
            }
            return new ParseException(th2);
        }
        throw ((UnsupportedOperationException) th2);
    }

    public ParseException(Throwable th2) {
        super(th2);
    }
}