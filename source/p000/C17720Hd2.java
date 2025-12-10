package p000;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskExecutors;

/* renamed from: Hd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17720Hd2 extends CancellationToken {

    /* renamed from: a */
    public final C23121yK2 f2276a = new C23121yK2();

    /* renamed from: a */
    public final void m68062a() {
        this.f2276a.m283e(null);
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.f2276a.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener) {
        this.f2276a.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new I92(this, onTokenCanceledListener));
        return this;
    }
}
