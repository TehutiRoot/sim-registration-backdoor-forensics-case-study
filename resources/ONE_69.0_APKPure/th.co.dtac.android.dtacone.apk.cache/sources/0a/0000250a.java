package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m29092f = "SnapFlingBehavior.kt", m29091i = {0, 0, 0}, m29090l = {362}, m29089m = "animateDecay", m29088n = {"animationState", "previousValue", "targetOffset"}, m29087s = {"L$0", "L$1", "F$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateDecay$1(Continuation<? super SnapFlingBehaviorKt$animateDecay$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61395a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61395a = SnapFlingBehaviorKt.m61395a(null, 0.0f, null, null, null, this);
        return m61395a;
    }
}