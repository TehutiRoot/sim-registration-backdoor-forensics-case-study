package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Clock;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.Key;
import com.google.auth.http.HttpTransportFactory;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class TokenVerifier {

    /* renamed from: g */
    public static final Set f52579g = ImmutableSet.m40918of("RS256", "ES256");

    /* renamed from: a */
    public final String f52580a;

    /* renamed from: b */
    public final String f52581b;

    /* renamed from: c */
    public final String f52582c;

    /* renamed from: d */
    public final PublicKey f52583d;

    /* renamed from: e */
    public final Clock f52584e;

    /* renamed from: f */
    public final LoadingCache f52585f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f52586a;

        /* renamed from: b */
        public String f52587b;

        /* renamed from: c */
        public String f52588c;

        /* renamed from: d */
        public PublicKey f52589d;

        /* renamed from: e */
        public Clock f52590e;

        /* renamed from: f */
        public HttpTransportFactory f52591f;

        public TokenVerifier build() {
            return new TokenVerifier(this);
        }

        public Builder setAudience(String str) {
            this.f52586a = str;
            return this;
        }

        public Builder setCertificatesLocation(String str) {
            this.f52587b = str;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.f52590e = clock;
            return this;
        }

        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52591f = httpTransportFactory;
            return this;
        }

        public Builder setIssuer(String str) {
            this.f52588c = str;
            return this;
        }

        public Builder setPublicKey(PublicKey publicKey) {
            this.f52589d = publicKey;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class PublicKeyLoader extends CacheLoader {

        /* renamed from: a */
        public final HttpTransportFactory f52592a;

        /* loaded from: classes4.dex */
        public static class JsonWebKey {
            @Key
            public String alg;
            @Key
            public String crv;
            @Key

            /* renamed from: e */
            public String f52593e;
            @Key
            public String kid;
            @Key
            public String kty;
            @Key

            /* renamed from: n */
            public String f52594n;
            @Key
            public String use;
            @Key

            /* renamed from: x */
            public String f52595x;
            @Key

            /* renamed from: y */
            public String f52596y;
        }

        /* loaded from: classes4.dex */
        public static class JsonWebKeySet extends GenericJson {
            @Key
            public List<JsonWebKey> keys;
        }

        public PublicKeyLoader(HttpTransportFactory httpTransportFactory) {
            this.f52592a = httpTransportFactory;
        }

        /* renamed from: c */
        private PublicKey m41568c(String str) {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(str.getBytes("UTF-8"))).getPublicKey();
        }

        /* renamed from: a */
        public final PublicKey m41570a(JsonWebKey jsonWebKey) {
            Preconditions.checkArgument("EC".equals(jsonWebKey.kty));
            Preconditions.checkArgument("P-256".equals(jsonWebKey.crv));
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Base64.decodeBase64(jsonWebKey.f52595x)), new BigInteger(1, Base64.decodeBase64(jsonWebKey.f52596y)));
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
            return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        }

        /* renamed from: b */
        public final PublicKey m41569b(JsonWebKey jsonWebKey) {
            if ("ES256".equals(jsonWebKey.alg)) {
                return m41570a(jsonWebKey);
            }
            if ("RS256".equals(jsonWebKey.alg)) {
                return m41567d(jsonWebKey);
            }
            return null;
        }

        /* renamed from: d */
        public final PublicKey m41567d(JsonWebKey jsonWebKey) {
            Preconditions.checkArgument("RSA".equals(jsonWebKey.kty));
            Preconditions.checkNotNull(jsonWebKey.f52593e);
            Preconditions.checkNotNull(jsonWebKey.f52594n);
            return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decodeBase64(jsonWebKey.f52594n)), new BigInteger(1, Base64.decodeBase64(jsonWebKey.f52593e))));
        }

        @Override // com.google.common.cache.CacheLoader
        /* renamed from: e */
        public Map load(String str) {
            HttpRequest parser = this.f52592a.create().createRequestFactory().buildGetRequest(new GenericUrl(str)).setParser(IJ0.f2657f.createJsonObjectParser());
            parser.setNumberOfRetries(2);
            parser.setUnsuccessfulResponseHandler(new HttpBackOffUnsuccessfulResponseHandler(new ExponentialBackOff.Builder().setInitialIntervalMillis(1000).setRandomizationFactor(0.1d).setMultiplier(2.0d).build()).setBackOffRequired(HttpBackOffUnsuccessfulResponseHandler.BackOffRequired.ALWAYS));
            JsonWebKeySet jsonWebKeySet = (JsonWebKeySet) parser.execute().parseAs((Class<Object>) JsonWebKeySet.class);
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            List<JsonWebKey> list = jsonWebKeySet.keys;
            if (list == null) {
                for (String str2 : jsonWebKeySet.keySet()) {
                    builder.put(str2, m41568c((String) jsonWebKeySet.get(str2)));
                }
            } else {
                for (JsonWebKey jsonWebKey : list) {
                    try {
                        builder.put(jsonWebKey.kid, m41569b(jsonWebKey));
                    } catch (NoSuchAlgorithmException | InvalidKeySpecException | InvalidParameterSpecException e) {
                        e.printStackTrace();
                    }
                }
            }
            ImmutableMap build = builder.build();
            if (!build.isEmpty()) {
                return build;
            }
            throw new VerificationException("No valid public key returned by the keystore: " + str);
        }
    }

    /* loaded from: classes4.dex */
    public static class VerificationException extends Exception {
        public VerificationException(String str) {
            super(str);
        }

        public VerificationException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static Builder newBuilder() {
        return new Builder().setClock(Clock.SYSTEM).setHttpTransportFactory(IJ0.f2656e);
    }

    /* renamed from: a */
    public final String m41577a(JsonWebSignature jsonWebSignature) {
        String str = this.f52581b;
        if (str != null) {
            return str;
        }
        String algorithm = jsonWebSignature.getHeader().getAlgorithm();
        algorithm.hashCode();
        if (!algorithm.equals("ES256")) {
            if (algorithm.equals("RS256")) {
                return "https://www.googleapis.com/oauth2/v3/certs";
            }
            throw new VerificationException("Unknown algorithm");
        }
        return "https://www.gstatic.com/iap/verify/public_key-jwk";
    }

    public JsonWebSignature verify(String str) throws VerificationException {
        try {
            JsonWebSignature parse = JsonWebSignature.parse(IJ0.f2657f, str);
            String str2 = this.f52580a;
            if (str2 != null && !str2.equals(parse.getPayload().getAudience())) {
                throw new VerificationException("Expected audience does not match");
            }
            String str3 = this.f52582c;
            if (str3 != null && !str3.equals(parse.getPayload().getIssuer())) {
                throw new VerificationException("Expected issuer does not match");
            }
            Long expirationTimeSeconds = parse.getPayload().getExpirationTimeSeconds();
            if (expirationTimeSeconds != null && expirationTimeSeconds.longValue() <= this.f52584e.currentTimeMillis() / 1000) {
                throw new VerificationException("Token is expired");
            }
            if (f52579g.contains(parse.getHeader().getAlgorithm())) {
                PublicKey publicKey = this.f52583d;
                if (publicKey == null) {
                    try {
                        publicKey = (PublicKey) ((Map) this.f52585f.get(m41577a(parse))).get(parse.getHeader().getKeyId());
                    } catch (UncheckedExecutionException | ExecutionException e) {
                        throw new VerificationException("Error fetching PublicKey from certificate location", e);
                    }
                }
                if (publicKey != null) {
                    try {
                        if (parse.verifySignature(publicKey)) {
                            return parse;
                        }
                        throw new VerificationException("Invalid signature");
                    } catch (GeneralSecurityException e2) {
                        throw new VerificationException("Error validating token", e2);
                    }
                }
                throw new VerificationException("Could not find PublicKey for provided keyId: " + parse.getHeader().getKeyId());
            }
            throw new VerificationException("Unexpected signing algorithm: expected either RS256 or ES256");
        } catch (IOException e3) {
            throw new VerificationException("Error parsing JsonWebSignature token", e3);
        }
    }

    public TokenVerifier(Builder builder) {
        this.f52580a = builder.f52586a;
        this.f52581b = builder.f52587b;
        this.f52582c = builder.f52588c;
        this.f52583d = builder.f52589d;
        this.f52584e = builder.f52590e;
        this.f52585f = CacheBuilder.newBuilder().expireAfterWrite(1L, TimeUnit.HOURS).build(new PublicKeyLoader(builder.f52591f));
    }
}