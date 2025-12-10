package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.p014io.Closer;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.Closer */
/* loaded from: classes4.dex */
public final class Closer implements Closeable {

    /* renamed from: d */
    public static final InterfaceC8101a f53952d = new InterfaceC8101a() { // from class: jq
        @Override // com.google.common.p014io.Closer.InterfaceC8101a
        /* renamed from: a */
        public final void mo29044a(Closeable closeable, Throwable th2, Throwable th3) {
            Closer.m39989b(closeable, th2, th3);
        }
    };

    /* renamed from: a */
    public final InterfaceC8101a f53953a;

    /* renamed from: b */
    public final Deque f53954b = new ArrayDeque(4);

    /* renamed from: c */
    public Throwable f53955c;

    /* renamed from: com.google.common.io.Closer$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8101a {
        /* renamed from: a */
        void mo29044a(Closeable closeable, Throwable th2, Throwable th3);
    }

    public Closer(InterfaceC8101a interfaceC8101a) {
        this.f53953a = (InterfaceC8101a) Preconditions.checkNotNull(interfaceC8101a);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39989b(Closeable closeable, Throwable th2, Throwable th3) {
        m39988d(closeable, th2, th3);
    }

    public static Closer create() {
        return new Closer(f53952d);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39988d(Closeable closeable, Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return;
        }
        try {
            th2.addSuppressed(th3);
        } catch (Throwable unused) {
            Logger logger = Closeables.f53951a;
            Level level = Level.WARNING;
            logger.log(level, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th2 = this.f53955c;
        while (!this.f53954b.isEmpty()) {
            Closeable closeable = (Closeable) this.f53954b.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f53953a.mo29044a(closeable, th2, th3);
                }
            }
        }
        if (this.f53955c == null && th2 != null) {
            Throwables.throwIfInstanceOf(th2, IOException.class);
            Throwables.throwIfUnchecked(th2);
            throw new AssertionError(th2);
        }
    }

    @CanIgnoreReturnValue
    public <C extends Closeable> C register(C c) {
        if (c != null) {
            this.f53954b.addFirst(c);
        }
        return c;
    }

    public RuntimeException rethrow(Throwable th2) throws IOException {
        Preconditions.checkNotNull(th2);
        this.f53955c = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th2, Class<X> cls) throws IOException, Exception {
        Preconditions.checkNotNull(th2);
        this.f53955c = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfInstanceOf(th2, cls);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th2, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
        Preconditions.checkNotNull(th2);
        this.f53955c = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfInstanceOf(th2, cls);
        Throwables.throwIfInstanceOf(th2, cls2);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }
}
