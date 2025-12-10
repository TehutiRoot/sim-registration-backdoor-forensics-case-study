package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m28800f = "SnapFlingBehavior.kt", m28799i = {0, 0, 0, 0}, m28798l = {HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED}, m28797m = "animateSnap", m28796n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, m28795s = {"L$0", "L$1", "F$0", "F$1"})
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
        Object m61443c;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61443c = SnapFlingBehaviorKt.m61443c(null, 0.0f, 0.0f, null, null, null, this);
        return m61443c;
    }
}
