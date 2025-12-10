package th.p047co.dtac.android.dtacone.presenter.prepaid;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.bus.event.ReaderStatusEvent;
import th.p047co.dtac.android.dtacone.presenter.prepaid.CameraIdCardPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "event", "Lth/co/dtac/android/dtacone/manager/bus/event/ReaderStatusEvent;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.CameraIdCardPresenter$registerEvent$1 */
/* loaded from: classes8.dex */
public final class CameraIdCardPresenter$registerEvent$1 extends Lambda implements Function1<ReaderStatusEvent, Unit> {
    final /* synthetic */ CameraIdCardPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraIdCardPresenter$registerEvent$1(CameraIdCardPresenter cameraIdCardPresenter) {
        super(1);
        this.this$0 = cameraIdCardPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReaderStatusEvent readerStatusEvent) {
        invoke2(readerStatusEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ReaderStatusEvent readerStatusEvent) {
        CameraIdCardPresenter.View view;
        CameraIdCardPresenter.View view2;
        CameraIdCardPresenter.View view3;
        int status = readerStatusEvent.getStatus();
        CameraIdCardPresenter.View view4 = null;
        if (status == 1) {
            view = this.this$0.f86140e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view;
            }
            view4.onConnectedBluetooth();
        } else if (status == 2) {
            view2 = this.this$0.f86140e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view2;
            }
            view4.onDisconnectBluetooth();
        } else if (status != 3) {
        } else {
            view3 = this.this$0.f86140e;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view3;
            }
            view4.onDisconnectBluetooth();
        }
    }
}