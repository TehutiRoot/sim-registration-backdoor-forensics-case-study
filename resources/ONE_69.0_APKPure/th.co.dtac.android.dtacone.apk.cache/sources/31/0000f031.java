package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.output.BrokenOutputStream;

/* renamed from: org.apache.commons.io.output.BrokenOutputStream */
/* loaded from: classes6.dex */
public class BrokenOutputStream extends OutputStream {
    public static final BrokenOutputStream INSTANCE = new BrokenOutputStream();

    /* renamed from: a */
    public final Supplier f73629a;

    public BrokenOutputStream() {
        this(new Supplier() { // from class: zc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenOutputStream.m25144g();
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Throwable m25146b(IOException iOException) {
        return m25142j(iOException);
    }

    /* renamed from: d */
    public static /* synthetic */ Throwable m25145d(Throwable th2) {
        return m25141k(th2);
    }

    /* renamed from: g */
    public static /* synthetic */ Throwable m25144g() {
        return m25143i();
    }

    /* renamed from: i */
    public static /* synthetic */ Throwable m25143i() {
        return new IOException("Broken output stream");
    }

    /* renamed from: j */
    public static /* synthetic */ Throwable m25142j(IOException iOException) {
        return iOException;
    }

    /* renamed from: k */
    public static /* synthetic */ Throwable m25141k(Throwable th2) {
        return th2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw m25140l();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw m25140l();
    }

    /* renamed from: l */
    public final RuntimeException m25140l() {
        Object obj;
        obj = this.f73629a.get();
        return Erase.rethrow((Throwable) obj);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        throw m25140l();
    }

    @Deprecated
    public BrokenOutputStream(final IOException iOException) {
        this(new Supplier() { // from class: yc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenOutputStream.m25146b(iOException);
            }
        });
    }

    public BrokenOutputStream(Supplier<Throwable> supplier) {
        this.f73629a = supplier;
    }

    public BrokenOutputStream(final Throwable th2) {
        this(new Supplier() { // from class: Ac
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenOutputStream.m25145d(th2);
            }
        });
    }
}