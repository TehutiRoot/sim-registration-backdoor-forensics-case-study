package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class UncaughtExceptionHandlers {

    /* renamed from: com.google.common.util.concurrent.UncaughtExceptionHandlers$a */
    /* loaded from: classes4.dex */
    public static final class C8282a implements Thread.UncaughtExceptionHandler {

        /* renamed from: b */
        public static final C17503Di0 f54465b = new C17503Di0(C8282a.class);

        /* renamed from: a */
        public final Runtime f54466a;

        public C8282a(Runtime runtime) {
            this.f54466a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            try {
                f54465b.m68797a().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th2);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new C8282a(Runtime.getRuntime());
    }
}