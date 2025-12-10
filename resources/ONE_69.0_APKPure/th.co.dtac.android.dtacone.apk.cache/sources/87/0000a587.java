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
    public static final Logger f51862e = Logger.getLogger(BatchRequest.class.getName());

    /* renamed from: b */
    public final HttpRequestFactory f51864b;

    /* renamed from: a */
    public GenericUrl f51863a = new GenericUrl("https://www.googleapis.com/batch");

    /* renamed from: c */
    public List f51865c = new ArrayList();

    /* renamed from: d */
    public Sleeper f51866d = Sleeper.DEFAULT;

    /* renamed from: com.google.api.client.googleapis.batch.BatchRequest$a */
    /* loaded from: classes4.dex */
    public class C7259a implements HttpExecuteInterceptor {

        /* renamed from: a */
        public HttpExecuteInterceptor f51867a;

        public C7259a(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.f51867a = httpExecuteInterceptor;
        }

        @Override // com.google.api.client.http.HttpExecuteInterceptor
        public void intercept(HttpRequest httpRequest) {
            HttpExecuteInterceptor httpExecuteInterceptor = this.f51867a;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(httpRequest);
            }
            for (C7260b c7260b : BatchRequest.this.f51865c) {
                HttpExecuteInterceptor interceptor = c7260b.f51872d.getInterceptor();
                if (interceptor != null) {
                    interceptor.intercept(c7260b.f51872d);
                }
            }
        }
    }

    /* renamed from: com.google.api.client.googleapis.batch.BatchRequest$b */
    /* loaded from: classes4.dex */
    public static class C7260b {

        /* renamed from: a */
        public final BatchCallback f51869a;

        /* renamed from: b */
        public final Class f51870b;

        /* renamed from: c */
        public final Class f51871c;

        /* renamed from: d */
        public final HttpRequest f51872d;

        public C7260b(BatchCallback batchCallback, Class cls, Class cls2, HttpRequest httpRequest) {
            this.f51869a = batchCallback;
            this.f51870b = cls;
            this.f51871c = cls2;
            this.f51872d = httpRequest;
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
        this.f51864b = createRequestFactory;
    }

    public void execute() throws IOException {
        boolean z;
        Preconditions.checkState(!this.f51865c.isEmpty(), "Batch is empty");
        if ("https://www.googleapis.com/batch".equals(this.f51863a.toString())) {
            f51862e.log(Level.WARNING, "You are using the global batch endpoint which will soon be shut down. Please instantiate your BatchRequest via your service client's `batch(HttpRequestInitializer)` method. For an example, please see https://github.com/googleapis/google-api-java-client#batching.");
        }
        HttpRequest buildPostRequest = this.f51864b.buildPostRequest(this.f51863a, null);
        buildPostRequest.setInterceptor(new C7259a(buildPostRequest.getInterceptor()));
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
            for (C7260b c7260b : this.f51865c) {
                multipartContent.addPart(new MultipartContent.Part(new HttpHeaders().setAcceptEncoding(null).set("Content-ID", (Object) Integer.valueOf(i)), new C20561j90(c7260b.f51872d)));
                i++;
            }
            buildPostRequest.setContent(multipartContent);
            HttpResponse execute = buildPostRequest.execute();
            try {
                C7261a c7261a = new C7261a(new BufferedInputStream(execute.getContent()), HelpFormatter.DEFAULT_LONG_OPT_PREFIX + execute.getMediaType().getParameter("boundary"), this.f51865c, z);
                while (c7261a.f51876d) {
                    c7261a.m41795e();
                }
                execute.disconnect();
                List list = c7261a.f51877e;
                if (list.isEmpty()) {
                    break;
                }
                this.f51865c = list;
                numberOfRetries--;
            } catch (Throwable th2) {
                execute.disconnect();
                throw th2;
            }
        } while (z);
        this.f51865c.clear();
    }

    public GenericUrl getBatchUrl() {
        return this.f51863a;
    }

    public Sleeper getSleeper() {
        return this.f51866d;
    }

    public <T, E> BatchRequest queue(HttpRequest httpRequest, Class<T> cls, Class<E> cls2, BatchCallback<T, E> batchCallback) throws IOException {
        Preconditions.checkNotNull(httpRequest);
        Preconditions.checkNotNull(batchCallback);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(cls2);
        this.f51865c.add(new C7260b(batchCallback, cls, cls2, httpRequest));
        return this;
    }

    public BatchRequest setBatchUrl(GenericUrl genericUrl) {
        this.f51863a = genericUrl;
        return this;
    }

    public BatchRequest setSleeper(Sleeper sleeper) {
        this.f51866d = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public int size() {
        return this.f51865c.size();
    }
}