package com.google.api.client.googleapis.media;

import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class MediaHttpUploader {
    public static final String CONTENT_LENGTH_HEADER = "X-Upload-Content-Length";
    public static final String CONTENT_TYPE_HEADER = "X-Upload-Content-Type";
    public static final int DEFAULT_CHUNK_SIZE = 10485760;
    public static final int MINIMUM_CHUNK_SIZE = 262144;

    /* renamed from: b */
    public final AbstractInputStreamContent f51907b;

    /* renamed from: c */
    public final HttpRequestFactory f51908c;

    /* renamed from: d */
    public final HttpTransport f51909d;

    /* renamed from: e */
    public HttpContent f51910e;

    /* renamed from: f */
    public long f51911f;

    /* renamed from: g */
    public boolean f51912g;

    /* renamed from: j */
    public HttpRequest f51915j;

    /* renamed from: k */
    public InputStream f51916k;

    /* renamed from: l */
    public boolean f51917l;

    /* renamed from: m */
    public MediaHttpUploaderProgressListener f51918m;

    /* renamed from: o */
    public long f51920o;

    /* renamed from: q */
    public Byte f51922q;

    /* renamed from: r */
    public long f51923r;

    /* renamed from: s */
    public int f51924s;

    /* renamed from: t */
    public byte[] f51925t;

    /* renamed from: u */
    public boolean f51926u;

    /* renamed from: a */
    public UploadState f51906a = UploadState.NOT_STARTED;

    /* renamed from: h */
    public String f51913h = "POST";

    /* renamed from: i */
    public HttpHeaders f51914i = new HttpHeaders();

    /* renamed from: n */
    public String f51919n = Marker.ANY_MARKER;

    /* renamed from: p */
    public int f51921p = DEFAULT_CHUNK_SIZE;

    /* renamed from: v */
    public Sleeper f51927v = Sleeper.DEFAULT;

    /* loaded from: classes4.dex */
    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    /* renamed from: com.google.api.client.googleapis.media.MediaHttpUploader$a */
    /* loaded from: classes4.dex */
    public static class C7277a {

        /* renamed from: a */
        public final AbstractInputStreamContent f51928a;

        /* renamed from: b */
        public final String f51929b;

        public C7277a(AbstractInputStreamContent abstractInputStreamContent, String str) {
            this.f51928a = abstractInputStreamContent;
            this.f51929b = str;
        }

        /* renamed from: a */
        public AbstractInputStreamContent m41788a() {
            return this.f51928a;
        }

        /* renamed from: b */
        public String m41787b() {
            return this.f51929b;
        }
    }

    public MediaHttpUploader(AbstractInputStreamContent abstractInputStreamContent, HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        HttpRequestFactory createRequestFactory;
        this.f51907b = (AbstractInputStreamContent) Preconditions.checkNotNull(abstractInputStreamContent);
        this.f51909d = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        if (httpRequestInitializer == null) {
            createRequestFactory = httpTransport.createRequestFactory();
        } else {
            createRequestFactory = httpTransport.createRequestFactory(httpRequestInitializer);
        }
        this.f51908c = createRequestFactory;
    }

    /* renamed from: a */
    public final C7277a m41799a() {
        int i;
        int i2;
        int i3;
        AbstractInputStreamContent byteArrayContent;
        String str;
        if (m41792h()) {
            i = (int) Math.min(this.f51921p, m41794f() - this.f51920o);
        } else {
            i = this.f51921p;
        }
        if (m41792h()) {
            this.f51916k.mark(i);
            long j = i;
            byteArrayContent = new InputStreamContent(this.f51907b.getType(), ByteStreams.limit(this.f51916k, j)).setRetrySupported(true).setLength(j).setCloseInputStream(false);
            this.f51919n = String.valueOf(m41794f());
        } else {
            byte[] bArr = this.f51925t;
            if (bArr == null) {
                Byte b = this.f51922q;
                if (b == null) {
                    i3 = i + 1;
                } else {
                    i3 = i;
                }
                byte[] bArr2 = new byte[i + 1];
                this.f51925t = bArr2;
                if (b != null) {
                    bArr2[0] = b.byteValue();
                }
                i2 = 0;
            } else {
                i2 = (int) (this.f51923r - this.f51920o);
                System.arraycopy(bArr, this.f51924s - i2, bArr, 0, i2);
                Byte b2 = this.f51922q;
                if (b2 != null) {
                    this.f51925t[i2] = b2.byteValue();
                }
                i3 = i - i2;
            }
            int read = ByteStreams.read(this.f51916k, this.f51925t, (i + 1) - i3, i3);
            if (read < i3) {
                int max = i2 + Math.max(0, read);
                if (this.f51922q != null) {
                    max++;
                    this.f51922q = null;
                }
                i = max;
                if (this.f51919n.equals(Marker.ANY_MARKER)) {
                    this.f51919n = String.valueOf(this.f51920o + i);
                }
            } else {
                this.f51922q = Byte.valueOf(this.f51925t[i]);
            }
            byteArrayContent = new ByteArrayContent(this.f51907b.getType(), this.f51925t, 0, i);
            this.f51923r = this.f51920o + i;
        }
        this.f51924s = i;
        if (i == 0) {
            str = "bytes */" + this.f51919n;
        } else {
            str = "bytes " + this.f51920o + HelpFormatter.DEFAULT_OPT_PREFIX + ((this.f51920o + i) - 1) + RemoteSettings.FORWARD_SLASH_STRING + this.f51919n;
        }
        return new C7277a(byteArrayContent, str);
    }

    /* renamed from: b */
    public final HttpResponse m41798b(GenericUrl genericUrl) {
        m41789k(UploadState.MEDIA_IN_PROGRESS);
        HttpContent httpContent = this.f51907b;
        if (this.f51910e != null) {
            httpContent = new MultipartContent().setContentParts(Arrays.asList(this.f51910e, this.f51907b));
            genericUrl.put("uploadType", "multipart");
        } else {
            genericUrl.put("uploadType", "media");
        }
        HttpRequest buildRequest = this.f51908c.buildRequest(this.f51913h, genericUrl, httpContent);
        buildRequest.getHeaders().putAll(this.f51914i);
        HttpResponse m41797c = m41797c(buildRequest);
        try {
            if (m41792h()) {
                this.f51920o = m41794f();
            }
            m41789k(UploadState.MEDIA_COMPLETE);
            return m41797c;
        } catch (Throwable th2) {
            m41797c.disconnect();
            throw th2;
        }
    }

    /* renamed from: c */
    public final HttpResponse m41797c(HttpRequest httpRequest) {
        if (!this.f51926u && !(httpRequest.getContent() instanceof EmptyContent)) {
            httpRequest.setEncoding(new GZipEncoding());
        }
        return m41796d(httpRequest);
    }

    /* renamed from: d */
    public final HttpResponse m41796d(HttpRequest httpRequest) {
        new MethodOverride().intercept(httpRequest);
        httpRequest.setThrowExceptionOnExecuteError(false);
        return httpRequest.execute();
    }

    /* renamed from: e */
    public final HttpResponse m41795e(GenericUrl genericUrl) {
        m41789k(UploadState.INITIATION_STARTED);
        genericUrl.put("uploadType", "resumable");
        HttpContent httpContent = this.f51910e;
        if (httpContent == null) {
            httpContent = new EmptyContent();
        }
        HttpRequest buildRequest = this.f51908c.buildRequest(this.f51913h, genericUrl, httpContent);
        this.f51914i.set(CONTENT_TYPE_HEADER, (Object) this.f51907b.getType());
        if (m41792h()) {
            this.f51914i.set(CONTENT_LENGTH_HEADER, (Object) Long.valueOf(m41794f()));
        }
        buildRequest.getHeaders().putAll(this.f51914i);
        HttpResponse m41797c = m41797c(buildRequest);
        try {
            m41789k(UploadState.INITIATION_COMPLETE);
            return m41797c;
        } catch (Throwable th2) {
            m41797c.disconnect();
            throw th2;
        }
    }

    /* renamed from: f */
    public final long m41794f() {
        if (!this.f51912g) {
            this.f51911f = this.f51907b.getLength();
            this.f51912g = true;
        }
        return this.f51911f;
    }

    /* renamed from: g */
    public final long m41793g(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    public int getChunkSize() {
        return this.f51921p;
    }

    public boolean getDisableGZipContent() {
        return this.f51926u;
    }

    public HttpHeaders getInitiationHeaders() {
        return this.f51914i;
    }

    public String getInitiationRequestMethod() {
        return this.f51913h;
    }

    public HttpContent getMediaContent() {
        return this.f51907b;
    }

    public HttpContent getMetadata() {
        return this.f51910e;
    }

    public long getNumBytesUploaded() {
        return this.f51920o;
    }

    public double getProgress() throws IOException {
        Preconditions.checkArgument(m41792h(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (m41794f() == 0) {
            return 0.0d;
        }
        return this.f51920o / m41794f();
    }

    public MediaHttpUploaderProgressListener getProgressListener() {
        return this.f51918m;
    }

    public Sleeper getSleeper() {
        return this.f51927v;
    }

    public HttpTransport getTransport() {
        return this.f51909d;
    }

    public UploadState getUploadState() {
        return this.f51906a;
    }

    /* renamed from: h */
    public final boolean m41792h() {
        if (m41794f() >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final HttpResponse m41791i(GenericUrl genericUrl) {
        HttpResponse m41797c;
        boolean z;
        HttpResponse m41795e = m41795e(genericUrl);
        if (!m41795e.isSuccessStatusCode()) {
            return m41795e;
        }
        try {
            GenericUrl genericUrl2 = new GenericUrl(m41795e.getHeaders().getLocation());
            m41795e.disconnect();
            InputStream inputStream = this.f51907b.getInputStream();
            this.f51916k = inputStream;
            if (!inputStream.markSupported() && m41792h()) {
                this.f51916k = new BufferedInputStream(this.f51916k);
            }
            while (true) {
                C7277a m41799a = m41799a();
                HttpRequest buildPutRequest = this.f51908c.buildPutRequest(genericUrl2, null);
                this.f51915j = buildPutRequest;
                buildPutRequest.setContent(m41799a.m41788a());
                this.f51915j.getHeaders().setContentRange(m41799a.m41787b());
                new C18651Vr0(this, this.f51915j);
                if (m41792h()) {
                    m41797c = m41796d(this.f51915j);
                } else {
                    m41797c = m41797c(this.f51915j);
                }
                try {
                    if (m41797c.isSuccessStatusCode()) {
                        this.f51920o = m41794f();
                        if (this.f51907b.getCloseInputStream()) {
                            this.f51916k.close();
                        }
                        m41789k(UploadState.MEDIA_COMPLETE);
                        return m41797c;
                    } else if (m41797c.getStatusCode() != 308) {
                        if (this.f51907b.getCloseInputStream()) {
                            this.f51916k.close();
                        }
                        return m41797c;
                    } else {
                        String location = m41797c.getHeaders().getLocation();
                        if (location != null) {
                            genericUrl2 = new GenericUrl(location);
                        }
                        long m41793g = m41793g(m41797c.getHeaders().getRange());
                        long j = m41793g - this.f51920o;
                        boolean z2 = false;
                        if (j >= 0 && j <= this.f51924s) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Preconditions.checkState(z);
                        long j2 = this.f51924s - j;
                        if (m41792h()) {
                            if (j2 > 0) {
                                this.f51916k.reset();
                                if (j == this.f51916k.skip(j)) {
                                    z2 = true;
                                }
                                Preconditions.checkState(z2);
                            }
                        } else if (j2 == 0) {
                            this.f51925t = null;
                        }
                        this.f51920o = m41793g;
                        m41789k(UploadState.MEDIA_IN_PROGRESS);
                        m41797c.disconnect();
                    }
                } catch (Throwable th2) {
                    m41797c.disconnect();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            m41795e.disconnect();
            throw th3;
        }
    }

    public boolean isDirectUploadEnabled() {
        return this.f51917l;
    }

    /* renamed from: j */
    public void m41790j() {
        Preconditions.checkNotNull(this.f51915j, "The current request should not be null");
        this.f51915j.setContent(new EmptyContent());
        HttpHeaders headers = this.f51915j.getHeaders();
        headers.setContentRange("bytes */" + this.f51919n);
    }

    /* renamed from: k */
    public final void m41789k(UploadState uploadState) {
        this.f51906a = uploadState;
        MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener = this.f51918m;
        if (mediaHttpUploaderProgressListener != null) {
            mediaHttpUploaderProgressListener.progressChanged(this);
        }
    }

    public MediaHttpUploader setChunkSize(int i) {
        boolean z;
        if (i > 0 && i % 262144 == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "chunkSize must be a positive multiple of 262144.");
        this.f51921p = i;
        return this;
    }

    public MediaHttpUploader setDirectUploadEnabled(boolean z) {
        this.f51917l = z;
        return this;
    }

    public MediaHttpUploader setDisableGZipContent(boolean z) {
        this.f51926u = z;
        return this;
    }

    public MediaHttpUploader setInitiationHeaders(HttpHeaders httpHeaders) {
        this.f51914i = httpHeaders;
        return this;
    }

    public MediaHttpUploader setInitiationRequestMethod(String str) {
        boolean z;
        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH")) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.f51913h = str;
        return this;
    }

    public MediaHttpUploader setMetadata(HttpContent httpContent) {
        this.f51910e = httpContent;
        return this;
    }

    public MediaHttpUploader setProgressListener(MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener) {
        this.f51918m = mediaHttpUploaderProgressListener;
        return this;
    }

    public MediaHttpUploader setSleeper(Sleeper sleeper) {
        this.f51927v = sleeper;
        return this;
    }

    public HttpResponse upload(GenericUrl genericUrl) throws IOException {
        boolean z;
        if (this.f51906a == UploadState.NOT_STARTED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (this.f51917l) {
            return m41798b(genericUrl);
        }
        return m41791i(genericUrl);
    }
}
