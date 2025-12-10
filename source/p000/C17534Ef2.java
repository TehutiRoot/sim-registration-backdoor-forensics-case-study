package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import com.google.android.gms.common.internal.GmsLogger;
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
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager;
import com.google.mlkit.common.sdkinternal.model.zzb;

/* renamed from: Ef2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17534Ef2 extends BroadcastReceiver {

    /* renamed from: a */
    public final long f1351a;

    /* renamed from: b */
    public final TaskCompletionSource f1352b;

    /* renamed from: c */
    public final /* synthetic */ RemoteModelDownloadManager f1353c;

    public /* synthetic */ C17534Ef2(RemoteModelDownloadManager remoteModelDownloadManager, long j, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.f1353c = remoteModelDownloadManager;
        this.f1351a = j;
        this.f1352b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        GmsLogger gmsLogger;
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        zzsh zzshVar;
        RemoteModel remoteModel;
        zzsh zzshVar2;
        RemoteModel remoteModel2;
        RemoteModel remoteModel3;
        zzsh zzshVar3;
        RemoteModel remoteModel4;
        MlKitException m37210k;
        MlKitContext mlKitContext;
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.f1351a) {
            return;
        }
        RemoteModelDownloadManager remoteModelDownloadManager = this.f1353c;
        Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                mlKitContext = this.f1353c.f56963c;
                mlKitContext.getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                gmsLogger = RemoteModelDownloadManager.f56959m;
                gmsLogger.m48399w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
            }
            longSparseArray = this.f1353c.f56961a;
            longSparseArray.remove(this.f1351a);
            longSparseArray2 = this.f1353c.f56962b;
            longSparseArray2.remove(this.f1351a);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                RemoteModelDownloadManager remoteModelDownloadManager2 = this.f1353c;
                zzshVar3 = remoteModelDownloadManager2.f56967g;
                zzry zzg = zzsk.zzg();
                remoteModel4 = remoteModelDownloadManager2.f56965e;
                Long valueOf = Long.valueOf(longExtra);
                zzshVar3.zze(zzg, remoteModel4, false, remoteModelDownloadManager2.getFailureReason(valueOf));
                TaskCompletionSource taskCompletionSource = this.f1352b;
                m37210k = this.f1353c.m37210k(valueOf);
                taskCompletionSource.setException(m37210k);
                return;
            } else if (downloadingModelStatusCode.intValue() == 8) {
                RemoteModelDownloadManager remoteModelDownloadManager3 = this.f1353c;
                zzshVar2 = remoteModelDownloadManager3.f56967g;
                zzry zzg2 = zzsk.zzg();
                remoteModel2 = remoteModelDownloadManager3.f56965e;
                zzsi zzh = zzsj.zzh();
                zzh.zzb(zzmu.NO_ERROR);
                zzh.zze(true);
                remoteModel3 = this.f1353c.f56965e;
                zzh.zzd(remoteModel3.getModelType());
                zzh.zza(zzna.SUCCEEDED);
                zzshVar2.zzg(zzg2, remoteModel2, zzh.zzh());
                this.f1352b.setResult(null);
                return;
            }
        }
        RemoteModelDownloadManager remoteModelDownloadManager4 = this.f1353c;
        zzshVar = remoteModelDownloadManager4.f56967g;
        zzry zzg3 = zzsk.zzg();
        remoteModel = remoteModelDownloadManager4.f56965e;
        zzshVar.zze(zzg3, remoteModel, false, 0);
        this.f1352b.setException(new MlKitException("Model downloading failed", 13));
    }
}
