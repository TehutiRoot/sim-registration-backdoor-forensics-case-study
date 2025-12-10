package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.LoggingInputStream;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.message.TokenParser;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes4.dex */
public final class HttpResponse {

    /* renamed from: a */
    public InputStream f52122a;

    /* renamed from: b */
    public final String f52123b;

    /* renamed from: c */
    public final String f52124c;

    /* renamed from: d */
    public final HttpMediaType f52125d;

    /* renamed from: e */
    public LowLevelHttpResponse f52126e;

    /* renamed from: f */
    public final int f52127f;

    /* renamed from: g */
    public final String f52128g;

    /* renamed from: h */
    public final HttpRequest f52129h;

    /* renamed from: i */
    public final boolean f52130i;

    /* renamed from: j */
    public int f52131j;

    /* renamed from: k */
    public boolean f52132k;

    /* renamed from: l */
    public boolean f52133l;

    public HttpResponse(HttpRequest httpRequest, LowLevelHttpResponse lowLevelHttpResponse) {
        StringBuilder sb;
        this.f52129h = httpRequest;
        this.f52130i = httpRequest.getResponseReturnRawInputStream();
        this.f52131j = httpRequest.getContentLoggingLimit();
        this.f52132k = httpRequest.isLoggingEnabled();
        this.f52126e = lowLevelHttpResponse;
        this.f52123b = lowLevelHttpResponse.getContentEncoding();
        int statusCode = lowLevelHttpResponse.getStatusCode();
        boolean z = false;
        statusCode = statusCode < 0 ? 0 : statusCode;
        this.f52127f = statusCode;
        String reasonPhrase = lowLevelHttpResponse.getReasonPhrase();
        this.f52128g = reasonPhrase;
        Logger logger = HttpTransport.f52140a;
        if (this.f52132k && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            String str = StringUtils.LINE_SEPARATOR;
            sb.append(str);
            String statusLine = lowLevelHttpResponse.getStatusLine();
            if (statusLine != null) {
                sb.append(statusLine);
            } else {
                sb.append(statusCode);
                if (reasonPhrase != null) {
                    sb.append(TokenParser.f74560SP);
                    sb.append(reasonPhrase);
                }
            }
            sb.append(str);
        } else {
            sb = null;
        }
        httpRequest.getResponseHeaders().fromHttpResponse(lowLevelHttpResponse, z ? sb : null);
        String contentType = lowLevelHttpResponse.getContentType();
        contentType = contentType == null ? httpRequest.getResponseHeaders().getContentType() : contentType;
        this.f52124c = contentType;
        this.f52125d = m41750b(contentType);
        if (z) {
            logger.config(sb.toString());
        }
    }

    /* renamed from: b */
    public static HttpMediaType m41750b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new HttpMediaType(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m41751a() {
        int statusCode = getStatusCode();
        if (!getRequest().getRequestMethod().equals("HEAD") && statusCode / 100 != 1 && statusCode != 204 && statusCode != 304) {
            return true;
        }
        ignore();
        return false;
    }

    public void disconnect() throws IOException {
        ignore();
        this.f52126e.disconnect();
    }

    public void download(OutputStream outputStream) throws IOException {
        IOUtils.copy(getContent(), outputStream);
    }

    public InputStream getContent() throws IOException {
        String str;
        if (!this.f52133l) {
            LoggingInputStream content = this.f52126e.getContent();
            if (content != null) {
                try {
                    if (!this.f52130i && (str = this.f52123b) != null) {
                        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                        if (!"gzip".equals(lowerCase)) {
                            if ("x-gzip".equals(lowerCase)) {
                            }
                        }
                        content = AbstractC20844l70.m26558a(new C16860ux(content));
                    }
                    Logger logger = HttpTransport.f52140a;
                    if (this.f52132k) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            content = new LoggingInputStream(content, logger, level, this.f52131j);
                        }
                    }
                    if (this.f52130i) {
                        this.f52122a = content;
                    } else {
                        this.f52122a = new BufferedInputStream(content);
                    }
                } catch (EOFException unused) {
                    content.close();
                } catch (Throwable th2) {
                    content.close();
                    throw th2;
                }
            }
            this.f52133l = true;
        }
        return this.f52122a;
    }

    public Charset getContentCharset() {
        HttpMediaType httpMediaType = this.f52125d;
        if (httpMediaType != null) {
            if (httpMediaType.getCharsetParameter() != null) {
                return this.f52125d.getCharsetParameter();
            }
            if ("application".equals(this.f52125d.getType()) && "json".equals(this.f52125d.getSubType())) {
                return StandardCharsets.UTF_8;
            }
            if (TextBundle.TEXT_ENTRY.equals(this.f52125d.getType()) && "csv".equals(this.f52125d.getSubType())) {
                return StandardCharsets.UTF_8;
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public String getContentEncoding() {
        return this.f52123b;
    }

    public int getContentLoggingLimit() {
        return this.f52131j;
    }

    public String getContentType() {
        return this.f52124c;
    }

    public HttpHeaders getHeaders() {
        return this.f52129h.getResponseHeaders();
    }

    public HttpMediaType getMediaType() {
        return this.f52125d;
    }

    public HttpRequest getRequest() {
        return this.f52129h;
    }

    public int getStatusCode() {
        return this.f52127f;
    }

    public String getStatusMessage() {
        return this.f52128g;
    }

    public HttpTransport getTransport() {
        return this.f52129h.getTransport();
    }

    public void ignore() throws IOException {
        InputStream content;
        LowLevelHttpResponse lowLevelHttpResponse = this.f52126e;
        if (lowLevelHttpResponse != null && (content = lowLevelHttpResponse.getContent()) != null) {
            content.close();
        }
    }

    public boolean isLoggingEnabled() {
        return this.f52132k;
    }

    public boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.f52127f);
    }

    public <T> T parseAs(Class<T> cls) throws IOException {
        if (m41751a()) {
            return (T) this.f52129h.getParser().parseAndClose(getContent(), getContentCharset(), (Class<Object>) cls);
        }
        return null;
    }

    public String parseAsString() throws IOException {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(content, byteArrayOutputStream);
        return byteArrayOutputStream.toString(getContentCharset().name());
    }

    public HttpResponse setContentLoggingLimit(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The content logging limit must be non-negative.");
        this.f52131j = i;
        return this;
    }

    public HttpResponse setLoggingEnabled(boolean z) {
        this.f52132k = z;
        return this;
    }

    public Object parseAs(Type type) throws IOException {
        if (m41751a()) {
            return this.f52129h.getParser().parseAndClose(getContent(), getContentCharset(), type);
        }
        return null;
    }
}
