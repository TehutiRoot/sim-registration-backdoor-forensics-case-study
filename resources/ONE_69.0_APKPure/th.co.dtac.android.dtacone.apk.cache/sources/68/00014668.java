package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

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
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolConsent;
import th.p047co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupConfirmFragment;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolConsent;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupConfirmFragment$setUpViewModel$2 */
/* loaded from: classes10.dex */
public final class OneTopupConfirmFragment$setUpViewModel$2 extends Lambda implements Function1<Resource<? extends Pair<? extends BuyDolConsent, ? extends String>>, Unit> {
    final /* synthetic */ OneTopupConfirmFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupConfirmFragment$setUpViewModel$2$WhenMappings */
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
    public OneTopupConfirmFragment$setUpViewModel$2(OneTopupConfirmFragment oneTopupConfirmFragment) {
        super(1);
        this.this$0 = oneTopupConfirmFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends BuyDolConsent, ? extends String>> resource) {
        invoke2((Resource<Pair<BuyDolConsent, String>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<BuyDolConsent, String>> resource) {
        Resource<Pair<BuyDolConsent, String>> resourceContentIfNotHandled;
        OneConsentDialog oneConsentDialog;
        OneConsentDialog oneConsentDialog2;
        OneConsentDialog oneConsentDialog3;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneTopupConfirmFragment oneTopupConfirmFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneTopupConfirmFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneTopupConfirmFragment.dismissLoading();
                return;
            }
        }
        Pair<BuyDolConsent, String> data = resourceContentIfNotHandled.getData();
        if (data != null) {
            BuyDolConsent first = data.getFirst();
            String second = data.getSecond();
            String consentMessage = first.getConsentMessage();
            if (consentMessage == null || consentMessage.length() == 0) {
                oneTopupConfirmFragment.m9328F(second);
                return;
            }
            String mrtrConsentId = first.getMrtrConsentId();
            OneTopupConfirmFragment.MrtrConsentId.setConsentId(mrtrConsentId != null ? Integer.valueOf(Integer.parseInt(mrtrConsentId)) : null);
            oneTopupConfirmFragment.f98427i = OneConsentDialog.Companion.newInstance(first.getConsentMessage(), oneTopupConfirmFragment.getString(R.string.one_consent_dialog_ok_massage));
            oneConsentDialog = oneTopupConfirmFragment.f98427i;
            if (oneConsentDialog != null) {
                oneConsentDialog.setCallback(oneTopupConfirmFragment);
            }
            oneConsentDialog2 = oneTopupConfirmFragment.f98427i;
            if (oneConsentDialog2 != null) {
                Integer num = OneHomeFragment.Companion.getFeatures().get(second);
                oneConsentDialog2.setTargetFragment(oneTopupConfirmFragment, num != null ? num.intValue() : 0);
            }
            FragmentManager parentFragmentManager = oneTopupConfirmFragment.getParentFragmentManager();
            oneConsentDialog3 = oneTopupConfirmFragment.f98427i;
            if (oneConsentDialog3 != null) {
                oneConsentDialog3.show(parentFragmentManager, (String) null);
            }
        }
    }
}