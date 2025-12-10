package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes4.dex */
public class InstrumentApacheHttpResponseHandler<T> implements ResponseHandler<T> {

    /* renamed from: a */
    public final ResponseHandler f56225a;

    /* renamed from: b */
    public final Timer f56226b;

    /* renamed from: c */
    public final NetworkRequestMetricBuilder f56227c;

    public InstrumentApacheHttpResponseHandler(ResponseHandler<? extends T> responseHandler, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f56225a = responseHandler;
        this.f56226b = timer;
        this.f56227c = networkRequestMetricBuilder;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f56227c.setTimeToResponseCompletedMicros(this.f56226b.getDurationMicros());
        this.f56227c.setHttpResponseCode(httpResponse.getStatusLine().getStatusCode());
        Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpResponse);
        if (apacheHttpMessageContentLength != null) {
            this.f56227c.setResponsePayloadBytes(apacheHttpMessageContentLength.longValue());
        }
        String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(httpResponse);
        if (apacheHttpResponseContentType != null) {
            this.f56227c.setResponseContentType(apacheHttpResponseContentType);
        }
        this.f56227c.build();
        return (T) this.f56225a.handleResponse(httpResponse);
    }
}
