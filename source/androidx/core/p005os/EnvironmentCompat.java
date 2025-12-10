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
    public static class C4037a {
        @DoNotInline
        /* renamed from: a */
        public static String m57192a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        return C4037a.m57192a(file);
    }
}
