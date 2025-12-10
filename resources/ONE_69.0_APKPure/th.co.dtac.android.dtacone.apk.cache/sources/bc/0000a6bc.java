package com.google.auth.oauth2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/* loaded from: classes4.dex */
public class DefaultPKCEProvider implements PKCEProvider {

    /* renamed from: a */
    public String f52442a;

    /* renamed from: b */
    public C7327a f52443b;

    /* renamed from: com.google.auth.oauth2.DefaultPKCEProvider$a */
    /* loaded from: classes4.dex */
    public class C7327a {

        /* renamed from: a */
        public String f52444a;

        /* renamed from: b */
        public String f52445b;

        public C7327a(String str) {
            Base64.Encoder urlEncoder;
            String encodeToString;
            try {
                byte[] bytes = str.getBytes();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes);
                byte[] digest = messageDigest.digest();
                urlEncoder = Base64.getUrlEncoder();
                encodeToString = urlEncoder.encodeToString(digest);
                this.f52444a = encodeToString.replace("=", "");
                this.f52445b = "S256";
            } catch (NoSuchAlgorithmException unused) {
                this.f52444a = str;
                this.f52445b = "plain";
            }
        }

        /* renamed from: a */
        public String m41661a() {
            return this.f52444a;
        }

        /* renamed from: b */
        public String m41660b() {
            return this.f52445b;
        }
    }

    public DefaultPKCEProvider() {
        String m41662b = m41662b();
        this.f52442a = m41662b;
        this.f52443b = m41663a(m41662b);
    }

    /* renamed from: a */
    public final C7327a m41663a(String str) {
        return new C7327a(str);
    }

    /* renamed from: b */
    public final String m41662b() {
        Base64.Encoder urlEncoder;
        String encodeToString;
        byte[] bArr = new byte[127];
        new SecureRandom().nextBytes(bArr);
        urlEncoder = Base64.getUrlEncoder();
        encodeToString = urlEncoder.encodeToString(bArr);
        return encodeToString;
    }

    @Override // com.google.auth.oauth2.PKCEProvider
    public String getCodeChallenge() {
        return this.f52443b.m41661a();
    }

    @Override // com.google.auth.oauth2.PKCEProvider
    public String getCodeChallengeMethod() {
        return this.f52443b.m41660b();
    }

    @Override // com.google.auth.oauth2.PKCEProvider
    public String getCodeVerifier() {
        return this.f52442a;
    }
}