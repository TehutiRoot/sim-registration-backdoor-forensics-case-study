package com.google.auth.oauth2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.auth.oauth2.a */
/* loaded from: classes4.dex */
public class C7368a {

    /* renamed from: a */
    public AwsSecurityCredentials f52625a;

    /* renamed from: b */
    public Map f52626b;

    /* renamed from: c */
    public String f52627c;

    /* renamed from: d */
    public String f52628d;

    /* renamed from: e */
    public String f52629e;

    /* renamed from: f */
    public String f52630f;

    /* renamed from: g */
    public String f52631g;

    /* renamed from: h */
    public String f52632h;

    /* renamed from: i */
    public String f52633i;

    /* renamed from: com.google.auth.oauth2.a$b */
    /* loaded from: classes4.dex */
    public static class C7370b {

        /* renamed from: a */
        public AwsSecurityCredentials f52634a;

        /* renamed from: b */
        public Map f52635b;

        /* renamed from: c */
        public String f52636c;

        /* renamed from: d */
        public String f52637d;

        /* renamed from: e */
        public String f52638e;

        /* renamed from: f */
        public String f52639f;

        /* renamed from: g */
        public String f52640g;

        /* renamed from: h */
        public String f52641h;

        /* renamed from: i */
        public String f52642i;

        /* renamed from: a */
        public C7368a m41537a() {
            return new C7368a(this.f52634a, this.f52635b, this.f52636c, this.f52637d, this.f52638e, this.f52639f, this.f52640g, this.f52641h, this.f52642i);
        }

        /* renamed from: b */
        public C7370b m41536b(String str) {
            this.f52642i = str;
            return this;
        }

        /* renamed from: c */
        public C7370b m41535c(Map map) {
            this.f52635b = new HashMap(map);
            return this;
        }

        /* renamed from: d */
        public C7370b m41534d(String str) {
            this.f52637d = str;
            return this;
        }

        /* renamed from: e */
        public C7370b m41533e(String str) {
            this.f52640g = str;
            return this;
        }

        /* renamed from: f */
        public C7370b m41532f(String str) {
            this.f52639f = str;
            return this;
        }

        /* renamed from: g */
        public C7370b m41531g(String str) {
            this.f52641h = str;
            return this;
        }

        /* renamed from: h */
        public C7370b m41530h(AwsSecurityCredentials awsSecurityCredentials) {
            this.f52634a = awsSecurityCredentials;
            return this;
        }

        /* renamed from: i */
        public C7370b m41529i(String str) {
            this.f52636c = str;
            return this;
        }

        /* renamed from: j */
        public C7370b m41528j(String str) {
            this.f52638e = str;
            return this;
        }
    }

    /* renamed from: a */
    public String m41541a() {
        return this.f52633i;
    }

    /* renamed from: b */
    public Map m41540b() {
        return new HashMap(this.f52626b);
    }

    /* renamed from: c */
    public String m41539c() {
        return this.f52630f;
    }

    /* renamed from: d */
    public String m41538d() {
        return this.f52632h;
    }

    public C7368a(AwsSecurityCredentials awsSecurityCredentials, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f52625a = awsSecurityCredentials;
        this.f52626b = map;
        this.f52627c = str;
        this.f52628d = str2;
        this.f52629e = str3;
        this.f52630f = str4;
        this.f52631g = str5;
        this.f52632h = str6;
        this.f52633i = str7;
    }
}
