package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.C3641Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneOutlineTextBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOutlineTextBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextBoxKt$OneOutlineTextBox$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,147:1\n154#2:148\n154#2:149\n154#2:150\n*S KotlinDebug\n*F\n+ 1 OneOutlineTextBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextBoxKt$OneOutlineTextBox$1$1\n*L\n68#1:148\n69#1:149\n70#1:150\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextBoxKt$OneOutlineTextBox$1$1 */
/* loaded from: classes7.dex */
public final class OneOutlineTextBoxKt$OneOutlineTextBox$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $borderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOutlineTextBoxKt$OneOutlineTextBox$1$1(long j) {
        super(1);
        this.$borderColor = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float f = 2;
        AbstractC12212lK.m26524C(drawBehind, this.$borderColor, OffsetKt.Offset(drawBehind.mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(f)), 0.0f), OffsetKt.Offset(drawBehind.mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(f)), Size.m71568getHeightimpl(drawBehind.mo72144getSizeNHjbRc())), drawBehind.mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(3)), 0, null, 0.0f, null, 0, 496, null);
    }
}
