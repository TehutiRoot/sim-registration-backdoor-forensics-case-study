package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m28800f = "SnapFlingBehavior.kt", m28799i = {0, 0, 0}, m28798l = {362}, m28797m = "animateDecay", m28796n = {"animationState", "previousValue", "targetOffset"}, m28795s = {"L$0", "L$1", "F$0"})
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
        Object m61445a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61445a = SnapFlingBehaviorKt.m61445a(null, 0.0f, null, null, null, this);
        return m61445a;
    }
}
