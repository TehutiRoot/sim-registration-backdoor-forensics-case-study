package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$CustomerSection$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$CustomerSection$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$CustomerSection$2(Function1<? super CustomerInformation, Unit> function1, CustomerInformation customerInformation) {
        super(1);
        this.$onCustomerInfoChange = function1;
        this.$customerInfo = customerInformation;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String str) {
        CustomerInformation copy;
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (str.length() > 80) {
            it = it.substring(0, 80);
            Intrinsics.checkNotNullExpressionValue(it, "substring(...)");
        }
        String str2 = it;
        Function1<CustomerInformation, Unit> function1 = this.$onCustomerInfoChange;
        copy = r3.copy((r24 & 1) != 0 ? r3.f97990a : str2, (r24 & 2) != 0 ? r3.f97991b : null, (r24 & 4) != 0 ? r3.f97992c : null, (r24 & 8) != 0 ? r3.f97993d : null, (r24 & 16) != 0 ? r3.f97994e : null, (r24 & 32) != 0 ? r3.f97995f : null, (r24 & 64) != 0 ? r3.f97996g : null, (r24 & 128) != 0 ? r3.f97997h : null, (r24 & 256) != 0 ? r3.f97998i : null, (r24 & 512) != 0 ? r3.f97999j : null, (r24 & 1024) != 0 ? this.$customerInfo.f98000k : null);
        function1.invoke(copy);
    }
}