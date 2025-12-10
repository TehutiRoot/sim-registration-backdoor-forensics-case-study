package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePrepaidRegistrationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePrepaidRegistrationActivity.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/activity/OnePrepaidRegistrationActivity$ComposeContent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,581:1\n230#2,5:582\n*S KotlinDebug\n*F\n+ 1 OnePrepaidRegistrationActivity.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/activity/OnePrepaidRegistrationActivity$ComposeContent$1\n*L\n227#1:582,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$ComposeContent$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidRegistrationActivity$ComposeContent$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidRegistrationActivity$ComposeContent$1(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
        super(0);
        this.this$0 = onePrepaidRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this.this$0.get_showOneDialogConfirmErrorState();
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
        this.this$0.getOnConfirmDialog().invoke();
    }
}