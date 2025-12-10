package io.realm.internal;

import android.os.Build;
import androidx.core.p005os.EnvironmentCompat;
import io.reactivex.Flowable;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class Util {

    /* renamed from: a */
    public static Boolean f66793a;

    /* renamed from: b */
    public static Boolean f66794b;

    public static void checkContainsKey(String str, Map<String, ?> map, String str2) {
        if (map.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Key '" + str + "' required in '" + str2 + "'.");
    }

    public static void checkEmpty(String str, String str2) {
        if (!isEmptyString(str)) {
            return;
        }
        throw new IllegalArgumentException("Non-empty '" + str2 + "' required.");
    }

    public static void checkLooperThread(String str) {
        new AndroidCapabilities().checkCanDeliverNotification(str);
    }

    public static void checkNotOnMainThread(String str) {
        if (!new AndroidCapabilities().isMainThread()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void checkNull(@Nullable Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("Nonnull '" + str + "' required.");
    }

    public static boolean deleteRealm(String str, File file, String str2) {
        boolean z;
        File file2 = new File(file, str2 + ".management");
        File file3 = new File(str);
        File file4 = new File(str + ".note");
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file5 : listFiles) {
                if (!file5.delete()) {
                    RealmLog.warn(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", file5.getAbsolutePath()), new Object[0]);
                }
            }
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.warn(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", file2.getAbsolutePath()), new Object[0]);
        }
        if (file3.exists()) {
            z = file3.delete();
            if (!z) {
                RealmLog.warn(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", file3.getAbsolutePath()), new Object[0]);
            }
        } else {
            z = true;
        }
        if (file4.exists() && !file4.delete()) {
            RealmLog.warn(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", file4.getAbsolutePath()), new Object[0]);
        }
        return z;
    }

    public static Class<?> getClassForName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("Class '" + str + "' does not exist.");
        }
    }

    public static Class<? extends RealmModel> getOriginalModelClass(Class<? extends RealmModel> cls) {
        if (!cls.equals(RealmModel.class) && !cls.equals(RealmObject.class)) {
            Class superclass = cls.getSuperclass();
            if (!superclass.equals(Object.class) && !superclass.equals(RealmObject.class)) {
                return superclass;
            }
            return cls;
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }

    public static String getStackTrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static String getTablePrefix() {
        return nativeGetTablePrefix();
    }

    public static synchronized boolean isCoroutinesAvailable() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (f66794b == null) {
                try {
                    f66794b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f66794b = Boolean.FALSE;
                }
            }
            booleanValue = f66794b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean isEmptyString(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean isEmulator() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(EnvironmentCompat.MEDIA_UNKNOWN)) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    public static synchronized boolean isRxJavaAvailable() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (f66793a == null) {
                try {
                    int i = Flowable.f63791a;
                    f66793a = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f66793a = Boolean.FALSE;
                }
            }
            booleanValue = f66793a.booleanValue();
        }
        return booleanValue;
    }

    public static native String nativeGetTablePrefix();

    public static <T> Set<T> toSet(T... tArr) {
        if (tArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : tArr) {
            if (t != null) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }
}
