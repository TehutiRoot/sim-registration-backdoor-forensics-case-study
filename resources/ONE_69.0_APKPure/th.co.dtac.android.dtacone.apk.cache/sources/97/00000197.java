package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager;
import com.google.mlkit.common.sdkinternal.model.zzb;

/* renamed from: Bg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17369Bg2 extends BroadcastReceiver {

    /* renamed from: a */
    public final long f461a;

    /* renamed from: b */
    public final TaskCompletionSource f462b;

    /* renamed from: c */
    public final /* synthetic */ RemoteModelDownloadManager f463c;

    public /* synthetic */ C17369Bg2(RemoteModelDownloadManager remoteModelDownloadManager, long j, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.f463c = remoteModelDownloadManager;
        this.f461a = j;
        this.f462b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.f461a) {
            return;
        }
        RemoteModelDownloadManager remoteModelDownloadManager = this.f463c;
        Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                RemoteModelDownloadManager.m37207f(this.f463c).getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                RemoteModelDownloadManager.m37210c().m48396w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
            }
            RemoteModelDownloadManager.m37212a(this.f463c).remove(this.f461a);
            RemoteModelDownloadManager.m37211b(this.f463c).remove(this.f461a);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                RemoteModelDownloadManager remoteModelDownloadManager2 = this.f463c;
                zzsh m37205h = RemoteModelDownloadManager.m37205h(remoteModelDownloadManager2);
                zzry zzg = zzsk.zzg();
                RemoteModel m37208e = RemoteModelDownloadManager.m37208e(remoteModelDownloadManager2);
                Long valueOf = Long.valueOf(longExtra);
                m37205h.zze(zzg, m37208e, false, remoteModelDownloadManager2.getFailureReason(valueOf));
                this.f462b.setException(RemoteModelDownloadManager.m37209d(this.f463c, valueOf));
                return;
            } else if (downloadingModelStatusCode.intValue() == 8) {
                RemoteModelDownloadManager remoteModelDownloadManager3 = this.f463c;
                zzsh m37205h2 = RemoteModelDownloadManager.m37205h(remoteModelDownloadManager3);
                zzry zzg2 = zzsk.zzg();
                RemoteModel m37208e2 = RemoteModelDownloadManager.m37208e(remoteModelDownloadManager3);
                zzsi zzh = zzsj.zzh();
                zzh.zzb(zzmu.NO_ERROR);
                zzh.zze(true);
                zzh.zzd(RemoteModelDownloadManager.m37208e(this.f463c).getModelType());
                zzh.zza(zzna.SUCCEEDED);
                m37205h2.zzg(zzg2, m37208e2, zzh.zzh());
                this.f462b.setResult(null);
                return;
            }
        }
        RemoteModelDownloadManager remoteModelDownloadManager4 = this.f463c;
        RemoteModelDownloadManager.m37205h(remoteModelDownloadManager4).zze(zzsk.zzg(), RemoteModelDownloadManager.m37208e(remoteModelDownloadManager4), false, 0);
        this.f462b.setException(new MlKitException("Model downloading failed", 13));
    }
}