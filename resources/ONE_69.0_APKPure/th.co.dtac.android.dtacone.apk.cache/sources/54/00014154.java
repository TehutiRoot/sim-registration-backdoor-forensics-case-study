package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderResponse;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1$3$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$18$1$3$1 extends Lambda implements Function1<SaveOrderResponse, Unit> {
    final /* synthetic */ MutableState<Boolean> $dismissDialogAppointment$delegate;
    final /* synthetic */ MutableState<Boolean> $isAppointmentPrimary$delegate;
    final /* synthetic */ MutableState<SaveOrderResponse> $saveOrderResponse$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$18$1$3$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<SaveOrderResponse> mutableState3) {
        super(1);
        this.$isAppointmentPrimary$delegate = mutableState;
        this.$dismissDialogAppointment$delegate = mutableState2;
        this.$saveOrderResponse$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SaveOrderResponse saveOrderResponse) {
        invoke2(saveOrderResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SaveOrderResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTolNavGraphKt$oneTolNavGraph$1$18$1.invoke$lambda$16(this.$isAppointmentPrimary$delegate, false);
        OneTolNavGraphKt$oneTolNavGraph$1$18$1.invoke$lambda$7(this.$dismissDialogAppointment$delegate, false);
        this.$saveOrderResponse$delegate.setValue(it);
    }
}