package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogImagePreview$1$1$1$1 */
/* loaded from: classes7.dex */
public final class OneDialogKt$OneDialogImagePreview$1$1$1$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ long $bitmapSize;
    final /* synthetic */ MutableState<IntSize> $imageSize$delegate;
    final /* synthetic */ MutableFloatState $maxScale$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogImagePreview$1$1$1$1(long j, MutableState<IntSize> mutableState, MutableFloatState mutableFloatState) {
        super(1);
        this.$bitmapSize = j;
        this.$imageSize$delegate = mutableState;
        this.$maxScale$delegate = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates it) {
        long m19836i;
        Intrinsics.checkNotNullParameter(it, "it");
        OneDialogKt.m19831n(this.$imageSize$delegate, it.mo72816getSizeYbymL2g());
        MutableFloatState mutableFloatState = this.$maxScale$delegate;
        m19836i = OneDialogKt.m19836i(this.$imageSize$delegate);
        OneDialogKt.m19832m(mutableFloatState, (IntSize.m73818getWidthimpl(this.$bitmapSize) * 4.0f) / IntSize.m73818getWidthimpl(m19836i));
    }
}
