package com.google.auth.oauth2;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* loaded from: classes4.dex */
public final class StsTokenExchangeRequest {

    /* renamed from: a */
    public final String f52541a;

    /* renamed from: b */
    public final String f52542b;

    /* renamed from: c */
    public final List f52543c;

    /* renamed from: d */
    public final String f52544d;

    /* renamed from: e */
    public final String f52545e;

    /* renamed from: f */
    public final String f52546f;

    /* renamed from: g */
    public final String f52547g;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f52548a;

        /* renamed from: b */
        public final String f52549b;

        /* renamed from: c */
        public String f52550c;

        /* renamed from: d */
        public String f52551d;

        /* renamed from: e */
        public String f52552e;

        /* renamed from: f */
        public List f52553f;

        /* renamed from: g */
        public String f52554g;

        public StsTokenExchangeRequest build() {
            return new StsTokenExchangeRequest(this.f52548a, this.f52549b, null, this.f52553f, this.f52550c, this.f52551d, this.f52552e, this.f52554g);
        }

        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            this.f52551d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInternalOptions(String str) {
            this.f52554g = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRequestTokenType(String str) {
            this.f52552e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setResource(String str) {
            this.f52550c = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(List<String> list) {
            this.f52553f = list;
            return this;
        }

        public Builder(String str, String str2) {
            this.f52548a = str;
            this.f52549b = str2;
        }

        @CanIgnoreReturnValue
        public Builder setActingParty(AbstractC0497H1 abstractC0497H1) {
            return this;
        }
    }

    /* renamed from: n */
    public static Builder m41593n(String str, String str2) {
        return new Builder(str, str2);
    }

    /* renamed from: a */
    public AbstractC0497H1 m41606a() {
        return null;
    }

    /* renamed from: b */
    public String m41605b() {
        return this.f52545e;
    }

    /* renamed from: c */
    public String m41604c() {
        return this.f52547g;
    }

    /* renamed from: d */
    public String m41603d() {
        return this.f52546f;
    }

    /* renamed from: e */
    public String m41602e() {
        return this.f52544d;
    }

    /* renamed from: f */
    public List m41601f() {
        return this.f52543c;
    }

    /* renamed from: g */
    public String m41600g() {
        return this.f52541a;
    }

    /* renamed from: h */
    public String m41599h() {
        return this.f52542b;
    }

    /* renamed from: i */
    public boolean m41598i() {
        return false;
    }

    /* renamed from: j */
    public boolean m41597j() {
        String str = this.f52545e;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m41596k() {
        String str = this.f52546f;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m41595l() {
        String str = this.f52544d;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m41594m() {
        List list = this.f52543c;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public StsTokenExchangeRequest(String str, String str2, AbstractC0497H1 abstractC0497H1, List list, String str3, String str4, String str5, String str6) {
        this.f52541a = (String) Preconditions.checkNotNull(str);
        this.f52542b = (String) Preconditions.checkNotNull(str2);
        this.f52543c = list;
        this.f52544d = str3;
        this.f52545e = str4;
        this.f52546f = str5;
        this.f52547g = str6;
    }
}
