package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOTriFunction;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.input.UncheckedFilterInputStream;

/* renamed from: org.apache.commons.io.input.UncheckedFilterInputStream */
/* loaded from: classes6.dex */
public final class UncheckedFilterInputStream extends FilterInputStream {

    /* renamed from: org.apache.commons.io.input.UncheckedFilterInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterInputStream, Builder> {
        /* renamed from: f */
        public final /* synthetic */ UncheckedFilterInputStream m25197f() {
            return new UncheckedFilterInputStream(getInputStream());
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedFilterInputStream get() {
            return (UncheckedFilterInputStream) Uncheck.get(new IOSupplier() { // from class: tY1
                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC18132Nb0.m67225a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    UncheckedFilterInputStream m25197f;
                    m25197f = UncheckedFilterInputStream.Builder.this.m25197f();
                    return m25197f;
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC18132Nb0.m67224b(this);
                }
            });
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: i */
    public static /* synthetic */ void m25209i(UncheckedFilterInputStream uncheckedFilterInputStream) {
        uncheckedFilterInputStream.m25200r();
    }

    /* renamed from: k */
    public static /* synthetic */ Integer m25207k(UncheckedFilterInputStream uncheckedFilterInputStream) {
        return uncheckedFilterInputStream.m25203o();
    }

    /* renamed from: l */
    public static /* synthetic */ Integer m25206l(UncheckedFilterInputStream uncheckedFilterInputStream, byte[] bArr, int i, int i2) {
        return uncheckedFilterInputStream.m25201q(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: qY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Integer m25205m;
                m25205m = UncheckedFilterInputStream.this.m25205m();
                return m25205m;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: pY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterInputStream.this.m25204n();
            }
        });
    }

    /* renamed from: m */
    public final /* synthetic */ Integer m25205m() {
        return Integer.valueOf(super.available());
    }

    /* renamed from: n */
    public final /* synthetic */ void m25204n() {
        super.close();
    }

    /* renamed from: o */
    public final /* synthetic */ Integer m25203o() {
        return Integer.valueOf(super.read());
    }

    /* renamed from: p */
    public final /* synthetic */ Integer m25202p(byte[] bArr) {
        return Integer.valueOf(super.read(bArr));
    }

    /* renamed from: q */
    public final /* synthetic */ Integer m25201q(byte[] bArr, int i, int i2) {
        return Integer.valueOf(super.read(bArr, i, i2));
    }

    /* renamed from: r */
    public final /* synthetic */ void m25200r() {
        super.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: mY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedFilterInputStream.m25207k(UncheckedFilterInputStream.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: nY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterInputStream.m25209i(UncheckedFilterInputStream.this);
            }
        });
    }

    /* renamed from: s */
    public final /* synthetic */ Long m25199s(long j) {
        return Long.valueOf(super.skip(j));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws UncheckedIOException {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: rY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                Long m25199s;
                m25199s = UncheckedFilterInputStream.this.m25199s(((Long) obj).longValue());
                return m25199s;
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC20283ha0.m31212f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC20283ha0.m31211g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC20283ha0.m31215c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC20283ha0.m31214d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        }, Long.valueOf(j))).longValue();
    }

    public UncheckedFilterInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: sY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                Integer m25202p;
                m25202p = UncheckedFilterInputStream.this.m25202p((byte[]) obj);
                return m25202p;
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC20283ha0.m31212f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC20283ha0.m31211g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC20283ha0.m31215c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC20283ha0.m31214d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        }, bArr)).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOTriFunction() { // from class: oY1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC18392Rb0.m66627a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedFilterInputStream.m25206l(UncheckedFilterInputStream.this, (byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }
}