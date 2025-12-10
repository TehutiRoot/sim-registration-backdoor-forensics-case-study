package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimCommonFragment$initView$1$4 */
/* loaded from: classes9.dex */
public final class ESimCommonFragment$initView$1$4 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ ESimCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimCommonFragment$initView$1$4(ESimCommonFragment eSimCommonFragment) {
        super(1);
        this.this$0 = eSimCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        ESimActivity m7826o;
        ESimViewModel eSimViewModel;
        ESimViewModel eSimViewModel2;
        ESimViewModel eSimViewModel3;
        UpPassFormType faceCompare;
        ESimViewModel eSimViewModel4;
        ESimViewModel eSimViewModel5;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getClazz(), UpPassFormFragment.class)) {
            this.this$0.m7828m();
            eSimViewModel = this.this$0.getESimViewModel();
            if (eSimViewModel.isRequireLiveness()) {
                eSimViewModel4 = this.this$0.getESimViewModel();
                int maxAttempt = eSimViewModel4.getMaxAttempt();
                eSimViewModel5 = this.this$0.getESimViewModel();
                faceCompare = new UpPassFormType.FaceCompareLiveness(null, eSimViewModel5.isAllowManualKYC(), maxAttempt, null, null, false, null, null, 249, null);
            } else {
                eSimViewModel2 = this.this$0.getESimViewModel();
                int maxAttempt2 = eSimViewModel2.getMaxAttempt();
                eSimViewModel3 = this.this$0.getESimViewModel();
                faceCompare = new UpPassFormType.FaceCompare(null, eSimViewModel3.isAllowManualKYC(), maxAttempt2, null, null, false, null, null, 249, null);
            }
            this.this$0.navigateNextToCommon(faceCompare);
            return;
        }
        m7826o = this.this$0.m7826o();
        m7826o.replaceFragment(it.buildFragment(), it.getTag());
    }
}