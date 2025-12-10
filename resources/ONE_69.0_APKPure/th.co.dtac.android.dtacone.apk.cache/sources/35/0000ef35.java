package org.apache.commons.p028io;

import java.io.IOException;

/* renamed from: org.apache.commons.io.IOIndexedException */
/* loaded from: classes6.dex */
public class IOIndexedException extends IOException {
    private static final long serialVersionUID = 1;
    private final int index;

    public IOIndexedException(int i, Throwable th2) {
        super(toMessage(i, th2), th2);
        this.index = i;
    }

    public static String toMessage(int i, Throwable th2) {
        String simpleName;
        String str = "Null";
        if (th2 == null) {
            simpleName = "Null";
        } else {
            simpleName = th2.getClass().getSimpleName();
        }
        if (th2 != null) {
            str = th2.getMessage();
        }
        return String.format("%s #%,d: %s", simpleName, Integer.valueOf(i), str);
    }

    public int getIndex() {
        return this.index;
    }
}