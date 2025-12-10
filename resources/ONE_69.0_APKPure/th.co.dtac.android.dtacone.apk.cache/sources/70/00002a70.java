package androidx.compose.material;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/BottomDrawerState$anchoredDraggableState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,956:1\n1#2:957\n*E\n"})
/* loaded from: classes.dex */
public final class BottomDrawerState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ BottomDrawerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$1(BottomDrawerState bottomDrawerState) {
        super(1);
        this.this$0 = bottomDrawerState;
    }

    @NotNull
    public final Float invoke(float f) {
        Density m60897b;
        float f2;
        m60897b = this.this$0.m60897b();
        f2 = DrawerKt.f14549b;
        return Float.valueOf(m60897b.mo69622toPx0680j_4(f2));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}