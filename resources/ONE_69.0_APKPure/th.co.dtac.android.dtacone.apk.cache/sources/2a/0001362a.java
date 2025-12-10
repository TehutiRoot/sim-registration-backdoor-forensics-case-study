package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity$ComposeContent$11 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationActivity$ComposeContent$11 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ OnePostpaidRegistrationActivity $tmp4_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationActivity$ComposeContent$11(OnePostpaidRegistrationActivity onePostpaidRegistrationActivity, int i) {
        super(2);
        this.$tmp4_rcvr = onePostpaidRegistrationActivity;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp4_rcvr.ComposeContent(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}