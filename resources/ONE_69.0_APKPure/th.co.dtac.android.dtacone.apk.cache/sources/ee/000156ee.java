package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$validateIdCardNumber$2 */
/* loaded from: classes9.dex */
public final class ESimViewModel$validateIdCardNumber$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$validateIdCardNumber$2(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ESimViewModel this$0) {
        MutableLiveData m2774F0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m2774F0 = this$0.m2774F0();
        m2774F0.postValue(Resource.Companion.error("", null, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MrtrErrorService mrtrErrorService;
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mrtrErrorService = this.this$0.f105827i;
        final ESimViewModel eSimViewModel = this.this$0;
        mrtrErrorService.handleExceptionCallback(it, new ErrorDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.viewmodel.esim.d
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox.Callback
            public final void onButtonClick() {
                ESimViewModel$validateIdCardNumber$2.invoke$lambda$0(ESimViewModel.this);
            }
        });
    }
}