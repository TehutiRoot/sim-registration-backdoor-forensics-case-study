package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment$initView$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidTelcoFragment$initView$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidTelcoFragment$initView$3(MrtrPrepaidTelcoFragment mrtrPrepaidTelcoFragment) {
        super(0);
        this.this$0 = mrtrPrepaidTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r0.isNotFoundBirthDate() != false) goto L27;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r4 = this;
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getMrtrPrepaidRegistrationViewModel$p(r0)
            java.lang.String r1 = "mrtrPrepaidRegistrationViewModel"
            r2 = 0
            if (r0 != 0) goto Lf
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        Lf:
            java.lang.String r0 = r0.getRegisterType()
            java.lang.String r3 = "REGISTER_ONLY"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L2b
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getMrtrPrepaidRegistrationViewModel$p(r0)
            if (r0 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L27:
            r0.uploadImage(r3, r2)
            goto L88
        L2b:
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getMrtrPrepaidRegistrationViewModel$p(r0)
            if (r0 != 0) goto L37
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L37:
            java.lang.String r0 = r0.getRegisterType()
            java.lang.String r3 = "REGISTER_ACTIVATION"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L77
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getMrtrPrepaidRegistrationViewModel$p(r0)
            if (r0 != 0) goto L4f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L4f:
            boolean r0 = r0.isBelow10Age()
            if (r0 != 0) goto L67
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getMrtrPrepaidRegistrationViewModel$p(r0)
            if (r0 != 0) goto L61
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L61:
            boolean r0 = r0.isNotFoundBirthDate()
            if (r0 == 0) goto L77
        L67:
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getMrtrPrepaidRegistrationViewModel$p(r0)
            if (r0 != 0) goto L73
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L73:
            r0.uploadImage(r3, r2)
            goto L88
        L77:
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment r0 = r4.this$0
            th.co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration.MrtrPrepaidRegistrationActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment.access$getPrepaidActivity(r0)
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidNonTelcoFragment$Companion r1 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidNonTelcoFragment.Companion
            th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidNonTelcoFragment r1 = r1.newInstance()
            java.lang.String r2 = "Prepaid : Consent Non Telco"
            r0.addFragment(r1, r2)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment$initView$3.invoke2():void");
    }
}