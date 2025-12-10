package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.input.BrokenInputStream;

/* renamed from: org.apache.commons.io.input.BrokenInputStream */
/* loaded from: classes6.dex */
public class BrokenInputStream extends InputStream {
    public static final BrokenInputStream INSTANCE = new BrokenInputStream();

    /* renamed from: a */
    public final Supplier f73435a;

    public BrokenInputStream() {
        this(new Supplier() { // from class: vc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenInputStream.m25334g();
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Throwable m25336b(IOException iOException) {
        return m25331k(iOException);
    }

    /* renamed from: d */
    public static /* synthetic */ Throwable m25335d(Throwable th2) {
        return m25330l(th2);
    }

    /* renamed from: g */
    public static /* synthetic */ Throwable m25334g() {
        return m25332j();
    }

    /* renamed from: j */
    public static /* synthetic */ Throwable m25332j() {
        return new IOException("Broken input stream");
    }

    /* renamed from: k */
    public static /* synthetic */ Throwable m25331k(IOException iOException) {
        return iOException;
    }

    /* renamed from: l */
    public static /* synthetic */ Throwable m25330l(Throwable th2) {
        return th2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw m25329m();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw m25329m();
    }

    /* renamed from: i */
    public Throwable m25333i() {
        Object obj;
        obj = this.f73435a.get();
        return (Throwable) obj;
    }

    /* renamed from: m */
    public final RuntimeException m25329m() {
        return Erase.rethrow(m25333i());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw m25329m();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw m25329m();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        throw m25329m();
    }

    @Deprecated
    public BrokenInputStream(final IOException iOException) {
        this(new Supplier() { // from class: xc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenInputStream.m25336b(iOException);
            }
        });
    }

    public BrokenInputStream(Supplier<Throwable> supplier) {
        this.f73435a = supplier;
    }

    public BrokenInputStream(final Throwable th2) {
        this(new Supplier() { // from class: wc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenInputStream.m25335d(th2);
            }
        });
    }
}