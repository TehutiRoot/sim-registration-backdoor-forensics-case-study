package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

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
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$11 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$initViewModel$1$11 extends Lambda implements Function1<Resource<? extends OneTopUpGetMainBalanceDataResponse>, Unit> {
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$11$WhenMappings */
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
    public OneProsermOnlineInputNumberFragment$initViewModel$1$11(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment) {
        super(1);
        this.this$0 = oneProsermOnlineInputNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneTopUpGetMainBalanceDataResponse> resource) {
        invoke2((Resource<OneTopUpGetMainBalanceDataResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneTopUpGetMainBalanceDataResponse> resource) {
        Resource<OneTopUpGetMainBalanceDataResponse> resourceContentIfNotHandled;
        DtacSwipeRefresh dtacSwipeRefresh;
        DtacSwipeRefresh dtacSwipeRefresh2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        String balance;
        DtacSwipeRefresh dtacSwipeRefresh3;
        ConstraintLayout constraintLayout3;
        OneFontTextView oneFontTextView3;
        ConstraintLayout constraintLayout4;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        DtacSwipeRefresh dtacSwipeRefresh4 = null;
        ConstraintLayout constraintLayout5 = null;
        OneFontTextView oneFontTextView4 = null;
        if (i == 1) {
            dtacSwipeRefresh = oneProsermOnlineInputNumberFragment.f97603t;
            if (dtacSwipeRefresh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                dtacSwipeRefresh4 = dtacSwipeRefresh;
            }
            dtacSwipeRefresh4.setRefreshing(true);
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            dtacSwipeRefresh3 = oneProsermOnlineInputNumberFragment.f97603t;
            if (dtacSwipeRefresh3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
                dtacSwipeRefresh3 = null;
            }
            dtacSwipeRefresh3.setRefreshing(false);
            constraintLayout3 = oneProsermOnlineInputNumberFragment.f97583J;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceLayout");
                constraintLayout3 = null;
            }
            ViewVisibleExtKt.toVisible(constraintLayout3);
            oneFontTextView3 = oneProsermOnlineInputNumberFragment.f97584K;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceValueTextView");
                oneFontTextView3 = null;
            }
            ViewVisibleExtKt.toGone(oneFontTextView3);
            constraintLayout4 = oneProsermOnlineInputNumberFragment.f97586M;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceRetryLayout");
            } else {
                constraintLayout5 = constraintLayout4;
            }
            ViewVisibleExtKt.toVisible(constraintLayout5);
        } else {
            dtacSwipeRefresh2 = oneProsermOnlineInputNumberFragment.f97603t;
            if (dtacSwipeRefresh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
                dtacSwipeRefresh2 = null;
            }
            dtacSwipeRefresh2.setRefreshing(false);
            constraintLayout = oneProsermOnlineInputNumberFragment.f97583J;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceLayout");
                constraintLayout = null;
            }
            ViewVisibleExtKt.toVisible(constraintLayout);
            constraintLayout2 = oneProsermOnlineInputNumberFragment.f97586M;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceRetryLayout");
                constraintLayout2 = null;
            }
            ViewVisibleExtKt.toInVisible(constraintLayout2);
            oneFontTextView = oneProsermOnlineInputNumberFragment.f97584K;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceValueTextView");
                oneFontTextView = null;
            }
            ViewVisibleExtKt.toVisible(oneFontTextView);
            oneFontTextView2 = oneProsermOnlineInputNumberFragment.f97584K;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceValueTextView");
            } else {
                oneFontTextView4 = oneFontTextView2;
            }
            int i2 = R.string.one_top_up_bath_title;
            OneTopUpGetMainBalanceDataResponse data = resourceContentIfNotHandled.getData();
            oneFontTextView4.setText(oneProsermOnlineInputNumberFragment.getString(i2, (data == null || (balance = data.getBalance()) == null || (r11 = StringExtKt.formatMoneyWithDecimal(balance)) == null) ? "" : ""));
        }
    }
}