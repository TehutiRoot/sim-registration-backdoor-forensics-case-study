package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class zao extends GoogleApi implements TelemetryLoggingClient {

    /* renamed from: j */
    public static final Api.ClientKey f45140j;

    /* renamed from: k */
    public static final Api.AbstractClientBuilder f45141k;

    /* renamed from: l */
    public static final Api f45142l;
    public static final /* synthetic */ int zab = 0;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f45140j = clientKey;
        C20852l92 c20852l92 = new C20852l92();
        f45141k = c20852l92;
        f45142l = new Api("ClientTelemetry.API", c20852l92, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, f45142l, telemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final Task<Void> log(final TelemetryData telemetryData) {
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(zaf.zaa);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Api.ClientKey clientKey = zao.f45140j;
                ((zai) ((zap) obj).getService()).zae(TelemetryData.this);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(builder.build());
    }
}
