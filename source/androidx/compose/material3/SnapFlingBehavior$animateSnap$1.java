package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material3.SnapFlingBehavior", m28800f = "SnapFlingBehavior.kt", m28799i = {0, 0, 0, 0, 0}, m28798l = {299}, m28797m = "animateSnap", m28796n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, m28795s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
/* loaded from: classes2.dex */
public final class SnapFlingBehavior$animateSnap$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateSnap$1(SnapFlingBehavior snapFlingBehavior, Continuation<? super SnapFlingBehavior$animateSnap$1> continuation) {
        super(continuation);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60529c;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60529c = this.this$0.m60529c(null, 0.0f, 0.0f, null, null, this);
        return m60529c;
    }
}
