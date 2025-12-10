package com.google.auth.oauth2;

import com.google.auth.ServiceAccountSigner;
import com.google.auth.oauth2.C7368a;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.p014io.BaseEncoding;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.auth.oauth2.b */
/* loaded from: classes4.dex */
public class C7371b {

    /* renamed from: a */
    public final AwsSecurityCredentials f52643a;

    /* renamed from: b */
    public final Map f52644b;

    /* renamed from: c */
    public final String f52645c;

    /* renamed from: d */
    public final String f52646d;

    /* renamed from: e */
    public final String f52647e;

    /* renamed from: f */
    public final URI f52648f;

    /* renamed from: g */
    public final C1224R9 f52649g;

    /* renamed from: com.google.auth.oauth2.b$b */
    /* loaded from: classes4.dex */
    public static class C7373b {

        /* renamed from: a */
        public final AwsSecurityCredentials f52650a;

        /* renamed from: b */
        public final String f52651b;

        /* renamed from: c */
        public final String f52652c;

        /* renamed from: d */
        public final String f52653d;

        /* renamed from: e */
        public String f52654e;

        /* renamed from: f */
        public Map f52655f;

        /* renamed from: g */
        public C1224R9 f52656g;

        /* renamed from: a */
        public C7371b m41518a() {
            return new C7371b(this.f52650a, this.f52651b, this.f52652c, this.f52653d, this.f52654e, this.f52655f, this.f52656g);
        }

        /* renamed from: b */
        public C7373b m41517b(Map map) {
            if (map.containsKey("date") && map.containsKey("x-amz-date")) {
                throw new IllegalArgumentException("One of {date, x-amz-date} can be specified, not both.");
            }
            try {
                if (map.containsKey("date")) {
                    this.f52656g = C1224R9.m66500a((String) map.get("date"));
                }
                if (map.containsKey("x-amz-date")) {
                    this.f52656g = C1224R9.m66499b((String) map.get("x-amz-date"));
                }
                this.f52655f = map;
                return this;
            } catch (ParseException e) {
                throw new IllegalArgumentException("The provided date header value is invalid.", e);
            }
        }

        public C7373b(AwsSecurityCredentials awsSecurityCredentials, String str, String str2, String str3) {
            this.f52650a = awsSecurityCredentials;
            this.f52651b = str;
            this.f52652c = str2;
            this.f52653d = str3;
        }
    }

    /* renamed from: f */
    public static String m41522f(byte[] bArr) {
        try {
            return BaseEncoding.base16().lowerCase().encode(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to compute SHA-256 hash.", e);
        }
    }

    /* renamed from: g */
    public static C7373b m41521g(AwsSecurityCredentials awsSecurityCredentials, String str, String str2, String str3) {
        return new C7373b(awsSecurityCredentials, str, str2, str3);
    }

    /* renamed from: i */
    public static byte[] m41519i(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return mac.doFinal(bArr2);
        } catch (InvalidKeyException e) {
            throw new ServiceAccountSigner.SigningException("Invalid key used when calculating the AWS V4 Signature", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("HmacSHA256 must be supported by the JVM.", e2);
        }
    }

    /* renamed from: a */
    public final String m41527a(String str, String str2, String str3, String str4, String str5) {
        String str6 = "AWS4" + str2;
        Charset charset = StandardCharsets.UTF_8;
        return BaseEncoding.base16().lowerCase().encode(m41519i(m41519i(m41519i(m41519i(m41519i(str6.getBytes(charset), str3.getBytes(charset)), str4.getBytes(charset)), str.getBytes(charset)), "aws4_request".getBytes(charset)), str5.getBytes(charset)));
    }

    /* renamed from: b */
    public final String m41526b(Map map, List list) {
        String rawPath;
        String str;
        StringBuilder sb = new StringBuilder(this.f52645c);
        sb.append("\n");
        if (this.f52648f.getRawPath().isEmpty()) {
            rawPath = RemoteSettings.FORWARD_SLASH_STRING;
        } else {
            rawPath = this.f52648f.getRawPath();
        }
        sb.append(rawPath);
        sb.append("\n");
        if (this.f52648f.getRawQuery() != null) {
            str = this.f52648f.getRawQuery();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb2.append(str2);
            sb2.append(":");
            sb2.append((String) map.get(str2));
            sb2.append("\n");
        }
        sb.append((CharSequence) sb2);
        sb.append("\n");
        sb.append(Joiner.m41323on(';').join(list));
        sb.append("\n");
        String str3 = this.f52647e;
        Charset charset = StandardCharsets.UTF_8;
        sb.append(m41522f(str3.getBytes(charset)));
        return m41522f(sb.toString().getBytes(charset));
    }

    /* renamed from: c */
    public final String m41525c(String str, String str2, String str3) {
        return "AWS4-HMAC-SHA256\n" + str2 + "\n" + str3 + "\n" + str;
    }

    /* renamed from: d */
    public final String m41524d(List list, String str, String str2, String str3) {
        return String.format("%s Credential=%s/%s, SignedHeaders=%s, Signature=%s", "AWS4-HMAC-SHA256", str, str2, Joiner.m41323on(';').join(list), str3);
    }

    /* renamed from: e */
    public final Map m41523e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("host", this.f52648f.getHost());
        if (!this.f52644b.containsKey("date")) {
            hashMap.put("x-amz-date", str);
        }
        if (this.f52643a.getSessionToken() != null && !this.f52643a.getSessionToken().isEmpty()) {
            hashMap.put("x-amz-security-token", this.f52643a.getSessionToken());
        }
        for (String str2 : this.f52644b.keySet()) {
            hashMap.put(str2.toLowerCase(Locale.US), this.f52644b.get(str2));
        }
        return hashMap;
    }

    /* renamed from: h */
    public C7368a m41520h() {
        String next = Splitter.m41289on(".").split(this.f52648f.getHost()).iterator().next();
        Map m41523e = m41523e(this.f52649g.m66496e());
        ArrayList arrayList = new ArrayList();
        for (String str : m41523e.keySet()) {
            arrayList.add(str.toLowerCase(Locale.US));
        }
        Collections.sort(arrayList);
        String str2 = this.f52649g.m66497d() + RemoteSettings.FORWARD_SLASH_STRING + this.f52646d + RemoteSettings.FORWARD_SLASH_STRING + next + RemoteSettings.FORWARD_SLASH_STRING + "aws4_request";
        String m41527a = m41527a(next, this.f52643a.getSecretAccessKey(), this.f52649g.m66497d(), this.f52646d, m41525c(m41526b(m41523e, arrayList), this.f52649g.m66495f(), str2));
        return new C7368a.C7370b().m41529i(m41527a).m41535c(m41523e).m41532f(this.f52645c).m41530h(this.f52643a).m41534d(str2).m41528j(this.f52648f.toString()).m41533e(this.f52649g.m66496e()).m41531g(this.f52646d).m41536b(m41524d(arrayList, this.f52643a.getAccessKeyId(), str2, m41527a)).m41537a();
    }

    public C7371b(AwsSecurityCredentials awsSecurityCredentials, String str, String str2, String str3, String str4, Map map, C1224R9 c1224r9) {
        this.f52643a = (AwsSecurityCredentials) Preconditions.checkNotNull(awsSecurityCredentials);
        this.f52645c = (String) Preconditions.checkNotNull(str);
        this.f52648f = URI.create(str2).normalize();
        this.f52646d = (String) Preconditions.checkNotNull(str3);
        this.f52647e = str4 == null ? "" : str4;
        this.f52644b = map != null ? new HashMap(map) : new HashMap();
        this.f52649g = c1224r9 == null ? C1224R9.m66498c() : c1224r9;
    }
}
