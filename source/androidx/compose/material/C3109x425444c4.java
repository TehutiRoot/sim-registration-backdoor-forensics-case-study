package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m28800f = "Drawer.kt", m28799i = {0}, m28798l = {TypedValues.Custom.TYPE_STRING}, m28797m = "onPreFling-QWom1Mo", m28796n = {"available"}, m28795s = {"J$0"})
/* renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* loaded from: classes.dex */
public final class C3109x425444c4 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3107xfccf8785 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3109x425444c4(C3107xfccf8785 c3107xfccf8785, Continuation<? super C3109x425444c4> continuation) {
        super(continuation);
        this.this$0 = c3107xfccf8785;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69447onPreFlingQWom1Mo(0L, this);
    }
}
