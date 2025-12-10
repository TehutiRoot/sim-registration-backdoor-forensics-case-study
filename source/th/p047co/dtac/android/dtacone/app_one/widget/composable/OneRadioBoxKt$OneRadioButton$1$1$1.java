package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneRadioBoxKt$OneRadioButton$1$1$1 */
/* loaded from: classes7.dex */
public final class OneRadioBoxKt$OneRadioButton$1$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $animateRadius$delegate;
    final /* synthetic */ long $checkedColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRadioBoxKt$OneRadioButton$1$1$1(long j, State<Float> state) {
        super(1);
        this.$checkedColor = j;
        this.$animateRadius$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope drawBehind) {
        float m19816c;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        long j = this.$checkedColor;
        m19816c = OneRadioBoxKt.m19816c(this.$animateRadius$delegate);
        AbstractC12212lK.m26490x(drawBehind, j, m19816c, drawBehind.mo72143getCenterF1C5BW0(), 0.0f, null, null, 0, 120, null);
    }
}
