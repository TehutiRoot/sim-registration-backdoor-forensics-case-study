package com.google.auth.http;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Preconditions;
import com.google.auth.Credentials;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class HttpCredentialsAdapter implements HttpRequestInitializer, HttpUnsuccessfulResponseHandler {

    /* renamed from: b */
    public static final Logger f52393b = Logger.getLogger(HttpCredentialsAdapter.class.getName());

    /* renamed from: c */
    public static final Pattern f52394c = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    /* renamed from: a */
    public final Credentials f52395a;

    public HttpCredentialsAdapter(Credentials credentials) {
        Preconditions.checkNotNull(credentials);
        this.f52395a = credentials;
    }

    public Credentials getCredentials() {
        return this.f52395a;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2;
        boolean z3;
        List<String> authenticateAsList = httpResponse.getHeaders().getAuthenticateAsList();
        if (authenticateAsList != null) {
            for (String str : authenticateAsList) {
                if (str.startsWith("Bearer ")) {
                    z2 = f52394c.matcher(str).find();
                    z3 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z3) {
            if (httpResponse.getStatusCode() == 401) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            try {
                this.f52395a.refresh();
                initialize(httpRequest);
                return true;
            } catch (IOException e) {
                f52393b.log(Level.SEVERE, "unable to refresh token", (Throwable) e);
            }
        }
        return false;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        URI uri;
        httpRequest.setUnsuccessfulResponseHandler(this);
        if (!this.f52395a.hasRequestMetadata()) {
            return;
        }
        HttpHeaders headers = httpRequest.getHeaders();
        if (httpRequest.getUrl() != null) {
            uri = httpRequest.getUrl().toURI();
        } else {
            uri = null;
        }
        Map<String, List<String>> requestMetadata = this.f52395a.getRequestMetadata(uri);
        if (requestMetadata == null) {
            return;
        }
        for (Map.Entry<String, List<String>> entry : requestMetadata.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(entry.getValue());
            headers.put(entry.getKey(), (Object) arrayList);
        }
    }
}
