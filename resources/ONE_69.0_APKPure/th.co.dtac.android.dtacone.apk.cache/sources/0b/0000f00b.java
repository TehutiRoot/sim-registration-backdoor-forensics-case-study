package org.apache.commons.p028io.input;

import java.io.BufferedReader;
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
import org.apache.commons.p028io.input.UncheckedBufferedReader;

/* renamed from: org.apache.commons.io.input.UncheckedBufferedReader */
/* loaded from: classes6.dex */
public final class UncheckedBufferedReader extends BufferedReader {

    /* renamed from: org.apache.commons.io.input.UncheckedBufferedReader$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedBufferedReader, Builder> {
        /* renamed from: e */
        public static /* synthetic */ UncheckedBufferedReader m25214e(Builder builder) {
            return builder.m25213f();
        }

        /* renamed from: f */
        public final /* synthetic */ UncheckedBufferedReader m25213f() {
            return new UncheckedBufferedReader(getReader(), getBufferSize());
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedBufferedReader get() {
            return (UncheckedBufferedReader) Uncheck.get(new IOSupplier() { // from class: lY1
                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC18132Nb0.m67225a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    return UncheckedBufferedReader.Builder.m25214e(UncheckedBufferedReader.Builder.this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC18132Nb0.m67224b(this);
                }
            });
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Long m25234b(UncheckedBufferedReader uncheckedBufferedReader, long j) {
        return uncheckedBufferedReader.m25215y(j);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m25233d(UncheckedBufferedReader uncheckedBufferedReader) {
        return uncheckedBufferedReader.m25217w();
    }

    /* renamed from: g */
    public static /* synthetic */ Integer m25232g(UncheckedBufferedReader uncheckedBufferedReader) {
        return uncheckedBufferedReader.m25222r();
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m25231i(UncheckedBufferedReader uncheckedBufferedReader, CharBuffer charBuffer) {
        return uncheckedBufferedReader.m25219u(charBuffer);
    }

    /* renamed from: j */
    public static /* synthetic */ void m25230j(UncheckedBufferedReader uncheckedBufferedReader, int i) {
        uncheckedBufferedReader.m25223q(i);
    }

    /* renamed from: k */
    public static /* synthetic */ void m25229k(UncheckedBufferedReader uncheckedBufferedReader) {
        uncheckedBufferedReader.m25224p();
    }

    /* renamed from: l */
    public static /* synthetic */ void m25228l(UncheckedBufferedReader uncheckedBufferedReader) {
        uncheckedBufferedReader.m25216x();
    }

    /* renamed from: m */
    public static /* synthetic */ String m25227m(UncheckedBufferedReader uncheckedBufferedReader) {
        return uncheckedBufferedReader.m25218v();
    }

    /* renamed from: n */
    public static /* synthetic */ Integer m25226n(UncheckedBufferedReader uncheckedBufferedReader, char[] cArr, int i, int i2) {
        return uncheckedBufferedReader.m25220t(cArr, i, i2);
    }

    /* renamed from: o */
    public static /* synthetic */ Integer m25225o(UncheckedBufferedReader uncheckedBufferedReader, char[] cArr) {
        return uncheckedBufferedReader.m25221s(cArr);
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: kY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedBufferedReader.m25229k(UncheckedBufferedReader.this);
            }
        });
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public void mark(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: cY1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedBufferedReader.m25230j(UncheckedBufferedReader.this, i2);
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

    /* renamed from: p */
    public final /* synthetic */ void m25224p() {
        super.close();
    }

    /* renamed from: q */
    public final /* synthetic */ void m25223q(int i) {
        super.mark(i);
    }

    /* renamed from: r */
    public final /* synthetic */ Integer m25222r() {
        return Integer.valueOf(super.read());
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: hY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedBufferedReader.m25232g(UncheckedBufferedReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).intValue();
    }

    @Override // java.io.BufferedReader
    public String readLine() throws UncheckedIOException {
        return (String) Uncheck.get(new IOSupplier() { // from class: dY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedBufferedReader.m25227m(UncheckedBufferedReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        });
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public boolean ready() throws UncheckedIOException {
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: jY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return UncheckedBufferedReader.m25233d(UncheckedBufferedReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).booleanValue();
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public void reset() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: iY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedBufferedReader.m25228l(UncheckedBufferedReader.this);
            }
        });
    }

    /* renamed from: s */
    public final /* synthetic */ Integer m25221s(char[] cArr) {
        return Integer.valueOf(super.read(cArr));
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public long skip(long j) throws UncheckedIOException {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: gY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedBufferedReader.m25234b(UncheckedBufferedReader.this, ((Long) obj).longValue());
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
    public final /* synthetic */ Integer m25220t(char[] cArr, int i, int i2) {
        return Integer.valueOf(super.read(cArr, i, i2));
    }

    /* renamed from: u */
    public final /* synthetic */ Integer m25219u(CharBuffer charBuffer) {
        return Integer.valueOf(super.read(charBuffer));
    }

    /* renamed from: v */
    public final /* synthetic */ String m25218v() {
        return super.readLine();
    }

    /* renamed from: w */
    public final /* synthetic */ Boolean m25217w() {
        return Boolean.valueOf(super.ready());
    }

    /* renamed from: x */
    public final /* synthetic */ void m25216x() {
        super.reset();
    }

    /* renamed from: y */
    public final /* synthetic */ Long m25215y(long j) {
        return Long.valueOf(super.skip(j));
    }

    public UncheckedBufferedReader(Reader reader, int i) {
        super(reader, i);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: bY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedBufferedReader.m25225o(UncheckedBufferedReader.this, (char[]) obj);
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

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOTriFunction() { // from class: fY1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC18392Rb0.m66627a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedBufferedReader.m25226n(UncheckedBufferedReader.this, (char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: eY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedBufferedReader.m25231i(UncheckedBufferedReader.this, (CharBuffer) obj);
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