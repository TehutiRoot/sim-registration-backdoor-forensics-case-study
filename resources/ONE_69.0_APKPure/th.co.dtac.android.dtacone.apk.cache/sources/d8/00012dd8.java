package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleTrueModel;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDeviceSaleTrueViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleTrueViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/viewModel/OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1127:1\n819#2:1128\n847#2,2:1129\n*S KotlinDebug\n*F\n+ 1 OneDeviceSaleTrueViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/viewModel/OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$2\n*L\n441#1:1128\n441#1:1129,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$2 extends Lambda implements Function1<OneGetPricePlansDetailResponse, Unit> {
    final /* synthetic */ Function1<List<PriceplanListItem>, Unit> $updateList;
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$2(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel, Function1<? super List<PriceplanListItem>, Unit> function1) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
        this.$updateList = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        invoke2(oneGetPricePlansDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        List<PriceplanListItem> pricePlansList;
        Data data = oneGetPricePlansDetailResponse.getData();
        List<PriceplanListItem> list = null;
        if ((data != null ? data.getPricePlansStatus() : null) != null) {
            this.this$0.getOneModel().setPricePlansDetailStatusResponse(oneGetPricePlansDetailResponse.getData().getPricePlansStatus());
        }
        Data data2 = oneGetPricePlansDetailResponse.getData();
        List<PriceplanListItem> pricePlansList2 = data2 != null ? data2.getPricePlansList() : null;
        if (pricePlansList2 == null) {
            pricePlansList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!pricePlansList2.isEmpty()) {
            OneDeviceSaleTrueModel oneModel = this.this$0.getOneModel();
            Data data3 = oneGetPricePlansDetailResponse.getData();
            if (data3 != null && (pricePlansList = data3.getPricePlansList()) != null) {
                OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : pricePlansList) {
                    String name = ((PriceplanListItem) obj).getName();
                    PriceplanListItem packageTrueSelectedItem = oneDeviceSaleTrueViewModel.getOneModel().getPackageTrueSelectedItem();
                    if (!Intrinsics.areEqual(name, packageTrueSelectedItem != null ? packageTrueSelectedItem.getName() : null)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            oneModel.setPricePlansDetailListResponse(list);
            this.$updateList.invoke(this.this$0.getOneModel().getPricePlansDetailListResponse());
        }
    }
}