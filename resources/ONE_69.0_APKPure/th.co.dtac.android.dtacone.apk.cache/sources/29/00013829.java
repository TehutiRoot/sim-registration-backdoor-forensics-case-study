package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.UpdateEventAppForm;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "updateEvent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/UpdateEventAppForm;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidNiceNumberTrueFragment$updateAppFormObserver$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidNiceNumberTrueFragment$updateAppFormObserver$1 extends Lambda implements Function1<UpdateEventAppForm, Unit> {
    final /* synthetic */ OnePostpaidNiceNumberTrueFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidNiceNumberTrueFragment$updateAppFormObserver$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateEventAppForm.values().length];
            try {
                iArr[UpdateEventAppForm.ESIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateEventAppForm.PDPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdateEventAppForm.TMN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidNiceNumberTrueFragment$updateAppFormObserver$1(OnePostpaidNiceNumberTrueFragment onePostpaidNiceNumberTrueFragment) {
        super(1);
        this.this$0 = onePostpaidNiceNumberTrueFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpdateEventAppForm updateEventAppForm) {
        invoke2(updateEventAppForm);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpdateEventAppForm updateEvent) {
        Intrinsics.checkNotNullParameter(updateEvent, "updateEvent");
        int i = WhenMappings.$EnumSwitchMapping$0[updateEvent.ordinal()];
        if (i == 1) {
            this.this$0.getViewModel().handleEsignEvent();
        } else if (i == 2) {
            this.this$0.getViewModel().handlePdpaEvent();
        } else if (i != 3) {
        } else {
            this.this$0.getViewModel().handleTmnEvent();
        }
    }
}