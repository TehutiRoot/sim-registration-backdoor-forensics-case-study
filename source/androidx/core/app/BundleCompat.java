package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class BundleCompat {

    /* renamed from: androidx.core.app.BundleCompat$a */
    /* loaded from: classes2.dex */
    public static class C3835a {
        @DoNotInline
        /* renamed from: a */
        public static IBinder m57932a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57931b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @Nullable
    public static IBinder getBinder(@NonNull Bundle bundle, @Nullable String str) {
        return C3835a.m57932a(bundle, str);
    }

    public static void putBinder(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        C3835a.m57931b(bundle, str, iBinder);
    }
}
