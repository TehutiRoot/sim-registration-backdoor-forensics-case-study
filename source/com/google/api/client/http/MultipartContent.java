package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class MultipartContent extends AbstractHttpContent {

    /* renamed from: c */
    public ArrayList f52149c;

    /* loaded from: classes4.dex */
    public static final class Part {

        /* renamed from: a */
        public HttpContent f52150a;

        /* renamed from: b */
        public HttpHeaders f52151b;

        /* renamed from: c */
        public HttpEncoding f52152c;

        public Part() {
            this(null);
        }

        public HttpContent getContent() {
            return this.f52150a;
        }

        public HttpEncoding getEncoding() {
            return this.f52152c;
        }

        public HttpHeaders getHeaders() {
            return this.f52151b;
        }

        public Part setContent(HttpContent httpContent) {
            this.f52150a = httpContent;
            return this;
        }

        public Part setEncoding(HttpEncoding httpEncoding) {
            this.f52152c = httpEncoding;
            return this;
        }

        public Part setHeaders(HttpHeaders httpHeaders) {
            this.f52151b = httpHeaders;
            return this;
        }

        public Part(HttpContent httpContent) {
            this(null, httpContent);
        }

        public Part(HttpHeaders httpHeaders, HttpContent httpContent) {
            setHeaders(httpHeaders);
            setContent(httpContent);
        }
    }

    public MultipartContent() {
        this("__END_OF_PART__" + UUID.randomUUID().toString() + "__");
    }

    public MultipartContent addPart(Part part) {
        this.f52149c.add(Preconditions.checkNotNull(part));
        return this;
    }

    public final String getBoundary() {
        return getMediaType().getParameter("boundary");
    }

    public final Collection<Part> getParts() {
        return Collections.unmodifiableCollection(this.f52149c);
    }

    @Override // com.google.api.client.http.AbstractHttpContent, com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        Iterator it = this.f52149c.iterator();
        while (it.hasNext()) {
            if (!((Part) it.next()).f52150a.retrySupported()) {
                return false;
            }
        }
        return true;
    }

    public MultipartContent setBoundary(String str) {
        getMediaType().setParameter("boundary", (String) Preconditions.checkNotNull(str));
        return this;
    }

    public MultipartContent setContentParts(Collection<? extends HttpContent> collection) {
        this.f52149c = new ArrayList(collection.size());
        for (HttpContent httpContent : collection) {
            addPart(new Part(httpContent));
        }
        return this;
    }

    public MultipartContent setParts(Collection<Part> collection) {
        this.f52149c = new ArrayList(collection);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.api.client.http.HttpEncodingStreamingContent] */
    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        long j;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, getCharset());
        String boundary = getBoundary();
        Iterator it = this.f52149c.iterator();
        while (it.hasNext()) {
            Part part = (Part) it.next();
            HttpHeaders acceptEncoding = new HttpHeaders().setAcceptEncoding(null);
            HttpHeaders httpHeaders = part.f52151b;
            if (httpHeaders != null) {
                acceptEncoding.fromHttpHeaders(httpHeaders);
            }
            acceptEncoding.setContentEncoding(null).setUserAgent(null).setContentType(null).setContentLength(null).set("Content-Transfer-Encoding", (Object) null);
            HttpContent httpContent = part.f52150a;
            if (httpContent != null) {
                acceptEncoding.set("Content-Transfer-Encoding", (Object) Arrays.asList("binary"));
                acceptEncoding.setContentType(httpContent.getType());
                HttpEncoding httpEncoding = part.f52152c;
                if (httpEncoding == null) {
                    j = httpContent.getLength();
                } else {
                    acceptEncoding.setContentEncoding(httpEncoding.getName());
                    ?? httpEncodingStreamingContent = new HttpEncodingStreamingContent(httpContent, httpEncoding);
                    long computeLength = AbstractHttpContent.computeLength(httpContent);
                    httpContent = httpEncodingStreamingContent;
                    j = computeLength;
                }
                if (j != -1) {
                    acceptEncoding.setContentLength(Long.valueOf(j));
                }
            } else {
                httpContent = null;
            }
            outputStreamWriter.write(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
            outputStreamWriter.write(boundary);
            outputStreamWriter.write("\r\n");
            HttpHeaders.serializeHeadersForMultipartRequests(acceptEncoding, null, null, outputStreamWriter);
            if (httpContent != null) {
                outputStreamWriter.write("\r\n");
                outputStreamWriter.flush();
                httpContent.writeTo(outputStream);
            }
            outputStreamWriter.write("\r\n");
        }
        outputStreamWriter.write(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        outputStreamWriter.write(boundary);
        outputStreamWriter.write(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
    }

    public MultipartContent(String str) {
        super(new HttpMediaType("multipart/related").setParameter("boundary", str));
        this.f52149c = new ArrayList();
    }

    @Override // com.google.api.client.http.AbstractHttpContent
    public MultipartContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }
}
