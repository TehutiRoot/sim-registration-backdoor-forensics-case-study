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

/* renamed from: Kn2 */
/* loaded from: classes3.dex */
public final class Kn2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzbr f3277a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnection f3278b;

    /* renamed from: c */
    public final /* synthetic */ zzff f3279c;

    public Kn2(zzff zzffVar, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f3279c = zzffVar;
        this.f3277a = zzbrVar;
        this.f3278b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzff zzffVar = this.f3279c;
        zzfg zzfgVar = zzffVar.f48339b;
        str = zzffVar.f48338a;
        zzbr zzbrVar = this.f3277a;
        ServiceConnection serviceConnection = this.f3278b;
        zzfgVar.f48340a.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbrVar.zzd(bundle);
            if (zzd == null) {
                zzfgVar.f48340a.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e) {
            zzfgVar.f48340a.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfgVar.f48340a.zzaz().zzg();
        zzfy.m46273f();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzfgVar.f48340a.zzay().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzfgVar.f48340a.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle m46114P = zzfgVar.f48340a.zzv().m46114P(Uri.parse(CallerData.f39639NA.concat(string)));
                    if (m46114P == null) {
                        zzfgVar.f48340a.zzay().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m46114P.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzfgVar.f48340a.zzay().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m46114P.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfgVar.f48340a.zzm().f1402e.zza()) {
                            zzfgVar.f48340a.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfgVar.f48340a.zzJ()) {
                            zzfgVar.f48340a.zzm().f1402e.zzb(j);
                            zzfgVar.f48340a.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m46114P.putString("_cis", "referrer API v2");
                            zzfgVar.f48340a.zzq().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, m46114P, str);
                        }
                    }
                } else {
                    zzfgVar.f48340a.zzay().zzd().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfgVar.f48340a.zzau(), serviceConnection);
    }
}
