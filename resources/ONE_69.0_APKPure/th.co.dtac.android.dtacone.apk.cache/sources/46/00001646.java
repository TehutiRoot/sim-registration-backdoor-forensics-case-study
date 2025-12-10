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

/* renamed from: XK2 */
/* loaded from: classes3.dex */
public final class XK2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map f7528a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7529b;

    /* renamed from: c */
    public final /* synthetic */ String f7530c;

    /* renamed from: d */
    public final /* synthetic */ long f7531d;

    /* renamed from: e */
    public final /* synthetic */ boolean f7532e;

    /* renamed from: f */
    public final /* synthetic */ boolean f7533f;

    /* renamed from: g */
    public final /* synthetic */ String f7534g;

    /* renamed from: h */
    public final /* synthetic */ Tracker f7535h;

    public XK2(Tracker tracker, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f7535h = tracker;
        this.f7528a = map;
        this.f7529b = z;
        this.f7530c = str;
        this.f7531d = j;
        this.f7532e = z2;
        this.f7533f = z3;
        this.f7534g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20945lL2 c20945lL2;
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
        c20945lL2 = this.f7535h.f44403e;
        if (c20945lL2.zzf()) {
            this.f7528a.put(OperatorName.NON_STROKING_COLOR, "start");
        }
        Map map = this.f7528a;
        GoogleAnalytics zzp = this.f7535h.zzp();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        String zzb = zzp.m48738a().zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str2 = (String) this.f7528a.get("sf");
        if (str2 != null) {
            try {
                d = Double.parseDouble(str2);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (zzfu.zzj(d, (String) this.f7528a.get("cid"))) {
                this.f7535h.zzF("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        Tracker tracker = this.f7535h;
        boolean z = this.f7529b;
        zzr = tracker.zzr();
        if (z) {
            Map map2 = this.f7528a;
            boolean zzb2 = zzr.zzb();
            if (!map2.containsKey("ate")) {
                if (true == zzb2) {
                    str = "1";
                } else {
                    str = "0";
                }
                map2.put("ate", str);
            }
            zzfu.zzg(this.f7528a, "adid", zzr.zza());
        } else {
            this.f7528a.remove("ate");
            this.f7528a.remove("adid");
        }
        zzu = this.f7535h.zzu();
        zzax zza = zzu.zza();
        zzfu.zzg(this.f7528a, "an", zza.zzf());
        zzfu.zzg(this.f7528a, "av", zza.zzg());
        zzfu.zzg(this.f7528a, "aid", zza.zzd());
        zzfu.zzg(this.f7528a, "aiid", zza.zze());
        this.f7528a.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "1");
        this.f7528a.put("_v", zzbv.zzb);
        Map map3 = this.f7528a;
        zzx = this.f7535h.zzx();
        zzfu.zzg(map3, "ul", zzx.zza().zzd());
        Map map4 = this.f7528a;
        zzx2 = this.f7535h.zzx();
        zzfu.zzg(map4, "sr", zzx2.zzb());
        if (!this.f7530c.equals("transaction") && !this.f7530c.equals("item")) {
            zzfbVar = this.f7535h.f44402d;
            if (!zzfbVar.zza()) {
                Tracker tracker2 = this.f7535h;
                Map map5 = this.f7528a;
                zzz2 = tracker2.zzz();
                zzz2.zzc(map5, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        long zza2 = zzfu.zza((String) this.f7528a.get("ht"));
        if (zza2 == 0) {
            zza2 = this.f7531d;
        }
        long j = zza2;
        if (this.f7532e) {
            zzez zzezVar = new zzez(this.f7535h, this.f7528a, j, this.f7533f);
            zzz = this.f7535h.zzz();
            zzz.zzM("Dry run enabled. Would have sent hit", zzezVar);
            return;
        }
        String str3 = (String) this.f7528a.get("cid");
        HashMap hashMap = new HashMap();
        zzfu.zzh(hashMap, "uid", this.f7528a);
        zzfu.zzh(hashMap, "an", this.f7528a);
        zzfu.zzh(hashMap, "aid", this.f7528a);
        zzfu.zzh(hashMap, "av", this.f7528a);
        zzfu.zzh(hashMap, "aiid", this.f7528a);
        Preconditions.checkNotNull(str3);
        zzbz zzbzVar = new zzbz(0L, str3, this.f7534g, !TextUtils.isEmpty((CharSequence) this.f7528a.get("adid")), 0L, hashMap);
        zzs = this.f7535h.zzs();
        this.f7528a.put("_s", String.valueOf(zzs.zza(zzbzVar)));
        zzez zzezVar2 = new zzez(this.f7535h, this.f7528a, j, this.f7533f);
        zzs2 = this.f7535h.zzs();
        zzs2.zzh(zzezVar2);
    }
}