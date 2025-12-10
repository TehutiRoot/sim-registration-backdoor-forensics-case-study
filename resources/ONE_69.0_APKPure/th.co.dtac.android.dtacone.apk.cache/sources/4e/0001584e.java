package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.esim.SendQRCodeRequest;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$sendQRCode$3 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$sendQRCode$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $type;
    final /* synthetic */ String $value;
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$sendQRCode$3(MrtrChangeSimViewModel mrtrChangeSimViewModel, String str, String str2) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
        this.$type = str;
        this.$value = str2;
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
        mrtrErrorService = this.this$0.f106265i;
        final MrtrChangeSimViewModel mrtrChangeSimViewModel = this.this$0;
        final String str = this.$type;
        final String str2 = this.$value;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$sendQRCode$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                MutableLiveData m2415B;
                String str3;
                String str4;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    mrtrErrorService2 = MrtrChangeSimViewModel.this.f106265i;
                    errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th2));
                } else {
                    errorCollection = ((ServerErrorException) th2).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                }
                m2415B = MrtrChangeSimViewModel.this.m2415B();
                Resource.Companion companion = Resource.Companion;
                String valueOf = String.valueOf(errorCollection.getDescription());
                if (!Intrinsics.areEqual(str, "email")) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                String str5 = str;
                if (!Intrinsics.areEqual(str5, Constant.SendQRType.mms)) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                m2415B.setValue(companion.error(valueOf, new SendQRCodeRequest(null, null, null, null, null, str3, str5, str4, 31, null), 0));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}