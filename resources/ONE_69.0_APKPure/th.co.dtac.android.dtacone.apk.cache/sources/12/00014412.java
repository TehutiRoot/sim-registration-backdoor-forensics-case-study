package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.productType;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.productType.SelectProductTypeScreenKt$SelectTypeList$2 */
/* loaded from: classes10.dex */
public final class SelectProductTypeScreenKt$SelectTypeList$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<ProductType, Unit> $onProductTypeSelected;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectProductTypeScreenKt$SelectTypeList$2(ProductType productType, Function1<? super ProductType, Unit> function1, int i) {
        super(2);
        this.$productType = productType;
        this.$onProductTypeSelected = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectProductTypeScreenKt.m9449c(this.$productType, this.$onProductTypeSelected, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}