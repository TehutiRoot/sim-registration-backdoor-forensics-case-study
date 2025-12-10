package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.zzx;

/* renamed from: DM2 */
/* loaded from: classes4.dex */
public final class DM2 extends BroadcastReceiver {

    /* renamed from: a */
    public final long f1002a;

    /* renamed from: b */
    public final TaskCompletionSource f1003b;

    /* renamed from: c */
    public final /* synthetic */ zzx f1004c;

    public DM2(zzx zzxVar, long j, TaskCompletionSource taskCompletionSource) {
        this.f1004c = zzxVar;
        this.f1002a = j;
        this.f1003b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.f1002a) {
            return;
        }
        Integer m38359p = this.f1004c.m38359p();
        synchronized (this.f1004c) {
            try {
                zzx.m38373b(this.f1004c).getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                zzx.m38354u().m48396w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
            }
            zzx.m38369f(this.f1004c).remove(this.f1002a);
            zzx.m38366i(this.f1004c).remove(this.f1002a);
        }
        if (m38359p != null) {
            if (m38359p.intValue() == 16) {
                zzx.m38364k(this.f1004c).zza(false, zzx.m38365j(this.f1004c), this.f1004c.m38374a(Long.valueOf(longExtra)));
                this.f1003b.setException(zzx.m38372c(this.f1004c, Long.valueOf(longExtra)));
                return;
            } else if (m38359p.intValue() == 8) {
                zzx.m38364k(this.f1004c).zza(zzoa.NO_ERROR, zzx.m38365j(this.f1004c), zznq.zzak.zzb.SUCCEEDED);
                this.f1003b.setResult(null);
                return;
            }
        }
        zzx.m38364k(this.f1004c).zza(false, zzx.m38365j(this.f1004c), 0);
        this.f1003b.setException(new FirebaseMLException("Model downloading failed", 13));
    }
}