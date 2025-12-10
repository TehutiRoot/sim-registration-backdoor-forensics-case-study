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
    public long f73337d;

    /* renamed from: e */
    public long f73338e;

    /* renamed from: f */
    public final long f73339f;

    /* renamed from: g */
    public final IOBiConsumer f73340g;

    /* renamed from: h */
    public boolean f73341h;

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
        public long f73342l;

        /* renamed from: m */
        public long f73343m = -1;

        /* renamed from: n */
        public IOBiConsumer f73344n = AbstractC23086y90.m327e();

        /* renamed from: o */
        public boolean f73345o = true;

        /* renamed from: e */
        public long m25150e() {
            return this.f73342l;
        }

        /* renamed from: f */
        public long m25149f() {
            return this.f73343m;
        }

        /* renamed from: g */
        public IOBiConsumer m25148g() {
            return this.f73344n;
        }

        /* renamed from: h */
        public boolean m25147h() {
            return this.f73345o;
        }

        public AbstractC12524a setCount(long j) {
            this.f73342l = Math.max(0L, j);
            return (AbstractC12524a) asThis();
        }

        public AbstractC12524a setMaxCount(long j) {
            this.f73343m = Math.max(-1L, j);
            return (AbstractC12524a) asThis();
        }

        public AbstractC12524a setOnMaxCount(IOBiConsumer iOBiConsumer) {
            if (iOBiConsumer == null) {
                iOBiConsumer = AbstractC23086y90.m327e();
            }
            this.f73344n = iOBiConsumer;
            return (AbstractC12524a) asThis();
        }

        public AbstractC12524a setPropagateClose(boolean z) {
            this.f73345o = z;
            return (AbstractC12524a) asThis();
        }
    }

    public BoundedInputStream(Builder builder) {
        super(builder);
        this.f73341h = true;
        this.f73337d = builder.m25150e();
        this.f73339f = builder.m25149f();
        this.f73341h = builder.m25147h();
        this.f73340g = builder.m25148g();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream
    public synchronized void afterRead(int i) throws IOException {
        if (i != -1) {
            try {
                this.f73337d += i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.afterRead(i);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (m25152d()) {
            onMaxLength(this.f73339f, getCount());
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f73341h) {
            super.close();
        }
    }

    /* renamed from: d */
    public final boolean m25152d() {
        if (this.f73339f >= 0 && getCount() >= this.f73339f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final long m25151g(long j) {
        long j2 = this.f73339f;
        if (j2 >= 0) {
            return Math.min(j, j2 - getCount());
        }
        return j;
    }

    public synchronized long getCount() {
        return this.f73337d;
    }

    public long getMaxCount() {
        return this.f73339f;
    }

    @Deprecated
    public long getMaxLength() {
        return this.f73339f;
    }

    public long getRemaining() {
        return Math.max(0L, getMaxCount() - getCount());
    }

    public boolean isPropagateClose() {
        return this.f73341h;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f73338e = this.f73337d;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    public void onMaxLength(long j, long j2) throws IOException {
        this.f73340g.accept(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m25152d()) {
            onMaxLength(this.f73339f, getCount());
            return -1;
        }
        return super.read();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        ((FilterInputStream) this).in.reset();
        this.f73337d = this.f73338e;
    }

    @Deprecated
    public void setPropagateClose(boolean z) {
        this.f73341h = z;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(m25151g(j));
        this.f73337d += skip;
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
        if (m25152d()) {
            onMaxLength(this.f73339f, getCount());
            return -1;
        }
        return super.read(bArr, i, (int) m25151g(i2));
    }

    @Deprecated
    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public BoundedInputStream(InputStream inputStream, Builder builder) {
        super(inputStream, builder);
        this.f73341h = true;
        this.f73337d = builder.m25150e();
        this.f73339f = builder.m25149f();
        this.f73341h = builder.m25147h();
        this.f73340g = builder.m25148g();
    }

    @Deprecated
    public BoundedInputStream(InputStream inputStream, long j) {
        this(inputStream, (Builder) builder().setMaxCount(j));
    }
}
