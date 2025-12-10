package com.google.auth.oauth2;

import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Clock;
import com.google.auth.Credentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class JwtCredentials extends Credentials implements JwtProvider {
    private static final long CLOCK_SKEW = TimeUnit.MINUTES.toSeconds(5);
    private static final String JWT_ACCESS_PREFIX = "Bearer ";
    private static final String JWT_INCOMPLETE_ERROR_MESSAGE = "JWT claims must contain audience, issuer, and subject.";
    @VisibleForTesting
    transient Clock clock;
    private transient Long expiryInSeconds;
    private transient String jwt;
    private final JwtClaims jwtClaims;
    private final Long lifeSpanSeconds;
    private final Object lock;
    private final PrivateKey privateKey;
    private final String privateKeyId;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public PrivateKey f52485a;

        /* renamed from: b */
        public String f52486b;

        /* renamed from: c */
        public JwtClaims f52487c;

        /* renamed from: d */
        public Clock f52488d = Clock.SYSTEM;

        /* renamed from: e */
        public Long f52489e = Long.valueOf(TimeUnit.HOURS.toSeconds(1));

        /* renamed from: a */
        public Clock m41631a() {
            return this.f52488d;
        }

        /* renamed from: b */
        public Builder m41630b(Clock clock) {
            this.f52488d = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public JwtCredentials build() {
            return new JwtCredentials(this);
        }

        public JwtClaims getJwtClaims() {
            return this.f52487c;
        }

        public Long getLifeSpanSeconds() {
            return this.f52489e;
        }

        public PrivateKey getPrivateKey() {
            return this.f52485a;
        }

        public String getPrivateKeyId() {
            return this.f52486b;
        }

        @CanIgnoreReturnValue
        public Builder setJwtClaims(JwtClaims jwtClaims) {
            this.f52487c = (JwtClaims) Preconditions.checkNotNull(jwtClaims);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLifeSpanSeconds(Long l) {
            this.f52489e = (Long) Preconditions.checkNotNull(l);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKey(PrivateKey privateKey) {
            this.f52485a = (PrivateKey) Preconditions.checkNotNull(privateKey);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKeyId(String str) {
            this.f52486b = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private boolean shouldRefresh() {
        if (this.expiryInSeconds != null && getClock().currentTimeMillis() / 1000 <= this.expiryInSeconds.longValue() - CLOCK_SKEW) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JwtCredentials)) {
            return false;
        }
        JwtCredentials jwtCredentials = (JwtCredentials) obj;
        if (!Objects.equals(this.privateKey, jwtCredentials.privateKey) || !Objects.equals(this.privateKeyId, jwtCredentials.privateKeyId) || !Objects.equals(this.jwtClaims, jwtCredentials.jwtClaims) || !Objects.equals(this.lifeSpanSeconds, jwtCredentials.lifeSpanSeconds)) {
            return false;
        }
        return true;
    }

    @Override // com.google.auth.Credentials
    public String getAuthenticationType() {
        return "JWT";
    }

    public Clock getClock() {
        if (this.clock == null) {
            this.clock = Clock.SYSTEM;
        }
        return this.clock;
    }

    @Override // com.google.auth.Credentials
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        Map<String, List<String>> singletonMap;
        synchronized (this.lock) {
            try {
                if (shouldRefresh()) {
                    refresh();
                }
                singletonMap = Collections.singletonMap("Authorization", Collections.singletonList(JWT_ACCESS_PREFIX + this.jwt));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return singletonMap;
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadata() {
        return true;
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadataOnly() {
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.privateKey, this.privateKeyId, this.jwtClaims, this.lifeSpanSeconds);
    }

    @Override // com.google.auth.oauth2.JwtProvider
    public JwtCredentials jwtWithClaims(JwtClaims jwtClaims) {
        return newBuilder().setPrivateKey(this.privateKey).setPrivateKeyId(this.privateKeyId).setJwtClaims(this.jwtClaims.merge(jwtClaims)).build();
    }

    @Override // com.google.auth.Credentials
    public void refresh() throws IOException {
        JsonWebSignature.Header header = new JsonWebSignature.Header();
        header.setAlgorithm("RS256");
        header.setType("JWT");
        header.setKeyId(this.privateKeyId);
        JsonWebToken.Payload payload = new JsonWebToken.Payload();
        payload.setAudience(this.jwtClaims.getAudience());
        payload.setIssuer(this.jwtClaims.getIssuer());
        payload.setSubject(this.jwtClaims.getSubject());
        long currentTimeMillis = this.clock.currentTimeMillis() / 1000;
        payload.setIssuedAtTimeSeconds(Long.valueOf(currentTimeMillis));
        payload.setExpirationTimeSeconds(Long.valueOf(currentTimeMillis + this.lifeSpanSeconds.longValue()));
        payload.putAll(this.jwtClaims.getAdditionalClaims());
        synchronized (this.lock) {
            try {
                this.expiryInSeconds = payload.getExpirationTimeSeconds();
                try {
                    this.jwt = JsonWebSignature.signUsingRsaSha256(this.privateKey, IJ0.f2657f, header, payload);
                } catch (GeneralSecurityException e) {
                    throw new IOException("Error signing service account JWT access header with private key.", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private JwtCredentials(Builder builder) {
        this.lock = new byte[0];
        this.privateKey = (PrivateKey) Preconditions.checkNotNull(builder.getPrivateKey());
        this.privateKeyId = builder.getPrivateKeyId();
        JwtClaims jwtClaims = (JwtClaims) Preconditions.checkNotNull(builder.getJwtClaims());
        this.jwtClaims = jwtClaims;
        Preconditions.checkState(jwtClaims.isComplete(), JWT_INCOMPLETE_ERROR_MESSAGE);
        this.lifeSpanSeconds = (Long) Preconditions.checkNotNull(builder.getLifeSpanSeconds());
        this.clock = (Clock) Preconditions.checkNotNull(builder.m41631a());
    }
}