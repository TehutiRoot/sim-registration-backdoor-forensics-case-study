package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: oh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21456oh2 implements QI2 {

    /* renamed from: a */
    public final Executor f72770a;

    /* renamed from: b */
    public final Continuation f72771b;

    /* renamed from: c */
    public final C23121yK2 f72772c;

    public C21456oh2(Executor executor, Continuation continuation, C23121yK2 c23121yK2) {
        this.f72770a = executor;
        this.f72771b = continuation;
        this.f72772c = c23121yK2;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        this.f72770a.execute(new RunnableC21966rf2(this, task));
    }

    @Override // p000.QI2
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
