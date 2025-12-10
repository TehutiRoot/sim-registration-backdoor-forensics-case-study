package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$5$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$3$5$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutableState<Boolean> $cardReaderMode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$3$5$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$cardReaderMode$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$8(this.$cardReaderMode$delegate, z);
    }
}