package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$submitTrueCompany$4 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$submitTrueCompany$4 extends Lambda implements Function1<OnePrepaidSubmitOrderResponse, Unit> {
    final /* synthetic */ String $nontelcoConsentType;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$submitTrueCompany$4(String str, OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.$nontelcoConsentType = str;
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidSubmitOrderResponse onePrepaidSubmitOrderResponse) {
        invoke2(onePrepaidSubmitOrderResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidSubmitOrderResponse onePrepaidSubmitOrderResponse) {
        if (Intrinsics.areEqual(this.$nontelcoConsentType, "Y")) {
            this.this$0.m13499Y1();
        }
        this.this$0.m13407w0();
        this.this$0.m13445m2();
        this.this$0.m13526P1(onePrepaidSubmitOrderResponse.getData());
    }
}