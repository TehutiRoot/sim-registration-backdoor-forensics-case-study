package com.google.android.gms.internal.mlkit_vision_face;

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
public final class zzoe {

    /* renamed from: a */
    public final TelemetryLoggingClient f47224a;

    /* renamed from: b */
    public final AtomicLong f47225b = new AtomicLong(-1);

    public zzoe(Context context, String str) {
        this.f47224a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    public static zzoe zza(Context context) {
        return new zzoe(context, "mlkit:vision");
    }

    /* renamed from: a */
    public final /* synthetic */ void m46727a(long j, Exception exc) {
        this.f47225b.set(j);
    }

    public final synchronized void zzc(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f47225b.get() != -1 && elapsedRealtime - this.f47225b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f47224a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzod
            {
                zzoe.this = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzoe.this.m46727a(elapsedRealtime, exc);
            }
        });
    }
}
