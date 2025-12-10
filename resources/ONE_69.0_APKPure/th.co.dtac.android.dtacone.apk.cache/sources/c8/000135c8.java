package th.p047co.dtac.android.dtacone.view.appOne.online_activation.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.activity.OneOnlineActivationActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.fragment.OneOnlineActivationVerifyFragment$initViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneOnlineActivationVerifyFragment$initViewModel$1$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneOnlineActivationVerifyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineActivationVerifyFragment$initViewModel$1$2(OneOnlineActivationVerifyFragment oneOnlineActivationVerifyFragment) {
        super(1);
        this.this$0 = oneOnlineActivationVerifyFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        OneOnlineActivationActivity m12821n;
        if (z) {
            m12821n = this.this$0.m12821n();
            m12821n.onActivateDolSuccess();
        }
    }
}