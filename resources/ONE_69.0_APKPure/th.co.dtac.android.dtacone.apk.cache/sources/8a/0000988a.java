package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzlx implements Closeable {

    /* renamed from: h */
    public static final Map f47047h = new HashMap();

    /* renamed from: a */
    public final String f47048a;

    /* renamed from: b */
    public int f47049b;

    /* renamed from: c */
    public double f47050c;

    /* renamed from: d */
    public long f47051d;

    /* renamed from: e */
    public long f47052e;

    /* renamed from: f */
    public long f47053f;

    /* renamed from: g */
    public long f47054g;

    public zzlx(String str) {
        this.f47053f = 2147483647L;
        this.f47054g = -2147483648L;
        this.f47048a = str;
    }

    public static zzlx zze(String str) {
        C6566a c6566a;
        zzmw.zza();
        if (!zzmw.zzb()) {
            c6566a = C6566a.f46995i;
            return c6566a;
        }
        Map map = f47047h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    /* renamed from: b */
    public final void m46798b() {
        this.f47049b = 0;
        this.f47050c = 0.0d;
        this.f47051d = 0L;
        this.f47053f = 2147483647L;
        this.f47054g = -2147483648L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f47051d;
        if (j != 0) {
            zzd(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public zzlx zzb() {
        this.f47051d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f47052e;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            m46798b();
        }
        this.f47052e = elapsedRealtimeNanos;
        this.f47049b++;
        this.f47050c += j;
        this.f47053f = Math.min(this.f47053f, j);
        this.f47054g = Math.max(this.f47054g, j);
        if (this.f47049b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f47048a, Long.valueOf(j), Integer.valueOf(this.f47049b), Long.valueOf(this.f47053f), Long.valueOf(this.f47054g), Integer.valueOf((int) (this.f47050c / this.f47049b)));
            zzmw.zza();
        }
        if (this.f47049b % 500 == 0) {
            m46798b();
        }
    }

    public void zzd(long j) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}