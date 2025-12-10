package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OneMnpTruePackageSetFragment$initView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneMnpTruePackageSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpTruePackageSetFragment$initView$1(OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment) {
        super(0);
        this.this$0 = oneMnpTruePackageSetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LinearLayoutCompat linearLayoutCompat;
        CardView cardView;
        OneMnpViewModel viewModel;
        linearLayoutCompat = this.this$0.f91951w;
        CardView cardView2 = null;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            linearLayoutCompat = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat);
        cardView = this.this$0.f91952x;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardView");
        } else {
            cardView2 = cardView;
        }
        ViewVisibleExtKt.toVisible(cardView2);
        viewModel = this.this$0.getViewModel();
        viewModel.getPackageList();
    }
}