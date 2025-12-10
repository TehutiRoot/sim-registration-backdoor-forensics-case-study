package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellingNode;

/* renamed from: og0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21451og0 extends JobCancellingNode {

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f72754e = AtomicIntegerFieldUpdater.newUpdater(C21451og0.class, "_invoked");
    @Volatile
    private volatile int _invoked;

    /* renamed from: d */
    public final Function1 f72755d;

    public C21451og0(Function1 function1) {
        this.f72755d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        if (f72754e.compareAndSet(this, 0, 1)) {
            this.f72755d.invoke(th2);
        }
    }
}
