package com.google.auth.oauth2;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public final class StsTokenExchangeResponse {

    /* renamed from: a */
    public final AccessToken f52555a;

    /* renamed from: b */
    public final String f52556b;

    /* renamed from: c */
    public final String f52557c;

    /* renamed from: d */
    public final Long f52558d;

    /* renamed from: e */
    public final String f52559e;

    /* renamed from: f */
    public final List f52560f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f52561a;

        /* renamed from: b */
        public final String f52562b;

        /* renamed from: c */
        public final String f52563c;

        /* renamed from: d */
        public Long f52564d;

        /* renamed from: e */
        public String f52565e;

        /* renamed from: f */
        public List f52566f;

        public StsTokenExchangeResponse build() {
            return new StsTokenExchangeResponse(this.f52561a, this.f52562b, this.f52563c, this.f52564d, this.f52565e, this.f52566f);
        }

        @CanIgnoreReturnValue
        public Builder setExpiresInSeconds(long j) {
            this.f52564d = Long.valueOf(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRefreshToken(String str) {
            this.f52565e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(List<String> list) {
            if (list != null) {
                this.f52566f = new ArrayList(list);
            }
            return this;
        }

        public Builder(String str, String str2, String str3) {
            this.f52561a = str;
            this.f52562b = str2;
            this.f52563c = str3;
        }
    }

    /* renamed from: b */
    public static Builder m41591b(String str, String str2, String str3) {
        return new Builder(str, str2, str3);
    }

    /* renamed from: a */
    public AccessToken m41592a() {
        return this.f52555a;
    }

    public StsTokenExchangeResponse(String str, String str2, String str3, Long l, String str4, List list) {
        Preconditions.checkNotNull(str);
        this.f52558d = l;
        Long valueOf = l == null ? null : Long.valueOf(System.currentTimeMillis() + (l.longValue() * 1000));
        this.f52555a = new AccessToken(str, valueOf != null ? new Date(valueOf.longValue()) : null);
        this.f52556b = (String) Preconditions.checkNotNull(str2);
        this.f52557c = (String) Preconditions.checkNotNull(str3);
        this.f52559e = str4;
        this.f52560f = list;
    }
}
