package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OneScanBarcodeSimFragment$setUpViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneScanBarcodeSimFragment$setUpViewModel$1$1 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ OneScanBarcodeSimFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneScanBarcodeSimFragment$setUpViewModel$1$1(OneScanBarcodeSimFragment oneScanBarcodeSimFragment) {
        super(1);
        this.this$0 = oneScanBarcodeSimFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        OnePrepaidRegistrationActivity m10674p;
        OnePrepaidRegistrationActivity m10674p2;
        Intrinsics.checkNotNullParameter(it, "it");
        Class<?> clazz = it.getClazz();
        if (Intrinsics.areEqual(clazz, OnePrepaidCampaignListFragment.class)) {
            this.this$0.f95756p = true;
            m10674p2 = this.this$0.m10674p();
            m10674p2.replaceFragment(it.buildFragment(), OnePrepaidCampaignListFragment.TAG);
        } else if (Intrinsics.areEqual(clazz, UpPassFormFragment.class)) {
            this.this$0.navigateNextToCommon();
        } else {
            this.this$0.f95756p = true;
            m10674p = this.this$0.m10674p();
            m10674p.replaceFragment(it.buildFragment(), it.getTag());
        }
    }
}