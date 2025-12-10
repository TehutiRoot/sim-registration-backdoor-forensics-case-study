package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class VersionUtil {

    /* renamed from: a */
    public static final Pattern f43265a = Pattern.compile("[-_./;:]");

    /* renamed from: a */
    public static final void m49493a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static Version mavenVersionFor(ClassLoader classLoader, String str, String str2) {
        InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/maven/" + str.replaceAll("\\.", RemoteSettings.FORWARD_SLASH_STRING) + RemoteSettings.FORWARD_SLASH_STRING + str2 + "/pom.properties");
        if (resourceAsStream != null) {
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                return parseVersion(properties.getProperty(ClientCookie.VERSION_ATTR), properties.getProperty("groupId"), properties.getProperty("artifactId"));
            } catch (IOException unused) {
            } finally {
                m49493a(resourceAsStream);
            }
        }
        return Version.unknownVersion();
    }

    public static Version packageVersionFor(Class<?> cls) {
        Version version = null;
        try {
            Class<?> cls2 = Class.forName(cls.getPackage().getName() + ".PackageVersion", true, cls.getClassLoader());
            try {
                version = ((Versioned) cls2.getDeclaredConstructor(null).newInstance(null)).version();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to get Versioned out of " + cls2);
            }
        } catch (Exception unused2) {
        }
        if (version == null) {
            return Version.unknownVersion();
        }
        return version;
    }

    public static Version parseVersion(String str, String str2, String str3) {
        int i;
        int i2;
        String str4;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = f43265a.split(trim);
                int parseVersionPart = parseVersionPart(split[0]);
                if (split.length > 1) {
                    i = parseVersionPart(split[1]);
                } else {
                    i = 0;
                }
                if (split.length > 2) {
                    i2 = parseVersionPart(split[2]);
                } else {
                    i2 = 0;
                }
                if (split.length > 3) {
                    str4 = split[3];
                } else {
                    str4 = null;
                }
                return new Version(parseVersionPart, i, i2, str4, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    public static int parseVersionPart(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    public static final void throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static Version versionFor(Class<?> cls) {
        Version packageVersionFor = packageVersionFor(cls);
        if (packageVersionFor == null) {
            return Version.unknownVersion();
        }
        return packageVersionFor;
    }

    @Deprecated
    public Version version() {
        return Version.unknownVersion();
    }
}
