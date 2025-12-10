package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzef extends AbstractC19410cn2 {

    /* renamed from: b */
    public String f48281b;

    /* renamed from: c */
    public String f48282c;

    /* renamed from: d */
    public int f48283d;

    /* renamed from: e */
    public String f48284e;

    /* renamed from: f */
    public String f48285f;

    /* renamed from: g */
    public long f48286g;

    /* renamed from: h */
    public final long f48287h;

    /* renamed from: i */
    public List f48288i;

    /* renamed from: j */
    public String f48289j;

    /* renamed from: k */
    public int f48290k;

    /* renamed from: l */
    public String f48291l;

    /* renamed from: m */
    public String f48292m;

    /* renamed from: n */
    public String f48293n;

    /* renamed from: o */
    public long f48294o;

    /* renamed from: p */
    public String f48295p;

    public zzef(zzfy zzfyVar, long j) {
        super(zzfyVar);
        this.f48294o = 0L;
        this.f48295p = null;
        this.f48287h = j;
    }

    /* renamed from: b */
    public final int m46331b() {
        zza();
        return this.f48290k;
    }

    /* renamed from: c */
    public final int m46330c() {
        zza();
        return this.f48283d;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzq m46329d(java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.m46329d(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    /* renamed from: e */
    public final String m46328e() {
        zza();
        return this.f48292m;
    }

    /* renamed from: f */
    public final List m46327f() {
        return this.f48288i;
    }

    /* renamed from: g */
    public final void m46326g() {
        String format;
        String str;
        zzg();
        if (!this.zzs.zzm().m68455d().zzi(zzah.ANALYTICS_STORAGE)) {
            this.zzs.zzay().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            this.zzs.zzv().m46106f().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzem zzc = this.zzs.zzay().zzc();
        if (format == null) {
            str = AbstractJsonLexerKt.NULL;
        } else {
            str = "not null";
        }
        zzc.zza(String.format("Resetting session stitching token to %s", str));
        this.f48293n = format;
        this.f48294o = this.zzs.zzav().currentTimeMillis();
    }

    /* renamed from: h */
    public final boolean m46325h(String str) {
        String str2 = this.f48295p;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f48295p = str;
        return z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(20:72|(1:74)(1:81)|76|77|5|(1:64)(1:9)|10|11|13|(1:15)|16|17|(1:19)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)|46)|51)|(2:40|41)(2:43|44))|52|(0)(0)))|4|5|(1:7)|64|10|11|13|(0)|16|17|(0)|20|(0)|(0)|34|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bb, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01de, code lost:
        r11.zzs.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzeo.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194 A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:59:0x01bf, B:61:0x01d5, B:63:0x01da, B:62:0x01d8), top: B:90:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:59:0x01bf, B:61:0x01d5, B:63:0x01da, B:62:0x01d8), top: B:90:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    @Override // p000.AbstractC19410cn2
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.zzd():void");
    }

    @Override // p000.AbstractC19410cn2
    public final boolean zzf() {
        return true;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.f48281b);
        return this.f48281b;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.f48291l);
        return this.f48291l;
    }
}
