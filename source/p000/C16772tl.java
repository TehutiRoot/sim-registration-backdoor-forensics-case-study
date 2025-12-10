package p000;

import java.util.concurrent.Future;
import kotlin.Unit;
import kotlinx.coroutines.JobNode;

/* renamed from: tl */
/* loaded from: classes6.dex */
public final class C16772tl extends JobNode {

    /* renamed from: d */
    public final Future f107186d;

    public C16772tl(Future future) {
        this.f107186d = future;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        if (th2 != null) {
            this.f107186d.cancel(false);
        }
    }
}
