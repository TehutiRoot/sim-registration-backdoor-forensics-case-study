package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m28800f = "BottomSheetScaffold.kt", m28799i = {0}, m28798l = {TypedValues.TransitionType.TYPE_TRANSITION_FLAGS}, m28797m = "onPostFling-RZ2iAVY", m28796n = {"available"}, m28795s = {"J$0"})
/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes.dex */
public final class C3089x8eaee744 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3088x7deaba9e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3089x8eaee744(C3088x7deaba9e c3088x7deaba9e, Continuation<? super C3089x8eaee744> continuation) {
        super(continuation);
        this.this$0 = c3088x7deaba9e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69445onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
