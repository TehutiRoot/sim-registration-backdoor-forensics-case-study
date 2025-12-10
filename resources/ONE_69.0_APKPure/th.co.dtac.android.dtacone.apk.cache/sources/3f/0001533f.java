package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.Fotoapparat;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.log.Logger;
import io.fotoapparat.log.LoggersKt;
import io.fotoapparat.parameter.ScaleType;
import io.fotoapparat.preview.Frame;
import io.fotoapparat.selector.LensPositionSelectorsKt;
import io.fotoapparat.view.CameraView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.QRCameraFragmentBase;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraFactory;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.FragmentPermissionsDelegate;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 M2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0003J%\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00132\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\bH&¢\u0006\u0004\b-\u0010.J*\u00104\u001a\u001d\u0012\u0013\u0012\u001100¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b4\u00105R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\bH\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040/8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u00105¨\u0006N"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/QRCameraFragmentBase;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", OperatorName.CLOSE_AND_STROKE, "startCamera", "stopCamera", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/fotoapparat/Fotoapparat;", "o", "(Landroid/content/Context;)Lio/fotoapparat/Fotoapparat;", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "onClean", "onPause", "Lio/fotoapparat/view/CameraView;", "cameraView", "Landroid/widget/TextView;", "noPermission", "setView", "(Lio/fotoapparat/view/CameraView;Landroid/widget/TextView;)V", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraFactory;", "cameraFactory", "initCameraHandler", "(Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraFactory;)V", "checkCameraPermission", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "onAction", "showDialogError", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "isShow", "visibleView", "(Z)V", "Lkotlin/Function1;", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, OperatorName.ENDPATH, "()Lkotlin/jvm/functions/Function1;", "i", "Lio/fotoapparat/view/CameraView;", OperatorName.SET_LINE_JOINSTYLE, "Landroid/widget/TextView;", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FragmentPermissionsDelegate;", OperatorName.NON_STROKING_CMYK, "Lkotlin/Lazy;", OperatorName.SAVE, "()Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FragmentPermissionsDelegate;", "permissionsDelegate", OperatorName.LINE_TO, "Z", "permissionsGranted", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraHandler;", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraHandler;", "cameraHandler", "Lio/fotoapparat/configuration/CameraConfiguration;", "p", "()Lio/fotoapparat/configuration/CameraConfiguration;", "cameraConfiguration", "getFrameProcess", "frameProcess", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.QRCameraFragmentBase */
/* loaded from: classes9.dex */
public abstract class QRCameraFragmentBase extends BaseFragment {
    @NotNull
    public static final String TAG = "QR_CAMERA";

    /* renamed from: i */
    public CameraView f104891i;

    /* renamed from: j */
    public TextView f104892j;

    /* renamed from: l */
    public boolean f104894l;

    /* renamed from: m */
    public CameraHandler f104895m;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: k */
    public final Lazy f104893k = LazyKt__LazyJVMKt.lazy(new QRCameraFragmentBase$permissionsDelegate$2(this));

    /* renamed from: n */
    public final Lazy f104896n = LazyKt__LazyJVMKt.lazy(new QRCameraFragmentBase$cameraConfiguration$2(this));

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/QRCameraFragmentBase$Companion;", "", "()V", "TAG", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.QRCameraFragmentBase$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: o */
    private final Fotoapparat m3535o(Context context) {
        CameraView cameraView = this.f104891i;
        if (cameraView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            cameraView = null;
        }
        Logger logcat = LoggersKt.logcat();
        return new Fotoapparat(context, cameraView, null, LensPositionSelectorsKt.back(), ScaleType.CenterCrop, m3534p(), QRCameraFragmentBase$createCamera$1.INSTANCE, null, logcat, 132, null);
    }

    /* renamed from: q */
    private final FragmentPermissionsDelegate m3533q() {
        return (FragmentPermissionsDelegate) this.f104893k.getValue();
    }

    /* renamed from: r */
    private final boolean m3532r() {
        boolean z;
        if (this.f104895m != null) {
            z = true;
        } else {
            z = false;
        }
        return z & this.f104894l;
    }

    /* renamed from: s */
    private final void m3531s() {
        stopCamera();
        startCamera();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDialogError$default(QRCameraFragmentBase qRCameraFragmentBase, String str, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = QRCameraFragmentBase$showDialogError$1.INSTANCE;
            }
            qRCameraFragmentBase.showDialogError(str, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialogError");
    }

    private final void startCamera() {
        if (m3532r()) {
            CameraHandler cameraHandler = this.f104895m;
            if (cameraHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraHandler");
                cameraHandler = null;
            }
            cameraHandler.start();
        }
    }

    private final void stopCamera() {
        if (m3532r()) {
            CameraHandler cameraHandler = this.f104895m;
            if (cameraHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraHandler");
                cameraHandler = null;
            }
            cameraHandler.stop();
        }
    }

    /* renamed from: t */
    public static final void m3530t(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void checkCameraPermission() {
        boolean hasCameraPermission = m3533q().hasCameraPermission();
        this.f104894l = hasCameraPermission;
        if (!hasCameraPermission) {
            CameraView cameraView = this.f104891i;
            if (cameraView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
                cameraView = null;
            }
            cameraView.setVisibility(8);
            m3533q().requestCameraPermission();
        }
    }

    @NotNull
    public abstract Function1<Frame, Unit> getFrameProcess();

    public final void initCameraHandler(@NotNull CameraFactory cameraFactory) {
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        Context context = getContext();
        if (context != null) {
            this.f104895m = cameraFactory.set(m3535o(context), getFrameProcess()).build();
        }
    }

    /* renamed from: n */
    public final Function1 m3536n() {
        return new QRCameraFragmentBase$cameraFrameProcessor$1(this);
    }

    public abstract void onClean();

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopCamera();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        CameraView cameraView = null;
        if (m3533q().resultGranted(i, permissions, grantResults)) {
            this.f104894l = true;
            TextView textView = this.f104892j;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noPermission");
                textView = null;
            }
            textView.setVisibility(8);
            CameraView cameraView2 = this.f104891i;
            if (cameraView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            } else {
                cameraView = cameraView2;
            }
            cameraView.setVisibility(0);
            m3531s();
            return;
        }
        TextView textView2 = this.f104892j;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noPermission");
        } else {
            cameraView = textView2;
        }
        cameraView.setVisibility(0);
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        startCamera();
        onClean();
    }

    /* renamed from: p */
    public final CameraConfiguration m3534p() {
        return (CameraConfiguration) this.f104896n.getValue();
    }

    public final void setView(@NotNull CameraView cameraView, @NotNull TextView noPermission) {
        Intrinsics.checkNotNullParameter(cameraView, "cameraView");
        Intrinsics.checkNotNullParameter(noPermission, "noPermission");
        this.f104891i = cameraView;
        if (cameraView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            cameraView = null;
        }
        cameraView.setVisibility(0);
        this.f104892j = noPermission;
    }

    public final void showDialogError(@NotNull String error, @NotNull final Function0<Unit> onAction) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        CustomDialogBox customDialogBox = new CustomDialogBox(getContext(), new CustomDialogBox.Callback() { // from class: gq1
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                QRCameraFragmentBase.m3530t(onAction);
            }
        });
        customDialogBox.setMessage(error);
        customDialogBox.show();
    }

    public abstract void visibleView(boolean z);
}