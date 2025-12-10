package com.google.firebase.perf.logging;

/* loaded from: classes4.dex */
public final class ConsoleUrlGenerator {
    /* renamed from: a */
    public static String m38270a(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }

    public static String generateCustomTraceUrl(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", m38270a(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    public static String generateDashboardUrl(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", m38270a(str, str2), "perf-android-sdk", "android-ide");
    }

    public static String generateScreenTraceUrl(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", m38270a(str, str2), str3, "perf-android-sdk", "android-ide");
    }
}
