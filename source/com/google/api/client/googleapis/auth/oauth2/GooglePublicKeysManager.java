package com.google.api.client.googleapis.auth.oauth2;

import androidx.work.PeriodicWorkRequest;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Beta
/* loaded from: classes4.dex */
public class GooglePublicKeysManager {

    /* renamed from: h */
    public static final Pattern f51835h = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");

    /* renamed from: a */
    public final JsonFactory f51836a;

    /* renamed from: b */
    public List f51837b;

    /* renamed from: c */
    public long f51838c;

    /* renamed from: d */
    public final HttpTransport f51839d;

    /* renamed from: e */
    public final Lock f51840e;

    /* renamed from: f */
    public final Clock f51841f;

    /* renamed from: g */
    public final String f51842g;

    @Beta
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: b */
        public final HttpTransport f51844b;

        /* renamed from: c */
        public final JsonFactory f51845c;

        /* renamed from: a */
        public Clock f51843a = Clock.SYSTEM;

        /* renamed from: d */
        public String f51846d = GoogleOAuthConstants.DEFAULT_PUBLIC_CERTS_ENCODED_URL;

        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory) {
            this.f51844b = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            this.f51845c = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        }

        public GooglePublicKeysManager build() {
            return new GooglePublicKeysManager(this);
        }

        public final Clock getClock() {
            return this.f51843a;
        }

        public final JsonFactory getJsonFactory() {
            return this.f51845c;
        }

        public final String getPublicCertsEncodedUrl() {
            return this.f51846d;
        }

        public final HttpTransport getTransport() {
            return this.f51844b;
        }

        public Builder setClock(Clock clock) {
            this.f51843a = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setPublicCertsEncodedUrl(String str) {
            this.f51846d = (String) Preconditions.checkNotNull(str);
            return this;
        }
    }

    public GooglePublicKeysManager(HttpTransport httpTransport, JsonFactory jsonFactory) {
        this(new Builder(httpTransport, jsonFactory));
    }

    /* renamed from: a */
    public long m41817a(HttpHeaders httpHeaders) {
        long j;
        if (httpHeaders.getCacheControl() != null) {
            for (String str : httpHeaders.getCacheControl().split(",")) {
                Matcher matcher = f51835h.matcher(str);
                if (matcher.matches()) {
                    j = Long.parseLong(matcher.group(1));
                    break;
                }
            }
        }
        j = 0;
        if (httpHeaders.getAge() != null) {
            j -= httpHeaders.getAge().longValue();
        }
        return Math.max(0L, j);
    }

    public final Clock getClock() {
        return this.f51841f;
    }

    public final long getExpirationTimeMilliseconds() {
        return this.f51838c;
    }

    public final JsonFactory getJsonFactory() {
        return this.f51836a;
    }

    public final String getPublicCertsEncodedUrl() {
        return this.f51842g;
    }

    public final List<PublicKey> getPublicKeys() throws GeneralSecurityException, IOException {
        this.f51840e.lock();
        try {
            if (this.f51837b != null) {
                if (this.f51841f.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS > this.f51838c) {
                }
                List<PublicKey> list = this.f51837b;
                this.f51840e.unlock();
                return list;
            }
            refresh();
            List<PublicKey> list2 = this.f51837b;
            this.f51840e.unlock();
            return list2;
        } catch (Throwable th2) {
            this.f51840e.unlock();
            throw th2;
        }
    }

    public final HttpTransport getTransport() {
        return this.f51839d;
    }

    public GooglePublicKeysManager refresh() throws GeneralSecurityException, IOException {
        boolean z;
        this.f51840e.lock();
        try {
            this.f51837b = new ArrayList();
            CertificateFactory x509CertificateFactory = SecurityUtils.getX509CertificateFactory();
            HttpResponse execute = this.f51839d.createRequestFactory().buildGetRequest(new GenericUrl(this.f51842g)).execute();
            this.f51838c = this.f51841f.currentTimeMillis() + (m41817a(execute.getHeaders()) * 1000);
            JsonParser createJsonParser = this.f51836a.createJsonParser(execute.getContent());
            JsonToken currentToken = createJsonParser.getCurrentToken();
            if (currentToken == null) {
                currentToken = createJsonParser.nextToken();
            }
            if (currentToken == JsonToken.START_OBJECT) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            while (createJsonParser.nextToken() != JsonToken.END_OBJECT) {
                createJsonParser.nextToken();
                this.f51837b.add(((X509Certificate) x509CertificateFactory.generateCertificate(new ByteArrayInputStream(StringUtils.getBytesUtf8(createJsonParser.getText())))).getPublicKey());
            }
            this.f51837b = Collections.unmodifiableList(this.f51837b);
            createJsonParser.close();
            this.f51840e.unlock();
            return this;
        } catch (Throwable th2) {
            this.f51840e.unlock();
            throw th2;
        }
    }

    public GooglePublicKeysManager(Builder builder) {
        this.f51840e = new ReentrantLock();
        this.f51839d = builder.f51844b;
        this.f51836a = builder.f51845c;
        this.f51841f = builder.f51843a;
        this.f51842g = builder.f51846d;
    }
}
