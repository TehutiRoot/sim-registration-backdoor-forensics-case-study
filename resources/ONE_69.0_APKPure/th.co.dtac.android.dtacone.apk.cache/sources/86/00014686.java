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
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceDataResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$8 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$setUpViewModel$1$8 extends Lambda implements Function1<Resource<? extends OneTopUpGetMainBalanceDataResponse>, Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$8$WhenMappings */
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
    public OneTopupPriceListFragment$setUpViewModel$1$8(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneTopUpGetMainBalanceDataResponse> resource) {
        invoke2((Resource<OneTopUpGetMainBalanceDataResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneTopUpGetMainBalanceDataResponse> resource) {
        Resource<OneTopUpGetMainBalanceDataResponse> resourceContentIfNotHandled;
        ConstraintLayout constraintLayout;
        OneFontTextView oneFontTextView;
        ConstraintLayout constraintLayout2;
        OneFontTextView oneFontTextView2;
        String balance;
        ConstraintLayout constraintLayout3;
        OneFontTextView oneFontTextView3;
        ConstraintLayout constraintLayout4;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        ConstraintLayout constraintLayout5 = null;
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
            constraintLayout4 = oneTopupPriceListFragment.f98461R;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceRetryLayout");
            } else {
                constraintLayout5 = constraintLayout4;
            }
            ViewVisibleExtKt.toVisible(constraintLayout5);
            return;
        }
        oneTopupPriceListFragment.dismissLoading();
        constraintLayout = oneTopupPriceListFragment.f98460Q;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceLayout");
            constraintLayout = null;
        }
        ViewVisibleExtKt.toVisible(constraintLayout);
        oneFontTextView = oneTopupPriceListFragment.f98462S;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceValueTextView");
            oneFontTextView = null;
        }
        int i2 = R.string.one_top_up_bath_title;
        OneTopUpGetMainBalanceDataResponse data = resourceContentIfNotHandled.getData();
        oneFontTextView.setText(oneTopupPriceListFragment.getString(i2, (data == null || (balance = data.getBalance()) == null || (r9 = StringExtKt.formatMoneyWithDecimal(balance)) == null) ? "" : ""));
        constraintLayout2 = oneTopupPriceListFragment.f98461R;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceRetryLayout");
            constraintLayout2 = null;
        }
        ViewVisibleExtKt.toInVisible(constraintLayout2);
        oneFontTextView2 = oneTopupPriceListFragment.f98462S;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneTopUpBalanceValueTextView");
        } else {
            constraintLayout5 = oneFontTextView2;
        }
        ViewVisibleExtKt.toVisible(constraintLayout5);
    }
}