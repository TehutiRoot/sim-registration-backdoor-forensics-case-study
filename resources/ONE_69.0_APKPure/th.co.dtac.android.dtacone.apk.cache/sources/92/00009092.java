package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzsg {

    /* renamed from: c */
    public static final GmsLogger f46033c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f46034a = new LinkedList();

    /* renamed from: b */
    public long f46035b = -1;

    public final void zzb(zzsn zzsnVar) {
        if (zzsnVar.zzbuo.getBitmap() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f46034a.add(Long.valueOf(elapsedRealtime));
        if (this.f46034a.size() > 5) {
            this.f46034a.removeFirst();
        }
        if (this.f46034a.size() == 5 && elapsedRealtime - ((Long) this.f46034a.peekFirst()).longValue() < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
            long j = this.f46035b;
            if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                this.f46035b = elapsedRealtime;
                f46033c.m48397w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}