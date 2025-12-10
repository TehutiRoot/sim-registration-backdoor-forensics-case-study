package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzue {

    /* renamed from: a */
    public final TelemetryLoggingClient f47411a;

    /* renamed from: b */
    public final AtomicLong f47412b = new AtomicLong(-1);

    public zzue(Context context, String str) {
        this.f47411a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    public static zzue zza(Context context) {
        return new zzue(context, "mlkit:vision");
    }

    /* renamed from: a */
    public final /* synthetic */ void m46662a(long j, Exception exc) {
        this.f47412b.set(j);
    }

    public final synchronized void zzc(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = this.f47412b;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && elapsedRealtime - this.f47412b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f47411a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0, -1)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzud
            {
                zzue.this = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzue.this.m46662a(elapsedRealtime, exc);
            }
        });
    }
}
