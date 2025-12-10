package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import com.google.firebase.p015ml.common.internal.modeldownload.zzx;
import com.google.firebase.p015ml.common.internal.modeldownload.zzy;

/* renamed from: GL2 */
/* loaded from: classes4.dex */
public final class GL2 extends BroadcastReceiver {

    /* renamed from: a */
    public final long f1911a;

    /* renamed from: b */
    public final TaskCompletionSource f1912b;

    /* renamed from: c */
    public final /* synthetic */ zzx f1913c;

    public GL2(zzx zzxVar, long j, TaskCompletionSource taskCompletionSource) {
        this.f1913c = zzxVar;
        this.f1911a = j;
        this.f1912b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        GmsLogger gmsLogger;
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        zzy zzyVar;
        zzn m38363t;
        zzy zzyVar2;
        zzn m38363t2;
        zzy zzyVar3;
        zzn m38363t3;
        FirebaseMLException m38376g;
        zzqn zzqnVar;
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.f1911a) {
            return;
        }
        Integer m38367p = this.f1913c.m38367p();
        synchronized (this.f1913c) {
            try {
                zzqnVar = this.f1913c.f55785c;
                zzqnVar.getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                gmsLogger = zzx.f55781j;
                gmsLogger.m48399w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
            }
            longSparseArray = this.f1913c.f55783a;
            longSparseArray.remove(this.f1911a);
            longSparseArray2 = this.f1913c.f55784b;
            longSparseArray2.remove(this.f1911a);
        }
        if (m38367p != null) {
            if (m38367p.intValue() == 16) {
                zzyVar3 = this.f1913c.f55788f;
                m38363t3 = this.f1913c.m38363t();
                zzyVar3.zza(false, m38363t3, this.f1913c.m38382a(Long.valueOf(longExtra)));
                TaskCompletionSource taskCompletionSource = this.f1912b;
                m38376g = this.f1913c.m38376g(Long.valueOf(longExtra));
                taskCompletionSource.setException(m38376g);
                return;
            } else if (m38367p.intValue() == 8) {
                zzyVar2 = this.f1913c.f55788f;
                zzoa zzoaVar = zzoa.NO_ERROR;
                m38363t2 = this.f1913c.m38363t();
                zzyVar2.zza(zzoaVar, m38363t2, zznq.zzak.zzb.SUCCEEDED);
                this.f1912b.setResult(null);
                return;
            }
        }
        zzyVar = this.f1913c.f55788f;
        m38363t = this.f1913c.m38363t();
        zzyVar.zza(false, m38363t, 0);
        this.f1912b.setException(new FirebaseMLException("Model downloading failed", 13));
    }
}
