package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextBoxKt$OneOutlineTextBox$4 */
/* loaded from: classes7.dex */
public final class OneOutlineTextBoxKt$OneOutlineTextBox$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Painter $icon;
    final /* synthetic */ Modifier $iconModifier;
    final /* synthetic */ boolean $isEnable;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOutlineTextBoxKt$OneOutlineTextBox$4(String str, Modifier modifier, Painter painter, Modifier modifier2, String str2, boolean z, int i, int i2) {
        super(2);
        this.$value = str;
        this.$modifier = modifier;
        this.$icon = painter;
        this.$iconModifier = modifier2;
        this.$placeholder = str2;
        this.$isEnable = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneOutlineTextBoxKt.OneOutlineTextBox(this.$value, this.$modifier, this.$icon, this.$iconModifier, this.$placeholder, this.$isEnable, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
