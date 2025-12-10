package androidx.core.p005os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.io.File;

/* renamed from: androidx.core.os.EnvironmentCompat */
/* loaded from: classes2.dex */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";

    /* renamed from: androidx.core.os.EnvironmentCompat$a */
    /* loaded from: classes2.dex */
    public static class C4019a {
        @DoNotInline
        /* renamed from: a */
        public static String m57142a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        return C4019a.m57142a(file);
    }
}