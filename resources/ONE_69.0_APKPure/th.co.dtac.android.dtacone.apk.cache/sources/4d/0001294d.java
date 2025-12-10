package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

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
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$UpPassDemoTopBar$3$1 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$UpPassDemoTopBar$3$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ MutableState<Float> $width$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$UpPassDemoTopBar$3$1(MutableState<Float> mutableState) {
        super(1);
        this.$width$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UpPassDemoTopBarKt.m16166d(this.$width$delegate, IntSize.m74002getWidthimpl(it.mo73000getSizeYbymL2g()));
    }
}