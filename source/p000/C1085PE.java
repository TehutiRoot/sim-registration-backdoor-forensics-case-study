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

/* renamed from: PE */
/* loaded from: classes4.dex */
public class C1085PE implements IG1 {

    /* renamed from: a */
    public final String f4680a;

    /* renamed from: b */
    public final HttpRequestFactory f4681b;

    /* renamed from: c */
    public final Logger f4682c;

    public C1085PE(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }

    @Override // p000.IG1
    /* renamed from: a */
    public JSONObject mo66899a(HG1 hg1, boolean z) {
        CrashlyticsWorkers.checkBlockingThread();
        if (z) {
            try {
                Map m66894f = m66894f(hg1);
                HttpGetRequest m66898b = m66898b(m66896d(m66894f), hg1);
                Logger logger = this.f4682c;
                logger.m39140d("Requesting settings from " + this.f4680a);
                Logger logger2 = this.f4682c;
                logger2.m39134v("Settings query params were: " + m66894f);
                return m66893g(m66898b.execute());
            } catch (IOException e) {
                this.f4682c.m39137e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: b */
    public final HttpGetRequest m66898b(HttpGetRequest httpGetRequest, HG1 hg1) {
        m66897c(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", hg1.f2167a);
        m66897c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m66897c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        m66897c(httpGetRequest, "Accept", "application/json");
        m66897c(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", hg1.f2168b);
        m66897c(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", hg1.f2169c);
        m66897c(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", hg1.f2170d);
        m66897c(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", hg1.f2171e.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    /* renamed from: c */
    public final void m66897c(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    /* renamed from: d */
    public HttpGetRequest m66896d(Map map) {
        HttpGetRequest buildHttpGetRequest = this.f4681b.buildHttpGetRequest(this.f4680a, map);
        return buildHttpGetRequest.header("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject m66895e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger logger = this.f4682c;
            logger.m39131w("Failed to parse settings JSON from " + this.f4680a, e);
            Logger logger2 = this.f4682c;
            logger2.m39132w("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map m66894f(HG1 hg1) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", hg1.f2174h);
        hashMap.put("display_version", hg1.f2173g);
        hashMap.put("source", Integer.toString(hg1.f2175i));
        String str = hg1.f2172f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject m66893g(HttpResponse httpResponse) {
        int code = httpResponse.code();
        Logger logger = this.f4682c;
        logger.m39134v("Settings response code was: " + code);
        if (m66892h(code)) {
            return m66895e(httpResponse.body());
        }
        Logger logger2 = this.f4682c;
        logger2.m39138e("Settings request failed; (status: " + code + ") from " + this.f4680a);
        return null;
    }

    /* renamed from: h */
    public boolean m66892h(int i) {
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            return false;
        }
        return true;
    }

    public C1085PE(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str != null) {
            this.f4682c = logger;
            this.f4681b = httpRequestFactory;
            this.f4680a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
