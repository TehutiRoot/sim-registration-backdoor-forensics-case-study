package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.productType;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.productType.SelectProductTypeScreenKt$SelectProductTypeScreen$2 */
/* loaded from: classes10.dex */
public final class SelectProductTypeScreenKt$SelectProductTypeScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isFixedLinePlus;
    final /* synthetic */ Function1<Boolean, Unit> $onFixedLinePlusChecked;
    final /* synthetic */ Function0<Unit> $onNext;
    final /* synthetic */ Function1<ProductType, Unit> $onProductTypeSelected;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectProductTypeScreenKt$SelectProductTypeScreen$2(ProductType productType, boolean z, Function1<? super ProductType, Unit> function1, Function1<? super Boolean, Unit> function12, Function0<Unit> function0, int i) {
        super(2);
        this.$productType = productType;
        this.$isFixedLinePlus = z;
        this.$onProductTypeSelected = function1;
        this.$onFixedLinePlusChecked = function12;
        this.$onNext = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectProductTypeScreenKt.SelectProductTypeScreen(this.$productType, this.$isFixedLinePlus, this.$onProductTypeSelected, this.$onFixedLinePlusChecked, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}