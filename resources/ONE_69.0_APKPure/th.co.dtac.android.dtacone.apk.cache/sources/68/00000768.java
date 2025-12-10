package p000;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzfg;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.firebase.messaging.Constants;
import kotlinx.coroutines.DebugKt;

/* renamed from: Ho2 */
/* loaded from: classes3.dex */
public final class Ho2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzbr f2482a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnection f2483b;

    /* renamed from: c */
    public final /* synthetic */ zzff f2484c;

    public Ho2(zzff zzffVar, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f2484c = zzffVar;
        this.f2482a = zzbrVar;
        this.f2483b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzff zzffVar = this.f2484c;
        zzfg zzfgVar = zzffVar.f48351b;
        str = zzffVar.f48350a;
        zzbr zzbrVar = this.f2482a;
        ServiceConnection serviceConnection = this.f2483b;
        zzfgVar.f48352a.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbrVar.zzd(bundle);
            if (zzd == null) {
                zzfgVar.f48352a.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e) {
            zzfgVar.f48352a.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfgVar.f48352a.zzaz().zzg();
        zzfy.m46258f();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzfgVar.f48352a.zzay().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzfgVar.f48352a.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle m46099P = zzfgVar.f48352a.zzv().m46099P(Uri.parse(CallerData.f39637NA.concat(string)));
                    if (m46099P == null) {
                        zzfgVar.f48352a.zzay().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m46099P.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzfgVar.f48352a.zzay().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m46099P.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfgVar.f48352a.zzm().f520e.zza()) {
                            zzfgVar.f48352a.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfgVar.f48352a.zzJ()) {
                            zzfgVar.f48352a.zzm().f520e.zzb(j);
                            zzfgVar.f48352a.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m46099P.putString("_cis", "referrer API v2");
                            zzfgVar.f48352a.zzq().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, m46099P, str);
                        }
                    }
                } else {
                    zzfgVar.f48352a.zzay().zzd().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfgVar.f48352a.zzau(), serviceConnection);
    }
}