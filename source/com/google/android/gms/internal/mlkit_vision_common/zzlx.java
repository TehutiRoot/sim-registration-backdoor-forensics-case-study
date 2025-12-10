package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzlx implements Closeable {

    /* renamed from: h */
    public static final Map f47035h = new HashMap();

    /* renamed from: a */
    public final String f47036a;

    /* renamed from: b */
    public int f47037b;

    /* renamed from: c */
    public double f47038c;

    /* renamed from: d */
    public long f47039d;

    /* renamed from: e */
    public long f47040e;

    /* renamed from: f */
    public long f47041f;

    /* renamed from: g */
    public long f47042g;

    public zzlx(String str) {
        this.f47041f = 2147483647L;
        this.f47042g = -2147483648L;
        this.f47036a = str;
    }

    public static zzlx zze(String str) {
        C6577a c6577a;
        zzmw.zza();
        if (!zzmw.zzb()) {
            c6577a = C6577a.f46983i;
            return c6577a;
        }
        Map map = f47035h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    /* renamed from: b */
    public final void m46806b() {
        this.f47037b = 0;
        this.f47038c = 0.0d;
        this.f47039d = 0L;
        this.f47041f = 2147483647L;
        this.f47042g = -2147483648L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f47039d;
        if (j != 0) {
            zzd(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public zzlx zzb() {
        this.f47039d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f47040e;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            m46806b();
        }
        this.f47040e = elapsedRealtimeNanos;
        this.f47037b++;
        this.f47038c += j;
        this.f47041f = Math.min(this.f47041f, j);
        this.f47042g = Math.max(this.f47042g, j);
        if (this.f47037b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f47036a, Long.valueOf(j), Integer.valueOf(this.f47037b), Long.valueOf(this.f47041f), Long.valueOf(this.f47042g), Integer.valueOf((int) (this.f47038c / this.f47037b)));
            zzmw.zza();
        }
        if (this.f47037b % 500 == 0) {
            m46806b();
        }
    }

    public void zzd(long j) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
