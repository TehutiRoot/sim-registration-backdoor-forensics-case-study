package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidTruePackagesAdapter$onBindViewHolder$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidTruePackagesAdapter$onBindViewHolder$1 extends Lambda implements Function1<PriceplanListItem, Unit> {
    final /* synthetic */ int $position;
    final /* synthetic */ OnePostpaidTruePackagesAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidTruePackagesAdapter$onBindViewHolder$1(OnePostpaidTruePackagesAdapter onePostpaidTruePackagesAdapter, int i) {
        super(1);
        this.this$0 = onePostpaidTruePackagesAdapter;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriceplanListItem priceplanListItem) {
        invoke2(priceplanListItem);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PriceplanListItem it) {
        List list;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<PriceplanListItem, Unit> onItemSelected = this.this$0.getOnItemSelected();
        if (onItemSelected != null) {
            list = this.this$0.f93322f;
            onItemSelected.invoke(list.get(this.$position));
        }
    }
}