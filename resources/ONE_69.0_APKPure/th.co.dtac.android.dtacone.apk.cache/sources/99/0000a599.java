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
    public final HttpRequestFactory f51909a;

    /* renamed from: b */
    public final HttpTransport f51910b;

    /* renamed from: d */
    public MediaHttpDownloaderProgressListener f51912d;

    /* renamed from: f */
    public long f51914f;

    /* renamed from: h */
    public long f51916h;

    /* renamed from: c */
    public boolean f51911c = false;

    /* renamed from: e */
    public int f51913e = MAXIMUM_CHUNK_SIZE;

    /* renamed from: g */
    public DownloadState f51915g = DownloadState.NOT_STARTED;

    /* renamed from: i */
    public long f51917i = -1;

    /* loaded from: classes4.dex */
    public enum DownloadState {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpDownloader(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        HttpRequestFactory createRequestFactory;
        this.f51910b = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        if (httpRequestInitializer == null) {
            createRequestFactory = httpTransport.createRequestFactory();
        } else {
            createRequestFactory = httpTransport.createRequestFactory(httpRequestInitializer);
        }
        this.f51909a = createRequestFactory;
    }

    /* renamed from: a */
    public final HttpResponse m41790a(long j, GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) {
        HttpRequest buildGetRequest = this.f51909a.buildGetRequest(genericUrl);
        if (httpHeaders != null) {
            buildGetRequest.getHeaders().putAll(httpHeaders);
        }
        if (this.f51916h != 0 || j != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(this.f51916h);
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
    public final long m41789b(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    /* renamed from: c */
    public final void m41788c(String str) {
        if (str != null && this.f51914f == 0) {
            this.f51914f = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    /* renamed from: d */
    public final void m41787d(DownloadState downloadState) {
        this.f51915g = downloadState;
        MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener = this.f51912d;
        if (mediaHttpDownloaderProgressListener != null) {
            mediaHttpDownloaderProgressListener.progressChanged(this);
        }
    }

    public void download(GenericUrl genericUrl, OutputStream outputStream) throws IOException {
        download(genericUrl, null, outputStream);
    }

    public int getChunkSize() {
        return this.f51913e;
    }

    public DownloadState getDownloadState() {
        return this.f51915g;
    }

    public long getLastBytePosition() {
        return this.f51917i;
    }

    public long getNumBytesDownloaded() {
        return this.f51916h;
    }

    public double getProgress() {
        long j = this.f51914f;
        if (j == 0) {
            return 0.0d;
        }
        return this.f51916h / j;
    }

    public MediaHttpDownloaderProgressListener getProgressListener() {
        return this.f51912d;
    }

    public HttpTransport getTransport() {
        return this.f51910b;
    }

    public boolean isDirectDownloadEnabled() {
        return this.f51911c;
    }

    public MediaHttpDownloader setBytesDownloaded(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f51916h = j;
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
        this.f51913e = i;
        return this;
    }

    public MediaHttpDownloader setContentRange(long j, long j2) {
        Preconditions.checkArgument(j2 >= j);
        setBytesDownloaded(j);
        this.f51917i = j2;
        return this;
    }

    public MediaHttpDownloader setDirectDownloadEnabled(boolean z) {
        this.f51911c = z;
        return this;
    }

    public MediaHttpDownloader setProgressListener(MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener) {
        this.f51912d = mediaHttpDownloaderProgressListener;
        return this;
    }

    public void download(GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        Preconditions.checkArgument(this.f51915g == DownloadState.NOT_STARTED);
        genericUrl.put("alt", "media");
        if (this.f51911c) {
            m41787d(DownloadState.MEDIA_IN_PROGRESS);
            long longValue = ((Long) MoreObjects.firstNonNull(m41790a(this.f51917i, genericUrl, httpHeaders, outputStream).getHeaders().getContentLength(), Long.valueOf(this.f51914f))).longValue();
            this.f51914f = longValue;
            this.f51916h = longValue;
            m41787d(DownloadState.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long j = (this.f51916h + this.f51913e) - 1;
            long j2 = this.f51917i;
            if (j2 != -1) {
                j = Math.min(j2, j);
            }
            String contentRange = m41790a(j, genericUrl, httpHeaders, outputStream).getHeaders().getContentRange();
            long m41789b = m41789b(contentRange);
            m41788c(contentRange);
            long j3 = this.f51917i;
            if (j3 != -1 && j3 <= m41789b) {
                this.f51916h = j3;
                m41787d(DownloadState.MEDIA_COMPLETE);
                return;
            }
            long j4 = this.f51914f;
            if (j4 <= m41789b) {
                this.f51916h = j4;
                m41787d(DownloadState.MEDIA_COMPLETE);
                return;
            }
            this.f51916h = m41789b;
            m41787d(DownloadState.MEDIA_IN_PROGRESS);
        }
    }

    @Deprecated
    public MediaHttpDownloader setContentRange(long j, int i) {
        return setContentRange(j, i);
    }
}