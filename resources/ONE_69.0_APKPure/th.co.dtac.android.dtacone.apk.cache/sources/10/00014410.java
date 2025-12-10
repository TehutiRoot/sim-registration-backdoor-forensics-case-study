package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.productType;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductTypeItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.productType.SelectProductTypeScreenKt$SelectTypeItem$2 */
/* loaded from: classes10.dex */
public final class SelectProductTypeScreenKt$SelectTypeItem$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<ProductType, Unit> $onProductTypeSelected;
    final /* synthetic */ ProductTypeItem $optionItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectProductTypeScreenKt$SelectTypeItem$2(Function1<? super ProductType, Unit> function1, ProductTypeItem productTypeItem) {
        super(0);
        this.$onProductTypeSelected = function1;
        this.$optionItem = productTypeItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onProductTypeSelected.invoke(this.$optionItem.getType());
    }
}