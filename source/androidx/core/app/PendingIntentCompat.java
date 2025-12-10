package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class PendingIntentCompat {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    /* renamed from: androidx.core.app.PendingIntentCompat$a */
    /* loaded from: classes2.dex */
    public static class C3915a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static PendingIntent m57663a(@NonNull Context context, int i, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i2, @NonNull Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static PendingIntent m57662b(@NonNull Context context, int i, @NonNull Intent intent, int i2, @NonNull Bundle bundle) {
            return PendingIntent.getActivity(context, i, intent, i2, bundle);
        }
    }

    /* renamed from: androidx.core.app.PendingIntentCompat$b */
    /* loaded from: classes2.dex */
    public static class C3916b {
        @DoNotInline
        /* renamed from: a */
        public static PendingIntent m57661a(Context context, int i, Intent intent, int i2) {
            return PendingIntent.getForegroundService(context, i, intent, i2);
        }
    }

    /* renamed from: a */
    public static int m57664a(boolean z, int i) {
        int i2;
        if (z) {
            if (Build.VERSION.SDK_INT >= 31) {
                i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
            } else {
                return i;
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            i2 = 67108864;
        } else {
            return i;
        }
        return i | i2;
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context, int i, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i2, @NonNull Bundle bundle, boolean z) {
        return C3915a.m57663a(context, i, intentArr, m57664a(z, i2), bundle);
    }

    @NonNull
    public static PendingIntent getActivity(@NonNull Context context, int i, @NonNull Intent intent, int i2, boolean z) {
        return PendingIntent.getActivity(context, i, intent, m57664a(z, i2));
    }

    @NonNull
    public static PendingIntent getBroadcast(@NonNull Context context, int i, @NonNull Intent intent, int i2, boolean z) {
        return PendingIntent.getBroadcast(context, i, intent, m57664a(z, i2));
    }

    @NonNull
    @RequiresApi(26)
    public static PendingIntent getForegroundService(@NonNull Context context, int i, @NonNull Intent intent, int i2, boolean z) {
        return C3916b.m57661a(context, i, intent, m57664a(z, i2));
    }

    @NonNull
    public static PendingIntent getService(@NonNull Context context, int i, @NonNull Intent intent, int i2, boolean z) {
        return PendingIntent.getService(context, i, intent, m57664a(z, i2));
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context, int i, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i2, boolean z) {
        return PendingIntent.getActivities(context, i, intentArr, m57664a(z, i2));
    }

    @NonNull
    public static PendingIntent getActivity(@NonNull Context context, int i, @NonNull Intent intent, int i2, @NonNull Bundle bundle, boolean z) {
        return C3915a.m57662b(context, i, intent, m57664a(z, i2), bundle);
    }
}
