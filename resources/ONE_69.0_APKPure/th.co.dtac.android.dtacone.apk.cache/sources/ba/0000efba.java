package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOBiConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.BoundedInputStream */
/* loaded from: classes6.dex */
public class BoundedInputStream extends ProxyInputStream {

    /* renamed from: d */
    public long f73421d;

    /* renamed from: e */
    public long f73422e;

    /* renamed from: f */
    public final long f73423f;

    /* renamed from: g */
    public final IOBiConsumer f73424g;

    /* renamed from: h */
    public boolean f73425h;

    /* renamed from: org.apache.commons.io.input.BoundedInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractC12524a {
        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ AbstractStreamBuilder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        @Override // org.apache.commons.p028io.input.BoundedInputStream.AbstractC12524a
        public /* bridge */ /* synthetic */ AbstractC12524a setCount(long j) {
            return super.setCount(j);
        }

        @Override // org.apache.commons.p028io.input.BoundedInputStream.AbstractC12524a
        public /* bridge */ /* synthetic */ AbstractC12524a setMaxCount(long j) {
            return super.setMaxCount(j);
        }

        @Override // org.apache.commons.p028io.input.BoundedInputStream.AbstractC12524a
        public /* bridge */ /* synthetic */ AbstractC12524a setOnMaxCount(IOBiConsumer iOBiConsumer) {
            return super.setOnMaxCount(iOBiConsumer);
        }

        @Override // org.apache.commons.p028io.input.BoundedInputStream.AbstractC12524a
        public /* bridge */ /* synthetic */ AbstractC12524a setPropagateClose(boolean z) {
            return super.setPropagateClose(z);
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public BoundedInputStream get() throws IOException {
            return new BoundedInputStream(this);
        }
    }

    /* renamed from: org.apache.commons.io.input.BoundedInputStream$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC12524a extends ProxyInputStream.AbstractBuilder {

        /* renamed from: l */
        public long f73426l;

        /* renamed from: m */
        public long f73427m = -1;

        /* renamed from: n */
        public IOBiConsumer f73428n = E90.m68684e();

        /* renamed from: o */
        public boolean f73429o = true;

        /* renamed from: e */
        public long m25340e() {
            return this.f73426l;
        }

        /* renamed from: f */
        public long m25339f() {
            return this.f73427m;
        }

        /* renamed from: g */
        public IOBiConsumer m25338g() {
            return this.f73428n;
        }

        /* renamed from: h */
        public boolean m25337h() {
            return this.f73429o;
        }

        public AbstractC12524a setCount(long j) {
            this.f73426l = Math.max(0L, j);
            return (AbstractC12524a) asThis();
        }

        public AbstractC12524a setMaxCount(long j) {
            this.f73427m = Math.max(-1L, j);
            return (AbstractC12524a) asThis();
        }

        public AbstractC12524a setOnMaxCount(IOBiConsumer iOBiConsumer) {
            if (iOBiConsumer == null) {
                iOBiConsumer = E90.m68684e();
            }
            this.f73428n = iOBiConsumer;
            return (AbstractC12524a) asThis();
        }

        public AbstractC12524a setPropagateClose(boolean z) {
            this.f73429o = z;
            return (AbstractC12524a) asThis();
        }
    }

    public BoundedInputStream(Builder builder) {
        super(builder);
        this.f73425h = true;
        this.f73421d = builder.m25340e();
        this.f73423f = builder.m25339f();
        this.f73425h = builder.m25337h();
        this.f73424g = builder.m25338g();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream
    public synchronized void afterRead(int i) throws IOException {
        if (i != -1) {
            try {
                this.f73421d += i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.afterRead(i);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (m25342d()) {
            onMaxLength(this.f73423f, getCount());
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f73425h) {
            super.close();
        }
    }

    /* renamed from: d */
    public final boolean m25342d() {
        if (this.f73423f >= 0 && getCount() >= this.f73423f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final long m25341g(long j) {
        long j2 = this.f73423f;
        if (j2 >= 0) {
            return Math.min(j, j2 - getCount());
        }
        return j;
    }

    public synchronized long getCount() {
        return this.f73421d;
    }

    public long getMaxCount() {
        return this.f73423f;
    }

    @Deprecated
    public long getMaxLength() {
        return this.f73423f;
    }

    public long getRemaining() {
        return Math.max(0L, getMaxCount() - getCount());
    }

    public boolean isPropagateClose() {
        return this.f73425h;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f73422e = this.f73421d;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    public void onMaxLength(long j, long j2) throws IOException {
        this.f73424g.accept(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m25342d()) {
            onMaxLength(this.f73423f, getCount());
            return -1;
        }
        return super.read();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        ((FilterInputStream) this).in.reset();
        this.f73421d = this.f73422e;
    }

    @Deprecated
    public void setPropagateClose(boolean z) {
        this.f73425h = z;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(m25341g(j));
        this.f73421d += skip;
        return skip;
    }

    public String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (m25342d()) {
            onMaxLength(this.f73423f, getCount());
            return -1;
        }
        return super.read(bArr, i, (int) m25341g(i2));
    }

    @Deprecated
    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public BoundedInputStream(InputStream inputStream, Builder builder) {
        super(inputStream, builder);
        this.f73425h = true;
        this.f73421d = builder.m25340e();
        this.f73423f = builder.m25339f();
        this.f73425h = builder.m25337h();
        this.f73424g = builder.m25338g();
    }

    @Deprecated
    public BoundedInputStream(InputStream inputStream, long j) {
        this(inputStream, (Builder) builder().setMaxCount(j));
    }
}