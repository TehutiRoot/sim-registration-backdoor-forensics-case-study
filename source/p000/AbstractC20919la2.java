package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzc;

/* renamed from: la2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20919la2 extends zzc {

    /* renamed from: d */
    public final /* synthetic */ BaseGmsClient f71654d;
    public final int zza;
    @Nullable
    public final Bundle zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC20919la2(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f71654d = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.zza != 0) {
            this.f71654d.m48412n(1, null);
            Bundle bundle = this.zzb;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT);
            }
            zzb(new ConnectionResult(this.zza, pendingIntent));
        } else if (!zzd()) {
            this.f71654d.m48412n(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }

    public abstract void zzb(ConnectionResult connectionResult);

    public abstract boolean zzd();

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }
}
