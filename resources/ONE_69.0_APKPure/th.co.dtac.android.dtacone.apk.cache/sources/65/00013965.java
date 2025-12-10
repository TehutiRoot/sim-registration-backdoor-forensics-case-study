package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$updateAppForms$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$updateAppForms$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $event;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$updateAppForms$3(String str, OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.$event = str;
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        OneErrorService oneErrorService;
        String str = this.$event;
        int hashCode = str.hashCode();
        if (hashCode != 83189) {
            if (hashCode != 2451173) {
                if (hashCode == 66268034 && str.equals(Constant.ConsentDomain.ESIGN)) {
                    this.this$0.setUpdateAppFormESIGN(null);
                }
            } else if (str.equals(Constant.ConsentDomain.PDPA)) {
                this.this$0.setUpdateAppFormPDPA(null);
            }
        } else if (str.equals(Constant.ConsentDomain.TMN)) {
            this.this$0.setUpdateAppFormTMN(null);
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        oneErrorService = this.this$0.f94619g;
        oneErrorService.handleException(th2, new OneErrorService.ExceptionHandler[0]);
    }
}