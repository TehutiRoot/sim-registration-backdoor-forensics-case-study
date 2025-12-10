package com.google.gson.internal;

/* loaded from: classes4.dex */
public final class JavaVersion {

    /* renamed from: a */
    public static final int f56737a = m37544a();

    /* renamed from: a */
    public static int m37544a() {
        return m37541d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    public static int m37543b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m37542c(String str) {
        try {
            String[] split = str.split("[._]", 3);
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static int m37541d(String str) {
        int m37542c = m37542c(str);
        if (m37542c == -1) {
            m37542c = m37543b(str);
        }
        if (m37542c == -1) {
            return 6;
        }
        return m37542c;
    }

    public static int getMajorJavaVersion() {
        return f56737a;
    }

    public static boolean isJava9OrLater() {
        if (f56737a >= 9) {
            return true;
        }
        return false;
    }
}