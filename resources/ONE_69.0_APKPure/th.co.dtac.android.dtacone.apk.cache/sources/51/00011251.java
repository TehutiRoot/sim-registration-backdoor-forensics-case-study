package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneSegmentedButtonRowKt$lambda-2$1$1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneSegmentedButtonRowKt$lambda2$1$1$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ MutableState<Integer> $selected$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$OneSegmentedButtonRowKt$lambda2$1$1$1(MutableState<Integer> mutableState) {
        super(1);
        this.$selected$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ComposableSingletons$OneSegmentedButtonRowKt$lambda2$1.invoke$lambda$2(this.$selected$delegate, i);
    }
}