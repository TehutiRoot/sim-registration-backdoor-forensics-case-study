package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.input.BrokenReader;

/* renamed from: org.apache.commons.io.input.BrokenReader */
/* loaded from: classes6.dex */
public class BrokenReader extends Reader {
    public static final BrokenReader INSTANCE = new BrokenReader();

    /* renamed from: a */
    public final Supplier f73436a;

    public BrokenReader() {
        this(new Supplier() { // from class: Dc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenReader.m25327d();
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Throwable m25328b(IOException iOException) {
        return m25324j(iOException);
    }

    /* renamed from: d */
    public static /* synthetic */ Throwable m25327d() {
        return m25325i();
    }

    /* renamed from: g */
    public static /* synthetic */ Throwable m25326g(Throwable th2) {
        return m25323k(th2);
    }

    /* renamed from: i */
    public static /* synthetic */ Throwable m25325i() {
        return new IOException("Broken reader");
    }

    /* renamed from: j */
    public static /* synthetic */ Throwable m25324j(IOException iOException) {
        return iOException;
    }

    /* renamed from: k */
    public static /* synthetic */ Throwable m25323k(Throwable th2) {
        return th2;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw m25322l();
    }

    /* renamed from: l */
    public final RuntimeException m25322l() {
        Object obj;
        obj = this.f73436a.get();
        return Erase.rethrow((Throwable) obj);
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        throw m25322l();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        throw m25322l();
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        throw m25322l();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        throw m25322l();
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        throw m25322l();
    }

    @Deprecated
    public BrokenReader(final IOException iOException) {
        this(new Supplier() { // from class: Bc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenReader.m25328b(iOException);
            }
        });
    }

    public BrokenReader(Supplier<Throwable> supplier) {
        this.f73436a = supplier;
    }

    public BrokenReader(final Throwable th2) {
        this(new Supplier() { // from class: Cc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenReader.m25326g(th2);
            }
        });
    }
}