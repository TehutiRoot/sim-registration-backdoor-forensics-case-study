package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationBusinessTypeItemResponse;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.dialog.OneBusinessTypeDialog;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationRetailerInfoFragment$initView$10 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationRetailerInfoFragment$initView$10 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneOnlineRegistrationRetailerInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationRetailerInfoFragment$initView$10(OneOnlineRegistrationRetailerInfoFragment oneOnlineRegistrationRetailerInfoFragment) {
        super(0);
        this.this$0 = oneOnlineRegistrationRetailerInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ArrayList arrayList;
        ArrayList<OneOnlineRegistrationBusinessTypeItemResponse> arrayList2;
        OneOnlineRegistrationBusinessTypeItemResponse oneOnlineRegistrationBusinessTypeItemResponse;
        arrayList = this.this$0.f92788i;
        if (!arrayList.isEmpty()) {
            OneBusinessTypeDialog.Companion companion = OneBusinessTypeDialog.Companion;
            arrayList2 = this.this$0.f92788i;
            int i = R.string.one_online_register_retailer_info_business_type;
            int i2 = R.color.red5;
            int i3 = R.color.redCream;
            oneOnlineRegistrationBusinessTypeItemResponse = this.this$0.f92794o;
            OneBusinessTypeDialog newInstance = companion.newInstance(arrayList2, i, i2, i3, oneOnlineRegistrationBusinessTypeItemResponse);
            newInstance.setCallback(this.this$0);
            newInstance.show(this.this$0.getParentFragmentManager(), (String) null);
        }
    }
}