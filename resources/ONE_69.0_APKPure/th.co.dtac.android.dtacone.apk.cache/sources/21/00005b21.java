package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "T", "it", "Landroidx/compose/ui/unit/Density;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SwipeableV2Kt$swipeAnchors$1 extends Lambda implements Function1<Density, Unit> {
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeAnchors$1(SwipeableV2State<T> swipeableV2State) {
        super(1);
        this.$state = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Density density) {
        invoke2(density);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Density it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$state.setDensity$material3_release(it);
    }
}