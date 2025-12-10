package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ExecutionList {

    /* renamed from: c */
    public static final C17503Di0 f54330c = new C17503Di0(ExecutionList.class);

    /* renamed from: a */
    public C8231a f54331a;

    /* renamed from: b */
    public boolean f54332b;

    /* renamed from: com.google.common.util.concurrent.ExecutionList$a */
    /* loaded from: classes4.dex */
    public static final class C8231a {

        /* renamed from: a */
        public final Runnable f54333a;

        /* renamed from: b */
        public final Executor f54334b;

        /* renamed from: c */
        public C8231a f54335c;

        public C8231a(Runnable runnable, Executor executor, C8231a c8231a) {
            this.f54333a = runnable;
            this.f54334b = executor;
            this.f54335c = c8231a;
        }
    }

    /* renamed from: a */
    public static void m39523a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger m68797a = f54330c.m68797a();
            Level level = Level.SEVERE;
            m68797a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public void add(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (!this.f54332b) {
                    this.f54331a = new C8231a(runnable, executor, this.f54331a);
                } else {
                    m39523a(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void execute() {
        synchronized (this) {
            try {
                if (this.f54332b) {
                    return;
                }
                this.f54332b = true;
                C8231a c8231a = this.f54331a;
                C8231a c8231a2 = null;
                this.f54331a = null;
                while (c8231a != null) {
                    C8231a c8231a3 = c8231a.f54335c;
                    c8231a.f54335c = c8231a2;
                    c8231a2 = c8231a;
                    c8231a = c8231a3;
                }
                while (c8231a2 != null) {
                    m39523a(c8231a2.f54333a, c8231a2.f54334b);
                    c8231a2 = c8231a2.f54335c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}