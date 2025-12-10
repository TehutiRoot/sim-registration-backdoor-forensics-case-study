package com.google.api.client.googleapis;

import com.google.api.client.util.SecurityUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class GoogleUtils {
    public static final Integer BUGFIX_VERSION;
    public static final Integer MAJOR_VERSION;
    public static final Integer MINOR_VERSION;
    public static final String VERSION;

    /* renamed from: a */
    public static final Pattern f51791a;

    /* renamed from: b */
    public static KeyStore f51792b;

    static {
        String m41840a = m41840a();
        VERSION = m41840a;
        Pattern compile = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        f51791a = compile;
        Matcher matcher = compile.matcher(m41840a);
        matcher.find();
        MAJOR_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        MINOR_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(2)));
        BUGFIX_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(3)));
    }

    private GoogleUtils() {
    }

    /* renamed from: a */
    public static String m41840a() {
        String str = null;
        try {
            InputStream resourceAsStream = GoogleUtils.class.getResourceAsStream("/com/google/api/client/googleapis/google-api-client.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-api-client.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        if (str == null) {
            return "unknown-version";
        }
        return str;
    }

    public static synchronized KeyStore getCertificateTrustStore() throws IOException, GeneralSecurityException {
        KeyStore keyStore;
        synchronized (GoogleUtils.class) {
            try {
                if (f51792b == null) {
                    f51792b = SecurityUtils.getPkcs12KeyStore();
                    SecurityUtils.loadKeyStore(f51792b, GoogleUtils.class.getResourceAsStream("google.p12"), "notasecret");
                }
                keyStore = f51792b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return keyStore;
    }
}
