package org.apache.commons.p028io;

import java.io.IOException;

@Deprecated
/* renamed from: org.apache.commons.io.IOExceptionWithCause */
/* loaded from: classes6.dex */
public class IOExceptionWithCause extends IOException {
    private static final long serialVersionUID = 1;

    public IOExceptionWithCause(String str, Throwable th2) {
        super(str, th2);
    }

    public IOExceptionWithCause(Throwable th2) {
        super(th2);
    }
}