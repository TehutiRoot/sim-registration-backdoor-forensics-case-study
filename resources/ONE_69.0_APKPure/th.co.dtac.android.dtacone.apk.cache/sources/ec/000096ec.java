package com.google.android.gms.internal.mlkit_vision_barcode;

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
public final class zztz {

    /* renamed from: a */
    public final TelemetryLoggingClient f46742a;

    /* renamed from: b */
    public final AtomicLong f46743b = new AtomicLong(-1);

    public zztz(Context context, String str) {
        this.f46742a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    public static zztz zza(Context context) {
        return new zztz(context, "mlkit:vision");
    }

    /* renamed from: a */
    public final /* synthetic */ void m46989a(long j, Exception exc) {
        this.f46743b.set(j);
    }

    public final synchronized void zzc(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f46743b.get() != -1 && elapsedRealtime - this.f46743b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f46742a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzty
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zztz.this.m46989a(elapsedRealtime, exc);
            }
        });
    }
}