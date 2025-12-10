package com.google.auth.oauth2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.auth.oauth2.a */
/* loaded from: classes4.dex */
public class C7357a {

    /* renamed from: a */
    public AwsSecurityCredentials f52637a;

    /* renamed from: b */
    public Map f52638b;

    /* renamed from: c */
    public String f52639c;

    /* renamed from: d */
    public String f52640d;

    /* renamed from: e */
    public String f52641e;

    /* renamed from: f */
    public String f52642f;

    /* renamed from: g */
    public String f52643g;

    /* renamed from: h */
    public String f52644h;

    /* renamed from: i */
    public String f52645i;

    /* renamed from: com.google.auth.oauth2.a$b */
    /* loaded from: classes4.dex */
    public static class C7359b {

        /* renamed from: a */
        public AwsSecurityCredentials f52646a;

        /* renamed from: b */
        public Map f52647b;

        /* renamed from: c */
        public String f52648c;

        /* renamed from: d */
        public String f52649d;

        /* renamed from: e */
        public String f52650e;

        /* renamed from: f */
        public String f52651f;

        /* renamed from: g */
        public String f52652g;

        /* renamed from: h */
        public String f52653h;

        /* renamed from: i */
        public String f52654i;

        /* renamed from: a */
        public C7357a m41524a() {
            return new C7357a(this.f52646a, this.f52647b, this.f52648c, this.f52649d, this.f52650e, this.f52651f, this.f52652g, this.f52653h, this.f52654i);
        }

        /* renamed from: b */
        public C7359b m41523b(String str) {
            this.f52654i = str;
            return this;
        }

        /* renamed from: c */
        public C7359b m41522c(Map map) {
            this.f52647b = new HashMap(map);
            return this;
        }

        /* renamed from: d */
        public C7359b m41521d(String str) {
            this.f52649d = str;
            return this;
        }

        /* renamed from: e */
        public C7359b m41520e(String str) {
            this.f52652g = str;
            return this;
        }

        /* renamed from: f */
        public C7359b m41519f(String str) {
            this.f52651f = str;
            return this;
        }

        /* renamed from: g */
        public C7359b m41518g(String str) {
            this.f52653h = str;
            return this;
        }

        /* renamed from: h */
        public C7359b m41517h(AwsSecurityCredentials awsSecurityCredentials) {
            this.f52646a = awsSecurityCredentials;
            return this;
        }

        /* renamed from: i */
        public C7359b m41516i(String str) {
            this.f52648c = str;
            return this;
        }

        /* renamed from: j */
        public C7359b m41515j(String str) {
            this.f52650e = str;
            return this;
        }
    }

    /* renamed from: a */
    public String m41528a() {
        return this.f52645i;
    }

    /* renamed from: b */
    public Map m41527b() {
        return new HashMap(this.f52638b);
    }

    /* renamed from: c */
    public String m41526c() {
        return this.f52642f;
    }

    /* renamed from: d */
    public String m41525d() {
        return this.f52644h;
    }

    public C7357a(AwsSecurityCredentials awsSecurityCredentials, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f52637a = awsSecurityCredentials;
        this.f52638b = map;
        this.f52639c = str;
        this.f52640d = str2;
        this.f52641e = str3;
        this.f52642f = str4;
        this.f52643g = str5;
        this.f52644h = str6;
        this.f52645i = str7;
    }
}