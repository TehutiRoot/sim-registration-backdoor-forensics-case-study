package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.common.collect.ImmutableList;
import io.opencensus.contrib.http.util.HttpPropagationUtil;
import io.opencensus.trace.BlankSpan;
import io.opencensus.trace.EndSpanOptions;
import io.opencensus.trace.MessageEvent;
import io.opencensus.trace.Span;
import io.opencensus.trace.Status;
import io.opencensus.trace.Tracer;
import io.opencensus.trace.Tracing;
import io.opencensus.trace.propagation.TextFormat;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

@Beta
/* loaded from: classes4.dex */
public class OpenCensusUtils {

    /* renamed from: e */
    public static volatile TextFormat f52157e;

    /* renamed from: f */
    public static volatile TextFormat.Setter f52158f;

    /* renamed from: a */
    public static final Logger f52153a = Logger.getLogger(OpenCensusUtils.class.getName());
    public static final String SPAN_NAME_HTTP_REQUEST_EXECUTE = "Sent." + HttpRequest.class.getName() + ".execute";

    /* renamed from: b */
    public static final Tracer f52154b = Tracing.getTracer();

    /* renamed from: c */
    public static final AtomicLong f52155c = new AtomicLong();

    /* renamed from: d */
    public static volatile boolean f52156d = true;

    /* renamed from: com.google.api.client.http.OpenCensusUtils$a */
    /* loaded from: classes4.dex */
    public static class C7298a extends TextFormat.Setter {
        @Override // io.opencensus.trace.propagation.TextFormat.Setter
        /* renamed from: a */
        public void put(HttpHeaders httpHeaders, String str, String str2) {
            httpHeaders.set(str, (Object) str2);
        }
    }

    static {
        f52157e = null;
        f52158f = null;
        try {
            f52157e = HttpPropagationUtil.getCloudTraceFormat();
            f52158f = new C7298a();
        } catch (Exception e) {
            f52153a.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e);
        }
        try {
            Tracing.getExportComponent().getSampledSpanStore().registerSpanNamesForCollection(ImmutableList.m40997of(SPAN_NAME_HTTP_REQUEST_EXECUTE));
        } catch (Exception e2) {
            f52153a.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e2);
        }
    }

    /* renamed from: a */
    public static void m41748a(Span span, long j, MessageEvent.Type type) {
        boolean z;
        if (span != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "span should not be null.");
        if (j < 0) {
            j = 0;
        }
        span.addMessageEvent(MessageEvent.builder(type, f52155c.getAndIncrement()).setUncompressedMessageSize(j).build());
    }

    public static EndSpanOptions getEndSpanOptions(@Nullable Integer num) {
        EndSpanOptions.Builder builder = EndSpanOptions.builder();
        if (num == null) {
            builder.setStatus(Status.UNKNOWN);
        } else if (!HttpStatusCodes.isSuccess(num.intValue())) {
            int intValue = num.intValue();
            if (intValue != 400) {
                if (intValue != 401) {
                    if (intValue != 403) {
                        if (intValue != 404) {
                            if (intValue != 412) {
                                if (intValue != 500) {
                                    builder.setStatus(Status.UNKNOWN);
                                } else {
                                    builder.setStatus(Status.UNAVAILABLE);
                                }
                            } else {
                                builder.setStatus(Status.FAILED_PRECONDITION);
                            }
                        } else {
                            builder.setStatus(Status.NOT_FOUND);
                        }
                    } else {
                        builder.setStatus(Status.PERMISSION_DENIED);
                    }
                } else {
                    builder.setStatus(Status.UNAUTHENTICATED);
                }
            } else {
                builder.setStatus(Status.INVALID_ARGUMENT);
            }
        } else {
            builder.setStatus(Status.f63681OK);
        }
        return builder.build();
    }

    public static Tracer getTracer() {
        return f52154b;
    }

    public static boolean isRecordEvent() {
        return f52156d;
    }

    public static void propagateTracingContext(Span span, HttpHeaders httpHeaders) {
        boolean z;
        boolean z2 = false;
        if (span != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "span should not be null.");
        if (httpHeaders != null) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "headers should not be null.");
        if (f52157e != null && f52158f != null && !span.equals(BlankSpan.INSTANCE)) {
            f52157e.inject(span.getContext(), httpHeaders, f52158f);
        }
    }

    public static void recordReceivedMessageEvent(Span span, long j) {
        m41748a(span, j, MessageEvent.Type.RECEIVED);
    }

    public static void recordSentMessageEvent(Span span, long j) {
        m41748a(span, j, MessageEvent.Type.SENT);
    }

    public static void setIsRecordEvent(boolean z) {
        f52156d = z;
    }

    public static void setPropagationTextFormat(@Nullable TextFormat textFormat) {
        f52157e = textFormat;
    }

    public static void setPropagationTextFormatSetter(@Nullable TextFormat.Setter setter) {
        f52158f = setter;
    }
}
