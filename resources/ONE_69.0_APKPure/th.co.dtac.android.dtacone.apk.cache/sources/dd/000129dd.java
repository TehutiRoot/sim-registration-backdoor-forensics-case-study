package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneCreditCardModel;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel;

@Metadata(m29143d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012R\u0010\u0002\u001aN\u0012 \u0012\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0004\u0012\u00020\b0\u0004 \t*&\u0012 \u0012\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\n"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneCreditCardModel;", "Lkotlin/collections/ArrayList;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneBuyDolCreditCardFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends Pair<? extends ArrayList<OneCreditCardModel>, ? extends Integer>>, Unit> {
    final /* synthetic */ OneBuyDolCreditCardFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment$setupObserve$2$WhenMappings */
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
    public OneBuyDolCreditCardFragment$setupObserve$2(OneBuyDolCreditCardFragment oneBuyDolCreditCardFragment) {
        super(1);
        this.this$0 = oneBuyDolCreditCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends ArrayList<OneCreditCardModel>, ? extends Integer>> resource) {
        invoke2((Resource<? extends Pair<? extends ArrayList<OneCreditCardModel>, Integer>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends Pair<? extends ArrayList<OneCreditCardModel>, Integer>> resource) {
        Resource<? extends Pair<? extends ArrayList<OneCreditCardModel>, Integer>> resourceContentIfNotHandled;
        ArrayList<OneCreditCardModel> first;
        OneBuyDolViewModel m15995i0;
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
        Pair<? extends ArrayList<OneCreditCardModel>, Integer> data = resource.getData();
        if (data == null || (first = data.getFirst()) == null) {
            return;
        }
        m15995i0 = oneBuyDolCreditCardFragment.m15995i0();
        m15995i0.initialCreditCardList(first);
    }
}