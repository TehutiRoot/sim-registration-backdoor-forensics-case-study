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
        public static /* synthetic */ UncheckedFilterReader m24988e(Builder builder) {
            return builder.m24987f();
        }

        /* renamed from: f */
        public final /* synthetic */ UncheckedFilterReader m24987f() {
            return new UncheckedFilterReader(getReader());
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedFilterReader get() {
            return (UncheckedFilterReader) Uncheck.get(new IOSupplier() { // from class: LX1
                {
                    UncheckedFilterReader.Builder.this = this;
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC17712Hb0.m68064a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    return UncheckedFilterReader.Builder.m24988e(UncheckedFilterReader.Builder.this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC17712Hb0.m68063b(this);
                }
            });
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m25006b(UncheckedFilterReader uncheckedFilterReader) {
        return uncheckedFilterReader.m24991u();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ void m25005d(UncheckedFilterReader uncheckedFilterReader) {
        uncheckedFilterReader.m24990v();
    }

    /* renamed from: g */
    public static /* synthetic */ void m25004g(UncheckedFilterReader uncheckedFilterReader) {
        uncheckedFilterReader.m24997o();
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m25003i(UncheckedFilterReader uncheckedFilterReader, CharBuffer charBuffer) {
        return uncheckedFilterReader.m24992t(charBuffer);
    }

    /* renamed from: j */
    public static /* synthetic */ Integer m25002j(UncheckedFilterReader uncheckedFilterReader, char[] cArr, int i, int i2) {
        return uncheckedFilterReader.m24993s(cArr, i, i2);
    }

    /* renamed from: k */
    public static /* synthetic */ Integer m25001k(UncheckedFilterReader uncheckedFilterReader) {
        return uncheckedFilterReader.m24995q();
    }

    /* renamed from: l */
    public static /* synthetic */ Long m25000l(UncheckedFilterReader uncheckedFilterReader, long j) {
        return uncheckedFilterReader.m24989w(j);
    }

    /* renamed from: m */
    public static /* synthetic */ Integer m24999m(UncheckedFilterReader uncheckedFilterReader, char[] cArr) {
        return uncheckedFilterReader.m24994r(cArr);
    }

    /* renamed from: n */
    public static /* synthetic */ void m24998n(UncheckedFilterReader uncheckedFilterReader, int i) {
        uncheckedFilterReader.m24996p(i);
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: FX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterReader.m25004g(UncheckedFilterReader.this);
            }
        });
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void mark(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: IX1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedFilterReader.m24998n(UncheckedFilterReader.this, i2);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
                return AbstractC20057ga0.m31095a(this, iOIntConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC20057ga0.m31094b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC20057ga0.m31093c(this);
            }
        }, i);
    }

    /* renamed from: o */
    public final /* synthetic */ void m24997o() {
        super.close();
    }

    /* renamed from: p */
    public final /* synthetic */ void m24996p(int i) {
        super.mark(i);
    }

    /* renamed from: q */
    public final /* synthetic */ Integer m24995q() {
        return Integer.valueOf(super.read());
    }

    /* renamed from: r */
    public final /* synthetic */ Integer m24994r(char[] cArr) {
        return Integer.valueOf(super.read(cArr));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: CX1
            {
                UncheckedFilterReader.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedFilterReader.m25001k(UncheckedFilterReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws UncheckedIOException {
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: HX1
            {
                UncheckedFilterReader.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedFilterReader.m25006b(UncheckedFilterReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void reset() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: JX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterReader.m25005d(UncheckedFilterReader.this);
            }
        });
    }

    /* renamed from: s */
    public final /* synthetic */ Integer m24993s(char[] cArr, int i, int i2) {
        return Integer.valueOf(super.read(cArr, i, i2));
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j) throws UncheckedIOException {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: KX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterReader.m25000l(UncheckedFilterReader.this, ((Long) obj).longValue());
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

    /* renamed from: t */
    public final /* synthetic */ Integer m24992t(CharBuffer charBuffer) {
        return Integer.valueOf(super.read(charBuffer));
    }

    /* renamed from: u */
    public final /* synthetic */ Boolean m24991u() {
        return Boolean.valueOf(super.ready());
    }

    /* renamed from: v */
    public final /* synthetic */ void m24990v() {
        super.reset();
    }

    /* renamed from: w */
    public final /* synthetic */ Long m24989w(long j) {
        return Long.valueOf(super.skip(j));
    }

    public UncheckedFilterReader(Reader reader) {
        super(reader);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: GX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterReader.m24999m(UncheckedFilterReader.this, (char[]) obj);
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
        }, cArr)).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOTriFunction() { // from class: DX1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedFilterReader.m25002j(UncheckedFilterReader.this, (char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: EX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterReader.m25003i(UncheckedFilterReader.this, (CharBuffer) obj);
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
        }, charBuffer)).intValue();
    }
}
