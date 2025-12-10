package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class EnvUtil {

    /* renamed from: a */
    public static final Pattern f40172a = Pattern.compile("^(1\\.)?([0-9]+)");

    /* renamed from: a */
    public static boolean m51321a(int i) {
        Matcher matcher = f40172a.matcher(System.getProperty("java.version", ""));
        return matcher.find() && i <= Integer.parseInt(matcher.group(2));
    }

    public static boolean isAndroidOS() {
        String systemProperty = OptionHelper.getSystemProperty("os.name");
        String env = OptionHelper.getEnv("ANDROID_ROOT");
        String env2 = OptionHelper.getEnv("ANDROID_DATA");
        return systemProperty != null && systemProperty.contains("Linux") && env != null && env.contains("/system") && env2 != null && env2.contains("/data");
    }

    public static boolean isJDK5() {
        return m51321a(5);
    }

    public static boolean isJDK7OrHigher() {
        return m51321a(7);
    }
}
