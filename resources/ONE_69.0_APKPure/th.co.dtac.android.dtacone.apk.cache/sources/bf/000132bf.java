package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentTelcoFragment$onStart$1$5 */
/* loaded from: classes10.dex */
public final class OneMnpConsentTelcoFragment$onStart$1$5 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ OneMnpConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpConsentTelcoFragment$onStart$1$5(OneMnpConsentTelcoFragment oneMnpConsentTelcoFragment) {
        super(1);
        this.this$0 = oneMnpConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        OneMnpActivity m13663p;
        Intrinsics.checkNotNullParameter(it, "it");
        m13663p = this.this$0.m13663p();
        m13663p.addFragment(it.buildFragment(), it.getTag());
    }
}