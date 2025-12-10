package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public abstract class Logger {

    /* renamed from: a */
    public static final Object f38245a = new Object();

    /* renamed from: b */
    public static volatile Logger f38246b = null;

    /* renamed from: c */
    public static final int f38247c = 20;

    /* loaded from: classes2.dex */
    public static class LogcatLogger extends Logger {

        /* renamed from: d */
        public final int f38248d;

        public LogcatLogger(int i) {
            super(i);
            this.f38248d = i;
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String str, @NonNull String str2) {
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String str, @NonNull String str2) {
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String str, @NonNull String str2) {
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String str, @NonNull String str2) {
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String str, @NonNull String str2) {
            if (this.f38248d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
            if (this.f38248d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public Logger(int i) {
    }

    @NonNull
    public static Logger get() {
        Logger logger;
        synchronized (f38245a) {
            try {
                if (f38246b == null) {
                    f38246b = new LogcatLogger(3);
                }
                logger = f38246b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return logger;
    }

    public static void setLogger(@NonNull Logger logger) {
        synchronized (f38245a) {
            f38246b = logger;
        }
    }

    @NonNull
    public static String tagWithPrefix(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f38247c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void debug(@NonNull String str, @NonNull String str2);

    public abstract void debug(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void error(@NonNull String str, @NonNull String str2);

    public abstract void error(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void info(@NonNull String str, @NonNull String str2);

    public abstract void info(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void verbose(@NonNull String str, @NonNull String str2);

    public abstract void verbose(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

    public abstract void warning(@NonNull String str, @NonNull String str2);

    public abstract void warning(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);
}
