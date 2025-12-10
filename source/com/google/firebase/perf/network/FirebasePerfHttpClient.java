package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes4.dex */
public class FirebasePerfHttpClient {
    /* renamed from: a */
    public static Object m38225a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpHost.toURI() + httpRequest.getRequestLine().getUri()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder));
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    /* renamed from: b */
    public static Object m38224b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpHost.toURI() + httpRequest.getRequestLine().getUri()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder), httpContext);
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    /* renamed from: c */
    public static Object m38223c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder));
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    /* renamed from: d */
    public static Object m38222d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder), httpContext);
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    /* renamed from: e */
    public static HttpResponse m38221e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpHost.toURI() + httpRequest.getRequestLine().getUri()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return m38219g(httpClient, httpUriRequest, new Timer(), TransportManager.getInstance());
    }

    /* renamed from: f */
    public static HttpResponse m38220f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpHost.toURI() + httpRequest.getRequestLine().getUri()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    /* renamed from: g */
    public static HttpResponse m38219g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    /* renamed from: h */
    public static HttpResponse m38218h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, TransportManager transportManager) {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return m38218h(httpClient, httpUriRequest, httpContext, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) m38223c(httpClient, httpUriRequest, responseHandler, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m38222d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return m38221e(httpClient, httpHost, httpRequest, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return m38220f(httpClient, httpHost, httpRequest, httpContext, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) m38225a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m38224b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), TransportManager.getInstance());
    }
}
