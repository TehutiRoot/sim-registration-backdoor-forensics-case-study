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
    public static boolean f33954a = true;

    /* renamed from: b */
    public static boolean f33955b = true;

    /* renamed from: androidx.core.os.MessageCompat$a */
    /* loaded from: classes2.dex */
    public static class C4043a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57180a(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57179b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        if (Build.VERSION.SDK_INT >= 22) {
            return C4043a.m57180a(message);
        }
        if (f33955b) {
            try {
                return C4043a.m57180a(message);
            } catch (NoSuchMethodError unused) {
                f33955b = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z) {
        if (Build.VERSION.SDK_INT >= 22) {
            C4043a.m57179b(message, z);
        } else if (f33954a) {
            try {
                C4043a.m57179b(message, z);
            } catch (NoSuchMethodError unused) {
                f33954a = false;
            }
        }
    }
}
