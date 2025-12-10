package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist.MrtrPrepaidReRegistActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "event", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistVerifyOtpFragment$onStart$2$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistVerifyOtpFragment$onStart$2$3 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ MrtrPrepaidReregistVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistVerifyOtpFragment$onStart$2$3(MrtrPrepaidReregistVerifyOtpFragment mrtrPrepaidReregistVerifyOtpFragment) {
        super(1);
        this.this$0 = mrtrPrepaidReregistVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent event) {
        MrtrPrepaidReRegistActivity m4558G;
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getClazz(), UpPassFormFragment.class)) {
            this.this$0.navigateNextToCommon(new UpPassFormType.Ocr(null, null, false, null, 15, null));
            return;
        }
        m4558G = this.this$0.m4558G();
        m4558G.replaceFragment(event.buildFragment(), event.getTag());
    }
}