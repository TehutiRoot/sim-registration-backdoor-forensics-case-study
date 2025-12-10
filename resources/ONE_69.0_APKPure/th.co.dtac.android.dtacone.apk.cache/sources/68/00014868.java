package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.ReviewFaceCompareDialogsKt$ReviewFaceCompareErrorDialog$3$1 */
/* loaded from: classes10.dex */
public final class ReviewFaceCompareDialogsKt$ReviewFaceCompareErrorDialog$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $confirmedKyc2$delegate;
    final /* synthetic */ Function0<Unit> $onKyc2Submit;
    final /* synthetic */ MutableState<Boolean> $showKyc2Dialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFaceCompareDialogsKt$ReviewFaceCompareErrorDialog$3$1(Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$onKyc2Submit = function0;
        this.$confirmedKyc2$delegate = mutableState;
        this.$showKyc2Dialog$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ReviewFaceCompareDialogsKt.m9110h(this.$confirmedKyc2$delegate, true);
        this.$onKyc2Submit.invoke();
        ReviewFaceCompareDialogsKt.m9112f(this.$showKyc2Dialog$delegate, false);
    }
}