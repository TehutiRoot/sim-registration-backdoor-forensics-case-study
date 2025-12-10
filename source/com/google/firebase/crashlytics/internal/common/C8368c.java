package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.internal.common.c */
/* loaded from: classes4.dex */
public class C8368c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final InterfaceC8369a f54879a;

    /* renamed from: b */
    public final SettingsProvider f54880b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f54881c;

    /* renamed from: d */
    public final CrashlyticsNativeComponent f54882d;

    /* renamed from: e */
    public final AtomicBoolean f54883e = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.c$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8369a {
        /* renamed from: a */
        void mo38970a(SettingsProvider settingsProvider, Thread thread, Throwable th2);
    }

    public C8368c(InterfaceC8369a interfaceC8369a, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f54879a = interfaceC8369a;
        this.f54880b = settingsProvider;
        this.f54881c = uncaughtExceptionHandler;
        this.f54882d = crashlyticsNativeComponent;
    }

    /* renamed from: a */
    public boolean m38972a() {
        return this.f54883e.get();
    }

    /* renamed from: b */
    public final boolean m38971b(Thread thread, Throwable th2) {
        if (thread == null) {
            Logger.getLogger().m39138e("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th2 == null) {
            Logger.getLogger().m39138e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f54882d.hasCrashDataForCurrentSession()) {
            Logger.getLogger().m39140d("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r7.f54881c != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().m39140d("Completed exception processing. Invoking default exception handler.");
        r7.f54881c.uncaughtException(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().m39140d("Completed exception processing, but no default exception handler.");
        java.lang.System.exit(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        r7.f54883e.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r7.f54881c == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        return;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Completed exception processing, but no default exception handler."
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f54883e
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.m38971b(r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            com.google.firebase.crashlytics.internal.common.c$a r4 = r7.f54879a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r5 = r7.f54880b     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r4.mo38970a(r5, r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L26
        L19:
            r4 = move-exception
            goto L56
        L1b:
            r4 = move-exception
            goto L47
        L1d:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.m39140d(r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L26:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f54881c
            if (r4 == 0) goto L37
        L2a:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.m39140d(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f54881c
            r0.uncaughtException(r8, r9)
            goto L41
        L37:
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r8.m39140d(r0)
            java.lang.System.exit(r3)
        L41:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f54883e
            r8.set(r2)
            goto L55
        L47:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.m39137e(r6, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f54881c
            if (r4 == 0) goto L37
            goto L2a
        L55:
            return
        L56:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f54881c
            if (r5 == 0) goto L67
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.m39140d(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f54881c
            r0.uncaughtException(r8, r9)
            goto L71
        L67:
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r8.m39140d(r0)
            java.lang.System.exit(r3)
        L71:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f54883e
            r8.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C8368c.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
