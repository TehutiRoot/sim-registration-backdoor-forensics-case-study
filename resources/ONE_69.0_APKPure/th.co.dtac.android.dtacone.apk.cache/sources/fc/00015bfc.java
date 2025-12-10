package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogLoading$3 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogLoading$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ OneDialogLoadingAlignment $alignment;
    final /* synthetic */ Float $progressPercent;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogLoading$3(String str, Float f, OneDialogLoadingAlignment oneDialogLoadingAlignment, int i, int i2) {
        super(2);
        this.$text = str;
        this.$progressPercent = f;
        this.$alignment = oneDialogLoadingAlignment;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneDialogKt.OneDialogLoading(this.$text, this.$progressPercent, this.$alignment, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}