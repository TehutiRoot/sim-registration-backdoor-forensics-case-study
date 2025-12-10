package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpSaveOrderResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneMnpSaveOrderState;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpSaveOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$oneMnpSaveOrder$1$3 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$oneMnpSaveOrder$1$3 extends Lambda implements Function1<OneMnpSaveOrderResponse, Unit> {
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$oneMnpSaveOrder$1$3(OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneMnpSaveOrderResponse oneMnpSaveOrderResponse) {
        invoke2(oneMnpSaveOrderResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneMnpSaveOrderResponse response) {
        MutableStateFlow mutableStateFlow;
        OneErrorService oneErrorService;
        MutableStateFlow mutableStateFlow2;
        DataItem data = response.getData();
        if (Intrinsics.areEqual((data == null || (r0 = data.getStatus()) == null) ? "1" : "1", "SUCCESSFUL")) {
            mutableStateFlow2 = this.this$0.f92083S2;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            mutableStateFlow2.setValue(new OneMnpSaveOrderState.Success(response));
            this.this$0.generateForm();
            return;
        }
        mutableStateFlow = this.this$0.f92083S2;
        mutableStateFlow.setValue(OneMnpSaveOrderState.Error.INSTANCE);
        oneErrorService = this.this$0.f92124e;
        oneErrorService.handleException(new Throwable("Save Order failed"), new OneErrorService.ExceptionHandler[0]);
    }
}