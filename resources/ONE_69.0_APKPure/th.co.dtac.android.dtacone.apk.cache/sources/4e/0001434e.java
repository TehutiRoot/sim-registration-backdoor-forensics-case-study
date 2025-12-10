package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.MutableState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;
    final /* synthetic */ MutableState<Boolean> $showBirthdayDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$InputInfoScreen$2(Function1<? super CustomerInformation, Unit> function1, CustomerInformation customerInformation, MutableState<Boolean> mutableState) {
        super(1);
        this.$onCustomerInfoChange = function1;
        this.$customerInfo = customerInformation;
        this.$showBirthdayDialog$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        CustomerInformation copy;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<CustomerInformation, Unit> function1 = this.$onCustomerInfoChange;
        CustomerInformation customerInformation = this.$customerInfo;
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        copy = customerInformation.copy((r24 & 1) != 0 ? customerInformation.f97990a : null, (r24 & 2) != 0 ? customerInformation.f97991b : null, (r24 & 4) != 0 ? customerInformation.f97992c : DateFormatExtKt.toDate(it, "yyyyMMdd", US), (r24 & 8) != 0 ? customerInformation.f97993d : null, (r24 & 16) != 0 ? customerInformation.f97994e : null, (r24 & 32) != 0 ? customerInformation.f97995f : null, (r24 & 64) != 0 ? customerInformation.f97996g : null, (r24 & 128) != 0 ? customerInformation.f97997h : null, (r24 & 256) != 0 ? customerInformation.f97998i : null, (r24 & 512) != 0 ? customerInformation.f97999j : null, (r24 & 1024) != 0 ? customerInformation.f98000k : null);
        function1.invoke(copy);
        InputInfoScreenKt.m9501t(this.$showBirthdayDialog$delegate, false);
    }
}