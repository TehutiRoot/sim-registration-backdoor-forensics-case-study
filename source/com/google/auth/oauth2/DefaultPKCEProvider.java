package com.google.auth.oauth2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/* loaded from: classes4.dex */
public class DefaultPKCEProvider implements PKCEProvider {

    /* renamed from: a */
    public String f52430a;

    /* renamed from: b */
    public C7338a f52431b;

    /* renamed from: com.google.auth.oauth2.DefaultPKCEProvider$a */
    /* loaded from: classes4.dex */
    public class C7338a {

        /* renamed from: a */
        public String f52432a;

        /* renamed from: b */
        public String f52433b;

        public C7338a(String str) {
            Base64.Encoder urlEncoder;
            String encodeToString;
            try {
                byte[] bytes = str.getBytes();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes);
                byte[] digest = messageDigest.digest();
                urlEncoder = Base64.getUrlEncoder();
                encodeToString = urlEncoder.encodeToString(digest);
                this.f52432a = encodeToString.replace("=", "");
                this.f52433b = "S256";
            } catch (NoSuchAlgorithmException unused) {
                this.f52432a = str;
                this.f52433b = "plain";
            }
        }

        /* renamed from: a */
        public String m41674a() {
            return this.f52432a;
        }

        /* renamed from: b */
        public String m41673b() {
            return this.f52433b;
        }
    }

    public DefaultPKCEProvider() {
        String m41675b = m41675b();
        this.f52430a = m41675b;
        this.f52431b = m41676a(m41675b);
    }

    /* renamed from: a */
    public final C7338a m41676a(String str) {
        return new C7338a(str);
    }

    /* renamed from: b */
    public final String m41675b() {
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
        return this.f52431b.m41674a();
    }

    @Override // com.google.auth.oauth2.PKCEProvider
    public String getCodeChallengeMethod() {
        return this.f52431b.m41673b();
    }

    @Override // com.google.auth.oauth2.PKCEProvider
    public String getCodeVerifier() {
        return this.f52430a;
    }
}
