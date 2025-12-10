package th.p047co.dtac.android.dtacone.view.appOne.mnp.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneMnpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMnpActivity.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/activity/OneMnpActivity$ComposeContent$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,818:1\n230#2,5:819\n*S KotlinDebug\n*F\n+ 1 OneMnpActivity.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/activity/OneMnpActivity$ComposeContent$3\n*L\n488#1:819,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$ComposeContent$3 */
/* loaded from: classes10.dex */
public final class OneMnpActivity$ComposeContent$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneMnpActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpActivity$ComposeContent$3(OneMnpActivity oneMnpActivity) {
        super(0);
        this.this$0 = oneMnpActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableStateFlow mutableStateFlow;
        Object value;
        mutableStateFlow = this.this$0.f91347s;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
    }
}