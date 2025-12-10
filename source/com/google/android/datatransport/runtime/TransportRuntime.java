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
public class TransportRuntime implements InterfaceC22456uV1 {

    /* renamed from: e */
    public static volatile AbstractC6282f f44031e;

    /* renamed from: a */
    public final Clock f44032a;

    /* renamed from: b */
    public final Clock f44033b;

    /* renamed from: c */
    public final Scheduler f44034c;

    /* renamed from: d */
    public final Uploader f44035d;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f44032a = clock;
        this.f44033b = clock2;
        this.f44034c = scheduler;
        this.f44035d = uploader;
        workInitializer.ensureContextsScheduled();
    }

    /* renamed from: b */
    public static Set m49140b(Destination destination) {
        if (destination instanceof EncodedDestination) {
            return Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings());
        }
        return Collections.singleton(Encoding.m49169of("proto"));
    }

    public static TransportRuntime getInstance() {
        AbstractC6282f abstractC6282f = f44031e;
        if (abstractC6282f != null) {
            return abstractC6282f.mo49121d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f44031e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f44031e == null) {
                        f44031e = AbstractC6277d.m49130a().mo49120a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final EventInternal m49141a(SendRequest sendRequest) {
        EventInternal.Builder code = EventInternal.builder().setEventMillis(this.f44032a.getTime()).setUptimeMillis(this.f44033b.getTime()).setTransportName(sendRequest.mo49135g()).setEncodedPayload(new EncodedPayload(sendRequest.mo49139b(), sendRequest.m49142d())).setCode(sendRequest.mo49138c().getCode());
        if (sendRequest.mo49138c().getProductData() != null && sendRequest.mo49138c().getProductData().getProductId() != null) {
            code.setProductId(sendRequest.mo49138c().getProductData().getProductId());
        }
        if (sendRequest.mo49138c().getEventContext() != null) {
            EventContext eventContext = sendRequest.mo49138c().getEventContext();
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
        return this.f44035d;
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new C22112sV1(m49140b(null), TransportContext.builder().setBackendName(str).build(), this);
    }

    @Override // p000.InterfaceC22456uV1
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f44034c.schedule(sendRequest.mo49136f().withPriority(sendRequest.mo49138c().getPriority()), m49141a(sendRequest), transportScheduleCallback);
    }

    public TransportFactory newFactory(Destination destination) {
        return new C22112sV1(m49140b(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }
}
