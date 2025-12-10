package p000;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobNode;

/* renamed from: Px1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18280Px1 extends JobNode {

    /* renamed from: d */
    public final Continuation f4913d;

    public C18280Px1(Continuation continuation) {
        this.f4913d = continuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        Continuation continuation = this.f4913d;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
    }
}
