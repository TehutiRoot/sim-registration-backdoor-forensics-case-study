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
        /* renamed from: e */
        public static /* synthetic */ UncheckedFilterInputStream m25008e(Builder builder) {
            return builder.m25007f();
        }

        /* renamed from: f */
        public final /* synthetic */ UncheckedFilterInputStream m25007f() {
            return new UncheckedFilterInputStream(getInputStream());
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedFilterInputStream get() {
            return (UncheckedFilterInputStream) Uncheck.get(new IOSupplier() { // from class: wX1
                {
                    UncheckedFilterInputStream.Builder.this = this;
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC17712Hb0.m68064a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    return UncheckedFilterInputStream.Builder.m25008e(UncheckedFilterInputStream.Builder.this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC17712Hb0.m68063b(this);
                }
            });
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m25022b(UncheckedFilterInputStream uncheckedFilterInputStream) {
        return uncheckedFilterInputStream.m25015m();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ Long m25021d(UncheckedFilterInputStream uncheckedFilterInputStream, long j) {
        return uncheckedFilterInputStream.m25009s(j);
    }

    /* renamed from: g */
    public static /* synthetic */ void m25020g(UncheckedFilterInputStream uncheckedFilterInputStream) {
        uncheckedFilterInputStream.m25014n();
    }

    /* renamed from: i */
    public static /* synthetic */ void m25019i(UncheckedFilterInputStream uncheckedFilterInputStream) {
        uncheckedFilterInputStream.m25010r();
    }

    /* renamed from: j */
    public static /* synthetic */ Integer m25018j(UncheckedFilterInputStream uncheckedFilterInputStream, byte[] bArr) {
        return uncheckedFilterInputStream.m25012p(bArr);
    }

    /* renamed from: k */
    public static /* synthetic */ Integer m25017k(UncheckedFilterInputStream uncheckedFilterInputStream) {
        return uncheckedFilterInputStream.m25013o();
    }

    /* renamed from: l */
    public static /* synthetic */ Integer m25016l(UncheckedFilterInputStream uncheckedFilterInputStream, byte[] bArr, int i, int i2) {
        return uncheckedFilterInputStream.m25011q(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: tX1
            {
                UncheckedFilterInputStream.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedFilterInputStream.m25022b(UncheckedFilterInputStream.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: sX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterInputStream.m25020g(UncheckedFilterInputStream.this);
            }
        });
    }

    /* renamed from: m */
    public final /* synthetic */ Integer m25015m() {
        return Integer.valueOf(super.available());
    }

    /* renamed from: n */
    public final /* synthetic */ void m25014n() {
        super.close();
    }

    /* renamed from: o */
    public final /* synthetic */ Integer m25013o() {
        return Integer.valueOf(super.read());
    }

    /* renamed from: p */
    public final /* synthetic */ Integer m25012p(byte[] bArr) {
        return Integer.valueOf(super.read(bArr));
    }

    /* renamed from: q */
    public final /* synthetic */ Integer m25011q(byte[] bArr, int i, int i2) {
        return Integer.valueOf(super.read(bArr, i, i2));
    }

    /* renamed from: r */
    public final /* synthetic */ void m25010r() {
        super.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: pX1
            {
                UncheckedFilterInputStream.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedFilterInputStream.m25017k(UncheckedFilterInputStream.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: qX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterInputStream.m25019i(UncheckedFilterInputStream.this);
            }
        });
    }

    /* renamed from: s */
    public final /* synthetic */ Long m25009s(long j) {
        return Long.valueOf(super.skip(j));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws UncheckedIOException {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: uX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterInputStream.m25021d(UncheckedFilterInputStream.this, ((Long) obj).longValue());
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC19197ba0.m51983g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC19197ba0.m51986d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        }, Long.valueOf(j))).longValue();
    }

    public UncheckedFilterInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: vX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterInputStream.m25018j(UncheckedFilterInputStream.this, (byte[]) obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC19197ba0.m51983g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC19197ba0.m51986d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        }, bArr)).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOTriFunction() { // from class: rX1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedFilterInputStream.m25016l(UncheckedFilterInputStream.this, (byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }
}
