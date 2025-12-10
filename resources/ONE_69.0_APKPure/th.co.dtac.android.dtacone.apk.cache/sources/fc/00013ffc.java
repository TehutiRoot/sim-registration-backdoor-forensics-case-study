package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$setUpViews$14 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$setUpViews$14 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneProsermOnlineInputNumberFragment$setUpViews$14(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment) {
        super(0);
        this.this$0 = oneProsermOnlineInputNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePhoneBookEditText onePhoneBookEditText;
        OneStvProsermOnlineViewModel m9814K;
        onePhoneBookEditText = this.this$0.f97597n;
        if (onePhoneBookEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onePhoneBookEditText");
            onePhoneBookEditText = null;
        }
        String internationalNumberFormat = PhoneNumberFormat.toInternationalNumberFormat(String.valueOf(onePhoneBookEditText.getText()), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
        m9814K = this.this$0.m9814K();
        m9814K.callCurrentPackages(internationalNumberFormat);
    }
}