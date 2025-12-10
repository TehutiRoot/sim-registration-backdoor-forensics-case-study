package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyDataResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyDataResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$9 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$setUpViewModel$1$9 extends Lambda implements Function1<Resource<? extends OneTopUpGetMainBalanceTrueCompanyDataResponse>, Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$9$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupPriceListFragment$setUpViewModel$1$9(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneTopUpGetMainBalanceTrueCompanyDataResponse> resource) {
        invoke2((Resource<OneTopUpGetMainBalanceTrueCompanyDataResponse>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneTopUpGetMainBalanceTrueCompanyDataResponse> resource) {
        Resource<OneTopUpGetMainBalanceTrueCompanyDataResponse> resourceContentIfNotHandled;
        ?? r10;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        ConstraintLayout constraintLayout3;
        OneFontTextView oneFontTextView3;
        ?? r102;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneTopupPriceListFragment.showLoading();
            return;
        }
        OneFontTextView oneFontTextView4 = null;
        if (i != 2) {
            if (i != 3) {
                return;
            }
            oneTopupPriceListFragment.dismissLoading();
            constraintLayout3 = oneTopupPriceListFragment.f98460Q;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceLayout");
                constraintLayout3 = null;
            }
            ViewVisibleExtKt.toVisible(constraintLayout3);
            oneFontTextView3 = oneTopupPriceListFragment.f98462S;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceValueTextView");
                oneFontTextView3 = null;
            }
            ViewVisibleExtKt.toGone(oneFontTextView3);
            r102 = oneTopupPriceListFragment.f98461R;
            if (r102 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceRetryLayout");
            } else {
                oneFontTextView4 = r102;
            }
            ViewVisibleExtKt.toVisible(oneFontTextView4);
            return;
        }
        oneTopupPriceListFragment.dismissLoading();
        OneTopUpGetMainBalanceTrueCompanyDataResponse data = resourceContentIfNotHandled.getData();
        if (data != null ? Intrinsics.areEqual(data.getDisplayBalance(), Boolean.TRUE) : false) {
            constraintLayout = oneTopupPriceListFragment.f98460Q;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceLayout");
                constraintLayout = null;
            }
            ViewVisibleExtKt.toVisible(constraintLayout);
            constraintLayout2 = oneTopupPriceListFragment.f98461R;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceRetryLayout");
                constraintLayout2 = null;
            }
            ViewVisibleExtKt.toInVisible(constraintLayout2);
            oneFontTextView = oneTopupPriceListFragment.f98462S;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceValueTextView");
                oneFontTextView = null;
            }
            ViewVisibleExtKt.toVisible(oneFontTextView);
            oneFontTextView2 = oneTopupPriceListFragment.f98462S;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceValueTextView");
            } else {
                oneFontTextView4 = oneFontTextView2;
            }
            int i2 = R.string.one_top_up_bath_title;
            String balance = resourceContentIfNotHandled.getData().getBalance();
            oneFontTextView4.setText(oneTopupPriceListFragment.getString(i2, (balance == null || (r10 = StringExtKt.formatMoneyWithDecimal(balance)) == null) ? "" : ""));
            return;
        }
        r10 = oneTopupPriceListFragment.f98460Q;
        if (r10 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceLayout");
        } else {
            oneFontTextView4 = r10;
        }
        ViewVisibleExtKt.toGone(oneFontTextView4);
    }
}