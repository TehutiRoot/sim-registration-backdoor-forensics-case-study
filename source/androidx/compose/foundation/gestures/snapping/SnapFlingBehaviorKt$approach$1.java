package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m28800f = "SnapFlingBehavior.kt", m28799i = {0, 0}, m28798l = {312}, m28797m = "approach", m28796n = {"snapLayoutInfoProvider", "density"}, m28795s = {"L$0", "L$1"})
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
        Object m61442d;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61442d = SnapFlingBehaviorKt.m61442d(null, 0.0f, 0.0f, null, null, null, null, this);
        return m61442d;
    }
}
