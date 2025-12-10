package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfe extends BroadcastReceiver {
    @VisibleForTesting
    static final String zza = "com.google.android.gms.internal.gtm.zzfe";
    private final zzbx zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfe(zzbx zzbxVar) {
        Preconditions.checkNotNull(zzbxVar);
        this.zzb = zzbxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzm();
        this.zzb.zzf();
        String action = intent.getAction();
        this.zzb.zzm().zzO("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zze = zze();
            if (this.zzd != zze) {
                this.zzd = zze;
                zzbs zzf = this.zzb.zzf();
                zzf.zzO("Network connectivity status changed", Boolean.valueOf(zze));
                zzf.zzq().zzi(new zzbl(zzf, zze));
            }
        } else if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(zza)) {
                zzbs zzf2 = this.zzb.zzf();
                zzf2.zzN("Radio powered up");
                zzf2.zzc();
            }
        } else {
            this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", action);
        }
    }

    public final void zza() {
        this.zzb.zzm();
        this.zzb.zzf();
        if (this.zzc) {
            return;
        }
        Context zza2 = this.zzb.zza();
        ContextCompat.registerReceiver(zza2, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(zza2.getPackageName());
        ContextCompat.registerReceiver(zza2, this, intentFilter, 4);
        this.zzd = zze();
        this.zzb.zzm().zzO("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    @VisibleForTesting
    public final void zzb() {
        Context zza2 = this.zzb.zza();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(zza2.getPackageName());
        intent.putExtra(zza, true);
        zza2.sendOrderedBroadcast(intent, null);
    }

    public final void zzc() {
        if (!this.zzc) {
            return;
        }
        this.zzb.zzm().zzN("Unregistering connectivity change receiver");
        this.zzc = false;
        this.zzd = false;
        try {
            this.zzb.zza().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            this.zzb.zzm().zzJ("Failed to unregister the network broadcast receiver", e);
        }
    }

    public final boolean zzd() {
        if (!this.zzc) {
            this.zzb.zzm().zzQ("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    @VisibleForTesting
    public final boolean zze() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.zza().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }
}
