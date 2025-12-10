package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidTruePackagesAdapter$OnePostpaidTruePackagesViewHolder$bind$1$1$1 */
/* loaded from: classes10.dex */
public final class C14855x7ed2a50c extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<PriceplanListItem, Unit> $onItemSelected;
    final /* synthetic */ PriceplanListItem $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14855x7ed2a50c(Function1<? super PriceplanListItem, Unit> function1, PriceplanListItem priceplanListItem) {
        super(0);
        this.$onItemSelected = function1;
        this.$this_run = priceplanListItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<PriceplanListItem, Unit> function1 = this.$onItemSelected;
        if (function1 != null) {
            function1.invoke(this.$this_run);
        }
    }
}