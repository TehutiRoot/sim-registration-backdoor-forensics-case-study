package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
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
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidTruePackagesAdapter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPackageFragment$onStart$1$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSelectPackageFragment$onStart$1$1 extends Lambda implements Function1<Resource<? extends List<? extends PriceplanListItem>>, Unit> {
    final /* synthetic */ OnePre2PostSelectPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPackageFragment$onStart$1$1$WhenMappings */
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
    public OnePre2PostSelectPackageFragment$onStart$1$1(OnePre2PostSelectPackageFragment onePre2PostSelectPackageFragment) {
        super(1);
        this.this$0 = onePre2PostSelectPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends PriceplanListItem>> resource) {
        invoke2((Resource<? extends List<PriceplanListItem>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<PriceplanListItem>> resource) {
        Resource<? extends List<PriceplanListItem>> resourceContentIfNotHandled;
        ArrayList arrayList;
        ArrayList arrayList2;
        OnePostpaidTruePackagesAdapter onePostpaidTruePackagesAdapter;
        CardView cardView;
        LinearLayoutCompat linearLayoutCompat;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostSelectPackageFragment onePre2PostSelectPackageFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            onePre2PostSelectPackageFragment.showLoading();
        } else if (i == 2) {
            onePre2PostSelectPackageFragment.dismissLoading();
            List<PriceplanListItem> data = resourceContentIfNotHandled.getData();
            if (data != null) {
                arrayList = onePre2PostSelectPackageFragment.f95311x;
                arrayList.clear();
                arrayList2 = onePre2PostSelectPackageFragment.f95311x;
                arrayList2.addAll(data);
                onePostpaidTruePackagesAdapter = onePre2PostSelectPackageFragment.f95310w;
                if (onePostpaidTruePackagesAdapter != null) {
                    onePostpaidTruePackagesAdapter.notifyDataSetChanged();
                }
            }
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            onePre2PostSelectPackageFragment.dismissLoading();
        } else {
            onePre2PostSelectPackageFragment.dismissLoading();
            cardView = onePre2PostSelectPackageFragment.f95300m;
            LinearLayoutCompat linearLayoutCompat2 = null;
            if (cardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cvListItem");
                cardView = null;
            }
            ViewVisibleExtKt.toGone(cardView);
            linearLayoutCompat = onePre2PostSelectPackageFragment.f95304q;
            if (linearLayoutCompat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            } else {
                linearLayoutCompat2 = linearLayoutCompat;
            }
            ViewVisibleExtKt.toVisible(linearLayoutCompat2);
        }
    }
}