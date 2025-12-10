package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.time.Instant;
import org.apache.http.cookie.ClientCookie;

/* renamed from: com.google.auth.oauth2.d */
/* loaded from: classes4.dex */
public class C7364d {

    /* renamed from: a */
    public final int f52677a;

    /* renamed from: b */
    public final boolean f52678b;

    /* renamed from: c */
    public Long f52679c;

    /* renamed from: d */
    public String f52680d;

    /* renamed from: e */
    public String f52681e;

    /* renamed from: f */
    public String f52682f;

    /* renamed from: g */
    public String f52683g;

    public C7364d(GenericJson genericJson) {
        String str;
        if (genericJson.containsKey(ClientCookie.VERSION_ATTR)) {
            if (genericJson.containsKey(FirebaseAnalytics.Param.SUCCESS)) {
                this.f52677a = m41479i(genericJson.get(ClientCookie.VERSION_ATTR));
                boolean booleanValue = ((Boolean) genericJson.get(FirebaseAnalytics.Param.SUCCESS)).booleanValue();
                this.f52678b = booleanValue;
                if (booleanValue) {
                    if (genericJson.containsKey("token_type")) {
                        this.f52680d = (String) genericJson.get("token_type");
                        if (genericJson.containsKey("expiration_time")) {
                            this.f52679c = Long.valueOf(m41478j(genericJson.get("expiration_time")));
                        }
                        if ("urn:ietf:params:oauth:token-type:saml2".equals(this.f52680d)) {
                            this.f52681e = (String) genericJson.get("saml_response");
                        } else {
                            this.f52681e = (String) genericJson.get("id_token");
                        }
                        String str2 = this.f52681e;
                        if (str2 == null || str2.isEmpty()) {
                            throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response does not contain a valid token.");
                        }
                        return;
                    }
                    throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response is missing the `token_type` field.");
                }
                this.f52682f = (String) genericJson.get("code");
                this.f52683g = (String) genericJson.get("message");
                String str3 = this.f52682f;
                if (str3 != null && !str3.isEmpty() && (str = this.f52683g) != null && !str.isEmpty()) {
                    return;
                }
                throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response must contain `error` and `message` fields when unsuccessful.");
            }
            throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response is missing the `success` field.");
        }
        throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response is missing the `version` field.");
    }

    /* renamed from: i */
    public static int m41479i(Object obj) {
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).intValue();
        }
        return ((Integer) obj).intValue();
    }

    /* renamed from: j */
    public static long m41478j(Object obj) {
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).longValue();
        }
        return ((Long) obj).longValue();
    }

    /* renamed from: a */
    public String m41487a() {
        return this.f52682f;
    }

    /* renamed from: b */
    public String m41486b() {
        return this.f52683g;
    }

    /* renamed from: c */
    public Long m41485c() {
        return this.f52679c;
    }

    /* renamed from: d */
    public String m41484d() {
        return this.f52681e;
    }

    /* renamed from: e */
    public int m41483e() {
        return this.f52677a;
    }

    /* renamed from: f */
    public boolean m41482f() {
        Instant now;
        long epochSecond;
        Long l = this.f52679c;
        if (l != null) {
            long longValue = l.longValue();
            now = Instant.now();
            epochSecond = now.getEpochSecond();
            if (longValue <= epochSecond) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m41481g() {
        return this.f52678b;
    }

    /* renamed from: h */
    public boolean m41480h() {
        if (m41481g() && !m41482f()) {
            return true;
        }
        return false;
    }
}