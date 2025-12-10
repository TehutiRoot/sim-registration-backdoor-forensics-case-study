package th.p047co.dtac.android.dtacone.view.fragment.eSIM.qrCode;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.esim.SendQRCodeRequest;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/esim/SendQRCodeRequest;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.qrCode.ESimShowQrCodeFragment$initViewModel$1$2 */
/* loaded from: classes9.dex */
public final class ESimShowQrCodeFragment$initViewModel$1$2 extends Lambda implements Function1<Resource<? extends SendQRCodeRequest>, Unit> {
    final /* synthetic */ ESimShowQrCodeFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.qrCode.ESimShowQrCodeFragment$initViewModel$1$2$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimShowQrCodeFragment$initViewModel$1$2(ESimShowQrCodeFragment eSimShowQrCodeFragment) {
        super(1);
        this.this$0 = eSimShowQrCodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends SendQRCodeRequest> resource) {
        invoke2((Resource<SendQRCodeRequest>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<SendQRCodeRequest> resource) {
        BottomSheetDialog bottomSheetDialog;
        String telephoneNumber;
        BottomSheetDialog bottomSheetDialog2;
        ConstraintLayout constraintLayout;
        TextView textView;
        ConstraintLayout constraintLayout2;
        TextView textView2;
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            this.this$0.showSecondaryLoading();
            return;
        }
        TextView textView3 = null;
        TextView textView4 = null;
        if (i == 2) {
            SendQRCodeRequest data = resource.getData();
            if (Intrinsics.areEqual(data != null ? data.getType() : null, "email")) {
                bottomSheetDialog2 = this.this$0.f101347i;
                if (bottomSheetDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetDialogByEmail");
                    bottomSheetDialog2 = null;
                }
                bottomSheetDialog2.dismiss();
            } else {
                bottomSheetDialog = this.this$0.f101354p;
                if (bottomSheetDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetDialogByMms");
                    bottomSheetDialog = null;
                }
                bottomSheetDialog.dismiss();
            }
            String str = Intrinsics.areEqual(data != null ? data.getType() : null, "email") ? "เมล์" : "เบอร์";
            String email = Intrinsics.areEqual(data != null ? data.getType() : null, "email") ? data.getEmail() : (data == null || (telephoneNumber = data.getTelephoneNumber()) == null) ? null : PhoneNumberExtKt.toPretty(telephoneNumber);
            this.this$0.dismissSecondaryLoading();
            this.this$0.m6915w("QR Code สำหรับสแกนตั้งค่า ESIM\nถูกส่งไปยัง" + str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + email + " แล้วค่ะ", email, data != null ? data.getType() : null);
        } else if (i != 3) {
        } else {
            SendQRCodeRequest data2 = resource.getData();
            if (Intrinsics.areEqual(data2 != null ? data2.getType() : null, "email")) {
                constraintLayout2 = this.this$0.f101353o;
                if (constraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutErrorEmail");
                    constraintLayout2 = null;
                }
                ViewVisibleExtKt.toVisible(constraintLayout2);
                textView2 = this.this$0.f101361w;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvErrorEmailBottomSheet");
                } else {
                    textView3 = textView2;
                }
                textView3.setText(resource.getMessage());
            } else {
                constraintLayout = this.this$0.f101360v;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutErrorMms");
                    constraintLayout = null;
                }
                ViewVisibleExtKt.toVisible(constraintLayout);
                textView = this.this$0.f101362x;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvErrorMMSBottomSheet");
                } else {
                    textView4 = textView;
                }
                textView4.setText(resource.getMessage());
            }
            this.this$0.dismissSecondaryLoading();
        }
    }
}