package p000;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskExecutors;

/* renamed from: Ee2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17558Ee2 extends CancellationToken {

    /* renamed from: a */
    public final C22675vL2 f1412a = new C22675vL2();

    /* renamed from: a */
    public final void m68616a() {
        this.f1412a.m915e(null);
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.f1412a.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener) {
        this.f1412a.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new C17611Fa2(this, onTokenCanceledListener));
        return this;
    }
}