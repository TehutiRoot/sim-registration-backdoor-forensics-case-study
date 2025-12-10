package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.clearcut.zzaa;
import com.google.android.gms.internal.clearcut.zzge;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzp;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;
import javax.annotation.Nullable;

@KeepForSdk
/* loaded from: classes3.dex */
public final class ClearcutLogger {
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API;

    /* renamed from: n */
    public static final Api.ClientKey f44556n;

    /* renamed from: o */
    public static final Api.AbstractClientBuilder f44557o;

    /* renamed from: p */
    public static final ExperimentTokens[] f44558p;

    /* renamed from: q */
    public static final String[] f44559q;

    /* renamed from: r */
    public static final byte[][] f44560r;

    /* renamed from: a */
    public final Context f44561a;

    /* renamed from: b */
    public final String f44562b;

    /* renamed from: c */
    public final int f44563c;

    /* renamed from: d */
    public String f44564d;

    /* renamed from: e */
    public int f44565e;

    /* renamed from: f */
    public String f44566f;

    /* renamed from: g */
    public String f44567g;

    /* renamed from: h */
    public final boolean f44568h;

    /* renamed from: i */
    public zzge.zzv.zzb f44569i;

    /* renamed from: j */
    public final com.google.android.gms.clearcut.zzb f44570j;

    /* renamed from: k */
    public final Clock f44571k;

    /* renamed from: l */
    public zzc f44572l;

    /* renamed from: m */
    public final zza f44573m;

    /* loaded from: classes3.dex */
    public class LogEventBuilder {

        /* renamed from: a */
        public int f44574a;

        /* renamed from: b */
        public String f44575b;

        /* renamed from: c */
        public String f44576c;

        /* renamed from: d */
        public String f44577d;

        /* renamed from: e */
        public zzge.zzv.zzb f44578e;

        /* renamed from: f */
        public final zzb f44579f;

        /* renamed from: g */
        public ArrayList f44580g;

        /* renamed from: h */
        public ArrayList f44581h;

        /* renamed from: i */
        public ArrayList f44582i;

        /* renamed from: j */
        public ArrayList f44583j;

        /* renamed from: k */
        public ArrayList f44584k;

        /* renamed from: l */
        public boolean f44585l;

        /* renamed from: m */
        public final zzha f44586m;

        /* renamed from: n */
        public boolean f44587n;

        public LogEventBuilder(ClearcutLogger clearcutLogger, byte[] bArr) {
            this(bArr, (zzb) null);
        }

        @KeepForSdk
        public void log() {
            if (this.f44587n) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f44587n = true;
            zze zzeVar = new zze(new zzr(ClearcutLogger.this.f44562b, ClearcutLogger.this.f44563c, this.f44574a, this.f44575b, this.f44576c, this.f44577d, ClearcutLogger.this.f44568h, this.f44578e), this.f44586m, null, null, ClearcutLogger.m48696c(null), null, ClearcutLogger.m48696c(null), null, null, this.f44585l);
            if (ClearcutLogger.this.f44573m.zza(zzeVar)) {
                ClearcutLogger.this.f44570j.zzb(zzeVar);
            } else {
                PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, (GoogleApiClient) null);
            }
        }

        @KeepForSdk
        public LogEventBuilder setEventCode(int i) {
            this.f44586m.zzbji = i;
            return this;
        }

        public LogEventBuilder(byte[] bArr, zzb zzbVar) {
            this.f44574a = ClearcutLogger.this.f44565e;
            this.f44575b = ClearcutLogger.this.f44564d;
            this.f44576c = ClearcutLogger.this.f44566f;
            this.f44577d = null;
            this.f44578e = ClearcutLogger.this.f44569i;
            this.f44580g = null;
            this.f44581h = null;
            this.f44582i = null;
            this.f44583j = null;
            this.f44584k = null;
            this.f44585l = true;
            zzha zzhaVar = new zzha();
            this.f44586m = zzhaVar;
            this.f44587n = false;
            this.f44576c = ClearcutLogger.this.f44566f;
            this.f44577d = null;
            zzhaVar.zzbkc = zzaa.zze(ClearcutLogger.this.f44561a);
            zzhaVar.zzbjf = ClearcutLogger.this.f44571k.currentTimeMillis();
            zzhaVar.zzbjg = ClearcutLogger.this.f44571k.elapsedRealtime();
            zzc unused = ClearcutLogger.this.f44572l;
            zzhaVar.zzbju = TimeZone.getDefault().getOffset(zzhaVar.zzbjf) / 1000;
            if (bArr != null) {
                zzhaVar.zzbjp = bArr;
            }
            this.f44579f = null;
        }

        public /* synthetic */ LogEventBuilder(ClearcutLogger clearcutLogger, byte[] bArr, Z92 z92) {
            this(clearcutLogger, bArr);
        }
    }

    /* loaded from: classes3.dex */
    public interface zza {
        boolean zza(zze zzeVar);
    }

    /* loaded from: classes3.dex */
    public interface zzb {
        byte[] zza();
    }

    /* loaded from: classes3.dex */
    public static class zzc {
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44556n = clientKey;
        Z92 z92 = new Z92();
        f44557o = z92;
        API = new Api<>("ClearcutLogger.API", z92, clientKey);
        f44558p = new ExperimentTokens[0];
        f44559q = new String[0];
        f44560r = new byte[0];
    }

    public ClearcutLogger(Context context, int i, String str, String str2, String str3, boolean z, com.google.android.gms.clearcut.zzb zzbVar, Clock clock, zzc zzcVar, zza zzaVar) {
        this.f44565e = -1;
        zzge.zzv.zzb zzbVar2 = zzge.zzv.zzb.DEFAULT;
        this.f44569i = zzbVar2;
        this.f44561a = context;
        this.f44562b = context.getPackageName();
        this.f44563c = m48698a(context);
        this.f44565e = -1;
        this.f44564d = str;
        this.f44566f = str2;
        this.f44567g = null;
        this.f44568h = z;
        this.f44570j = zzbVar;
        this.f44571k = clock;
        this.f44572l = new zzc();
        this.f44569i = zzbVar2;
        this.f44573m = zzaVar;
        if (z) {
            Preconditions.checkArgument(str2 == null, "can't be anonymous with an upload account");
        }
    }

    /* renamed from: a */
    public static int m48698a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @KeepForSdk
    public static ClearcutLogger anonymousLogger(Context context, String str) {
        return new ClearcutLogger(context, -1, str, null, null, true, com.google.android.gms.internal.clearcut.zze.zzb(context), DefaultClock.getInstance(), null, new zzp(context));
    }

    /* renamed from: c */
    public static int[] m48696c(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iArr[i2] = ((Integer) obj).intValue();
            i2++;
        }
        return iArr;
    }

    @KeepForSdk
    public final LogEventBuilder newEvent(@Nullable byte[] bArr) {
        return new LogEventBuilder(this, bArr, (Z92) null);
    }

    @KeepForSdk
    public ClearcutLogger(Context context, String str, @Nullable String str2) {
        this(context, -1, str, str2, null, false, com.google.android.gms.internal.clearcut.zze.zzb(context), DefaultClock.getInstance(), null, new zzp(context));
    }
}
