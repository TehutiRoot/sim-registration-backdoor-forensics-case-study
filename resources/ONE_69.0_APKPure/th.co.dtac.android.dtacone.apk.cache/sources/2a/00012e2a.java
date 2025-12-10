package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OneVerifyPrivilegeSubscribeResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$verifyPrivilegeSubscriber$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$verifyPrivilegeSubscriber$2 extends Lambda implements Function1<OneVerifyPrivilegeSubscribeResponse, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$verifyPrivilegeSubscriber$2(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse) {
        invoke2(oneVerifyPrivilegeSubscribeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneVerifyPrivilegeSubscribeResponse oneVerifyPrivilegeSubscribeResponse) {
        MutableLiveData m14885J0;
        if (Intrinsics.areEqual(oneVerifyPrivilegeSubscribeResponse.getCodeType(), "W")) {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
            m14885J0 = this.this$0.m14885J0();
            m14885J0.setValue(Resource.Companion.success(oneVerifyPrivilegeSubscribeResponse));
            return;
        }
        this.this$0.getProposition();
    }
}