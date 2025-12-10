package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m29092f = "SnapFlingBehavior.kt", m29091i = {0, 0, 0, 0}, m29090l = {HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED}, m29089m = "animateSnap", m29088n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, m29087s = {"L$0", "L$1", "F$0", "F$1"})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateSnap$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateSnap$1(Continuation<? super SnapFlingBehaviorKt$animateSnap$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61393c;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61393c = SnapFlingBehaviorKt.m61393c(null, 0.0f, 0.0f, null, null, null, this);
        return m61393c;
    }
}