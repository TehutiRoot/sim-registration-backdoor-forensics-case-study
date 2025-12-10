package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OneMnpConsentNonTelcoFragment$initView$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneMnpConsentNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpConsentNonTelcoFragment$initView$1(OneMnpConsentNonTelcoFragment oneMnpConsentNonTelcoFragment) {
        super(1);
        this.this$0 = oneMnpConsentNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        oneConsentNonTelcoViewModel = this.this$0.f91843i;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        oneConsentNonTelcoViewModel.getConsentTmn(it);
    }
}