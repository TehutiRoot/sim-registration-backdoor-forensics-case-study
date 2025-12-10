package com.google.api.client.googleapis.media;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.p014io.ByteStreams;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public final class MediaHttpDownloader {
    public static final int MAXIMUM_CHUNK_SIZE = 33554432;

    /* renamed from: a */
    public final HttpRequestFactory f51897a;

    /* renamed from: b */
    public final HttpTransport f51898b;

    /* renamed from: d */
    public MediaHttpDownloaderProgressListener f51900d;

    /* renamed from: f */
    public long f51902f;

    /* renamed from: h */
    public long f51904h;

    /* renamed from: c */
    public boolean f51899c = false;

    /* renamed from: e */
    public int f51901e = MAXIMUM_CHUNK_SIZE;

    /* renamed from: g */
    public DownloadState f51903g = DownloadState.NOT_STARTED;

    /* renamed from: i */
    public long f51905i = -1;

    /* loaded from: classes4.dex */
    public enum DownloadState {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpDownloader(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        HttpRequestFactory createRequestFactory;
        this.f51898b = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        if (httpRequestInitializer == null) {
            createRequestFactory = httpTransport.createRequestFactory();
        } else {
            createRequestFactory = httpTransport.createRequestFactory(httpRequestInitializer);
        }
        this.f51897a = createRequestFactory;
    }

    /* renamed from: a */
    public final HttpResponse m41803a(long j, GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) {
        HttpRequest buildGetRequest = this.f51897a.buildGetRequest(genericUrl);
        if (httpHeaders != null) {
            buildGetRequest.getHeaders().putAll(httpHeaders);
        }
        if (this.f51904h != 0 || j != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(this.f51904h);
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (j != -1) {
                sb.append(j);
            }
            buildGetRequest.getHeaders().setRange(sb.toString());
        }
        HttpResponse execute = buildGetRequest.execute();
        try {
            ByteStreams.copy(execute.getContent(), outputStream);
            return execute;
        } finally {
            execute.disconnect();
        }
    }

    /* renamed from: b */
    public final long m41802b(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    /* renamed from: c */
    public final void m41801c(String str) {
        if (str != null && this.f51902f == 0) {
            this.f51902f = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    /* renamed from: d */
    public final void m41800d(DownloadState downloadState) {
        this.f51903g = downloadState;
        MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener = this.f51900d;
        if (mediaHttpDownloaderProgressListener != null) {
            mediaHttpDownloaderProgressListener.progressChanged(this);
        }
    }

    public void download(GenericUrl genericUrl, OutputStream outputStream) throws IOException {
        download(genericUrl, null, outputStream);
    }

    public int getChunkSize() {
        return this.f51901e;
    }

    public DownloadState getDownloadState() {
        return this.f51903g;
    }

    public long getLastBytePosition() {
        return this.f51905i;
    }

    public long getNumBytesDownloaded() {
        return this.f51904h;
    }

    public double getProgress() {
        long j = this.f51902f;
        if (j == 0) {
            return 0.0d;
        }
        return this.f51904h / j;
    }

    public MediaHttpDownloaderProgressListener getProgressListener() {
        return this.f51900d;
    }

    public HttpTransport getTransport() {
        return this.f51898b;
    }

    public boolean isDirectDownloadEnabled() {
        return this.f51899c;
    }

    public MediaHttpDownloader setBytesDownloaded(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f51904h = j;
        return this;
    }

    public MediaHttpDownloader setChunkSize(int i) {
        boolean z;
        if (i > 0 && i <= 33554432) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f51901e = i;
        return this;
    }

    public MediaHttpDownloader setContentRange(long j, long j2) {
        Preconditions.checkArgument(j2 >= j);
        setBytesDownloaded(j);
        this.f51905i = j2;
        return this;
    }

    public MediaHttpDownloader setDirectDownloadEnabled(boolean z) {
        this.f51899c = z;
        return this;
    }

    public MediaHttpDownloader setProgressListener(MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener) {
        this.f51900d = mediaHttpDownloaderProgressListener;
        return this;
    }

    public void download(GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        Preconditions.checkArgument(this.f51903g == DownloadState.NOT_STARTED);
        genericUrl.put("alt", "media");
        if (this.f51899c) {
            m41800d(DownloadState.MEDIA_IN_PROGRESS);
            long longValue = ((Long) MoreObjects.firstNonNull(m41803a(this.f51905i, genericUrl, httpHeaders, outputStream).getHeaders().getContentLength(), Long.valueOf(this.f51902f))).longValue();
            this.f51902f = longValue;
            this.f51904h = longValue;
            m41800d(DownloadState.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long j = (this.f51904h + this.f51901e) - 1;
            long j2 = this.f51905i;
            if (j2 != -1) {
                j = Math.min(j2, j);
            }
            String contentRange = m41803a(j, genericUrl, httpHeaders, outputStream).getHeaders().getContentRange();
            long m41802b = m41802b(contentRange);
            m41801c(contentRange);
            long j3 = this.f51905i;
            if (j3 != -1 && j3 <= m41802b) {
                this.f51904h = j3;
                m41800d(DownloadState.MEDIA_COMPLETE);
                return;
            }
            long j4 = this.f51902f;
            if (j4 <= m41802b) {
                this.f51904h = j4;
                m41800d(DownloadState.MEDIA_COMPLETE);
                return;
            }
            this.f51904h = m41802b;
            m41800d(DownloadState.MEDIA_IN_PROGRESS);
        }
    }

    @Deprecated
    public MediaHttpDownloader setContentRange(long j, int i) {
        return setContentRange(j, i);
    }
}
