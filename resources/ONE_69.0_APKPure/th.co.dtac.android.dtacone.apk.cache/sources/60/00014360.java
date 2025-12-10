package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInfoInvoiceLanguage;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$LanguageSection$1$2$1$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$LanguageSection$1$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ CustomerInfoInvoiceLanguage $language;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$LanguageSection$1$2$1$1(Function1<? super CustomerInformation, Unit> function1, CustomerInformation customerInformation, CustomerInfoInvoiceLanguage customerInfoInvoiceLanguage) {
        super(0);
        this.$onCustomerInfoChange = function1;
        this.$customerInfo = customerInformation;
        this.$language = customerInfoInvoiceLanguage;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CustomerInformation copy;
        Function1<CustomerInformation, Unit> function1 = this.$onCustomerInfoChange;
        copy = r1.copy((r24 & 1) != 0 ? r1.f97990a : null, (r24 & 2) != 0 ? r1.f97991b : null, (r24 & 4) != 0 ? r1.f97992c : null, (r24 & 8) != 0 ? r1.f97993d : null, (r24 & 16) != 0 ? r1.f97994e : null, (r24 & 32) != 0 ? r1.f97995f : null, (r24 & 64) != 0 ? r1.f97996g : null, (r24 & 128) != 0 ? r1.f97997h : null, (r24 & 256) != 0 ? r1.f97998i : this.$language, (r24 & 512) != 0 ? r1.f97999j : null, (r24 & 1024) != 0 ? this.$customerInfo.f98000k : null);
        function1.invoke(copy);
    }
}