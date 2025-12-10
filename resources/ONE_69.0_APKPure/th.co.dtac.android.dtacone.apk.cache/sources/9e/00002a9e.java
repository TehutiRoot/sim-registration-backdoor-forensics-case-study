package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m29092f = "BottomSheetScaffold.kt", m29091i = {0}, m29090l = {TypedValues.TransitionType.TYPE_TRANSITION_FLAGS}, m29089m = "onPostFling-RZ2iAVY", m29088n = {"available"}, m29087s = {"J$0"})
/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes.dex */
public final class C3071x8eaee744 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3070x7deaba9e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3071x8eaee744(C3070x7deaba9e c3070x7deaba9e, Continuation<? super C3071x8eaee744> continuation) {
        super(continuation);
        this.this$0 = c3070x7deaba9e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69629onPostFlingRZ2iAVY(0L, 0L, this);
    }
}