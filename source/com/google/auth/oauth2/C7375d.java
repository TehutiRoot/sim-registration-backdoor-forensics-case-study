package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.time.Instant;
import org.apache.http.cookie.ClientCookie;

/* renamed from: com.google.auth.oauth2.d */
/* loaded from: classes4.dex */
public class C7375d {

    /* renamed from: a */
    public final int f52665a;

    /* renamed from: b */
    public final boolean f52666b;

    /* renamed from: c */
    public Long f52667c;

    /* renamed from: d */
    public String f52668d;

    /* renamed from: e */
    public String f52669e;

    /* renamed from: f */
    public String f52670f;

    /* renamed from: g */
    public String f52671g;

    public C7375d(GenericJson genericJson) {
        String str;
        if (genericJson.containsKey(ClientCookie.VERSION_ATTR)) {
            if (genericJson.containsKey(FirebaseAnalytics.Param.SUCCESS)) {
                this.f52665a = m41492i(genericJson.get(ClientCookie.VERSION_ATTR));
                boolean booleanValue = ((Boolean) genericJson.get(FirebaseAnalytics.Param.SUCCESS)).booleanValue();
                this.f52666b = booleanValue;
                if (booleanValue) {
                    if (genericJson.containsKey("token_type")) {
                        this.f52668d = (String) genericJson.get("token_type");
                        if (genericJson.containsKey("expiration_time")) {
                            this.f52667c = Long.valueOf(m41491j(genericJson.get("expiration_time")));
                        }
                        if ("urn:ietf:params:oauth:token-type:saml2".equals(this.f52668d)) {
                            this.f52669e = (String) genericJson.get("saml_response");
                        } else {
                            this.f52669e = (String) genericJson.get("id_token");
                        }
                        String str2 = this.f52669e;
                        if (str2 == null || str2.isEmpty()) {
                            throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response does not contain a valid token.");
                        }
                        return;
                    }
                    throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response is missing the `token_type` field.");
                }
                this.f52670f = (String) genericJson.get("code");
                this.f52671g = (String) genericJson.get("message");
                String str3 = this.f52670f;
                if (str3 != null && !str3.isEmpty() && (str = this.f52671g) != null && !str.isEmpty()) {
                    return;
                }
                throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response must contain `error` and `message` fields when unsuccessful.");
            }
            throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response is missing the `success` field.");
        }
        throw new PluggableAuthException("INVALID_EXECUTABLE_RESPONSE", "The executable response is missing the `version` field.");
    }

    /* renamed from: i */
    public static int m41492i(Object obj) {
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).intValue();
        }
        return ((Integer) obj).intValue();
    }

    /* renamed from: j */
    public static long m41491j(Object obj) {
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).longValue();
        }
        return ((Long) obj).longValue();
    }

    /* renamed from: a */
    public String m41500a() {
        return this.f52670f;
    }

    /* renamed from: b */
    public String m41499b() {
        return this.f52671g;
    }

    /* renamed from: c */
    public Long m41498c() {
        return this.f52667c;
    }

    /* renamed from: d */
    public String m41497d() {
        return this.f52669e;
    }

    /* renamed from: e */
    public int m41496e() {
        return this.f52665a;
    }

    /* renamed from: f */
    public boolean m41495f() {
        Instant now;
        long epochSecond;
        Long l = this.f52667c;
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
    public boolean m41494g() {
        return this.f52666b;
    }

    /* renamed from: h */
    public boolean m41493h() {
        if (m41494g() && !m41495f()) {
            return true;
        }
        return false;
    }
}
