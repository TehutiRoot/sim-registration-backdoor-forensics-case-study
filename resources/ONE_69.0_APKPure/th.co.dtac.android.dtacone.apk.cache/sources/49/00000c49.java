package p000;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobNode;

/* renamed from: My1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18126My1 extends JobNode {

    /* renamed from: d */
    public final Continuation f4027d;

    public C18126My1(Continuation continuation) {
        this.f4027d = continuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        Continuation continuation = this.f4027d;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m74271constructorimpl(Unit.INSTANCE));
    }
}