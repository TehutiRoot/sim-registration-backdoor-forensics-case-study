package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Collections;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public class TransportRuntime implements InterfaceC22006rW1 {

    /* renamed from: e */
    public static volatile AbstractC6271f f44043e;

    /* renamed from: a */
    public final Clock f44044a;

    /* renamed from: b */
    public final Clock f44045b;

    /* renamed from: c */
    public final Scheduler f44046c;

    /* renamed from: d */
    public final Uploader f44047d;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f44044a = clock;
        this.f44045b = clock2;
        this.f44046c = scheduler;
        this.f44047d = uploader;
        workInitializer.ensureContextsScheduled();
    }

    /* renamed from: b */
    public static Set m49137b(Destination destination) {
        if (destination instanceof EncodedDestination) {
            return Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings());
        }
        return Collections.singleton(Encoding.m49166of("proto"));
    }

    public static TransportRuntime getInstance() {
        AbstractC6271f abstractC6271f = f44043e;
        if (abstractC6271f != null) {
            return abstractC6271f.mo49118d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f44043e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f44043e == null) {
                        f44043e = AbstractC6266d.m49127a().mo49117a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final EventInternal m49138a(SendRequest sendRequest) {
        EventInternal.Builder code = EventInternal.builder().setEventMillis(this.f44044a.getTime()).setUptimeMillis(this.f44045b.getTime()).setTransportName(sendRequest.mo49132g()).setEncodedPayload(new EncodedPayload(sendRequest.mo49136b(), sendRequest.m49139d())).setCode(sendRequest.mo49135c().getCode());
        if (sendRequest.mo49135c().getProductData() != null && sendRequest.mo49135c().getProductData().getProductId() != null) {
            code.setProductId(sendRequest.mo49135c().getProductData().getProductId());
        }
        if (sendRequest.mo49135c().getEventContext() != null) {
            EventContext eventContext = sendRequest.mo49135c().getEventContext();
            if (eventContext.getPseudonymousId() != null) {
                code.setPseudonymousId(eventContext.getPseudonymousId());
            }
            if (eventContext.getExperimentIdsClear() != null) {
                code.setExperimentIdsClear(eventContext.getExperimentIdsClear());
            }
            if (eventContext.getExperimentIdsEncrypted() != null) {
                code.setExperimentIdsEncrypted(eventContext.getExperimentIdsEncrypted());
            }
        }
        return code.build();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Uploader getUploader() {
        return this.f44047d;
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new C21660pW1(m49137b(null), TransportContext.builder().setBackendName(str).build(), this);
    }

    @Override // p000.InterfaceC22006rW1
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f44046c.schedule(sendRequest.mo49133f().withPriority(sendRequest.mo49135c().getPriority()), m49138a(sendRequest), transportScheduleCallback);
    }

    public TransportFactory newFactory(Destination destination) {
        return new C21660pW1(m49137b(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }
}