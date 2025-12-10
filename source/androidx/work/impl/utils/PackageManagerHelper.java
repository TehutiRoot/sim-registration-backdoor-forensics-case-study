package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes.dex */
public class PackageManagerHelper {

    /* renamed from: a */
    public static final String f38716a = Logger.tagWithPrefix("PackageManagerHelper");

    /* renamed from: a */
    public static int m52165a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    /* renamed from: b */
    public static boolean m52164b(int i, boolean z) {
        return i == 0 ? z : i == 1;
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull Class<?> cls) {
        return m52164b(m52165a(context, cls.getName()), false);
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        int i;
        String str;
        String str2 = "disabled";
        try {
            if (z == m52164b(m52165a(context, cls.getName()), false)) {
                Logger logger = Logger.get();
                String str3 = f38716a;
                logger.debug(str3, "Skipping component enablement for " + cls.getName());
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            Logger logger2 = Logger.get();
            String str4 = f38716a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            if (!z) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            sb.append(str);
            logger2.debug(str4, sb.toString());
        } catch (Exception e) {
            Logger logger3 = Logger.get();
            String str5 = f38716a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str2 = "enabled";
            }
            sb2.append(str2);
            logger3.debug(str5, sb2.toString(), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull String str) {
        return m52165a(context, str) == 1;
    }
}
