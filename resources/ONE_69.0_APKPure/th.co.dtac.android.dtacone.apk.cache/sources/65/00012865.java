package th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity$ComposeContent$7 */
/* loaded from: classes10.dex */
public final class MrtrMnpActivity$ComposeContent$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MrtrMnpActivity $tmp2_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpActivity$ComposeContent$7(MrtrMnpActivity mrtrMnpActivity, int i) {
        super(2);
        this.$tmp2_rcvr = mrtrMnpActivity;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp2_rcvr.ComposeContent(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}