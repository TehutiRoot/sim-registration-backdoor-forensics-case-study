package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.CloseShieldInputStream */
/* loaded from: classes6.dex */
public class CloseShieldInputStream extends ProxyInputStream {
    @Deprecated
    public CloseShieldInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public static InputStream systemIn(InputStream inputStream) {
        if (inputStream == System.in) {
            return wrap(inputStream);
        }
        return inputStream;
    }

    public static CloseShieldInputStream wrap(InputStream inputStream) {
        return new CloseShieldInputStream(inputStream);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = ClosedInputStream.INSTANCE;
    }
}
