package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$1$1 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutableState<Boolean> $isCheck$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onClickCheckBox;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$1$1(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState) {
        super(1);
        this.$onClickCheckBox = function1;
        this.$isCheck$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$onClickCheckBox.invoke(Boolean.valueOf(z));
        OneFeeInfoScreenKt.m9368c(this.$isCheck$delegate, z);
    }
}