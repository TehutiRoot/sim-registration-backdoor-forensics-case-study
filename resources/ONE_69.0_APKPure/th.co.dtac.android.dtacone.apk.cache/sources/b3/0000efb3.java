package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.AbstractInputStream */
/* loaded from: classes6.dex */
public abstract class AbstractInputStream extends InputStream {

    /* renamed from: a */
    public boolean f73408a;

    /* renamed from: b */
    public void m25350b() {
        AbstractC18141Ne0.m67223a(!isClosed());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73408a = true;
    }

    public boolean isClosed() {
        return this.f73408a;
    }

    public void setClosed(boolean z) {
        this.f73408a = z;
    }
}