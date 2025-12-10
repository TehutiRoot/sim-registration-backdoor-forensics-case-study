package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import es.dmoral.toasty.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel;
import th.p047co.dtac.android.dtacone.widget.scroll.ScrollViewExt;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationConsentFragment$setupView$2 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationConsentFragment$setupView$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneOnlineRegistrationConsentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationConsentFragment$setupView$2(OneOnlineRegistrationConsentFragment oneOnlineRegistrationConsentFragment) {
        super(0);
        this.this$0 = oneOnlineRegistrationConsentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneOnlineRegisterViewModel viewModel;
        ScrollViewExt scrollViewExt;
        viewModel = this.this$0.getViewModel();
        viewModel.setSaveState(true);
        scrollViewExt = this.this$0.f92651i;
        if (scrollViewExt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            scrollViewExt = null;
        }
        scrollViewExt.fullScroll(BuildConfig.VERSION_CODE);
        this.this$0.m13061p();
    }
}