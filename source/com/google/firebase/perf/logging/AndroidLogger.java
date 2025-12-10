package com.google.firebase.perf.logging;

import androidx.annotation.VisibleForTesting;
import java.util.Locale;

/* loaded from: classes4.dex */
public class AndroidLogger {

    /* renamed from: c */
    public static volatile AndroidLogger f56142c;

    /* renamed from: a */
    public final C19053al0 f56143a;

    /* renamed from: b */
    public boolean f56144b;

    @VisibleForTesting
    public AndroidLogger(C19053al0 c19053al0) {
        this.f56144b = false;
        this.f56143a = c19053al0 == null ? C19053al0.m65049c() : c19053al0;
    }

    public static AndroidLogger getInstance() {
        if (f56142c == null) {
            synchronized (AndroidLogger.class) {
                try {
                    if (f56142c == null) {
                        f56142c = new AndroidLogger();
                    }
                } finally {
                }
            }
        }
        return f56142c;
    }

    public void debug(String str) {
        if (this.f56144b) {
            this.f56143a.m65051a(str);
        }
    }

    public void error(String str) {
        if (this.f56144b) {
            this.f56143a.m65050b(str);
        }
    }

    public void info(String str) {
        if (this.f56144b) {
            this.f56143a.m65048d(str);
        }
    }

    public boolean isLogcatEnabled() {
        return this.f56144b;
    }

    public void setLogcatEnabled(boolean z) {
        this.f56144b = z;
    }

    public void verbose(String str) {
        if (this.f56144b) {
            this.f56143a.m65047e(str);
        }
    }

    public void warn(String str) {
        if (this.f56144b) {
            this.f56143a.m65046f(str);
        }
    }

    public void debug(String str, Object... objArr) {
        if (this.f56144b) {
            this.f56143a.m65051a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void error(String str, Object... objArr) {
        if (this.f56144b) {
            this.f56143a.m65050b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void info(String str, Object... objArr) {
        if (this.f56144b) {
            this.f56143a.m65048d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void verbose(String str, Object... objArr) {
        if (this.f56144b) {
            this.f56143a.m65047e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.f56144b) {
            this.f56143a.m65046f(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public AndroidLogger() {
        this(null);
    }
}
