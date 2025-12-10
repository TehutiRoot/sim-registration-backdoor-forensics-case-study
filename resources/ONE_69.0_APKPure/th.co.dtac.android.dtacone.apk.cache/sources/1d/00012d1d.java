package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "isShow", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectCampaignFragment$initView$4$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSelectCampaignFragment$initView$4$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneDeviceSaleTrueSelectCampaignFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSelectCampaignFragment$initView$4$2(OneDeviceSaleTrueSelectCampaignFragment oneDeviceSaleTrueSelectCampaignFragment) {
        super(1);
        this.this$0 = oneDeviceSaleTrueSelectCampaignFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        OneFontTextView oneFontTextView;
        oneFontTextView = this.this$0.f89855l;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneDeviceSaleSelectCampaignWarningMessageTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setVisibility(z ? 0 : 8);
    }
}