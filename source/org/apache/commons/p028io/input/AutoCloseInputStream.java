package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.AutoCloseInputStream */
/* loaded from: classes6.dex */
public class AutoCloseInputStream extends ProxyInputStream {

    /* renamed from: org.apache.commons.io.input.AutoCloseInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<AutoCloseInputStream, Builder> {
        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.build.AbstractStreamBuilder, org.apache.commons.io.input.AutoCloseInputStream$Builder] */
        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public AutoCloseInputStream get() throws IOException {
            return new AutoCloseInputStream(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream
    public void afterRead(int i) throws IOException {
        if (i == -1) {
            close();
        }
        super.afterRead(i);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        ((FilterInputStream) this).in = ClosedInputStream.INSTANCE;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public AutoCloseInputStream(Builder builder) {
        super(builder);
    }

    @Deprecated
    public AutoCloseInputStream(InputStream inputStream) {
        super(ClosedInputStream.m25110b(inputStream));
    }
}
