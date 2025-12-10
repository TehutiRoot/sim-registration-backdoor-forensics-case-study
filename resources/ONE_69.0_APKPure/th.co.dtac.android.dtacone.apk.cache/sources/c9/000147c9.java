package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$OwnerTypeInfoBar$2 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$OwnerTypeInfoBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $backgroundColor;
    final /* synthetic */ int $icon;
    final /* synthetic */ int $text;
    final /* synthetic */ int $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormScreenKt$OwnerTypeInfoBar$2(int i, int i2, int i3, int i4, int i5) {
        super(2);
        this.$text = i;
        this.$icon = i2;
        this.$textColor = i3;
        this.$backgroundColor = i4;
        this.$$changed = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassFormScreenKt.m9145g(this.$text, this.$icon, this.$textColor, this.$backgroundColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}