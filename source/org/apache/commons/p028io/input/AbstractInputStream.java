package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.AbstractInputStream */
/* loaded from: classes6.dex */
public abstract class AbstractInputStream extends InputStream {

    /* renamed from: a */
    public boolean f73324a;

    /* renamed from: b */
    public void m25160b() {
        AbstractC17721He0.m68061a(!isClosed());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73324a = true;
    }

    public boolean isClosed() {
        return this.f73324a;
    }

    public void setClosed(boolean z) {
        this.f73324a = z;
    }
}
