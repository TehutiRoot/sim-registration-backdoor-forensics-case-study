package androidx.compose.material;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ BottomSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState$anchoredDraggableState$1(BottomSheetState bottomSheetState) {
        super(1);
        this.this$0 = bottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }

    @NotNull
    public final Float invoke(float f) {
        Density m60933a;
        float f2;
        m60933a = this.this$0.m60933a();
        f2 = BottomSheetScaffoldKt.f14382b;
        return Float.valueOf(m60933a.mo69438toPx0680j_4(f2));
    }
}
