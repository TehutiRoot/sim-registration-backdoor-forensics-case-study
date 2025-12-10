package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1502:1\n70#2:1503\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n236#1:1503\n*E\n"})
/* loaded from: classes2.dex */
public final class Recomposer$effectJob$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th2) {
        Job job;
        CancellableContinuation cancellableContinuation;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        boolean z;
        CancellableContinuation cancellableContinuation2;
        CancellableContinuation cancellableContinuation3;
        CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th2);
        Object obj = this.this$0.f28476c;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                job = recomposer.f28477d;
                cancellableContinuation = null;
                if (job != null) {
                    mutableStateFlow2 = recomposer.f28493t;
                    mutableStateFlow2.setValue(Recomposer.State.ShuttingDown);
                    z = recomposer.f28490q;
                    if (z) {
                        cancellableContinuation2 = recomposer.f28488o;
                        if (cancellableContinuation2 != null) {
                            cancellableContinuation3 = recomposer.f28488o;
                            recomposer.f28488o = null;
                            job.invokeOnCompletion(new Recomposer$effectJob$1$1$1$1(recomposer, th2));
                            cancellableContinuation = cancellableContinuation3;
                        }
                    } else {
                        job.cancel(CancellationException);
                    }
                    cancellableContinuation3 = null;
                    recomposer.f28488o = null;
                    job.invokeOnCompletion(new Recomposer$effectJob$1$1$1$1(recomposer, th2));
                    cancellableContinuation = cancellableContinuation3;
                } else {
                    recomposer.f28478e = CancellationException;
                    mutableStateFlow = recomposer.f28493t;
                    mutableStateFlow.setValue(Recomposer.State.ShutDown);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m74271constructorimpl(Unit.INSTANCE));
        }
    }
}