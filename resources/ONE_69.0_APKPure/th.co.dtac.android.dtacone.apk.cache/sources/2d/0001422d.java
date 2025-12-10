package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.discount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.discount.DiscountSelectScreenKt$DiscountItem$3 */
/* loaded from: classes10.dex */
public final class DiscountSelectScreenKt$DiscountItem$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $code;
    final /* synthetic */ String $name;
    final /* synthetic */ Function1<String, Unit> $onDiscountSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscountSelectScreenKt$DiscountItem$3(String str, Function1<? super String, Unit> function1, String str2, int i, int i2) {
        super(2);
        this.$name = str;
        this.$onDiscountSelected = function1;
        this.$code = str2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DiscountSelectScreenKt.m9572a(this.$name, this.$onDiscountSelected, this.$code, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}