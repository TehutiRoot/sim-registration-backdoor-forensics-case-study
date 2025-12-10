package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PricePlansStatus;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidTruePackagesAdapter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectPackageFragment$applyData$1$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSelectPackageFragment$applyData$1$1 extends Lambda implements Function1<Resource<? extends List<? extends PriceplanListItem>>, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel $this_apply;
    final /* synthetic */ OneDeviceSaleTrueSelectPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectPackageFragment$applyData$1$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSelectPackageFragment$applyData$1$1(OneDeviceSaleTrueSelectPackageFragment oneDeviceSaleTrueSelectPackageFragment, OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueSelectPackageFragment;
        this.$this_apply = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends PriceplanListItem>> resource) {
        invoke2((Resource<? extends List<PriceplanListItem>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<PriceplanListItem>> resource) {
        Resource<? extends List<PriceplanListItem>> resourceContentIfNotHandled;
        LinearLayoutCompat linearLayoutCompat;
        RecyclerView recyclerView;
        LinearLayoutCompat linearLayoutCompat2;
        RecyclerView recyclerView2;
        ArrayList arrayList;
        ArrayList arrayList2;
        OnePostpaidTruePackagesAdapter onePostpaidTruePackagesAdapter;
        OneDeviceSaleTrueViewModel viewModel;
        Integer pending;
        RecyclerView recyclerView3;
        LinearLayoutCompat linearLayoutCompat3;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSaleTrueSelectPackageFragment oneDeviceSaleTrueSelectPackageFragment = this.this$0;
        OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        LinearLayoutCompat linearLayoutCompat4 = null;
        if (i == 1) {
            linearLayoutCompat = oneDeviceSaleTrueSelectPackageFragment.f89909v;
            if (linearLayoutCompat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                linearLayoutCompat = null;
            }
            ViewVisibleExtKt.toInVisible(linearLayoutCompat);
            recyclerView = oneDeviceSaleTrueSelectPackageFragment.f89892C;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewPackage");
            } else {
                linearLayoutCompat4 = recyclerView;
            }
            ViewVisibleExtKt.toInVisible(linearLayoutCompat4);
            oneDeviceSaleTrueSelectPackageFragment.showLoading();
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                oneDeviceSaleTrueSelectPackageFragment.dismissLoading();
                return;
            }
            oneDeviceSaleTrueSelectPackageFragment.dismissLoading();
            recyclerView3 = oneDeviceSaleTrueSelectPackageFragment.f89892C;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewPackage");
                recyclerView3 = null;
            }
            ViewVisibleExtKt.toGone(recyclerView3);
            linearLayoutCompat3 = oneDeviceSaleTrueSelectPackageFragment.f89909v;
            if (linearLayoutCompat3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            } else {
                linearLayoutCompat4 = linearLayoutCompat3;
            }
            ViewVisibleExtKt.toVisible(linearLayoutCompat4);
        } else {
            oneDeviceSaleTrueSelectPackageFragment.dismissLoading();
            linearLayoutCompat2 = oneDeviceSaleTrueSelectPackageFragment.f89909v;
            if (linearLayoutCompat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                linearLayoutCompat2 = null;
            }
            ViewVisibleExtKt.toInVisible(linearLayoutCompat2);
            recyclerView2 = oneDeviceSaleTrueSelectPackageFragment.f89892C;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewPackage");
            } else {
                linearLayoutCompat4 = recyclerView2;
            }
            ViewVisibleExtKt.toVisible(linearLayoutCompat4);
            List<PriceplanListItem> data = resourceContentIfNotHandled.getData();
            if (data != null) {
                arrayList = oneDeviceSaleTrueSelectPackageFragment.f89895F;
                arrayList.clear();
                arrayList2 = oneDeviceSaleTrueSelectPackageFragment.f89895F;
                arrayList2.addAll(data);
                onePostpaidTruePackagesAdapter = oneDeviceSaleTrueSelectPackageFragment.f89894E;
                if (onePostpaidTruePackagesAdapter != null) {
                    onePostpaidTruePackagesAdapter.notifyDataSetChanged();
                }
                PricePlansStatus pricePlansDetailStatusResponse = oneDeviceSaleTrueViewModel.getOneModel().getPricePlansDetailStatusResponse();
                if (((pricePlansDetailStatusResponse == null || (pending = pricePlansDetailStatusResponse.getPending()) == null) ? 0 : pending.intValue()) > 0) {
                    viewModel = oneDeviceSaleTrueSelectPackageFragment.getViewModel();
                    OneDeviceSaleTrueViewModel.fetchDataPricePlansDetail$default(viewModel, null, new OneDeviceSaleTrueSelectPackageFragment$applyData$1$1$1$1$1(oneDeviceSaleTrueSelectPackageFragment), new OneDeviceSaleTrueSelectPackageFragment$applyData$1$1$1$1$2(oneDeviceSaleTrueSelectPackageFragment), 1, null);
                }
            }
        }
    }
}