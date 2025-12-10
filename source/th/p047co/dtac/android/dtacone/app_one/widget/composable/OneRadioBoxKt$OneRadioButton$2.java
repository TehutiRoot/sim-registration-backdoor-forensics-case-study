package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneRadioBoxKt$OneRadioButton$2 */
/* loaded from: classes7.dex */
public final class OneRadioBoxKt$OneRadioButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ long $checkedBorderColor;
    final /* synthetic */ long $checkedColor;
    final /* synthetic */ String $label;
    final /* synthetic */ float $labelSpacer;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
    final /* synthetic */ float $radioBorderSize;
    final /* synthetic */ float $radioSize;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ long $uncheckedBorderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneRadioBoxKt$OneRadioButton$2(String str, boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, float f, float f2, long j, long j2, long j3, TextStyle textStyle, float f3, int i, int i2, int i3) {
        super(2);
        this.$label = str;
        this.$checked = z;
        this.$onCheckedChange = function1;
        this.$modifier = modifier;
        this.$radioSize = f;
        this.$radioBorderSize = f2;
        this.$checkedColor = j;
        this.$checkedBorderColor = j2;
        this.$uncheckedBorderColor = j3;
        this.$textStyle = textStyle;
        this.$labelSpacer = f3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRadioBoxKt.m74947OneRadioButton7dS3OtE(this.$label, this.$checked, this.$onCheckedChange, this.$modifier, this.$radioSize, this.$radioBorderSize, this.$checkedColor, this.$checkedBorderColor, this.$uncheckedBorderColor, this.$textStyle, this.$labelSpacer, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
