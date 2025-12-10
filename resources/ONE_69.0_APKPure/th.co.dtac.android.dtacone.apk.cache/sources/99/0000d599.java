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
    public static final String f66834a;

    /* renamed from: b */
    public static final String f66835b;

    /* renamed from: c */
    public static final String f66836c;

    /* renamed from: d */
    public static boolean f66837d;

    static {
        String str = File.separator;
        f66834a = str;
        String str2 = File.pathSeparator;
        f66835b = str2;
        f66836c = "lib" + str2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + str + "lib";
        f66837d = false;
    }

    public static void addNativeLibraryPath(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.getProperty("java.library.path"));
            String str2 = f66835b;
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
            if (f66837d) {
                return;
            }
            ReLinker.loadLibrary(context, "realm-jni", BuildConfig.VERSION_NAME);
            f66837d = true;
        }
    }

    public static boolean osIsWindows() {
        return System.getProperty("os.name").toLowerCase(Locale.getDefault()).contains("win");
    }
}