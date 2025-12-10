package th.p047co.dtac.android.dtacone.view.appOne.common.composable;

import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.common.composable.ModifierHelperKt$shimmerEffect$1$1$1 */
/* loaded from: classes10.dex */
public final class ModifierHelperKt$shimmerEffect$1$1$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ MutableState<IntSize> $size$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierHelperKt$shimmerEffect$1$1$1(MutableState<IntSize> mutableState) {
        super(1);
        this.$size$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ModifierHelperKt$shimmerEffect$1.invoke$lambda$2(this.$size$delegate, it.mo73000getSizeYbymL2g());
    }
}