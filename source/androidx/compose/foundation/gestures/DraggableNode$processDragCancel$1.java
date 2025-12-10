package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.DraggableNode", m28800f = "Draggable.kt", m28799i = {0, 0}, m28798l = {451, 454}, m28797m = "processDragCancel", m28796n = {"this", "$this$processDragCancel"}, m28795s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DraggableNode$processDragCancel$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$processDragCancel$1(DraggableNode draggableNode, Continuation<? super DraggableNode$processDragCancel$1> continuation) {
        super(continuation);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61494d;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61494d = this.this$0.m61494d(null, this);
        return m61494d;
    }
}
