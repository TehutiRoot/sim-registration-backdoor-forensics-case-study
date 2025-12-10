package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$4 */
/* loaded from: classes10.dex */
public final class UpPassDemoScreenKt$UpPassDemoScreen$4 extends Lambda implements Function1<ExitCallbackState, Unit> {
    public static final UpPassDemoScreenKt$UpPassDemoScreen$4 INSTANCE = new UpPassDemoScreenKt$UpPassDemoScreen$4();

    public UpPassDemoScreenKt$UpPassDemoScreen$4() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ExitCallbackState it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
        invoke2(exitCallbackState);
        return Unit.INSTANCE;
    }
}