package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.ScrollableKt", m29092f = "Scrollable.kt", m29091i = {0}, m29090l = {371}, m29089m = "awaitScrollEvent", m29088n = {"$this$awaitScrollEvent"}, m29087s = {"L$0"})
/* loaded from: classes.dex */
public final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ScrollableKt$awaitScrollEvent$1(Continuation<? super ScrollableKt$awaitScrollEvent$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61431a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61431a = ScrollableKt.m61431a(null, this);
        return m61431a;
    }
}