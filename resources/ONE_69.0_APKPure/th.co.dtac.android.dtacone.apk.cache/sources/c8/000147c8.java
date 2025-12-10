package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$OwnerTypeBar$1 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$OwnerTypeBar$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ UpPassFormType $formType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormScreenKt$OwnerTypeBar$1(UpPassFormType upPassFormType, int i) {
        super(2);
        this.$formType = upPassFormType;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassFormScreenKt.m9146f(this.$formType, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}