package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1 extends Lambda implements Function2<CoroutineScope, Float, Unit> {
    final /* synthetic */ Function1<Float, Unit> $settleToDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1(Function1<? super Float, Unit> function1) {
        super(2);
        this.$settleToDismiss = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CoroutineScope coroutineScope, Float f) {
        invoke(coroutineScope, f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull CoroutineScope modalBottomSheetSwipeable, float f) {
        Intrinsics.checkNotNullParameter(modalBottomSheetSwipeable, "$this$modalBottomSheetSwipeable");
        this.$settleToDismiss.invoke(Float.valueOf(f));
    }
}
