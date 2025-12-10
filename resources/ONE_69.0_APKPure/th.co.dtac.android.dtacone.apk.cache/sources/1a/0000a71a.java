package com.google.auth.oauth2;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public final class StsTokenExchangeResponse {

    /* renamed from: a */
    public final AccessToken f52567a;

    /* renamed from: b */
    public final String f52568b;

    /* renamed from: c */
    public final String f52569c;

    /* renamed from: d */
    public final Long f52570d;

    /* renamed from: e */
    public final String f52571e;

    /* renamed from: f */
    public final List f52572f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f52573a;

        /* renamed from: b */
        public final String f52574b;

        /* renamed from: c */
        public final String f52575c;

        /* renamed from: d */
        public Long f52576d;

        /* renamed from: e */
        public String f52577e;

        /* renamed from: f */
        public List f52578f;

        public StsTokenExchangeResponse build() {
            return new StsTokenExchangeResponse(this.f52573a, this.f52574b, this.f52575c, this.f52576d, this.f52577e, this.f52578f);
        }

        @CanIgnoreReturnValue
        public Builder setExpiresInSeconds(long j) {
            this.f52576d = Long.valueOf(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRefreshToken(String str) {
            this.f52577e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(List<String> list) {
            if (list != null) {
                this.f52578f = new ArrayList(list);
            }
            return this;
        }

        public Builder(String str, String str2, String str3) {
            this.f52573a = str;
            this.f52574b = str2;
            this.f52575c = str3;
        }
    }

    /* renamed from: b */
    public static Builder m41578b(String str, String str2, String str3) {
        return new Builder(str, str2, str3);
    }

    /* renamed from: a */
    public AccessToken m41579a() {
        return this.f52567a;
    }

    public StsTokenExchangeResponse(String str, String str2, String str3, Long l, String str4, List list) {
        Preconditions.checkNotNull(str);
        this.f52570d = l;
        Long valueOf = l == null ? null : Long.valueOf(System.currentTimeMillis() + (l.longValue() * 1000));
        this.f52567a = new AccessToken(str, valueOf != null ? new Date(valueOf.longValue()) : null);
        this.f52568b = (String) Preconditions.checkNotNull(str2);
        this.f52569c = (String) Preconditions.checkNotNull(str3);
        this.f52571e = str4;
        this.f52572f = list;
    }
}