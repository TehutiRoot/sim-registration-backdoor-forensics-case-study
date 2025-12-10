package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

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
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidTruePackagesAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePricePlansViewModel;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTruePackageListFragment$applyData$1$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidTruePackageListFragment$applyData$1$1 extends Lambda implements Function1<Resource<? extends List<? extends PriceplanListItem>>, Unit> {
    final /* synthetic */ OnePostpaidTruePackageListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTruePackageListFragment$applyData$1$1$WhenMappings */
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
    public OnePostpaidTruePackageListFragment$applyData$1$1(OnePostpaidTruePackageListFragment onePostpaidTruePackageListFragment) {
        super(1);
        this.this$0 = onePostpaidTruePackageListFragment;
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
        OnePostpaidRegistrationViewModel viewModel;
        Integer pending;
        RecyclerView recyclerView3;
        LinearLayoutCompat linearLayoutCompat3;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePostpaidTruePackageListFragment onePostpaidTruePackageListFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        LinearLayoutCompat linearLayoutCompat4 = null;
        if (i == 1) {
            linearLayoutCompat = onePostpaidTruePackageListFragment.f94412v;
            if (linearLayoutCompat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                linearLayoutCompat = null;
            }
            ViewVisibleExtKt.toInVisible(linearLayoutCompat);
            recyclerView = onePostpaidTruePackageListFragment.f94395C;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewPackage");
            } else {
                linearLayoutCompat4 = recyclerView;
            }
            ViewVisibleExtKt.toInVisible(linearLayoutCompat4);
            onePostpaidTruePackageListFragment.showLoading();
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                onePostpaidTruePackageListFragment.dismissLoading();
                return;
            }
            onePostpaidTruePackageListFragment.dismissLoading();
            recyclerView3 = onePostpaidTruePackageListFragment.f94395C;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewPackage");
                recyclerView3 = null;
            }
            ViewVisibleExtKt.toGone(recyclerView3);
            linearLayoutCompat3 = onePostpaidTruePackageListFragment.f94412v;
            if (linearLayoutCompat3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            } else {
                linearLayoutCompat4 = linearLayoutCompat3;
            }
            ViewVisibleExtKt.toVisible(linearLayoutCompat4);
        } else {
            onePostpaidTruePackageListFragment.dismissLoading();
            linearLayoutCompat2 = onePostpaidTruePackageListFragment.f94412v;
            if (linearLayoutCompat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                linearLayoutCompat2 = null;
            }
            ViewVisibleExtKt.toInVisible(linearLayoutCompat2);
            recyclerView2 = onePostpaidTruePackageListFragment.f94395C;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewPackage");
            } else {
                linearLayoutCompat4 = recyclerView2;
            }
            ViewVisibleExtKt.toVisible(linearLayoutCompat4);
            List<PriceplanListItem> data = resourceContentIfNotHandled.getData();
            if (data != null) {
                arrayList = onePostpaidTruePackageListFragment.f94398F;
                arrayList.clear();
                arrayList2 = onePostpaidTruePackageListFragment.f94398F;
                arrayList2.addAll(data);
                onePostpaidTruePackagesAdapter = onePostpaidTruePackageListFragment.f94397E;
                if (onePostpaidTruePackagesAdapter != null) {
                    onePostpaidTruePackagesAdapter.notifyDataSetChanged();
                }
                viewModel = onePostpaidTruePackageListFragment.getViewModel();
                PricePlansStatus pricePlansDetailStatusResponse = viewModel.getPricePlansDetailStatusResponse();
                if (((pricePlansDetailStatusResponse == null || (pending = pricePlansDetailStatusResponse.getPending()) == null) ? 0 : pending.intValue()) > 0) {
                    OnePricePlansViewModel.fetchDataPricePlansDetail$default(onePostpaidTruePackageListFragment.getViewModelPricePlans(), null, new OnePostpaidTruePackageListFragment$applyData$1$1$1$1$1(onePostpaidTruePackageListFragment), new OnePostpaidTruePackageListFragment$applyData$1$1$1$1$2(onePostpaidTruePackageListFragment), 1, null);
                }
            }
        }
    }
}