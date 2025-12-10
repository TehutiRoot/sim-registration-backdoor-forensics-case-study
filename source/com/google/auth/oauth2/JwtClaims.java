package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.auth.oauth2.AutoValue_JwtClaims;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.Nullable;

@AutoValue
/* loaded from: classes4.dex */
public abstract class JwtClaims implements Serializable {
    private static final long serialVersionUID = 4974444151019426702L;

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        public abstract JwtClaims build();

        public abstract Builder setAdditionalClaims(Map<String, String> map);

        public abstract Builder setAudience(String str);

        public abstract Builder setIssuer(String str);

        public abstract Builder setSubject(String str);
    }

    public static Builder newBuilder() {
        return new AutoValue_JwtClaims.C7333b().setAdditionalClaims(ImmutableMap.m40976of());
    }

    public abstract Map<String, String> getAdditionalClaims();

    @Nullable
    public abstract String getAudience();

    @Nullable
    public abstract String getIssuer();

    @Nullable
    public abstract String getSubject();

    public boolean isComplete() {
        boolean z;
        if (getAdditionalClaims().containsKey(Action.SCOPE_ATTRIBUTE) && !getAdditionalClaims().get(Action.SCOPE_ATTRIBUTE).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if ((getAudience() == null && !z) || getIssuer() == null || getSubject() == null) {
            return false;
        }
        return true;
    }

    public JwtClaims merge(JwtClaims jwtClaims) {
        String audience;
        String issuer;
        String subject;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.putAll(getAdditionalClaims());
        builder.putAll(jwtClaims.getAdditionalClaims());
        Builder newBuilder = newBuilder();
        if (jwtClaims.getAudience() == null) {
            audience = getAudience();
        } else {
            audience = jwtClaims.getAudience();
        }
        Builder audience2 = newBuilder.setAudience(audience);
        if (jwtClaims.getIssuer() == null) {
            issuer = getIssuer();
        } else {
            issuer = jwtClaims.getIssuer();
        }
        Builder issuer2 = audience2.setIssuer(issuer);
        if (jwtClaims.getSubject() == null) {
            subject = getSubject();
        } else {
            subject = jwtClaims.getSubject();
        }
        return issuer2.setSubject(subject).setAdditionalClaims(builder.build()).build();
    }
}
