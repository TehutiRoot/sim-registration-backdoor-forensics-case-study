package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material3.SnapFlingBehavior", m28800f = "SnapFlingBehavior.kt", m28799i = {0}, m28798l = {154}, m28797m = "runApproach", m28796n = {"this"}, m28795s = {"L$0"})
/* loaded from: classes2.dex */
public final class SnapFlingBehavior$runApproach$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$runApproach$1(SnapFlingBehavior snapFlingBehavior, Continuation<? super SnapFlingBehavior$runApproach$1> continuation) {
        super(continuation);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60516p;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60516p = this.this$0.m60516p(null, 0.0f, 0.0f, this);
        return m60516p;
    }
}
