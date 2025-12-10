package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$updateAppForms$2 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$updateAppForms$2 extends Lambda implements Function1<OneUpdateAppFormsResponse, Unit> {
    final /* synthetic */ String $event;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$updateAppForms$2(OneMnpViewModel oneMnpViewModel, String str) {
        super(1);
        this.this$0 = oneMnpViewModel;
        this.$event = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneUpdateAppFormsResponse oneUpdateAppFormsResponse) {
        invoke2(oneUpdateAppFormsResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneUpdateAppFormsResponse oneUpdateAppFormsResponse) {
        MutableLiveData m13561G1;
        m13561G1 = this.this$0.m13561G1();
        m13561G1.setValue(Resource.Companion.success(null));
        String str = this.$event;
        int hashCode = str.hashCode();
        if (hashCode == 83189) {
            if (str.equals(Constant.ConsentDomain.TMN)) {
                this.this$0.m13409v2();
            }
        } else if (hashCode == 2451173) {
            if (str.equals(Constant.ConsentDomain.PDPA)) {
                this.this$0.m13413u2();
            }
        } else if (hashCode == 66268034 && str.equals(Constant.ConsentDomain.ESIGN)) {
            this.this$0.m13417t2();
        }
    }
}