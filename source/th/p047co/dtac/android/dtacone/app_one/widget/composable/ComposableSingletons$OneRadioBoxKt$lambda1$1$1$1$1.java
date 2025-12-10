package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneRadioBoxKt$lambda-1$1$1$1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneRadioBoxKt$lambda1$1$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutableState<Boolean> $checked$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$OneRadioBoxKt$lambda1$1$1$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$checked$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ComposableSingletons$OneRadioBoxKt$lambda1$1.invoke$lambda$5$lambda$2(this.$checked$delegate, true);
    }
}
