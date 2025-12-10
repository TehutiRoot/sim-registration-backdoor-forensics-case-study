package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneCustomerPreVerifyState;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$callCustomerPreVerify$2 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$callCustomerPreVerify$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$callCustomerPreVerify$2(OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        OneErrorService oneErrorService;
        MutableStateFlow mutableStateFlow;
        OneErrorService oneErrorService2;
        Intrinsics.checkNotNullParameter(it, "it");
        oneErrorService = this.this$0.f92124e;
        oneErrorService.handleException(it, new OneErrorService.ExceptionHandler[0]);
        mutableStateFlow = this.this$0.f92143i2;
        oneErrorService2 = this.this$0.f92124e;
        mutableStateFlow.setValue(new OneCustomerPreVerifyState.Error(oneErrorService2));
    }
}