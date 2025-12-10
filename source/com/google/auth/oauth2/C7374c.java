package com.google.auth.oauth2;

import com.google.auth.http.HttpTransportFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.auth.oauth2.c */
/* loaded from: classes4.dex */
public class C7374c {

    /* renamed from: d */
    public static final C7374c f52657d = new C7374c();

    /* renamed from: e */
    public static final String f52658e = System.getProperty("java.specification.version");

    /* renamed from: f */
    public static final String f52659f = System.getProperty("com.google.appengine.runtime.version");

    /* renamed from: g */
    public static final String f52660g = System.getProperty("org.eclipse.jetty.util.log.class");

    /* renamed from: h */
    public static final Logger f52661h = Logger.getLogger(C7374c.class.getName());

    /* renamed from: a */
    public GoogleCredentials f52662a = null;

    /* renamed from: b */
    public boolean f52663b = false;

    /* renamed from: c */
    public boolean f52664c = false;

    /* renamed from: a */
    public Class m41516a(String str) {
        return Class.forName(str);
    }

    /* renamed from: b */
    public final GoogleCredentials m41515b(HttpTransportFactory httpTransportFactory) {
        synchronized (this) {
            try {
                if (this.f52662a == null) {
                    this.f52662a = m41514c(httpTransportFactory);
                }
                GoogleCredentials googleCredentials = this.f52662a;
                if (googleCredentials != null) {
                    return googleCredentials;
                }
                throw new IOException("Your default credentials were not found. To set up Application Default Credentials for your environment, see https://cloud.google.com/docs/authentication/external/set-up-adc.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
        m41501p(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.auth.oauth2.GoogleCredentials m41514c(com.google.auth.http.HttpTransportFactory r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.auth.oauth2.C7374c.m41514c(com.google.auth.http.HttpTransportFactory):com.google.auth.oauth2.GoogleCredentials");
    }

    /* renamed from: d */
    public String m41513d(String str) {
        return System.getenv(str);
    }

    /* renamed from: e */
    public String m41512e() {
        return m41511f("os.name", "").toLowerCase(Locale.US);
    }

    /* renamed from: f */
    public String m41511f(String str, String str2) {
        return System.getProperty(str, str2);
    }

    /* renamed from: g */
    public final File m41510g() {
        return GoogleAuthUtils.m41647a(this);
    }

    /* renamed from: h */
    public boolean m41509h(File file) {
        return file.isFile();
    }

    /* renamed from: i */
    public boolean m41508i() {
        if (f52659f != null && (f52658e.equals("1.7") || f52660g == null)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public InputStream m41507j(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: k */
    public final boolean m41506k() {
        try {
            try {
                Field field = m41516a("com.google.appengine.api.utils.SystemProperty").getField("environment");
                if (field.getType().getMethod("value", null).invoke(field.get(null), null) != null) {
                    return true;
                }
                return false;
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                throw new RuntimeException(String.format("Unexpected error trying to determine if runnning on Google App Engine: %s", e.getMessage()), e);
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m41505l() {
        String m41513d = m41513d("GOOGLE_APPLICATION_CREDENTIALS_SKIP_APP_ENGINE");
        if (m41513d == null) {
            return false;
        }
        if (!m41513d.equalsIgnoreCase("true") && !m41513d.equals("1")) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final GoogleCredentials m41504m() {
        if (this.f52663b) {
            return null;
        }
        boolean m41506k = m41506k();
        this.f52663b = true;
        if (!m41506k) {
            return null;
        }
        return new AppEngineCredentials(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: n */
    public final GoogleCredentials m41503n() {
        String m41513d = m41513d("DEVSHELL_CLIENT_PORT");
        if (m41513d != null) {
            return CloudShellCredentials.create(Integer.parseInt(m41513d));
        }
        return null;
    }

    /* renamed from: o */
    public final GoogleCredentials m41502o(HttpTransportFactory httpTransportFactory) {
        if (this.f52664c) {
            return null;
        }
        boolean isOnGce = ComputeEngineCredentials.isOnGce(httpTransportFactory, this);
        this.f52664c = true;
        if (!isOnGce) {
            return null;
        }
        return ComputeEngineCredentials.newBuilder().setHttpTransportFactory(httpTransportFactory).build();
    }

    /* renamed from: p */
    public final void m41501p(GoogleCredentials googleCredentials) {
        if ((googleCredentials instanceof UserCredentials) && !Boolean.parseBoolean(m41513d("SUPPRESS_GCLOUD_CREDS_WARNING")) && ComputeEngineCredentials.checkStaticGceDetection(this)) {
            f52661h.log(Level.WARNING, "You are authenticating using user credentials. For production, we recommend using service account credentials.\n\nTo learn more about service account credentials, see http://cloud.google.com/docs/authentication/external/set-up-adc-on-cloud");
        }
    }
}
