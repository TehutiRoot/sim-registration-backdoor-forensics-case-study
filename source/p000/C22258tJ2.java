package p000;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: tJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22258tJ2 implements OnTokenCanceledListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f80073a;

    public C22258tJ2(TaskCompletionSource taskCompletionSource) {
        this.f80073a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        C23121yK2 c23121yK2;
        c23121yK2 = this.f80073a.f48590a;
        c23121yK2.m285c();
    }
}
