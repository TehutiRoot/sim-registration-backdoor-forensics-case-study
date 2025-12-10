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

/* renamed from: uf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC22482uf2 implements OnCompleteListener, Runnable {

    /* renamed from: d */
    public static final Handler f107421d = new zzh(Looper.getMainLooper());

    /* renamed from: e */
    public static final SparseArray f107422e = new SparseArray(2);

    /* renamed from: f */
    public static final AtomicInteger f107423f = new AtomicInteger();

    /* renamed from: a */
    public int f107424a;

    /* renamed from: b */
    public zzd f107425b;

    /* renamed from: c */
    public Task f107426c;

    /* renamed from: a */
    public static RunnableC22482uf2 m1245a(Task task) {
        long j;
        RunnableC22482uf2 runnableC22482uf2 = new RunnableC22482uf2();
        int incrementAndGet = f107423f.incrementAndGet();
        runnableC22482uf2.f107424a = incrementAndGet;
        f107422e.put(incrementAndGet, runnableC22482uf2);
        Handler handler = f107421d;
        j = AutoResolveHelper.f48716a;
        handler.postDelayed(runnableC22482uf2, j);
        task.addOnCompleteListener(runnableC22482uf2);
        return runnableC22482uf2;
    }

    /* renamed from: b */
    public final void m1244b(zzd zzdVar) {
        if (this.f107425b == zzdVar) {
            this.f107425b = null;
        }
    }

    /* renamed from: c */
    public final void m1243c(zzd zzdVar) {
        this.f107425b = zzdVar;
        m1242d();
    }

    /* renamed from: d */
    public final void m1242d() {
        if (this.f107426c != null && this.f107425b != null) {
            f107422e.delete(this.f107424a);
            f107421d.removeCallbacks(this);
            zzd zzdVar = this.f107425b;
            if (zzdVar != null) {
                zzdVar.m45979b(this.f107426c);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f107426c = task;
        m1242d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f107422e.delete(this.f107424a);
    }
}
