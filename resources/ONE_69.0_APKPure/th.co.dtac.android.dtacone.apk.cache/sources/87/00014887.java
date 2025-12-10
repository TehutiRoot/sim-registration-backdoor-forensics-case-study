package th.p047co.dtac.android.dtacone.view.compose.upPassDemo;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1$requestPermissionLauncher$1$1 */
/* loaded from: classes10.dex */
public final class C15876xae528cb extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
    final /* synthetic */ MutableState<Boolean> $showConfirmContinueDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15876xae528cb(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$onSelectOptionsNextClick = function0;
        this.$showConfirmContinueDialog$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (!z) {
            UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1.invoke$lambda$2(this.$showConfirmContinueDialog$delegate, true);
        } else {
            this.$onSelectOptionsNextClick.invoke();
        }
    }
}