package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleTrueModel;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDeviceSaleTrueViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleTrueViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/viewModel/OneDeviceSaleTrueViewModel$getPricePlansDetail$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1127:1\n819#2:1128\n847#2,2:1129\n819#2:1131\n847#2,2:1132\n*S KotlinDebug\n*F\n+ 1 OneDeviceSaleTrueViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/viewModel/OneDeviceSaleTrueViewModel$getPricePlansDetail$3\n*L\n397#1:1128\n397#1:1129,2\n400#1:1131\n400#1:1132,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$getPricePlansDetail$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$getPricePlansDetail$3 extends Lambda implements Function1<OneGetPricePlansDetailResponse, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$getPricePlansDetail$3(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        invoke2(oneGetPricePlansDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        ArrayList arrayList;
        MutableLiveData m14899C0;
        List<PriceplanListItem> pricePlansList;
        List<PriceplanListItem> pricePlansList2;
        OneDeviceSaleTrueModel oneModel = this.this$0.getOneModel();
        Data data = oneGetPricePlansDetailResponse.getData();
        ArrayList arrayList2 = null;
        if (data == null || (pricePlansList2 = data.getPricePlansList()) == null) {
            arrayList = null;
        } else {
            OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.this$0;
            arrayList = new ArrayList();
            for (Object obj : pricePlansList2) {
                String name = ((PriceplanListItem) obj).getName();
                PriceplanListItem packageTrueSelectedItem = oneDeviceSaleTrueViewModel.getOneModel().getPackageTrueSelectedItem();
                if (!Intrinsics.areEqual(name, packageTrueSelectedItem != null ? packageTrueSelectedItem.getName() : null)) {
                    arrayList.add(obj);
                }
            }
        }
        oneModel.setPricePlansDetailListResponse(arrayList);
        OneDeviceSaleTrueModel oneModel2 = this.this$0.getOneModel();
        Data data2 = oneGetPricePlansDetailResponse.getData();
        oneModel2.setPricePlansDetailStatusResponse(data2 != null ? data2.getPricePlansStatus() : null);
        m14899C0 = this.this$0.m14899C0();
        Resource.Companion companion = Resource.Companion;
        Data data3 = oneGetPricePlansDetailResponse.getData();
        if (data3 != null && (pricePlansList = data3.getPricePlansList()) != null) {
            OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel2 = this.this$0;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : pricePlansList) {
                String name2 = ((PriceplanListItem) obj2).getName();
                PriceplanListItem packageTrueSelectedItem2 = oneDeviceSaleTrueViewModel2.getOneModel().getPackageTrueSelectedItem();
                if (!Intrinsics.areEqual(name2, packageTrueSelectedItem2 != null ? packageTrueSelectedItem2.getName() : null)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2 = arrayList3;
        }
        m14899C0.postValue(companion.success(arrayList2));
    }
}