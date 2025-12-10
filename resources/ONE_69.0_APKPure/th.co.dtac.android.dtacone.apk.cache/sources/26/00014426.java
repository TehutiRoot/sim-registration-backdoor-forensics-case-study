package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$DataItemRow$3 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$DataItemRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Integer $iconRes;
    final /* synthetic */ boolean $multiLine;
    final /* synthetic */ Function0<Unit> $onIconClick;
    final /* synthetic */ int $titleRes;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewScreenKt$DataItemRow$3(int i, String str, boolean z, Integer num, Function0<Unit> function0, int i2, int i3) {
        super(2);
        this.$titleRes = i;
        this.$value = str;
        this.$multiLine = z;
        this.$iconRes = num;
        this.$onIconClick = function0;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ReviewScreenKt.m9444e(this.$titleRes, this.$value, this.$multiLine, this.$iconRes, this.$onIconClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}