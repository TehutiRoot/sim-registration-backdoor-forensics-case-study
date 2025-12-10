package p000;

import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzch;
import com.google.android.gms.internal.gtm.zzcz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfd;
import com.google.android.gms.internal.gtm.zzfu;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC18987aK2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map f8302a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8303b;

    /* renamed from: c */
    public final /* synthetic */ String f8304c;

    /* renamed from: d */
    public final /* synthetic */ long f8305d;

    /* renamed from: e */
    public final /* synthetic */ boolean f8306e;

    /* renamed from: f */
    public final /* synthetic */ boolean f8307f;

    /* renamed from: g */
    public final /* synthetic */ String f8308g;

    /* renamed from: h */
    public final /* synthetic */ Tracker f8309h;

    public RunnableC18987aK2(Tracker tracker, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f8309h = tracker;
        this.f8302a = map;
        this.f8303b = z;
        this.f8304c = str;
        this.f8305d = j;
        this.f8306e = z2;
        this.f8307f = z3;
        this.f8308g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21401oK2 c21401oK2;
        double d;
        zzbk zzr;
        zzch zzu;
        zzcz zzx;
        zzcz zzx2;
        zzbs zzs;
        zzbs zzs2;
        zzfd zzz;
        zzfb zzfbVar;
        zzfd zzz2;
        String str;
        c21401oK2 = this.f8309h.f44391e;
        if (c21401oK2.zzf()) {
            this.f8302a.put(OperatorName.NON_STROKING_COLOR, "start");
        }
        Map map = this.f8302a;
        GoogleAnalytics zzp = this.f8309h.zzp();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        String zzb = zzp.m48741a().zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str2 = (String) this.f8302a.get("sf");
        if (str2 != null) {
            try {
                d = Double.parseDouble(str2);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (zzfu.zzj(d, (String) this.f8302a.get("cid"))) {
                this.f8309h.zzF("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        Tracker tracker = this.f8309h;
        boolean z = this.f8303b;
        zzr = tracker.zzr();
        if (z) {
            Map map2 = this.f8302a;
            boolean zzb2 = zzr.zzb();
            if (!map2.containsKey("ate")) {
                if (true == zzb2) {
                    str = "1";
                } else {
                    str = "0";
                }
                map2.put("ate", str);
            }
            zzfu.zzg(this.f8302a, "adid", zzr.zza());
        } else {
            this.f8302a.remove("ate");
            this.f8302a.remove("adid");
        }
        zzu = this.f8309h.zzu();
        zzax zza = zzu.zza();
        zzfu.zzg(this.f8302a, "an", zza.zzf());
        zzfu.zzg(this.f8302a, "av", zza.zzg());
        zzfu.zzg(this.f8302a, "aid", zza.zzd());
        zzfu.zzg(this.f8302a, "aiid", zza.zze());
        this.f8302a.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "1");
        this.f8302a.put("_v", zzbv.zzb);
        Map map3 = this.f8302a;
        zzx = this.f8309h.zzx();
        zzfu.zzg(map3, "ul", zzx.zza().zzd());
        Map map4 = this.f8302a;
        zzx2 = this.f8309h.zzx();
        zzfu.zzg(map4, "sr", zzx2.zzb());
        if (!this.f8304c.equals("transaction") && !this.f8304c.equals("item")) {
            zzfbVar = this.f8309h.f44390d;
            if (!zzfbVar.zza()) {
                Tracker tracker2 = this.f8309h;
                Map map5 = this.f8302a;
                zzz2 = tracker2.zzz();
                zzz2.zzc(map5, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        long zza2 = zzfu.zza((String) this.f8302a.get("ht"));
        if (zza2 == 0) {
            zza2 = this.f8305d;
        }
        long j = zza2;
        if (this.f8306e) {
            zzez zzezVar = new zzez(this.f8309h, this.f8302a, j, this.f8307f);
            zzz = this.f8309h.zzz();
            zzz.zzM("Dry run enabled. Would have sent hit", zzezVar);
            return;
        }
        String str3 = (String) this.f8302a.get("cid");
        HashMap hashMap = new HashMap();
        zzfu.zzh(hashMap, "uid", this.f8302a);
        zzfu.zzh(hashMap, "an", this.f8302a);
        zzfu.zzh(hashMap, "aid", this.f8302a);
        zzfu.zzh(hashMap, "av", this.f8302a);
        zzfu.zzh(hashMap, "aiid", this.f8302a);
        Preconditions.checkNotNull(str3);
        zzbz zzbzVar = new zzbz(0L, str3, this.f8308g, !TextUtils.isEmpty((CharSequence) this.f8302a.get("adid")), 0L, hashMap);
        zzs = this.f8309h.zzs();
        this.f8302a.put("_s", String.valueOf(zzs.zza(zzbzVar)));
        zzez zzezVar2 = new zzez(this.f8309h, this.f8302a, j, this.f8307f);
        zzs2 = this.f8309h.zzs();
        zzs2.zzh(zzezVar2);
    }
}
