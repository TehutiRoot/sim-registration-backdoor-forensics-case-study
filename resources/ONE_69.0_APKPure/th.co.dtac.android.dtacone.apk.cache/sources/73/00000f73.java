package p000;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: QE */
/* loaded from: classes4.dex */
public class C1145QE implements FH1 {

    /* renamed from: a */
    public final String f5162a;

    /* renamed from: b */
    public final HttpRequestFactory f5163b;

    /* renamed from: c */
    public final Logger f5164c;

    public C1145QE(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }

    @Override // p000.FH1
    /* renamed from: a */
    public JSONObject mo66809a(EH1 eh1, boolean z) {
        CrashlyticsWorkers.checkBlockingThread();
        if (z) {
            try {
                Map m66804f = m66804f(eh1);
                HttpGetRequest m66808b = m66808b(m66806d(m66804f), eh1);
                Logger logger = this.f5164c;
                logger.m39132d("Requesting settings from " + this.f5162a);
                Logger logger2 = this.f5164c;
                logger2.m39126v("Settings query params were: " + m66804f);
                return m66803g(m66808b.execute());
            } catch (IOException e) {
                this.f5164c.m39129e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: b */
    public final HttpGetRequest m66808b(HttpGetRequest httpGetRequest, EH1 eh1) {
        m66807c(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", eh1.f1311a);
        m66807c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m66807c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        m66807c(httpGetRequest, "Accept", "application/json");
        m66807c(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", eh1.f1312b);
        m66807c(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", eh1.f1313c);
        m66807c(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", eh1.f1314d);
        m66807c(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", eh1.f1315e.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    /* renamed from: c */
    public final void m66807c(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    /* renamed from: d */
    public HttpGetRequest m66806d(Map map) {
        HttpGetRequest buildHttpGetRequest = this.f5163b.buildHttpGetRequest(this.f5162a, map);
        return buildHttpGetRequest.header("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject m66805e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger logger = this.f5164c;
            logger.m39123w("Failed to parse settings JSON from " + this.f5162a, e);
            Logger logger2 = this.f5164c;
            logger2.m39124w("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map m66804f(EH1 eh1) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", eh1.f1318h);
        hashMap.put("display_version", eh1.f1317g);
        hashMap.put("source", Integer.toString(eh1.f1319i));
        String str = eh1.f1316f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject m66803g(HttpResponse httpResponse) {
        int code = httpResponse.code();
        Logger logger = this.f5164c;
        logger.m39126v("Settings response code was: " + code);
        if (m66802h(code)) {
            return m66805e(httpResponse.body());
        }
        Logger logger2 = this.f5164c;
        logger2.m39130e("Settings request failed; (status: " + code + ") from " + this.f5162a);
        return null;
    }

    /* renamed from: h */
    public boolean m66802h(int i) {
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            return false;
        }
        return true;
    }

    public C1145QE(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str != null) {
            this.f5164c = logger;
            this.f5163b = httpRequestFactory;
            this.f5162a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}