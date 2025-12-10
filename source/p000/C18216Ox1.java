package p000;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupportKt;

/* renamed from: Ox1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18216Ox1 extends JobNode {

    /* renamed from: d */
    public final CancellableContinuationImpl f4593d;

    public C18216Ox1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f4593d = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f4593d;
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(((CompletedExceptionally) state$kotlinx_coroutines_core).cause)));
            return;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = this.f4593d;
        Result.Companion companion2 = Result.Companion;
        cancellableContinuationImpl2.resumeWith(Result.m74087constructorimpl(JobSupportKt.unboxState(state$kotlinx_coroutines_core)));
    }
}
