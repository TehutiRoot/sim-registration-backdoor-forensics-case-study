package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.DeviceType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/DeviceType;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$2 extends Lambda implements Function1<DeviceType, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$2$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.DTACDEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceType.OPENMARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$2(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeviceType deviceType) {
        invoke2(deviceType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DeviceType deviceType) {
        OneFontTextView oneFontTextView;
        oneFontTextView = this.this$0.f90257w;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewDeviceType");
            oneFontTextView = null;
        }
        int i = deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
        if (i == 1) {
            oneFontTextView.setText(R.string.with_device_device_type_dtac_device);
            oneFontTextView.setBackgroundResource(R.drawable.bg_dtac_device);
        } else if (i != 2) {
            ViewVisibleExtKt.toGone(oneFontTextView);
        } else {
            oneFontTextView.setText(R.string.with_device_device_type_open_market);
            oneFontTextView.setBackgroundResource(R.drawable.bg_open_market);
        }
    }
}