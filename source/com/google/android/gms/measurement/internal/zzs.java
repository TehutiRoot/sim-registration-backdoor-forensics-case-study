package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class zzs {

    /* renamed from: a */
    public final zzfy f48485a;

    public zzs(zzfy zzfyVar) {
        this.f48485a = zzfyVar;
    }

    /* renamed from: a */
    public final void m46085a(String str, Bundle bundle) {
        String uri;
        this.f48485a.zzaz().zzg();
        if (!this.f48485a.zzJ()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.f48485a.zzm().f1417t.zzb(uri);
                this.f48485a.zzm().f1418u.zzb(this.f48485a.zzav().currentTimeMillis());
            }
        }
    }

    /* renamed from: b */
    public final void m46084b() {
        String str;
        this.f48485a.zzaz().zzg();
        if (!m46082d()) {
            return;
        }
        if (m46081e()) {
            this.f48485a.zzm().f1417t.zzb(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f48485a.zzq().m46259c(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
        } else {
            String zza = this.f48485a.zzm().f1417t.zza();
            if (TextUtils.isEmpty(zza)) {
                this.f48485a.zzay().zzh().zza("Cache still valid but referrer not found");
            } else {
                long zza2 = ((this.f48485a.zzm().f1418u.zza() / CoreConstants.MILLIS_IN_ONE_HOUR) - 1) * CoreConstants.MILLIS_IN_ONE_HOUR;
                Uri parse = Uri.parse(zza);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", zza2);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                this.f48485a.zzq().m46259c(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
            }
            this.f48485a.zzm().f1417t.zzb(null);
        }
        this.f48485a.zzm().f1418u.zzb(0L);
    }

    /* renamed from: c */
    public final void m46083c() {
        if (m46082d() && m46081e()) {
            this.f48485a.zzm().f1417t.zzb(null);
        }
    }

    /* renamed from: d */
    public final boolean m46082d() {
        if (this.f48485a.zzm().f1418u.zza() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m46081e() {
        if (!m46082d() || this.f48485a.zzav().currentTimeMillis() - this.f48485a.zzm().f1418u.zza() <= this.f48485a.zzf().zzi(null, zzeb.zzQ)) {
            return false;
        }
        return true;
    }
}
