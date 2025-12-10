package androidx.compose.foundation.gestures;

import com.mixpanel.android.java_websocket.WebSocket;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.DraggableNode", m29092f = "Draggable.kt", m29091i = {0, 0, 0}, m29090l = {WebSocket.DEFAULT_WSS_PORT, 446}, m29089m = "processDragStop", m29088n = {"this", "$this$processDragStop", "event"}, m29087s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class DraggableNode$processDragStop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$processDragStop$1(DraggableNode draggableNode, Continuation<? super DraggableNode$processDragStop$1> continuation) {
        super(continuation);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61442f;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61442f = this.this$0.m61442f(null, null, this);
        return m61442f;
    }
}