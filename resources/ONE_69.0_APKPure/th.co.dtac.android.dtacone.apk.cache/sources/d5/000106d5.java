package p000;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: qK2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21807qK2 implements OnTokenCanceledListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f77168a;

    public C21807qK2(TaskCompletionSource taskCompletionSource) {
        this.f77168a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        C22675vL2 c22675vL2;
        c22675vL2 = this.f77168a.f48602a;
        c22675vL2.m917c();
    }
}