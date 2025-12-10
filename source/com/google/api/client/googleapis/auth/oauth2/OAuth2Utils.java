package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

@Beta
/* loaded from: classes4.dex */
public class OAuth2Utils {

    /* renamed from: a */
    public static final Charset f51848a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Logger f51849b = Logger.getLogger(OAuth2Utils.class.getName());

    /* renamed from: a */
    public static Throwable m41816a(Throwable th2, Throwable th3) {
        th2.initCause(th3);
        return th2;
    }

    /* renamed from: b */
    public static String m41815b(C19694eQ1 c19694eQ1) {
        String m31545a = c19694eQ1.m31545a("GCE_METADATA_HOST");
        if (m31545a != null) {
            return "http://" + m31545a;
        }
        return "http://169.254.169.254";
    }

    /* renamed from: c */
    public static boolean m41814c(HttpHeaders httpHeaders, String str, String str2) {
        Object obj = httpHeaders.get(str);
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if ((obj2 instanceof String) && ((String) obj2).equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m41813d(HttpTransport httpTransport, C19694eQ1 c19694eQ1) {
        if (Boolean.parseBoolean(c19694eQ1.m31545a("NO_GCE_CHECK"))) {
            return false;
        }
        GenericUrl genericUrl = new GenericUrl(m41815b(c19694eQ1));
        for (int i = 1; i <= 3; i++) {
            try {
                HttpRequest buildGetRequest = httpTransport.createRequestFactory().buildGetRequest(genericUrl);
                buildGetRequest.setConnectTimeout(500);
                buildGetRequest.getHeaders().set("Metadata-Flavor", "Google");
                HttpResponse execute = buildGetRequest.execute();
                try {
                    return m41814c(execute.getHeaders(), "Metadata-Flavor", "Google");
                } finally {
                    execute.disconnect();
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException e) {
                f51849b.log(Level.WARNING, "Failed to detect whether we are running on Google Compute Engine.", (Throwable) e);
            }
        }
        return false;
    }

    public static String getMetadataServerUrl() {
        return m41815b(C19694eQ1.f61507a);
    }
}
