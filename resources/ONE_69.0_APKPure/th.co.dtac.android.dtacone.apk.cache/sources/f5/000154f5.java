package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DeviceSIMInfo;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DeviceSIMInfoResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSIMInfo;", "kotlin.jvm.PlatformType", "response", "Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSIMInfoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel$callGetDeviceSIMInfoApi$2 */
/* loaded from: classes9.dex */
public final class SubscriberInfoViewModel$callGetDeviceSIMInfoApi$2 extends Lambda implements Function1<DeviceSIMInfoResponse, DeviceSIMInfo> {
    final /* synthetic */ SubscriberInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberInfoViewModel$callGetDeviceSIMInfoApi$2(SubscriberInfoViewModel subscriberInfoViewModel) {
        super(1);
        this.this$0 = subscriberInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DeviceSIMInfo invoke(@NotNull DeviceSIMInfoResponse response) {
        DeviceSIMInfo m3079d0;
        Intrinsics.checkNotNullParameter(response, "response");
        m3079d0 = this.this$0.m3079d0(response);
        return m3079d0;
    }
}