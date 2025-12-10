package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.configuration.featureconfig.BuyDolConfig;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.buy_dol.charge.CardCharge;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolChargeResponse;

@Metadata(m29143d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0004 \b*$\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;", "", "Lth/co/dtac/android/dtacone/model/buy_dol/charge/CardCharge;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment$setupObserve$4 */
/* loaded from: classes10.dex */
public final class OneBuyDolCreditCardFragment$setupObserve$4 extends Lambda implements Function1<Resource<? extends Pair<? extends OneBuyDolChargeResponse, ? extends Pair<? extends String, ? extends CardCharge>>>, Unit> {
    final /* synthetic */ OneBuyDolCreditCardFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment$setupObserve$4$WhenMappings */
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
    public OneBuyDolCreditCardFragment$setupObserve$4(OneBuyDolCreditCardFragment oneBuyDolCreditCardFragment) {
        super(1);
        this.this$0 = oneBuyDolCreditCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends OneBuyDolChargeResponse, ? extends Pair<? extends String, ? extends CardCharge>>> resource) {
        invoke2((Resource<Pair<OneBuyDolChargeResponse, Pair<String, CardCharge>>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<OneBuyDolChargeResponse, Pair<String, CardCharge>>> resource) {
        Resource<Pair<OneBuyDolChargeResponse, Pair<String, CardCharge>>> resourceContentIfNotHandled;
        Pair<String, CardCharge> second;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneBuyDolCreditCardFragment oneBuyDolCreditCardFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneBuyDolCreditCardFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneBuyDolCreditCardFragment.dismissLoading();
                return;
            }
        }
        oneBuyDolCreditCardFragment.dismissLoading();
        Pair<OneBuyDolChargeResponse, Pair<String, CardCharge>> data = resourceContentIfNotHandled.getData();
        String first = (data == null || (second = data.getSecond()) == null) ? null : second.getFirst();
        if (first != null) {
            int hashCode = first.hashCode();
            if (hashCode == -1433341840) {
                if (first.equals(BuyDolConfig.ON_CHARGE_CREDIT_CARD_RESULT)) {
                    oneBuyDolCreditCardFragment.m16017M(resourceContentIfNotHandled.getData().getFirst(), resourceContentIfNotHandled.getData().getSecond().getSecond());
                }
            } else if (hashCode != 607857993) {
                if (hashCode != 1648955312) {
                    return;
                }
                first.equals(BuyDolConfig.ON_CHARGE_DIRECT_ACCOUNT_RESULT);
            } else if (first.equals(BuyDolConfig.ON_3DS_CHARGE_CREDIT_CARD_RESULT)) {
                oneBuyDolCreditCardFragment.m16018L(resourceContentIfNotHandled.getData().getFirst());
            }
        }
    }
}