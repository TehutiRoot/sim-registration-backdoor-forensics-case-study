package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt$OneOutlineTextField$3 */
/* loaded from: classes7.dex */
public final class OneOutlineTextFieldKt$OneOutlineTextField$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Painter $icon;
    final /* synthetic */ Modifier $iconModifier;
    final /* synthetic */ boolean $isClearable;
    final /* synthetic */ boolean $isEnable;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneOutlineTextFieldKt$OneOutlineTextField$3(String str, Function1<? super String, Unit> function1, Modifier modifier, Painter painter, Modifier modifier2, String str2, boolean z, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, int i, int i2, int i3) {
        super(2);
        this.$value = str;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$icon = painter;
        this.$iconModifier = modifier2;
        this.$placeholder = str2;
        this.$isClearable = z;
        this.$isEnable = z2;
        this.$isReadOnly = z3;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$visualTransformation = visualTransformation;
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
        OneOutlineTextFieldKt.OneOutlineTextField(this.$value, this.$onValueChange, this.$modifier, this.$icon, this.$iconModifier, this.$placeholder, this.$isClearable, this.$isEnable, this.$isReadOnly, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
