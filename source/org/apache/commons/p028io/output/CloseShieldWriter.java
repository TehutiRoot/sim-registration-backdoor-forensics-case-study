package org.apache.commons.p028io.output;

import java.io.FilterWriter;
import java.io.Writer;

/* renamed from: org.apache.commons.io.output.CloseShieldWriter */
/* loaded from: classes6.dex */
public class CloseShieldWriter extends ProxyWriter {
    @Deprecated
    public CloseShieldWriter(Writer writer) {
        super(writer);
    }

    public static CloseShieldWriter wrap(Writer writer) {
        return new CloseShieldWriter(writer);
    }

    @Override // org.apache.commons.p028io.output.ProxyWriter, java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterWriter) this).out = ClosedWriter.INSTANCE;
    }
}
