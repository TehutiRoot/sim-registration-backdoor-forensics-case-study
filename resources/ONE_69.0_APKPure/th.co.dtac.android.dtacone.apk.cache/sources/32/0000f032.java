package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.output.BrokenWriter;

/* renamed from: org.apache.commons.io.output.BrokenWriter */
/* loaded from: classes6.dex */
public class BrokenWriter extends Writer {
    public static final BrokenWriter INSTANCE = new BrokenWriter();

    /* renamed from: a */
    public final Supplier f73630a;

    public BrokenWriter() {
        this(new Supplier() { // from class: Ec
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenWriter.m25137g();
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Throwable m25139b(IOException iOException) {
        return m25135j(iOException);
    }

    /* renamed from: d */
    public static /* synthetic */ Throwable m25138d(Throwable th2) {
        return m25134k(th2);
    }

    /* renamed from: g */
    public static /* synthetic */ Throwable m25137g() {
        return m25136i();
    }

    /* renamed from: i */
    public static /* synthetic */ Throwable m25136i() {
        return new IOException("Broken writer");
    }

    /* renamed from: j */
    public static /* synthetic */ Throwable m25135j(IOException iOException) {
        return iOException;
    }

    /* renamed from: k */
    public static /* synthetic */ Throwable m25134k(Throwable th2) {
        return th2;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw m25133l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw m25133l();
    }

    /* renamed from: l */
    public final RuntimeException m25133l() {
        Object obj;
        obj = this.f73630a.get();
        return Erase.rethrow((Throwable) obj);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        throw m25133l();
    }

    @Deprecated
    public BrokenWriter(final IOException iOException) {
        this(new Supplier() { // from class: Gc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenWriter.m25139b(iOException);
            }
        });
    }

    public BrokenWriter(Supplier<Throwable> supplier) {
        this.f73630a = supplier;
    }

    public BrokenWriter(final Throwable th2) {
        this(new Supplier() { // from class: Fc
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenWriter.m25138d(th2);
            }
        });
    }
}