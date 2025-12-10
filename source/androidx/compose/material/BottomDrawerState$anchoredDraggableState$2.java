package androidx.compose.material;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/BottomDrawerState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,956:1\n1#2:957\n*E\n"})
/* loaded from: classes.dex */
public final class BottomDrawerState$anchoredDraggableState$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ BottomDrawerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$2(BottomDrawerState bottomDrawerState) {
        super(0);
        this.this$0 = bottomDrawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        Density m60947b;
        float f;
        m60947b = this.this$0.m60947b();
        f = DrawerKt.f14462c;
        return Float.valueOf(m60947b.mo69438toPx0680j_4(f));
    }
}
