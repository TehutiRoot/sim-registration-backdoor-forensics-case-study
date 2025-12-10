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
    public static final Pattern f51847h = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");

    /* renamed from: a */
    public final JsonFactory f51848a;

    /* renamed from: b */
    public List f51849b;

    /* renamed from: c */
    public long f51850c;

    /* renamed from: d */
    public final HttpTransport f51851d;

    /* renamed from: e */
    public final Lock f51852e;

    /* renamed from: f */
    public final Clock f51853f;

    /* renamed from: g */
    public final String f51854g;

    @Beta
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: b */
        public final HttpTransport f51856b;

        /* renamed from: c */
        public final JsonFactory f51857c;

        /* renamed from: a */
        public Clock f51855a = Clock.SYSTEM;

        /* renamed from: d */
        public String f51858d = GoogleOAuthConstants.DEFAULT_PUBLIC_CERTS_ENCODED_URL;

        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory) {
            this.f51856b = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            this.f51857c = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        }

        public GooglePublicKeysManager build() {
            return new GooglePublicKeysManager(this);
        }

        public final Clock getClock() {
            return this.f51855a;
        }

        public final JsonFactory getJsonFactory() {
            return this.f51857c;
        }

        public final String getPublicCertsEncodedUrl() {
            return this.f51858d;
        }

        public final HttpTransport getTransport() {
            return this.f51856b;
        }

        public Builder setClock(Clock clock) {
            this.f51855a = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setPublicCertsEncodedUrl(String str) {
            this.f51858d = (String) Preconditions.checkNotNull(str);
            return this;
        }
    }

    public GooglePublicKeysManager(HttpTransport httpTransport, JsonFactory jsonFactory) {
        this(new Builder(httpTransport, jsonFactory));
    }

    /* renamed from: a */
    public long m41804a(HttpHeaders httpHeaders) {
        long j;
        if (httpHeaders.getCacheControl() != null) {
            for (String str : httpHeaders.getCacheControl().split(",")) {
                Matcher matcher = f51847h.matcher(str);
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
        return this.f51853f;
    }

    public final long getExpirationTimeMilliseconds() {
        return this.f51850c;
    }

    public final JsonFactory getJsonFactory() {
        return this.f51848a;
    }

    public final String getPublicCertsEncodedUrl() {
        return this.f51854g;
    }

    public final List<PublicKey> getPublicKeys() throws GeneralSecurityException, IOException {
        this.f51852e.lock();
        try {
            if (this.f51849b != null) {
                if (this.f51853f.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS > this.f51850c) {
                }
                List<PublicKey> list = this.f51849b;
                this.f51852e.unlock();
                return list;
            }
            refresh();
            List<PublicKey> list2 = this.f51849b;
            this.f51852e.unlock();
            return list2;
        } catch (Throwable th2) {
            this.f51852e.unlock();
            throw th2;
        }
    }

    public final HttpTransport getTransport() {
        return this.f51851d;
    }

    public GooglePublicKeysManager refresh() throws GeneralSecurityException, IOException {
        boolean z;
        this.f51852e.lock();
        try {
            this.f51849b = new ArrayList();
            CertificateFactory x509CertificateFactory = SecurityUtils.getX509CertificateFactory();
            HttpResponse execute = this.f51851d.createRequestFactory().buildGetRequest(new GenericUrl(this.f51854g)).execute();
            this.f51850c = this.f51853f.currentTimeMillis() + (m41804a(execute.getHeaders()) * 1000);
            JsonParser createJsonParser = this.f51848a.createJsonParser(execute.getContent());
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
                this.f51849b.add(((X509Certificate) x509CertificateFactory.generateCertificate(new ByteArrayInputStream(StringUtils.getBytesUtf8(createJsonParser.getText())))).getPublicKey());
            }
            this.f51849b = Collections.unmodifiableList(this.f51849b);
            createJsonParser.close();
            this.f51852e.unlock();
            return this;
        } catch (Throwable th2) {
            this.f51852e.unlock();
            throw th2;
        }
    }

    public GooglePublicKeysManager(Builder builder) {
        this.f51852e = new ReentrantLock();
        this.f51851d = builder.f51856b;
        this.f51848a = builder.f51857c;
        this.f51853f = builder.f51855a;
        this.f51854g = builder.f51858d;
    }
}