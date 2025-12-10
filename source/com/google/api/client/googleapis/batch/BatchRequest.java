package com.google.api.client.googleapis.batch;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public final class BatchRequest {

    /* renamed from: e */
    public static final Logger f51850e = Logger.getLogger(BatchRequest.class.getName());

    /* renamed from: b */
    public final HttpRequestFactory f51852b;

    /* renamed from: a */
    public GenericUrl f51851a = new GenericUrl("https://www.googleapis.com/batch");

    /* renamed from: c */
    public List f51853c = new ArrayList();

    /* renamed from: d */
    public Sleeper f51854d = Sleeper.DEFAULT;

    /* renamed from: com.google.api.client.googleapis.batch.BatchRequest$a */
    /* loaded from: classes4.dex */
    public class C7270a implements HttpExecuteInterceptor {

        /* renamed from: a */
        public HttpExecuteInterceptor f51855a;

        public C7270a(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.f51855a = httpExecuteInterceptor;
        }

        @Override // com.google.api.client.http.HttpExecuteInterceptor
        public void intercept(HttpRequest httpRequest) {
            HttpExecuteInterceptor httpExecuteInterceptor = this.f51855a;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(httpRequest);
            }
            for (C7271b c7271b : BatchRequest.this.f51853c) {
                HttpExecuteInterceptor interceptor = c7271b.f51860d.getInterceptor();
                if (interceptor != null) {
                    interceptor.intercept(c7271b.f51860d);
                }
            }
        }
    }

    /* renamed from: com.google.api.client.googleapis.batch.BatchRequest$b */
    /* loaded from: classes4.dex */
    public static class C7271b {

        /* renamed from: a */
        public final BatchCallback f51857a;

        /* renamed from: b */
        public final Class f51858b;

        /* renamed from: c */
        public final Class f51859c;

        /* renamed from: d */
        public final HttpRequest f51860d;

        public C7271b(BatchCallback batchCallback, Class cls, Class cls2, HttpRequest httpRequest) {
            this.f51857a = batchCallback;
            this.f51858b = cls;
            this.f51859c = cls2;
            this.f51860d = httpRequest;
        }
    }

    @Deprecated
    public BatchRequest(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        HttpRequestFactory createRequestFactory;
        if (httpRequestInitializer == null) {
            createRequestFactory = httpTransport.createRequestFactory();
        } else {
            createRequestFactory = httpTransport.createRequestFactory(httpRequestInitializer);
        }
        this.f51852b = createRequestFactory;
    }

    public void execute() throws IOException {
        boolean z;
        Preconditions.checkState(!this.f51853c.isEmpty(), "Batch is empty");
        if ("https://www.googleapis.com/batch".equals(this.f51851a.toString())) {
            f51850e.log(Level.WARNING, "You are using the global batch endpoint which will soon be shut down. Please instantiate your BatchRequest via your service client's `batch(HttpRequestInitializer)` method. For an example, please see https://github.com/googleapis/google-api-java-client#batching.");
        }
        HttpRequest buildPostRequest = this.f51852b.buildPostRequest(this.f51851a, null);
        buildPostRequest.setInterceptor(new C7270a(buildPostRequest.getInterceptor()));
        int numberOfRetries = buildPostRequest.getNumberOfRetries();
        do {
            if (numberOfRetries > 0) {
                z = true;
            } else {
                z = false;
            }
            MultipartContent multipartContent = new MultipartContent();
            multipartContent.getMediaType().setSubType("mixed");
            int i = 1;
            for (C7271b c7271b : this.f51853c) {
                multipartContent.addPart(new MultipartContent.Part(new HttpHeaders().setAcceptEncoding(null).set("Content-ID", (Object) Integer.valueOf(i)), new C19474d90(c7271b.f51860d)));
                i++;
            }
            buildPostRequest.setContent(multipartContent);
            HttpResponse execute = buildPostRequest.execute();
            try {
                C7272a c7272a = new C7272a(new BufferedInputStream(execute.getContent()), HelpFormatter.DEFAULT_LONG_OPT_PREFIX + execute.getMediaType().getParameter("boundary"), this.f51853c, z);
                while (c7272a.f51864d) {
                    c7272a.m41808e();
                }
                execute.disconnect();
                List list = c7272a.f51865e;
                if (list.isEmpty()) {
                    break;
                }
                this.f51853c = list;
                numberOfRetries--;
            } catch (Throwable th2) {
                execute.disconnect();
                throw th2;
            }
        } while (z);
        this.f51853c.clear();
    }

    public GenericUrl getBatchUrl() {
        return this.f51851a;
    }

    public Sleeper getSleeper() {
        return this.f51854d;
    }

    public <T, E> BatchRequest queue(HttpRequest httpRequest, Class<T> cls, Class<E> cls2, BatchCallback<T, E> batchCallback) throws IOException {
        Preconditions.checkNotNull(httpRequest);
        Preconditions.checkNotNull(batchCallback);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(cls2);
        this.f51853c.add(new C7271b(batchCallback, cls, cls2, httpRequest));
        return this;
    }

    public BatchRequest setBatchUrl(GenericUrl genericUrl) {
        this.f51851a = genericUrl;
        return this;
    }

    public BatchRequest setSleeper(Sleeper sleeper) {
        this.f51854d = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public int size() {
        return this.f51853c.size();
    }
}
