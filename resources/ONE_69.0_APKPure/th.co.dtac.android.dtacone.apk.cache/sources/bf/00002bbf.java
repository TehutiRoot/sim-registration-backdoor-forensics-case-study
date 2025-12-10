package androidx.compose.material;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,831:1\n1#2:832\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheetState$anchoredDraggableState$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ ModalBottomSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$anchoredDraggableState$2(ModalBottomSheetState modalBottomSheetState) {
        super(0);
        this.this$0 = modalBottomSheetState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        Density m60821a;
        float f;
        m60821a = this.this$0.m60821a();
        f = ModalBottomSheetKt.f14607b;
        return Float.valueOf(m60821a.mo69622toPx0680j_4(f));
    }
}