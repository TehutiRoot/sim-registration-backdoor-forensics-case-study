package com.google.auth.oauth2;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* loaded from: classes4.dex */
public final class StsTokenExchangeRequest {

    /* renamed from: a */
    public final String f52553a;

    /* renamed from: b */
    public final String f52554b;

    /* renamed from: c */
    public final List f52555c;

    /* renamed from: d */
    public final String f52556d;

    /* renamed from: e */
    public final String f52557e;

    /* renamed from: f */
    public final String f52558f;

    /* renamed from: g */
    public final String f52559g;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f52560a;

        /* renamed from: b */
        public final String f52561b;

        /* renamed from: c */
        public String f52562c;

        /* renamed from: d */
        public String f52563d;

        /* renamed from: e */
        public String f52564e;

        /* renamed from: f */
        public List f52565f;

        /* renamed from: g */
        public String f52566g;

        public StsTokenExchangeRequest build() {
            return new StsTokenExchangeRequest(this.f52560a, this.f52561b, null, this.f52565f, this.f52562c, this.f52563d, this.f52564e, this.f52566g);
        }

        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            this.f52563d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInternalOptions(String str) {
            this.f52566g = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRequestTokenType(String str) {
            this.f52564e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setResource(String str) {
            this.f52562c = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(List<String> list) {
            this.f52565f = list;
            return this;
        }

        public Builder(String str, String str2) {
            this.f52560a = str;
            this.f52561b = str2;
        }

        @CanIgnoreReturnValue
        public Builder setActingParty(AbstractC0491H1 abstractC0491H1) {
            return this;
        }
    }

    /* renamed from: n */
    public static Builder m41580n(String str, String str2) {
        return new Builder(str, str2);
    }

    /* renamed from: a */
    public AbstractC0491H1 m41593a() {
        return null;
    }

    /* renamed from: b */
    public String m41592b() {
        return this.f52557e;
    }

    /* renamed from: c */
    public String m41591c() {
        return this.f52559g;
    }

    /* renamed from: d */
    public String m41590d() {
        return this.f52558f;
    }

    /* renamed from: e */
    public String m41589e() {
        return this.f52556d;
    }

    /* renamed from: f */
    public List m41588f() {
        return this.f52555c;
    }

    /* renamed from: g */
    public String m41587g() {
        return this.f52553a;
    }

    /* renamed from: h */
    public String m41586h() {
        return this.f52554b;
    }

    /* renamed from: i */
    public boolean m41585i() {
        return false;
    }

    /* renamed from: j */
    public boolean m41584j() {
        String str = this.f52557e;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m41583k() {
        String str = this.f52558f;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m41582l() {
        String str = this.f52556d;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m41581m() {
        List list = this.f52555c;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public StsTokenExchangeRequest(String str, String str2, AbstractC0491H1 abstractC0491H1, List list, String str3, String str4, String str5, String str6) {
        this.f52553a = (String) Preconditions.checkNotNull(str);
        this.f52554b = (String) Preconditions.checkNotNull(str2);
        this.f52555c = list;
        this.f52556d = str3;
        this.f52557e = str4;
        this.f52558f = str5;
        this.f52559g = str6;
    }
}