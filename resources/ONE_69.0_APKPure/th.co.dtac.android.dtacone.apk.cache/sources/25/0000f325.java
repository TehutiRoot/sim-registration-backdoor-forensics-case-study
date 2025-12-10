package org.apache.http.util;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";

    /* renamed from: a */
    public final String f74729a;

    /* renamed from: b */
    public final String f74730b;

    /* renamed from: c */
    public final String f74731c;

    /* renamed from: d */
    public final String f74732d;

    /* renamed from: e */
    public final String f74733e;

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        Args.notNull(str, "Package identifier");
        this.f74729a = str;
        this.f74730b = str2 == null ? UNAVAILABLE : str2;
        this.f74731c = str3 == null ? UNAVAILABLE : str3;
        this.f74732d = str4 == null ? UNAVAILABLE : str4;
        this.f74733e = str5 == null ? UNAVAILABLE : str5;
    }

    public static VersionInfo fromMap(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        Args.notNull(str, "Package identifier");
        String str5 = null;
        if (map != null) {
            String str6 = (String) map.get(PROPERTY_MODULE);
            if (str6 != null && str6.length() < 1) {
                str6 = null;
            }
            String str7 = (String) map.get(PROPERTY_RELEASE);
            if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                str7 = null;
            }
            String str8 = (String) map.get(PROPERTY_TIMESTAMP);
            if (str8 != null && (str8.length() < 1 || str8.equals("${mvn.timestamp}"))) {
                str4 = null;
            } else {
                str4 = str8;
            }
            str2 = str6;
            str3 = str7;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        return new VersionInfo(str, str2, str3, str4, str5);
    }

    public static String getUserAgent(String str, String str2, Class<?> cls) {
        String str3;
        VersionInfo loadVersionInfo = loadVersionInfo(str2, cls.getClassLoader());
        if (loadVersionInfo != null) {
            str3 = loadVersionInfo.getRelease();
        } else {
            str3 = UNAVAILABLE;
        }
        return String.format("%s/%s (Java/%s)", str, str3, System.getProperty("java.version"));
    }

    public static VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        Args.notNull(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            VersionInfo loadVersionInfo = loadVersionInfo(str, classLoader);
            if (loadVersionInfo != null) {
                arrayList.add(loadVersionInfo);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }

    public final String getClassloader() {
        return this.f74733e;
    }

    public final String getModule() {
        return this.f74730b;
    }

    public final String getPackage() {
        return this.f74729a;
    }

    public final String getRelease() {
        return this.f74731c;
    }

    public final String getTimestamp() {
        return this.f74732d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f74729a.length() + 20 + this.f74730b.length() + this.f74731c.length() + this.f74732d.length() + this.f74733e.length());
        sb.append("VersionInfo(");
        sb.append(this.f74729a);
        sb.append(':');
        sb.append(this.f74730b);
        if (!UNAVAILABLE.equals(this.f74731c)) {
            sb.append(':');
            sb.append(this.f74731c);
        }
        if (!UNAVAILABLE.equals(this.f74732d)) {
            sb.append(':');
            sb.append(this.f74732d);
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (!UNAVAILABLE.equals(this.f74733e)) {
            sb.append('@');
            sb.append(this.f74733e);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            java.lang.String r0 = "Package identifier"
            org.apache.http.util.Args.notNull(r4, r0)
            if (r5 == 0) goto L8
            goto L10
        L8:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L10:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48
            r1.<init>()     // Catch: java.io.IOException -> L48
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch: java.io.IOException -> L48
            r1.append(r2)     // Catch: java.io.IOException -> L48
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch: java.io.IOException -> L48
            java.lang.String r2 = "version.properties"
            r1.append(r2)     // Catch: java.io.IOException -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L48
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch: java.io.IOException -> L48
            if (r1 == 0) goto L49
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            r2.load(r1)     // Catch: java.lang.Throwable -> L43
            r1.close()     // Catch: java.io.IOException -> L41
            goto L4a
        L41:
            goto L4a
        L43:
            r2 = move-exception
            r1.close()     // Catch: java.io.IOException -> L48
            throw r2     // Catch: java.io.IOException -> L48
        L48:
        L49:
            r2 = r0
        L4a:
            if (r2 == 0) goto L50
            org.apache.http.util.VersionInfo r0 = fromMap(r4, r2, r5)
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.VersionInfo.loadVersionInfo(java.lang.String, java.lang.ClassLoader):org.apache.http.util.VersionInfo");
    }
}