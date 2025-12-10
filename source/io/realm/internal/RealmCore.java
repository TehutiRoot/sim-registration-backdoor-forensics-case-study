package io.realm.internal;

import android.content.Context;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.getkeepsafe.relinker.ReLinker;
import io.realm.BuildConfig;
import java.io.File;
import java.util.Locale;

/* loaded from: classes5.dex */
public class RealmCore {

    /* renamed from: a */
    public static final String f66771a;

    /* renamed from: b */
    public static final String f66772b;

    /* renamed from: c */
    public static final String f66773c;

    /* renamed from: d */
    public static boolean f66774d;

    static {
        String str = File.separator;
        f66771a = str;
        String str2 = File.pathSeparator;
        f66772b = str2;
        f66773c = "lib" + str2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + str + "lib";
        f66774d = false;
    }

    public static void addNativeLibraryPath(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.getProperty("java.library.path"));
            String str2 = f66772b;
            sb.append(str2);
            sb.append(str);
            sb.append(str2);
            System.setProperty("java.library.path", sb.toString());
        } catch (Exception e) {
            throw new RuntimeException("Cannot set the library path!", e);
        }
    }

    public static synchronized void loadLibrary(Context context) {
        synchronized (RealmCore.class) {
            if (f66774d) {
                return;
            }
            ReLinker.loadLibrary(context, "realm-jni", BuildConfig.VERSION_NAME);
            f66774d = true;
        }
    }

    public static boolean osIsWindows() {
        return System.getProperty("os.name").toLowerCase(Locale.getDefault()).contains("win");
    }
}
