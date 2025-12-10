package org.apache.commons.p028io.input;

import java.io.FilterReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOTriFunction;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.input.UncheckedFilterReader;

/* renamed from: org.apache.commons.io.input.UncheckedFilterReader */
/* loaded from: classes6.dex */
public final class UncheckedFilterReader extends FilterReader {

    /* renamed from: org.apache.commons.io.input.UncheckedFilterReader$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterReader, Builder> {
        /* renamed from: e */
        public static /* synthetic */ UncheckedFilterReader m25178e(Builder builder) {
            return builder.m25177f();
        }

        /* renamed from: f */
        public final /* synthetic */ UncheckedFilterReader m25177f() {
            return new UncheckedFilterReader(getReader());
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedFilterReader get() {
            return (UncheckedFilterReader) Uncheck.get(new IOSupplier() { // from class: IY1
                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC18132Nb0.m67225a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    return UncheckedFilterReader.Builder.m25178e(UncheckedFilterReader.Builder.this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC18132Nb0.m67224b(this);
                }
            });
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m25196b(UncheckedFilterReader uncheckedFilterReader) {
        return uncheckedFilterReader.m25181u();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ void m25195d(UncheckedFilterReader uncheckedFilterReader) {
        uncheckedFilterReader.m25180v();
    }

    /* renamed from: g */
    public static /* synthetic */ void m25194g(UncheckedFilterReader uncheckedFilterReader) {
        uncheckedFilterReader.m25187o();
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m25193i(UncheckedFilterReader uncheckedFilterReader, CharBuffer charBuffer) {
        return uncheckedFilterReader.m25182t(charBuffer);
    }

    /* renamed from: j */
    public static /* synthetic */ Integer m25192j(UncheckedFilterReader uncheckedFilterReader, char[] cArr, int i, int i2) {
        return uncheckedFilterReader.m25183s(cArr, i, i2);
    }

    /* renamed from: l */
    public static /* synthetic */ Long m25190l(UncheckedFilterReader uncheckedFilterReader, long j) {
        return uncheckedFilterReader.m25179w(j);
    }

    /* renamed from: m */
    public static /* synthetic */ Integer m25189m(UncheckedFilterReader uncheckedFilterReader, char[] cArr) {
        return uncheckedFilterReader.m25184r(cArr);
    }

    /* renamed from: n */
    public static /* synthetic */ void m25188n(UncheckedFilterReader uncheckedFilterReader, int i) {
        uncheckedFilterReader.m25186p(i);
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: CY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterReader.m25194g(UncheckedFilterReader.this);
            }
        });
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void mark(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: FY1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedFilterReader.m25188n(UncheckedFilterReader.this, i2);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
                return AbstractC21148ma0.m26625a(this, iOIntConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC21148ma0.m26624b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC21148ma0.m26623c(this);
            }
        }, i);
    }

    /* renamed from: o */
    public final /* synthetic */ void m25187o() {
        super.close();
    }

    /* renamed from: p */
    public final /* synthetic */ void m25186p(int i) {
        super.mark(i);
    }

    /* renamed from: q */
    public final /* synthetic */ Integer m25185q() {
        return Integer.valueOf(super.read());
    }

    /* renamed from: r */
    public final /* synthetic */ Integer m25184r(char[] cArr) {
        return Integer.valueOf(super.read(cArr));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: zY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Integer m25185q;
                m25185q = UncheckedFilterReader.this.m25185q();
                return m25185q;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws UncheckedIOException {
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: EY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedFilterReader.m25196b(UncheckedFilterReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).booleanValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void reset() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: GY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterReader.m25195d(UncheckedFilterReader.this);
            }
        });
    }

    /* renamed from: s */
    public final /* synthetic */ Integer m25183s(char[] cArr, int i, int i2) {
        return Integer.valueOf(super.read(cArr, i, i2));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j) throws UncheckedIOException {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: HY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterReader.m25190l(UncheckedFilterReader.this, ((Long) obj).longValue());
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

    /* renamed from: t */
    public final /* synthetic */ Integer m25182t(CharBuffer charBuffer) {
        return Integer.valueOf(super.read(charBuffer));
    }

    /* renamed from: u */
    public final /* synthetic */ Boolean m25181u() {
        return Boolean.valueOf(super.ready());
    }

    /* renamed from: v */
    public final /* synthetic */ void m25180v() {
        super.reset();
    }

    /* renamed from: w */
    public final /* synthetic */ Long m25179w(long j) {
        return Long.valueOf(super.skip(j));
    }

    public UncheckedFilterReader(Reader reader) {
        super(reader);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: DY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterReader.m25189m(UncheckedFilterReader.this, (char[]) obj);
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
        }, cArr)).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOTriFunction() { // from class: AY1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC18392Rb0.m66627a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedFilterReader.m25192j(UncheckedFilterReader.this, (char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: BY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterReader.m25193i(UncheckedFilterReader.this, (CharBuffer) obj);
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
        }, charBuffer)).intValue();
    }
}