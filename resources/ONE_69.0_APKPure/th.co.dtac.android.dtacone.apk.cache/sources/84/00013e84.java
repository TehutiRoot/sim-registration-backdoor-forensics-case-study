package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.consent.ConsentResponse;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/consent/ConsentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileUpdateFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends Pair<? extends Integer, ? extends ConsentResponse>>, Unit> {
    final /* synthetic */ OneRetailerProfileUpdateFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileUpdateFragment$setupObserve$2$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
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
    public OneRetailerProfileUpdateFragment$setupObserve$2(OneRetailerProfileUpdateFragment oneRetailerProfileUpdateFragment) {
        super(1);
        this.this$0 = oneRetailerProfileUpdateFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends Integer, ? extends ConsentResponse>> resource) {
        invoke2((Resource<Pair<Integer, ConsentResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<Integer, ConsentResponse>> resource) {
        Resource<Pair<Integer, ConsentResponse>> resourceContentIfNotHandled;
        OneConsentDialog oneConsentDialog;
        OneConsentDialog oneConsentDialog2;
        OneConsentDialog oneConsentDialog3;
        OneConsentDialog oneConsentDialog4;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRetailerProfileUpdateFragment oneRetailerProfileUpdateFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneRetailerProfileUpdateFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneRetailerProfileUpdateFragment.dismissLoading();
                return;
            }
        }
        oneRetailerProfileUpdateFragment.dismissLoading();
        Pair<Integer, ConsentResponse> data = resourceContentIfNotHandled.getData();
        if (data != null) {
            ConsentResponse second = data.getSecond();
            int intValue = data.getFirst().intValue();
            oneRetailerProfileUpdateFragment.f96899j = OneConsentDialog.Companion.newInstance(second.getConsent(), oneRetailerProfileUpdateFragment.getString(R.string.one_consent_dialog_accept_massage));
            oneConsentDialog = oneRetailerProfileUpdateFragment.f96899j;
            if (oneConsentDialog != null) {
                oneConsentDialog.setCallback(oneRetailerProfileUpdateFragment);
            }
            oneConsentDialog2 = oneRetailerProfileUpdateFragment.f96899j;
            if (oneConsentDialog2 != null) {
                oneConsentDialog2.setResult(second.getMrtrConsentId());
            }
            oneConsentDialog3 = oneRetailerProfileUpdateFragment.f96899j;
            if (oneConsentDialog3 != null) {
                oneConsentDialog3.setTargetFragment(oneRetailerProfileUpdateFragment, intValue);
            }
            FragmentManager parentFragmentManager = oneRetailerProfileUpdateFragment.getParentFragmentManager();
            oneConsentDialog4 = oneRetailerProfileUpdateFragment.f96899j;
            if (oneConsentDialog4 != null) {
                oneConsentDialog4.show(parentFragmentManager, (String) null);
            }
        }
    }
}