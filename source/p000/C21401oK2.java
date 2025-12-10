package p000;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzft;
import java.util.HashMap;

/* renamed from: oK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21401oK2 extends zzbu {

    /* renamed from: a */
    public boolean f72677a;

    /* renamed from: b */
    public int f72678b;

    /* renamed from: c */
    public long f72679c;

    /* renamed from: d */
    public boolean f72680d;

    /* renamed from: e */
    public long f72681e;

    /* renamed from: f */
    public final /* synthetic */ Tracker f72682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21401oK2(Tracker tracker, zzbx zzbxVar) {
        super(zzbxVar);
        this.f72682f = tracker;
        this.f72679c = -1L;
    }

    private final void zzg() {
        C21401oK2 c21401oK2;
        C21401oK2 c21401oK22;
        if (this.f72679c < 0 && !this.f72677a) {
            GoogleAnalytics zzp = zzp();
            c21401oK22 = this.f72682f.f44391e;
            zzp.m48760e(c21401oK22);
            return;
        }
        GoogleAnalytics zzp2 = zzp();
        c21401oK2 = this.f72682f.f44391e;
        zzp2.m48761d(c21401oK2);
    }

    /* renamed from: b */
    public final void m25933b(Activity activity) {
        zzft zzftVar;
        String canonicalName;
        zzft zzftVar2;
        if (this.f72678b == 0 && zzC().elapsedRealtime() >= this.f72681e + Math.max(1000L, this.f72679c)) {
            this.f72680d = true;
        }
        this.f72678b++;
        if (this.f72677a) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.f72682f.setCampaignParamsOnNextHit(intent.getData());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("&t", "screenview");
            Tracker tracker = this.f72682f;
            zzftVar = tracker.f44393g;
            if (zzftVar != null) {
                zzftVar2 = tracker.f44393g;
                canonicalName = activity.getClass().getCanonicalName();
                String str = (String) zzftVar2.zzg.get(canonicalName);
                if (str != null) {
                    canonicalName = str;
                }
            } else {
                canonicalName = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", canonicalName);
            if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                Preconditions.checkNotNull(activity);
                Intent intent2 = activity.getIntent();
                String str2 = null;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        str2 = stringExtra;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("&dr", str2);
                }
            }
            this.f72682f.send(hashMap);
        }
    }

    /* renamed from: d */
    public final void m25932d(Activity activity) {
        int i = this.f72678b - 1;
        this.f72678b = i;
        int max = Math.max(0, i);
        this.f72678b = max;
        if (max == 0) {
            this.f72681e = zzC().elapsedRealtime();
        }
    }

    /* renamed from: g */
    public final void m25931g(boolean z) {
        this.f72677a = z;
        zzg();
    }

    /* renamed from: i */
    public final void m25930i(long j) {
        this.f72679c = j;
        zzg();
    }

    public final synchronized boolean zzf() {
        boolean z;
        z = this.f72680d;
        this.f72680d = false;
        return z;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
    }
}
