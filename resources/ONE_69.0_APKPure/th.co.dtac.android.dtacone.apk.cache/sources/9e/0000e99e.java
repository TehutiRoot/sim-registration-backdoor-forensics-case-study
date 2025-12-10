package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: li2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21001li2 implements NJ2 {

    /* renamed from: a */
    public final Executor f71783a;

    /* renamed from: b */
    public final Continuation f71784b;

    /* renamed from: c */
    public final C22675vL2 f71785c;

    public C21001li2(Executor executor, Continuation continuation, C22675vL2 c22675vL2) {
        this.f71783a = executor;
        this.f71784b = continuation;
        this.f71785c = c22675vL2;
    }

    @Override // p000.NJ2
    /* renamed from: a */
    public final void mo23918a(Task task) {
        this.f71783a.execute(new RunnableC21514og2(this, task));
    }

    @Override // p000.NJ2
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}