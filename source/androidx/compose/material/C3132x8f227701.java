package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m28800f = "ModalBottomSheet.kt", m28799i = {0}, m28798l = {784}, m28797m = "onPostFling-RZ2iAVY", m28796n = {"available"}, m28795s = {"J$0"})
/* renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes.dex */
public final class C3132x8f227701 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3131x58e3e91b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3132x8f227701(C3131x58e3e91b c3131x58e3e91b, Continuation<? super C3132x8f227701> continuation) {
        super(continuation);
        this.this$0 = c3131x58e3e91b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69445onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
