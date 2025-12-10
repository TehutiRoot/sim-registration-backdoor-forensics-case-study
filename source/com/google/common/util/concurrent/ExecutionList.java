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
    public static final C23005xi0 f54318c = new C23005xi0(ExecutionList.class);

    /* renamed from: a */
    public C8242a f54319a;

    /* renamed from: b */
    public boolean f54320b;

    /* renamed from: com.google.common.util.concurrent.ExecutionList$a */
    /* loaded from: classes4.dex */
    public static final class C8242a {

        /* renamed from: a */
        public final Runnable f54321a;

        /* renamed from: b */
        public final Executor f54322b;

        /* renamed from: c */
        public C8242a f54323c;

        public C8242a(Runnable runnable, Executor executor, C8242a c8242a) {
            this.f54321a = runnable;
            this.f54322b = executor;
            this.f54323c = c8242a;
        }
    }

    /* renamed from: a */
    public static void m39531a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger m405a = f54318c.m405a();
            Level level = Level.SEVERE;
            m405a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public void add(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (!this.f54320b) {
                    this.f54319a = new C8242a(runnable, executor, this.f54319a);
                } else {
                    m39531a(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void execute() {
        synchronized (this) {
            try {
                if (this.f54320b) {
                    return;
                }
                this.f54320b = true;
                C8242a c8242a = this.f54319a;
                C8242a c8242a2 = null;
                this.f54319a = null;
                while (c8242a != null) {
                    C8242a c8242a3 = c8242a.f54323c;
                    c8242a.f54323c = c8242a2;
                    c8242a2 = c8242a;
                    c8242a = c8242a3;
                }
                while (c8242a2 != null) {
                    m39531a(c8242a2.f54321a, c8242a2.f54322b);
                    c8242a2 = c8242a2.f54323c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
