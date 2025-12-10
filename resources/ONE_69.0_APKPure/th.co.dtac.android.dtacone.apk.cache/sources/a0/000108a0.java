package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.wallet.zzh;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.zzd;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC22033rg2 implements OnCompleteListener, Runnable {

    /* renamed from: d */
    public static final Handler f77588d = new zzh(Looper.getMainLooper());

    /* renamed from: e */
    public static final SparseArray f77589e = new SparseArray(2);

    /* renamed from: f */
    public static final AtomicInteger f77590f = new AtomicInteger();

    /* renamed from: a */
    public int f77591a;

    /* renamed from: b */
    public zzd f77592b;

    /* renamed from: c */
    public Task f77593c;

    /* renamed from: a */
    public static RunnableC22033rg2 m23470a(Task task) {
        long j;
        RunnableC22033rg2 runnableC22033rg2 = new RunnableC22033rg2();
        int incrementAndGet = f77590f.incrementAndGet();
        runnableC22033rg2.f77591a = incrementAndGet;
        f77589e.put(incrementAndGet, runnableC22033rg2);
        Handler handler = f77588d;
        j = AutoResolveHelper.f48728a;
        handler.postDelayed(runnableC22033rg2, j);
        task.addOnCompleteListener(runnableC22033rg2);
        return runnableC22033rg2;
    }

    /* renamed from: b */
    public final void m23469b(zzd zzdVar) {
        if (this.f77592b == zzdVar) {
            this.f77592b = null;
        }
    }

    /* renamed from: c */
    public final void m23468c(zzd zzdVar) {
        this.f77592b = zzdVar;
        m23467d();
    }

    /* renamed from: d */
    public final void m23467d() {
        if (this.f77593c != null && this.f77592b != null) {
            f77589e.delete(this.f77591a);
            f77588d.removeCallbacks(this);
            zzd zzdVar = this.f77592b;
            if (zzdVar != null) {
                zzdVar.m45964b(this.f77593c);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f77593c = task;
        m23467d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f77589e.delete(this.f77591a);
    }
}