package androidx.core.p005os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.MessageCompat */
/* loaded from: classes2.dex */
public final class MessageCompat {

    /* renamed from: a */
    public static boolean f34042a = true;

    /* renamed from: b */
    public static boolean f34043b = true;

    /* renamed from: androidx.core.os.MessageCompat$a */
    /* loaded from: classes2.dex */
    public static class C4025a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57130a(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57129b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        if (Build.VERSION.SDK_INT >= 22) {
            return C4025a.m57130a(message);
        }
        if (f34043b) {
            try {
                return C4025a.m57130a(message);
            } catch (NoSuchMethodError unused) {
                f34043b = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z) {
        if (Build.VERSION.SDK_INT >= 22) {
            C4025a.m57129b(message, z);
        } else if (f34042a) {
            try {
                C4025a.m57129b(message, z);
            } catch (NoSuchMethodError unused) {
                f34042a = false;
            }
        }
    }
}