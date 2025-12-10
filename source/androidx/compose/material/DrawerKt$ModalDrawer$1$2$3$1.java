package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$ModalDrawer$1$2$3$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$3$1(float f, float f2, DrawerState drawerState) {
        super(0);
        this.$minValue = f;
        this.$maxValue = f2;
        this.$drawerState = drawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        float m60907f;
        m60907f = DrawerKt.m60907f(this.$minValue, this.$maxValue, this.$drawerState.requireOffset$material_release());
        return Float.valueOf(m60907f);
    }
}
