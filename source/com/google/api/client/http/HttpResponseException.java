package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;
    private final int attemptCount;
    private final String content;
    private final transient HttpHeaders headers;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponseException(HttpResponse httpResponse) {
        this(new Builder(httpResponse));
    }

    public static StringBuilder computeMessageBuffer(HttpResponse httpResponse) {
        StringBuilder sb = new StringBuilder();
        int statusCode = httpResponse.getStatusCode();
        if (statusCode != 0) {
            sb.append(statusCode);
        }
        String statusMessage = httpResponse.getStatusMessage();
        if (statusMessage != null) {
            if (statusCode != 0) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(statusMessage);
        }
        HttpRequest request = httpResponse.getRequest();
        if (request != null) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            String requestMethod = request.getRequestMethod();
            if (requestMethod != null) {
                sb.append(requestMethod);
                sb.append(TokenParser.f74560SP);
            }
            sb.append(request.getUrl());
        }
        return sb;
    }

    public final int getAttemptCount() {
        return this.attemptCount;
    }

    public final String getContent() {
        return this.content;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.statusCode);
    }

    public HttpResponseException(Builder builder) {
        super(builder.f52138e);
        this.statusCode = builder.f52134a;
        this.statusMessage = builder.f52135b;
        this.headers = builder.f52136c;
        this.content = builder.f52137d;
        this.attemptCount = builder.f52139f;
    }

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f52134a;

        /* renamed from: b */
        public String f52135b;

        /* renamed from: c */
        public HttpHeaders f52136c;

        /* renamed from: d */
        public String f52137d;

        /* renamed from: e */
        public String f52138e;

        /* renamed from: f */
        public int f52139f;

        public Builder(int i, String str, HttpHeaders httpHeaders) {
            setStatusCode(i);
            setStatusMessage(str);
            setHeaders(httpHeaders);
        }

        public HttpResponseException build() {
            return new HttpResponseException(this);
        }

        public final int getAttemptCount() {
            return this.f52139f;
        }

        public final String getContent() {
            return this.f52137d;
        }

        public HttpHeaders getHeaders() {
            return this.f52136c;
        }

        public final String getMessage() {
            return this.f52138e;
        }

        public final int getStatusCode() {
            return this.f52134a;
        }

        public final String getStatusMessage() {
            return this.f52135b;
        }

        public Builder setAttemptCount(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f52139f = i;
            return this;
        }

        public Builder setContent(String str) {
            this.f52137d = str;
            return this;
        }

        public Builder setHeaders(HttpHeaders httpHeaders) {
            this.f52136c = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
            return this;
        }

        public Builder setMessage(String str) {
            this.f52138e = str;
            return this;
        }

        public Builder setStatusCode(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f52134a = i;
            return this;
        }

        public Builder setStatusMessage(String str) {
            this.f52135b = str;
            return this;
        }

        public Builder(HttpResponse httpResponse) {
            this(httpResponse.getStatusCode(), httpResponse.getStatusMessage(), httpResponse.getHeaders());
            try {
                String parseAsString = httpResponse.parseAsString();
                this.f52137d = parseAsString;
                if (parseAsString.length() == 0) {
                    this.f52137d = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
            StringBuilder computeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
            if (this.f52137d != null) {
                computeMessageBuffer.append(StringUtils.LINE_SEPARATOR);
                computeMessageBuffer.append(this.f52137d);
            }
            this.f52138e = computeMessageBuffer.toString();
        }
    }
}
