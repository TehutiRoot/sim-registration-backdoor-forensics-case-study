package th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration.MrtrPrepaidRegistrationActivity$deleteImageCallback$1$1 */
/* loaded from: classes10.dex */
public final class MrtrPrepaidRegistrationActivity$deleteImageCallback$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $deleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MrtrPrepaidRegistrationActivity$deleteImageCallback$1$1(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$deleted = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        Function1<Boolean, Unit> function1 = this.$deleted;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }
}