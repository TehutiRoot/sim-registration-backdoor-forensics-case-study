package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneRoundedCornerCheckBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRoundedCornerCheckBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,109:1\n1#2:110\n164#3:111\n*S KotlinDebug\n*F\n+ 1 OneRoundedCornerCheckBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$1$1\n*L\n76#1:111\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$1$1 */
/* loaded from: classes7.dex */
public final class OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$1$1 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ Density $density;
    final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$1$1(Density density, float f) {
        super(1);
        this.$density = density;
        this.$size = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final Integer invoke(int i) {
        return Integer.valueOf(this.$density.mo69432roundToPx0680j_4(C3641Dp.m73658constructorimpl((float) (this.$size * (-0.5d)))));
    }
}
