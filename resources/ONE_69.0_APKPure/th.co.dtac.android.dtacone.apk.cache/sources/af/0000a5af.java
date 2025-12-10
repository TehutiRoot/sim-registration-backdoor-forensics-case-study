package com.google.api.client.googleapis.services;

import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Strings;
import com.google.auth.Credentials;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class AbstractGoogleClient {

    /* renamed from: l */
    public static final Logger f51959l = Logger.getLogger(AbstractGoogleClient.class.getName());

    /* renamed from: a */
    public final HttpRequestFactory f51960a;

    /* renamed from: b */
    public final GoogleClientRequestInitializer f51961b;

    /* renamed from: c */
    public final String f51962c;

    /* renamed from: d */
    public final String f51963d;

    /* renamed from: e */
    public final String f51964e;

    /* renamed from: f */
    public final String f51965f;

    /* renamed from: g */
    public final ObjectParser f51966g;

    /* renamed from: h */
    public final boolean f51967h;

    /* renamed from: i */
    public final boolean f51968i;

    /* renamed from: j */
    public final String f51969j;

    /* renamed from: k */
    public final HttpRequestInitializer f51970k;

    /* loaded from: classes4.dex */
    public static abstract class Builder {

        /* renamed from: a */
        public final HttpTransport f51971a;

        /* renamed from: b */
        public GoogleClientRequestInitializer f51972b;

        /* renamed from: c */
        public HttpRequestInitializer f51973c;

        /* renamed from: d */
        public final ObjectParser f51974d;

        /* renamed from: e */
        public String f51975e;

        /* renamed from: f */
        public String f51976f;

        /* renamed from: g */
        public String f51977g;

        /* renamed from: h */
        public String f51978h;

        /* renamed from: i */
        public boolean f51979i;

        /* renamed from: j */
        public boolean f51980j;

        /* renamed from: k */
        public String f51981k;

        /* renamed from: l */
        public Pattern f51982l = Pattern.compile("https://([a-zA-Z]*)(\\.mtls)?\\.googleapis.com/?");

        /* renamed from: m */
        public boolean f51983m;

        /* renamed from: n */
        public String f51984n;

        public Builder(HttpTransport httpTransport, String str, String str2, ObjectParser objectParser, HttpRequestInitializer httpRequestInitializer) {
            String str3;
            this.f51971a = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            this.f51974d = objectParser;
            this.f51975e = AbstractGoogleClient.m41768c(str);
            this.f51976f = AbstractGoogleClient.m41767d(str2);
            this.f51973c = httpRequestInitializer;
            Matcher matcher = this.f51982l.matcher(str);
            boolean matches = matcher.matches();
            this.f51983m = !matches;
            if (matches) {
                str3 = matcher.group(1);
            } else {
                str3 = null;
            }
            this.f51984n = str3;
        }

        public abstract AbstractGoogleClient build();

        public final String getApplicationName() {
            return this.f51978h;
        }

        public final GoogleClientRequestInitializer getGoogleClientRequestInitializer() {
            return this.f51972b;
        }

        public final HttpRequestInitializer getHttpRequestInitializer() {
            return this.f51973c;
        }

        public ObjectParser getObjectParser() {
            return this.f51974d;
        }

        public final String getRootUrl() {
            return this.f51975e;
        }

        public final String getServicePath() {
            return this.f51976f;
        }

        public final boolean getSuppressPatternChecks() {
            return this.f51979i;
        }

        public final boolean getSuppressRequiredParameterChecks() {
            return this.f51980j;
        }

        public final HttpTransport getTransport() {
            return this.f51971a;
        }

        public Builder setApplicationName(String str) {
            this.f51978h = str;
            return this;
        }

        public Builder setBatchPath(String str) {
            this.f51977g = str;
            return this;
        }

        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleClientRequestInitializer) {
            this.f51972b = googleClientRequestInitializer;
            return this;
        }

        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.f51973c = httpRequestInitializer;
            return this;
        }

        public Builder setRootUrl(String str) {
            this.f51983m = true;
            this.f51975e = AbstractGoogleClient.m41768c(str);
            return this;
        }

        public Builder setServicePath(String str) {
            this.f51976f = AbstractGoogleClient.m41767d(str);
            return this;
        }

        public Builder setSuppressAllChecks(boolean z) {
            return setSuppressPatternChecks(true).setSuppressRequiredParameterChecks(true);
        }

        public Builder setSuppressPatternChecks(boolean z) {
            this.f51979i = z;
            return this;
        }

        public Builder setSuppressRequiredParameterChecks(boolean z) {
            this.f51980j = z;
            return this;
        }

        public Builder setUniverseDomain(String str) {
            if (str != null && str.isEmpty()) {
                throw new IllegalArgumentException("The universe domain value cannot be empty.");
            }
            this.f51981k = str;
            return this;
        }
    }

    public AbstractGoogleClient(Builder builder) {
        HttpRequestFactory createRequestFactory;
        this.f51961b = builder.f51972b;
        this.f51969j = m41769b(builder);
        this.f51962c = m41768c(m41770a(builder));
        this.f51963d = m41767d(builder.f51976f);
        this.f51964e = builder.f51977g;
        if (Strings.isNullOrEmpty(builder.f51978h)) {
            f51959l.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f51965f = builder.f51978h;
        HttpRequestInitializer httpRequestInitializer = builder.f51973c;
        if (httpRequestInitializer == null) {
            createRequestFactory = builder.f51971a.createRequestFactory();
        } else {
            createRequestFactory = builder.f51971a.createRequestFactory(httpRequestInitializer);
        }
        this.f51960a = createRequestFactory;
        this.f51966g = builder.f51974d;
        this.f51967h = builder.f51979i;
        this.f51968i = builder.f51980j;
        this.f51970k = builder.f51973c;
    }

    /* renamed from: c */
    public static String m41768c(String str) {
        Preconditions.checkNotNull(str, "root URL cannot be null.");
        if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str + RemoteSettings.FORWARD_SLASH_STRING;
        }
        return str;
    }

    /* renamed from: d */
    public static String m41767d(String str) {
        Preconditions.checkNotNull(str, "service path cannot be null");
        if (str.length() == 1) {
            Preconditions.checkArgument(RemoteSettings.FORWARD_SLASH_STRING.equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() > 0) {
            if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str + RemoteSettings.FORWARD_SLASH_STRING;
            }
            if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                return str.substring(1);
            }
            return str;
        } else {
            return str;
        }
    }

    /* renamed from: a */
    public final String m41770a(Builder builder) {
        boolean contains = builder.f51975e.contains(".mtls.");
        if (contains && !this.f51969j.equals(Credentials.GOOGLE_DEFAULT_UNIVERSE)) {
            throw new IllegalStateException("mTLS is not supported in any universe other than googleapis.com");
        }
        if (!builder.f51983m && builder.f51984n != null) {
            if (contains) {
                return "https://" + builder.f51984n + ".mtls." + this.f51969j + RemoteSettings.FORWARD_SLASH_STRING;
            }
            return "https://" + builder.f51984n + "." + this.f51969j + RemoteSettings.FORWARD_SLASH_STRING;
        }
        return builder.f51975e;
    }

    /* renamed from: b */
    public final String m41769b(Builder builder) {
        String str = builder.f51981k;
        if (str == null) {
            str = System.getenv("GOOGLE_CLOUD_UNIVERSE_DOMAIN");
        }
        if (str == null) {
            return Credentials.GOOGLE_DEFAULT_UNIVERSE;
        }
        return str;
    }

    public final BatchRequest batch() {
        return batch(null);
    }

    public final String getApplicationName() {
        return this.f51965f;
    }

    public final String getBaseUrl() {
        return this.f51962c + this.f51963d;
    }

    public final GoogleClientRequestInitializer getGoogleClientRequestInitializer() {
        return this.f51961b;
    }

    public ObjectParser getObjectParser() {
        return this.f51966g;
    }

    public final HttpRequestFactory getRequestFactory() {
        return this.f51960a;
    }

    public final String getRootUrl() {
        return this.f51962c;
    }

    public final String getServicePath() {
        return this.f51963d;
    }

    public final boolean getSuppressPatternChecks() {
        return this.f51967h;
    }

    public final boolean getSuppressRequiredParameterChecks() {
        return this.f51968i;
    }

    public final String getUniverseDomain() {
        return this.f51969j;
    }

    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        validateUniverseDomain();
        if (getGoogleClientRequestInitializer() != null) {
            getGoogleClientRequestInitializer().initialize(abstractGoogleClientRequest);
        }
    }

    public void validateUniverseDomain() throws IOException {
        HttpRequestInitializer httpRequestInitializer = this.f51970k;
        if (!(httpRequestInitializer instanceof HttpCredentialsAdapter)) {
            return;
        }
        String universeDomain = ((HttpCredentialsAdapter) httpRequestInitializer).getCredentials().getUniverseDomain();
        if (universeDomain.equals(getUniverseDomain())) {
            return;
        }
        throw new IllegalStateException(String.format("The configured universe domain (%s) does not match the universe domain found in the credentials (%s). If you haven't configured the universe domain explicitly, `googleapis.com` is the default.", getUniverseDomain(), universeDomain));
    }

    public final BatchRequest batch(HttpRequestInitializer httpRequestInitializer) {
        BatchRequest batchRequest = new BatchRequest(getRequestFactory().getTransport(), httpRequestInitializer);
        if (Strings.isNullOrEmpty(this.f51964e)) {
            batchRequest.setBatchUrl(new GenericUrl(getRootUrl() + "batch"));
        } else {
            batchRequest.setBatchUrl(new GenericUrl(getRootUrl() + this.f51964e));
        }
        return batchRequest;
    }
}