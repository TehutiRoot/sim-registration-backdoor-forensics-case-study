package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class InstrumentOkHttpEnqueueCallback implements Callback {

    /* renamed from: a */
    public final Callback f56228a;

    /* renamed from: b */
    public final NetworkRequestMetricBuilder f56229b;

    /* renamed from: c */
    public final Timer f56230c;

    /* renamed from: d */
    public final long f56231d;

    public InstrumentOkHttpEnqueueCallback(Callback callback, TransportManager transportManager, Timer timer, long j) {
        this.f56228a = callback;
        this.f56229b = NetworkRequestMetricBuilder.builder(transportManager);
        this.f56231d = j;
        this.f56230c = timer;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.f56229b.setUrl(url.url().toString());
            }
            if (request.method() != null) {
                this.f56229b.setHttpMethod(request.method());
            }
        }
        this.f56229b.setRequestStartTimeMicros(this.f56231d);
        this.f56229b.setTimeToResponseCompletedMicros(this.f56230c.getDurationMicros());
        NetworkRequestMetricBuilderUtil.logError(this.f56229b);
        this.f56228a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        FirebasePerfOkHttpClient.m38217a(response, this.f56229b, this.f56231d, this.f56230c.getDurationMicros());
        this.f56228a.onResponse(call, response);
    }
}
