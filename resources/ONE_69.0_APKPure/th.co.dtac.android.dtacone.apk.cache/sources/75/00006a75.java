package androidx.core.p005os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import kotlin.time.DurationKt;

/* renamed from: androidx.core.os.BuildCompat */
/* loaded from: classes2.dex */
public class BuildCompat {
    @ChecksSdkIntAtLeast(extension = DurationKt.NANOS_IN_MILLIS)
    @SuppressLint({"CompileTimeConstant"})
    public static final int AD_SERVICES_EXTENSION_INT;
    @ChecksSdkIntAtLeast(extension = 30)
    @SuppressLint({"CompileTimeConstant"})
    public static final int R_EXTENSION_INT;
    @ChecksSdkIntAtLeast(extension = 31)
    @SuppressLint({"CompileTimeConstant"})
    public static final int S_EXTENSION_INT;
    @ChecksSdkIntAtLeast(extension = 33)
    @SuppressLint({"CompileTimeConstant"})
    public static final int T_EXTENSION_INT;

    @RequiresOptIn
    /* renamed from: androidx.core.os.BuildCompat$PrereleaseSdkCheck */
    /* loaded from: classes2.dex */
    public @interface PrereleaseSdkCheck {
    }

    /* renamed from: androidx.core.os.BuildCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4015a {

        /* renamed from: a */
        public static final int f34028a;

        /* renamed from: b */
        public static final int f34029b;

        /* renamed from: c */
        public static final int f34030c;

        /* renamed from: d */
        public static final int f34031d;

        static {
            int extensionVersion;
            int extensionVersion2;
            int extensionVersion3;
            int extensionVersion4;
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            f34028a = extensionVersion;
            extensionVersion2 = SdkExtensions.getExtensionVersion(31);
            f34029b = extensionVersion2;
            extensionVersion3 = SdkExtensions.getExtensionVersion(33);
            f34030c = extensionVersion3;
            extensionVersion4 = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
            f34031d = extensionVersion4;
        }
    }

    static {
        int i;
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 >= 30) {
            i = C4015a.f34028a;
        } else {
            i = 0;
        }
        R_EXTENSION_INT = i;
        if (i4 >= 30) {
            i2 = C4015a.f34029b;
        } else {
            i2 = 0;
        }
        S_EXTENSION_INT = i2;
        if (i4 >= 30) {
            i3 = C4015a.f34030c;
        } else {
            i3 = 0;
        }
        T_EXTENSION_INT = i3;
        if (i4 >= 30) {
            i5 = C4015a.f34031d;
        }
        AD_SERVICES_EXTENSION_INT = i5;
    }

    @ChecksSdkIntAtLeast(api = 24)
    @Deprecated
    public static boolean isAtLeastN() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @Deprecated
    public static boolean isAtLeastNMR1() {
        if (Build.VERSION.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @Deprecated
    public static boolean isAtLeastO() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @Deprecated
    public static boolean isAtLeastOMR1() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @Deprecated
    public static boolean isAtLeastP() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public static boolean isAtLeastPreReleaseCodename(@NonNull String str, @NonNull String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @Deprecated
    public static boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @Deprecated
    public static boolean isAtLeastR() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && (i < 30 || !isAtLeastPreReleaseCodename("S", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @PrereleaseSdkCheck
    @Deprecated
    public static boolean isAtLeastSv2() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32 && (i < 31 || !isAtLeastPreReleaseCodename("Sv2", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @PrereleaseSdkCheck
    public static boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 32 || !isAtLeastPreReleaseCodename("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(codename = "UpsideDownCake")
    @PrereleaseSdkCheck
    public static boolean isAtLeastU() {
        if (Build.VERSION.SDK_INT >= 33 && isAtLeastPreReleaseCodename("UpsideDownCake", Build.VERSION.CODENAME)) {
            return true;
        }
        return false;
    }
}