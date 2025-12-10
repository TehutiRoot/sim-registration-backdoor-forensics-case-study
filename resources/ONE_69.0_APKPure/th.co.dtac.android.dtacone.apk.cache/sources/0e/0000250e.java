package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m29092f = "SnapFlingBehavior.kt", m29091i = {0, 0}, m29090l = {312}, m29089m = "approach", m29088n = {"snapLayoutInfoProvider", "density"}, m29087s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$approach$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$approach$1(Continuation<? super SnapFlingBehaviorKt$approach$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61392d;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61392d = SnapFlingBehaviorKt.m61392d(null, 0.0f, 0.0f, null, null, null, null, this);
        return m61392d;
    }
}