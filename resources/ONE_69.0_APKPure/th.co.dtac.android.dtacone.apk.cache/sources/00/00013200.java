package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "isUpdate", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpInputPinCodeFragment$setupObserve$1$2 */
/* loaded from: classes10.dex */
public final class OneMnpInputPinCodeFragment$setupObserve$1$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    final /* synthetic */ OneMnpInputPinCodeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpInputPinCodeFragment$setupObserve$1$2(OneMnpViewModel oneMnpViewModel, OneMnpInputPinCodeFragment oneMnpInputPinCodeFragment) {
        super(1);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpInputPinCodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean isUpdate) {
        OneMnpActivity m13902q;
        Intrinsics.checkNotNullExpressionValue(isUpdate, "isUpdate");
        if (isUpdate.booleanValue()) {
            this.$this_apply.getReloadOcrLiveData().setValue(Boolean.FALSE);
            m13902q = this.this$0.m13902q();
            m13902q.navigateToOcr();
        }
    }
}