package th.p047co.dtac.android.dtacone.widget.compose.common;

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
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneButtonKt$OneButton$1$1 */
/* loaded from: classes9.dex */
public final class OneButtonKt$OneButton$1$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ MutableState<Float> $height$delegate;
    final /* synthetic */ MutableState<Float> $width$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneButtonKt$OneButton$1$1(MutableState<Float> mutableState, MutableState<Float> mutableState2) {
        super(1);
        this.$width$delegate = mutableState;
        this.$height$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneButtonKt.m1830e(this.$width$delegate, IntSize.m74002getWidthimpl(it.mo73000getSizeYbymL2g()));
        OneButtonKt.m1828g(this.$height$delegate, IntSize.m74001getHeightimpl(it.mo73000getSizeYbymL2g()));
    }
}