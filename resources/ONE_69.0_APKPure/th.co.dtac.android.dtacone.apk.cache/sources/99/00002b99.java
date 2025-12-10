package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m29092f = "ModalBottomSheet.kt", m29091i = {0}, m29090l = {784}, m29089m = "onPostFling-RZ2iAVY", m29088n = {"available"}, m29087s = {"J$0"})
/* renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes.dex */
public final class C3114x8f227701 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3113x58e3e91b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3114x8f227701(C3113x58e3e91b c3113x58e3e91b, Continuation<? super C3114x8f227701> continuation) {
        super(continuation);
        this.this$0 = c3113x58e3e91b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69629onPostFlingRZ2iAVY(0L, 0L, this);
    }
}