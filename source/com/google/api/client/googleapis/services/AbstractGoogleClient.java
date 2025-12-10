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
    public static final Logger f51947l = Logger.getLogger(AbstractGoogleClient.class.getName());

    /* renamed from: a */
    public final HttpRequestFactory f51948a;

    /* renamed from: b */
    public final GoogleClientRequestInitializer f51949b;

    /* renamed from: c */
    public final String f51950c;

    /* renamed from: d */
    public final String f51951d;

    /* renamed from: e */
    public final String f51952e;

    /* renamed from: f */
    public final String f51953f;

    /* renamed from: g */
    public final ObjectParser f51954g;

    /* renamed from: h */
    public final boolean f51955h;

    /* renamed from: i */
    public final boolean f51956i;

    /* renamed from: j */
    public final String f51957j;

    /* renamed from: k */
    public final HttpRequestInitializer f51958k;

    /* loaded from: classes4.dex */
    public static abstract class Builder {

        /* renamed from: a */
        public final HttpTransport f51959a;

        /* renamed from: b */
        public GoogleClientRequestInitializer f51960b;

        /* renamed from: c */
        public HttpRequestInitializer f51961c;

        /* renamed from: d */
        public final ObjectParser f51962d;

        /* renamed from: e */
        public String f51963e;

        /* renamed from: f */
        public String f51964f;

        /* renamed from: g */
        public String f51965g;

        /* renamed from: h */
        public String f51966h;

        /* renamed from: i */
        public boolean f51967i;

        /* renamed from: j */
        public boolean f51968j;

        /* renamed from: k */
        public String f51969k;

        /* renamed from: l */
        public Pattern f51970l = Pattern.compile("https://([a-zA-Z]*)(\\.mtls)?\\.googleapis.com/?");

        /* renamed from: m */
        public boolean f51971m;

        /* renamed from: n */
        public String f51972n;

        public Builder(HttpTransport httpTransport, String str, String str2, ObjectParser objectParser, HttpRequestInitializer httpRequestInitializer) {
            String str3;
            this.f51959a = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            this.f51962d = objectParser;
            this.f51963e = AbstractGoogleClient.m41781c(str);
            this.f51964f = AbstractGoogleClient.m41780d(str2);
            this.f51961c = httpRequestInitializer;
            Matcher matcher = this.f51970l.matcher(str);
            boolean matches = matcher.matches();
            this.f51971m = !matches;
            if (matches) {
                str3 = matcher.group(1);
            } else {
                str3 = null;
            }
            this.f51972n = str3;
        }

        public abstract AbstractGoogleClient build();

        public final String getApplicationName() {
            return this.f51966h;
        }

        public final GoogleClientRequestInitializer getGoogleClientRequestInitializer() {
            return this.f51960b;
        }

        public final HttpRequestInitializer getHttpRequestInitializer() {
            return this.f51961c;
        }

        public ObjectParser getObjectParser() {
            return this.f51962d;
        }

        public final String getRootUrl() {
            return this.f51963e;
        }

        public final String getServicePath() {
            return this.f51964f;
        }

        public final boolean getSuppressPatternChecks() {
            return this.f51967i;
        }

        public final boolean getSuppressRequiredParameterChecks() {
            return this.f51968j;
        }

        public final HttpTransport getTransport() {
            return this.f51959a;
        }

        public Builder setApplicationName(String str) {
            this.f51966h = str;
            return this;
        }

        public Builder setBatchPath(String str) {
            this.f51965g = str;
            return this;
        }

        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleClientRequestInitializer) {
            this.f51960b = googleClientRequestInitializer;
            return this;
        }

        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.f51961c = httpRequestInitializer;
            return this;
        }

        public Builder setRootUrl(String str) {
            this.f51971m = true;
            this.f51963e = AbstractGoogleClient.m41781c(str);
            return this;
        }

        public Builder setServicePath(String str) {
            this.f51964f = AbstractGoogleClient.m41780d(str);
            return this;
        }

        public Builder setSuppressAllChecks(boolean z) {
            return setSuppressPatternChecks(true).setSuppressRequiredParameterChecks(true);
        }

        public Builder setSuppressPatternChecks(boolean z) {
            this.f51967i = z;
            return this;
        }

        public Builder setSuppressRequiredParameterChecks(boolean z) {
            this.f51968j = z;
            return this;
        }

        public Builder setUniverseDomain(String str) {
            if (str != null && str.isEmpty()) {
                throw new IllegalArgumentException("The universe domain value cannot be empty.");
            }
            this.f51969k = str;
            return this;
        }
    }

    public AbstractGoogleClient(Builder builder) {
        HttpRequestFactory createRequestFactory;
        this.f51949b = builder.f51960b;
        this.f51957j = m41782b(builder);
        this.f51950c = m41781c(m41783a(builder));
        this.f51951d = m41780d(builder.f51964f);
        this.f51952e = builder.f51965g;
        if (Strings.isNullOrEmpty(builder.f51966h)) {
            f51947l.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f51953f = builder.f51966h;
        HttpRequestInitializer httpRequestInitializer = builder.f51961c;
        if (httpRequestInitializer == null) {
            createRequestFactory = builder.f51959a.createRequestFactory();
        } else {
            createRequestFactory = builder.f51959a.createRequestFactory(httpRequestInitializer);
        }
        this.f51948a = createRequestFactory;
        this.f51954g = builder.f51962d;
        this.f51955h = builder.f51967i;
        this.f51956i = builder.f51968j;
        this.f51958k = builder.f51961c;
    }

    /* renamed from: c */
    public static String m41781c(String str) {
        Preconditions.checkNotNull(str, "root URL cannot be null.");
        if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str + RemoteSettings.FORWARD_SLASH_STRING;
        }
        return str;
    }

    /* renamed from: d */
    public static String m41780d(String str) {
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
    public final String m41783a(Builder builder) {
        boolean contains = builder.f51963e.contains(".mtls.");
        if (contains && !this.f51957j.equals(Credentials.GOOGLE_DEFAULT_UNIVERSE)) {
            throw new IllegalStateException("mTLS is not supported in any universe other than googleapis.com");
        }
        if (!builder.f51971m && builder.f51972n != null) {
            if (contains) {
                return "https://" + builder.f51972n + ".mtls." + this.f51957j + RemoteSettings.FORWARD_SLASH_STRING;
            }
            return "https://" + builder.f51972n + "." + this.f51957j + RemoteSettings.FORWARD_SLASH_STRING;
        }
        return builder.f51963e;
    }

    /* renamed from: b */
    public final String m41782b(Builder builder) {
        String str = builder.f51969k;
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
        return this.f51953f;
    }

    public final String getBaseUrl() {
        return this.f51950c + this.f51951d;
    }

    public final GoogleClientRequestInitializer getGoogleClientRequestInitializer() {
        return this.f51949b;
    }

    public ObjectParser getObjectParser() {
        return this.f51954g;
    }

    public final HttpRequestFactory getRequestFactory() {
        return this.f51948a;
    }

    public final String getRootUrl() {
        return this.f51950c;
    }

    public final String getServicePath() {
        return this.f51951d;
    }

    public final boolean getSuppressPatternChecks() {
        return this.f51955h;
    }

    public final boolean getSuppressRequiredParameterChecks() {
        return this.f51956i;
    }

    public final String getUniverseDomain() {
        return this.f51957j;
    }

    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        validateUniverseDomain();
        if (getGoogleClientRequestInitializer() != null) {
            getGoogleClientRequestInitializer().initialize(abstractGoogleClientRequest);
        }
    }

    public void validateUniverseDomain() throws IOException {
        HttpRequestInitializer httpRequestInitializer = this.f51958k;
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
        if (Strings.isNullOrEmpty(this.f51952e)) {
            batchRequest.setBatchUrl(new GenericUrl(getRootUrl() + "batch"));
        } else {
            batchRequest.setBatchUrl(new GenericUrl(getRootUrl() + this.f51952e));
        }
        return batchRequest;
    }
}
