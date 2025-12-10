package com.google.firebase.perf.logging;

import androidx.annotation.VisibleForTesting;
import java.util.Locale;

/* loaded from: classes4.dex */
public class AndroidLogger {

    /* renamed from: c */
    public static volatile AndroidLogger f56154c;

    /* renamed from: a */
    public final C20143gl0 f56155a;

    /* renamed from: b */
    public boolean f56156b;

    @VisibleForTesting
    public AndroidLogger(C20143gl0 c20143gl0) {
        this.f56156b = false;
        this.f56155a = c20143gl0 == null ? C20143gl0.m31327c() : c20143gl0;
    }

    public static AndroidLogger getInstance() {
        if (f56154c == null) {
            synchronized (AndroidLogger.class) {
                try {
                    if (f56154c == null) {
                        f56154c = new AndroidLogger();
                    }
                } finally {
                }
            }
        }
        return f56154c;
    }

    public void debug(String str) {
        if (this.f56156b) {
            this.f56155a.m31329a(str);
        }
    }

    public void error(String str) {
        if (this.f56156b) {
            this.f56155a.m31328b(str);
        }
    }

    public void info(String str) {
        if (this.f56156b) {
            this.f56155a.m31326d(str);
        }
    }

    public boolean isLogcatEnabled() {
        return this.f56156b;
    }

    public void setLogcatEnabled(boolean z) {
        this.f56156b = z;
    }

    public void verbose(String str) {
        if (this.f56156b) {
            this.f56155a.m31325e(str);
        }
    }

    public void warn(String str) {
        if (this.f56156b) {
            this.f56155a.m31324f(str);
        }
    }

    public void debug(String str, Object... objArr) {
        if (this.f56156b) {
            this.f56155a.m31329a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void error(String str, Object... objArr) {
        if (this.f56156b) {
            this.f56155a.m31328b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void info(String str, Object... objArr) {
        if (this.f56156b) {
            this.f56155a.m31326d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void verbose(String str, Object... objArr) {
        if (this.f56156b) {
            this.f56155a.m31325e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.f56156b) {
            this.f56155a.m31324f(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public AndroidLogger() {
        this(null);
    }
}