package com.google.api.client.auth.openidconnect;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Clock;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class IdTokenVerifier {
    public static final long DEFAULT_TIME_SKEW_SECONDS = 300;

    /* renamed from: h */
    public static final Logger f51781h = Logger.getLogger(IdTokenVerifier.class.getName());

    /* renamed from: i */
    public static final Set f51782i = ImmutableSet.m40918of("RS256", "ES256");

    /* renamed from: j */
    public static final HttpTransport f51783j = new NetHttpTransport();

    /* renamed from: a */
    public final Clock f51784a;

    /* renamed from: b */
    public final String f51785b;

    /* renamed from: c */
    public final C0798LS f51786c;

    /* renamed from: d */
    public final LoadingCache f51787d;

    /* renamed from: e */
    public final long f51788e;

    /* renamed from: f */
    public final Collection f51789f;

    /* renamed from: g */
    public final Collection f51790g;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: b */
        public String f51792b;

        /* renamed from: c */
        public C0798LS f51793c;

        /* renamed from: e */
        public Collection f51795e;

        /* renamed from: f */
        public Collection f51796f;

        /* renamed from: g */
        public HttpTransportFactory f51797g;

        /* renamed from: a */
        public Clock f51791a = Clock.SYSTEM;

        /* renamed from: d */
        public long f51794d = 300;

        public IdTokenVerifier build() {
            return new IdTokenVerifier(this);
        }

        public final long getAcceptableTimeSkewSeconds() {
            return this.f51794d;
        }

        public final Collection<String> getAudience() {
            return this.f51796f;
        }

        public final Clock getClock() {
            return this.f51791a;
        }

        public final String getIssuer() {
            Collection collection = this.f51795e;
            if (collection == null) {
                return null;
            }
            return (String) collection.iterator().next();
        }

        public final Collection<String> getIssuers() {
            return this.f51795e;
        }

        public Builder setAcceptableTimeSkewSeconds(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f51794d = j;
            return this;
        }

        public Builder setAudience(Collection<String> collection) {
            this.f51796f = collection;
            return this;
        }

        public Builder setCertificatesLocation(String str) {
            this.f51792b = str;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.f51791a = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f51797g = httpTransportFactory;
            return this;
        }

        public Builder setIssuer(String str) {
            if (str == null) {
                return setIssuers(null);
            }
            return setIssuers(Collections.singleton(str));
        }

        public Builder setIssuers(Collection<String> collection) {
            boolean z;
            if (collection != null && collection.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "Issuers must not be empty");
            this.f51795e = collection;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class PublicKeyLoader extends CacheLoader {

        /* renamed from: a */
        public final HttpTransportFactory f51798a;

        /* loaded from: classes4.dex */
        public static class JsonWebKey {
            @Key
            public String alg;
            @Key
            public String crv;
            @Key

            /* renamed from: e */
            public String f51799e;
            @Key
            public String kid;
            @Key
            public String kty;
            @Key

            /* renamed from: n */
            public String f51800n;
            @Key
            public String use;
            @Key

            /* renamed from: x */
            public String f51801x;
            @Key

            /* renamed from: y */
            public String f51802y;
        }

        /* loaded from: classes4.dex */
        public static class JsonWebKeySet extends GenericJson {
            @Key
            public List<JsonWebKey> keys;
        }

        public PublicKeyLoader(HttpTransportFactory httpTransportFactory) {
            this.f51798a = httpTransportFactory;
        }

        /* renamed from: a */
        public final PublicKey m41832a(JsonWebKey jsonWebKey) {
            com.google.common.base.Preconditions.checkArgument("EC".equals(jsonWebKey.kty));
            com.google.common.base.Preconditions.checkArgument("P-256".equals(jsonWebKey.crv));
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Base64.decodeBase64(jsonWebKey.f51801x)), new BigInteger(1, Base64.decodeBase64(jsonWebKey.f51802y)));
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
            return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        }

        /* renamed from: b */
        public final PublicKey m41831b(JsonWebKey jsonWebKey) {
            if ("ES256".equals(jsonWebKey.alg)) {
                return m41832a(jsonWebKey);
            }
            if ("RS256".equals(jsonWebKey.alg)) {
                return m41829d(jsonWebKey);
            }
            return null;
        }

        /* renamed from: c */
        public final PublicKey m41830c(String str) {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(str.getBytes("UTF-8"))).getPublicKey();
        }

        /* renamed from: d */
        public final PublicKey m41829d(JsonWebKey jsonWebKey) {
            com.google.common.base.Preconditions.checkArgument("RSA".equals(jsonWebKey.kty));
            com.google.common.base.Preconditions.checkNotNull(jsonWebKey.f51799e);
            com.google.common.base.Preconditions.checkNotNull(jsonWebKey.f51800n);
            return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decodeBase64(jsonWebKey.f51800n)), new BigInteger(1, Base64.decodeBase64(jsonWebKey.f51799e))));
        }

        @Override // com.google.common.cache.CacheLoader
        /* renamed from: e */
        public Map load(String str) {
            try {
                HttpRequest parser = this.f51798a.create().createRequestFactory().buildGetRequest(new GenericUrl(str)).setParser(GsonFactory.getDefaultInstance().createJsonObjectParser());
                parser.setNumberOfRetries(2);
                parser.setUnsuccessfulResponseHandler(new HttpBackOffUnsuccessfulResponseHandler(new ExponentialBackOff.Builder().setInitialIntervalMillis(1000).setRandomizationFactor(0.1d).setMultiplier(2.0d).build()).setBackOffRequired(HttpBackOffUnsuccessfulResponseHandler.BackOffRequired.ALWAYS));
                JsonWebKeySet jsonWebKeySet = (JsonWebKeySet) parser.execute().parseAs((Class<Object>) JsonWebKeySet.class);
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                List<JsonWebKey> list = jsonWebKeySet.keys;
                if (list == null) {
                    for (String str2 : jsonWebKeySet.keySet()) {
                        builder.put(str2, m41830c((String) jsonWebKeySet.get(str2)));
                    }
                } else {
                    for (JsonWebKey jsonWebKey : list) {
                        try {
                            builder.put(jsonWebKey.kid, m41831b(jsonWebKey));
                        } catch (NoSuchAlgorithmException | InvalidKeySpecException | InvalidParameterSpecException e) {
                            IdTokenVerifier.f51781h.log(Level.WARNING, "Failed to put a key into the cache", e);
                        }
                    }
                }
                ImmutableMap build = builder.build();
                if (!build.isEmpty()) {
                    return build;
                }
                throw new VerificationException("No valid public key returned by the keystore: " + str);
            } catch (IOException e2) {
                Logger logger = IdTokenVerifier.f51781h;
                Level level = Level.WARNING;
                logger.log(level, "Failed to get a certificate from certificate location " + str, (Throwable) e2);
                throw e2;
            }
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

    /* renamed from: com.google.api.client.auth.openidconnect.IdTokenVerifier$a */
    /* loaded from: classes4.dex */
    public static class C7255a implements HttpTransportFactory {
        @Override // com.google.api.client.auth.openidconnect.HttpTransportFactory
        public HttpTransport create() {
            return IdTokenVerifier.f51783j;
        }
    }

    public IdTokenVerifier() {
        this(new Builder());
    }

    /* renamed from: b */
    public final String m41834b(JsonWebSignature.Header header) {
        String str = this.f51785b;
        if (str != null) {
            return str;
        }
        String algorithm = header.getAlgorithm();
        algorithm.hashCode();
        if (!algorithm.equals("ES256")) {
            if (algorithm.equals("RS256")) {
                return "https://www.googleapis.com/oauth2/v3/certs";
            }
            throw new VerificationException(String.format("Unexpected signing algorithm %s: expected either RS256 or ES256", header.getAlgorithm()));
        }
        return "https://www.gstatic.com/iap/verify/public_key-jwk";
    }

    /* renamed from: c */
    public boolean m41833c(IdToken idToken) {
        if (Boolean.parseBoolean(this.f51786c.m67557a("OAUTH_CLIENT_SKIP_SIGNATURE"))) {
            return true;
        }
        if (f51782i.contains(idToken.getHeader().getAlgorithm())) {
            try {
                PublicKey publicKey = (PublicKey) ((Map) this.f51787d.get(m41834b(idToken.getHeader()))).get(idToken.getHeader().getKeyId());
                if (publicKey != null) {
                    try {
                        if (idToken.verifySignature(publicKey)) {
                            return true;
                        }
                        throw new VerificationException("Invalid signature");
                    } catch (GeneralSecurityException e) {
                        throw new VerificationException("Error validating token", e);
                    }
                }
                throw new IOException("Could not find public key for provided keyId: " + idToken.getHeader().getKeyId());
            } catch (UncheckedExecutionException | ExecutionException e2) {
                throw new IOException("Error fetching public key from certificate location " + this.f51785b, e2);
            }
        }
        throw new VerificationException(String.format("Unexpected signing algorithm %s: expected either RS256 or ES256", idToken.getHeader().getAlgorithm()));
    }

    public final long getAcceptableTimeSkewSeconds() {
        return this.f51788e;
    }

    public final Collection<String> getAudience() {
        return this.f51790g;
    }

    public final Clock getClock() {
        return this.f51784a;
    }

    public final String getIssuer() {
        Collection collection = this.f51789f;
        if (collection == null) {
            return null;
        }
        return (String) collection.iterator().next();
    }

    public final Collection<String> getIssuers() {
        return this.f51789f;
    }

    @Deprecated
    public boolean verify(IdToken idToken) {
        try {
            return verifyOrThrow(idToken);
        } catch (IOException e) {
            f51781h.log(Level.SEVERE, e.getMessage(), (Throwable) e);
            return false;
        }
    }

    public boolean verifyOrThrow(IdToken idToken) throws IOException {
        if (!verifyPayload(idToken)) {
            return false;
        }
        try {
            return m41833c(idToken);
        } catch (VerificationException e) {
            f51781h.log(Level.INFO, "Id token signature verification failed. ", (Throwable) e);
            return false;
        }
    }

    public boolean verifyPayload(IdToken idToken) {
        Collection<String> collection;
        Collection<String> collection2 = this.f51789f;
        if ((collection2 == null || idToken.verifyIssuer(collection2)) && (((collection = this.f51790g) == null || idToken.verifyAudience(collection)) && idToken.verifyTime(this.f51784a.currentTimeMillis(), this.f51788e))) {
            return true;
        }
        return false;
    }

    public IdTokenVerifier(Builder builder) {
        this.f51785b = builder.f51792b;
        this.f51784a = builder.f51791a;
        this.f51788e = builder.f51794d;
        Collection collection = builder.f51795e;
        this.f51789f = collection == null ? null : Collections.unmodifiableCollection(collection);
        Collection collection2 = builder.f51796f;
        this.f51790g = collection2 != null ? Collections.unmodifiableCollection(collection2) : null;
        HttpTransportFactory httpTransportFactory = builder.f51797g;
        this.f51787d = CacheBuilder.newBuilder().expireAfterWrite(1L, TimeUnit.HOURS).build(new PublicKeyLoader(httpTransportFactory == null ? new C7255a() : httpTransportFactory));
        C0798LS c0798ls = builder.f51793c;
        this.f51786c = c0798ls == null ? new C0798LS() : c0798ls;
    }
}