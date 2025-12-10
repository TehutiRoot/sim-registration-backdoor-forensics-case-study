package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$ReviewScreen$3$1 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$ReviewScreen$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Integer> $deleteIndex$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onDeleteImage;
    final /* synthetic */ MutableState<Boolean> $showConfirmDelete$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReviewScreenKt$ReviewScreen$3$1(Function1<? super Integer, Unit> function1, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$onDeleteImage = function1;
        this.$deleteIndex$delegate = mutableState;
        this.$showConfirmDelete$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int m9436m;
        Function1<Integer, Unit> function1 = this.$onDeleteImage;
        m9436m = ReviewScreenKt.m9436m(this.$deleteIndex$delegate);
        function1.invoke(Integer.valueOf(m9436m));
        ReviewScreenKt.m9430s(this.$showConfirmDelete$delegate, false);
    }
}