package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageItem;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$MainPackageSummaryAdapterViewHolder$bind$1 */
/* loaded from: classes7.dex */
public final class PackageSummaryAdapter$MainPackageSummaryAdapterViewHolder$bind$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PackageItem $packageItem;
    final /* synthetic */ PackageSummaryAdapter.Selected $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageSummaryAdapter$MainPackageSummaryAdapterViewHolder$bind$1(PackageItem packageItem, PackageSummaryAdapter.Selected selected) {
        super(0);
        this.$packageItem = packageItem;
        this.$selected = selected;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (Intrinsics.areEqual(this.$packageItem.getPackageType(), "10")) {
            this.$selected.onItemClickMainPackages(this.$packageItem);
        } else {
            this.$selected.onItemClickAdditionalPackages(this.$packageItem);
        }
    }
}
