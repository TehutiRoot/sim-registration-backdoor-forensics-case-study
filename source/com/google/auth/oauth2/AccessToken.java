package com.google.auth.oauth2;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class AccessToken implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    private final Long expirationTimeMillis;
    private final List<String> scopes;
    private final String tokenValue;

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (!Objects.equals(this.tokenValue, accessToken.tokenValue) || !Objects.equals(this.expirationTimeMillis, accessToken.expirationTimeMillis) || !Objects.equals(this.scopes, accessToken.scopes)) {
            return false;
        }
        return true;
    }

    public Date getExpirationTime() {
        if (this.expirationTimeMillis == null) {
            return null;
        }
        return new Date(this.expirationTimeMillis.longValue());
    }

    public Long getExpirationTimeMillis() {
        return this.expirationTimeMillis;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public int hashCode() {
        return Objects.hash(this.tokenValue, this.expirationTimeMillis, this.scopes);
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("tokenValue", this.tokenValue).add("expirationTimeMillis", this.expirationTimeMillis).add("scopes", this.scopes).toString();
    }

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f52396a;

        /* renamed from: b */
        public Date f52397b;

        /* renamed from: c */
        public List f52398c;

        public Builder() {
            this.f52398c = new ArrayList();
        }

        public AccessToken build() {
            return new AccessToken(this);
        }

        public Date getExpirationTime() {
            return this.f52397b;
        }

        public List<String> getScopes() {
            return this.f52398c;
        }

        public String getTokenValue() {
            return this.f52396a;
        }

        @CanIgnoreReturnValue
        public Builder setExpirationTime(Date date) {
            this.f52397b = date;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(String str) {
            if (str != null && str.trim().length() > 0) {
                this.f52398c = Arrays.asList(str.split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR));
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenValue(String str) {
            this.f52396a = str;
            return this;
        }

        public Builder(AccessToken accessToken) {
            this.f52398c = new ArrayList();
            this.f52396a = accessToken.getTokenValue();
            this.f52397b = accessToken.getExpirationTime();
            this.f52398c = accessToken.getScopes();
        }

        @CanIgnoreReturnValue
        public Builder setScopes(List<String> list) {
            if (list == null) {
                this.f52398c = new ArrayList();
            } else {
                this.f52398c = list;
            }
            return this;
        }
    }

    public AccessToken(String str, Date date) {
        this.tokenValue = str;
        this.expirationTimeMillis = date == null ? null : Long.valueOf(date.getTime());
        this.scopes = new ArrayList();
    }

    private AccessToken(Builder builder) {
        this.tokenValue = builder.getTokenValue();
        Date expirationTime = builder.getExpirationTime();
        this.expirationTimeMillis = expirationTime == null ? null : Long.valueOf(expirationTime.getTime());
        this.scopes = builder.getScopes();
    }
}
