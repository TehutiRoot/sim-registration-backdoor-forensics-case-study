package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: zm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23363zm2 extends BroadcastReceiver {

    /* renamed from: a */
    public final zzkz f109187a;

    /* renamed from: b */
    public boolean f109188b;

    /* renamed from: c */
    public boolean f109189c;

    public C23363zm2(zzkz zzkzVar) {
        Preconditions.checkNotNull(zzkzVar);
        this.f109187a = zzkzVar;
    }

    /* renamed from: b */
    public final void m36b() {
        this.f109187a.m46185b();
        this.f109187a.zzaz().zzg();
        if (this.f109188b) {
            return;
        }
        this.f109187a.zzau().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f109189c = this.f109187a.zzl().zza();
        this.f109187a.zzay().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f109189c));
        this.f109188b = true;
    }

    /* renamed from: c */
    public final void m35c() {
        this.f109187a.m46185b();
        this.f109187a.zzaz().zzg();
        this.f109187a.zzaz().zzg();
        if (this.f109188b) {
            this.f109187a.zzay().zzj().zza("Unregistering connectivity change receiver");
            this.f109188b = false;
            this.f109189c = false;
            try {
                this.f109187a.zzau().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f109187a.zzay().zzd().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f109187a.m46185b();
        String action = intent.getAction();
        this.f109187a.zzay().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zza = this.f109187a.zzl().zza();
            if (this.f109189c != zza) {
                this.f109189c = zza;
                this.f109187a.zzaz().zzp(new RunnableC22675vm2(this, zza));
                return;
            }
            return;
        }
        this.f109187a.zzay().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
    }
}
