package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberDataResponse;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberDataResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$10 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$initViewModel$1$10 extends Lambda implements Function1<Resource<? extends Pair<? extends String, ? extends OneTopUpCheckSubscriberDataResponse>>, Unit> {
    final /* synthetic */ OneStvProsermOnlineViewModel $this_apply;
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$10$WhenMappings */
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
    public OneProsermOnlineInputNumberFragment$initViewModel$1$10(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment, OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.this$0 = oneProsermOnlineInputNumberFragment;
        this.$this_apply = oneStvProsermOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends String, ? extends OneTopUpCheckSubscriberDataResponse>> resource) {
        invoke2((Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>> resource) {
        Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>> resourceContentIfNotHandled;
        DtacSwipeRefresh dtacSwipeRefresh;
        DtacSwipeRefresh dtacSwipeRefresh2;
        ?? r8;
        OneTopUpCheckSubscriberDataResponse second;
        DtacSwipeRefresh dtacSwipeRefresh3;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment = this.this$0;
        OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        DtacSwipeRefresh dtacSwipeRefresh4 = null;
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
            } else {
                dtacSwipeRefresh4 = dtacSwipeRefresh3;
            }
            dtacSwipeRefresh4.setRefreshing(false);
        } else {
            Pair<String, OneTopUpCheckSubscriberDataResponse> data = resourceContentIfNotHandled.getData();
            if (!((data == null || (second = data.getSecond()) == null) ? false : Intrinsics.areEqual(second.getDisplayBalance(), Boolean.TRUE))) {
                dtacSwipeRefresh2 = oneProsermOnlineInputNumberFragment.f97603t;
                if (dtacSwipeRefresh2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
                    dtacSwipeRefresh2 = null;
                }
                dtacSwipeRefresh2.setRefreshing(false);
                r8 = oneProsermOnlineInputNumberFragment.f97583J;
                if (r8 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("oneStvProsermBalanceLayout");
                } else {
                    dtacSwipeRefresh4 = r8;
                }
                ViewVisibleExtKt.toGone(dtacSwipeRefresh4);
                return;
            }
            String first = resourceContentIfNotHandled.getData().getFirst();
            OneTopUpCheckSubscriberDataResponse second2 = resourceContentIfNotHandled.getData().getSecond();
            oneStvProsermOnlineViewModel.getMainBalance(first, (second2 == null || (r8 = second2.getCustomerNumber()) == null) ? "" : "");
        }
    }
}