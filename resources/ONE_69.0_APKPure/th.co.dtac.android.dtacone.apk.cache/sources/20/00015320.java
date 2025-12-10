package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.Fotoapparat;
import io.fotoapparat.log.LoggersKt;
import io.fotoapparat.parameter.ScaleType;
import io.fotoapparat.result.BitmapPhoto;
import io.fotoapparat.selector.LensPositionSelectorsKt;
import io.fotoapparat.view.CameraView;
import io.fotoapparat.view.FocusView;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.ScaleAttr;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.Camera;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraFactory;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.FragmentPermissionsDelegate;
import timber.log.Timber;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J%\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0003J\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\u0003J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040/¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\u0003J\u001b\u00106\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b6\u00107J+\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\f\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001d\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\u00040CH&¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0006H&¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u000204H&¢\u0006\u0004\bK\u0010LJ-\u0010P\u001a\u0004\u0018\u00010O2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040/2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040/H&¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0004H&¢\u0006\u0004\bR\u0010\u0003J\u000f\u0010S\u001a\u00020\u0004H&¢\u0006\u0004\bS\u0010\u0003J\u000f\u0010T\u001a\u00020\u0004H&¢\u0006\u0004\bT\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010]R\u001b\u0010d\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010qR\u0016\u0010u\u001a\u00020s8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010tR\u0016\u0010w\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010vR\u0016\u0010y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010vR\u0016\u0010z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010vR\"\u0010~\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010f\u001a\u0004\b|\u0010\b\"\u0004\b}\u0010IR\"\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00040C8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0083\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/CameraFaceDetectFragmentBase;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", "u", "", OperatorName.CLOSE_AND_STROKE, "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/fotoapparat/Fotoapparat;", OperatorName.SAVE, "(Landroid/content/Context;)Lio/fotoapparat/Fotoapparat;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "onAttach", "(Landroid/content/Context;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", Constant.ServiceAPIName.onStart, "onStop", "Lio/fotoapparat/view/CameraView;", "cameraView", "Lio/fotoapparat/view/FocusView;", "focusView", "Landroid/widget/TextView;", "noPermission", "setView", "(Lio/fotoapparat/view/CameraView;Lio/fotoapparat/view/FocusView;Landroid/widget/TextView;)V", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraFactory;", "cameraFactory", "initCameraHandler", "(Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraFactory;)V", "startCamera", "stopCamera", "resetFaceDetectorAttemptCount", "checkCameraPermission", "max", "setDetectionAttempt", "(I)V", "Lkotlin/Function0;", "takePicture", "()Lkotlin/jvm/functions/Function0;", "takePhoto", "Lth/co/dtac/android/dtacone/model/Resource;", "Landroid/graphics/Bitmap;", "resource", "processResponse", "(Lth/co/dtac/android/dtacone/model/Resource;)V", "Lio/reactivex/Observable;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lth/co/dtac/android/dtacone/extension/ScaleAttr;", "scaleAttr", "retryScaleDownImage", "(Lio/reactivex/Observable;Lth/co/dtac/android/dtacone/extension/ScaleAttr;)Lio/reactivex/Observable;", "Landroid/view/Menu;", "menu", "onPrepareOptionsMenu", "(Landroid/view/Menu;)V", "Lkotlin/Function1;", "Lio/fotoapparat/result/BitmapPhoto;", "processImage", "()Lkotlin/jvm/functions/Function1;", "isShow", "visibleView", "(Z)V", "bitmap", "takePhotoAfter", "(Landroid/graphics/Bitmap;)V", "onCancel", "onNext", "Landroid/app/Dialog;", "createDialogConfirmUsedPhoto", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "onPreStart", "onPreClose", "showWarningNoFace", "i", "Lio/fotoapparat/view/CameraView;", OperatorName.SET_LINE_JOINSTYLE, "Lio/fotoapparat/view/FocusView;", "cameraFocusView", OperatorName.NON_STROKING_CMYK, "Landroid/widget/TextView;", OperatorName.LINE_TO, "Ljava/lang/String;", "filenameSoundShutter", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FragmentPermissionsDelegate;", OperatorName.MOVE_TO, "Lkotlin/Lazy;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FragmentPermissionsDelegate;", "permissionsDelegate", OperatorName.ENDPATH, "Z", "permissionsGranted", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraHandler;", "o", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraHandler;", "cameraHandler", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/Camera;", "p", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/Camera;", "activeCamera", "Landroid/media/MediaPlayer;", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "mAudioManager", "I", "originalVolume", "t", "faceDetectorAttemptMax", "faceDetectorAttemptCount", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getAutoStart", "setAutoStart", "autoStart", OperatorName.SET_LINE_WIDTH, "Lkotlin/jvm/functions/Function1;", "faceNotFoundCount", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase */
/* loaded from: classes9.dex */
public abstract class CameraFaceDetectFragmentBase extends BaseFragment {
    @NotNull
    public static final String TAG = "CAMERA";

    /* renamed from: i */
    public CameraView f104831i;

    /* renamed from: j */
    public FocusView f104832j;

    /* renamed from: k */
    public TextView f104833k;

    /* renamed from: n */
    public boolean f104836n;

    /* renamed from: o */
    public CameraHandler f104837o;

    /* renamed from: r */
    public AudioManager f104840r;

    /* renamed from: s */
    public int f104841s;

    /* renamed from: u */
    public int f104843u;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: l */
    public final String f104834l = "camera_shutter.mp3";

    /* renamed from: m */
    public final Lazy f104835m = LazyKt__LazyJVMKt.lazy(new CameraFaceDetectFragmentBase$permissionsDelegate$2(this));

    /* renamed from: p */
    public Camera f104838p = Camera.BackWide.INSTANCE;

    /* renamed from: q */
    public MediaPlayer f104839q = new MediaPlayer();

    /* renamed from: t */
    public int f104842t = 3;

    /* renamed from: v */
    public boolean f104844v = true;

    /* renamed from: w */
    public final Function1 f104845w = new CameraFaceDetectFragmentBase$faceNotFoundCount$1(this);

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/CameraFaceDetectFragmentBase$Companion;", "", "()V", "TAG", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase$WhenMappings */
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
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: t */
    public static final void m3569t(CameraFaceDetectFragmentBase this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AudioManager audioManager = this$0.f104840r;
        if (audioManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAudioManager");
            audioManager = null;
        }
        audioManager.setStreamVolume(3, this$0.f104841s, 0);
    }

    /* renamed from: v */
    public static final Pair m3567v(Throwable t1, Integer t2) {
        Intrinsics.checkNotNullParameter(t1, "t1");
        Intrinsics.checkNotNullParameter(t2, "t2");
        return new Pair(t1, t2);
    }

    /* renamed from: w */
    public static final ObservableSource m3566w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final Unit m3565x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    public final void checkCameraPermission() {
        boolean hasCameraPermission = m3571r().hasCameraPermission();
        this.f104836n = hasCameraPermission;
        if (!hasCameraPermission) {
            CameraView cameraView = this.f104831i;
            if (cameraView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
                cameraView = null;
            }
            cameraView.setVisibility(8);
            m3571r().requestCameraPermission();
        }
    }

    @Nullable
    public abstract Dialog createDialogConfirmUsedPhoto(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02);

    public final boolean getAutoStart() {
        return this.f104844v;
    }

    public final void initCameraHandler(@NotNull CameraFactory cameraFactory) {
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        AudioManager audioManager = this.f104840r;
        if (audioManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAudioManager");
            audioManager = null;
        }
        this.f104841s = audioManager.getStreamVolume(3);
        m3564y();
        Context context = getContext();
        if (context != null) {
            this.f104837o = CameraFactory.set$default(cameraFactory, m3572q(context), null, 2, null).build();
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            obj = activity.getSystemService("audio");
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.media.AudioManager");
        this.f104840r = (AudioManager) obj;
    }

    public abstract void onPreClose();

    public abstract void onPreStart();

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.action_search);
        if (findItem != null) {
            findItem.setVisible(false);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        CameraView cameraView = null;
        if (m3571r().resultGranted(i, permissions, grantResults)) {
            this.f104836n = true;
            TextView textView = this.f104833k;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noPermission");
                textView = null;
            }
            textView.setVisibility(8);
            CameraView cameraView2 = this.f104831i;
            if (cameraView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            } else {
                cameraView = cameraView2;
            }
            cameraView.setVisibility(0);
            m3568u();
            return;
        }
        TextView textView2 = this.f104833k;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noPermission");
        } else {
            cameraView = textView2;
        }
        cameraView.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f104843u = 0;
        if (this.f104844v) {
            startCamera();
        }
        onPreStart();
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.f104844v) {
            stopCamera();
        }
        this.f104839q.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: Hj
            {
                CameraFaceDetectFragmentBase.this = this;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                CameraFaceDetectFragmentBase.m3569t(CameraFaceDetectFragmentBase.this, mediaPlayer);
            }
        });
        onPreClose();
    }

    @NotNull
    public abstract Function1<BitmapPhoto, Unit> processImage();

    public final void processResponse(@NotNull Resource<Bitmap> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Resource<Bitmap> resourceContentIfNotHandled = resource.getResourceContentIfNotHandled();
        if (resourceContentIfNotHandled != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    Function1 function1 = this.f104845w;
                    Bitmap data = resourceContentIfNotHandled.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type android.graphics.Bitmap");
                    function1.invoke(data);
                    return;
                }
                return;
            }
            Bitmap data2 = resourceContentIfNotHandled.getData();
            Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type android.graphics.Bitmap");
            takePhotoAfter(data2);
        }
    }

    /* renamed from: q */
    public final Fotoapparat m3572q(Context context) {
        CameraView cameraView;
        FocusView focusView;
        CameraView cameraView2 = this.f104831i;
        if (cameraView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            cameraView = null;
        } else {
            cameraView = cameraView2;
        }
        FocusView focusView2 = this.f104832j;
        if (focusView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraFocusView");
            focusView = null;
        } else {
            focusView = focusView2;
        }
        return new Fotoapparat(context, cameraView, focusView, LensPositionSelectorsKt.back(), ScaleType.CenterCrop, this.f104838p.getConfiguration(), CameraFaceDetectFragmentBase$createCamera$1.INSTANCE, null, LoggersKt.logcat(), 128, null);
    }

    /* renamed from: r */
    public final FragmentPermissionsDelegate m3571r() {
        return (FragmentPermissionsDelegate) this.f104835m.getValue();
    }

    public final void resetFaceDetectorAttemptCount() {
        this.f104843u = 0;
    }

    @Nullable
    public final Observable<Unit> retryScaleDownImage(@NotNull Observable<Throwable> error, @NotNull ScaleAttr scaleAttr) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scaleAttr, "scaleAttr");
        Observable<R> zipWith = error.zipWith(Observable.range(1, 4), new BiFunction() { // from class: Ij
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Pair m3567v;
                m3567v = CameraFaceDetectFragmentBase.m3567v((Throwable) obj, (Integer) obj2);
                return m3567v;
            }
        });
        final CameraFaceDetectFragmentBase$retryScaleDownImage$2 cameraFaceDetectFragmentBase$retryScaleDownImage$2 = CameraFaceDetectFragmentBase$retryScaleDownImage$2.INSTANCE;
        Observable flatMap = zipWith.flatMap(new Function() { // from class: Jj
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m3566w;
                m3566w = CameraFaceDetectFragmentBase.m3566w(cameraFaceDetectFragmentBase$retryScaleDownImage$2, obj);
                return m3566w;
            }
        });
        final CameraFaceDetectFragmentBase$retryScaleDownImage$3 cameraFaceDetectFragmentBase$retryScaleDownImage$3 = new CameraFaceDetectFragmentBase$retryScaleDownImage$3(scaleAttr);
        return flatMap.map(new Function() { // from class: Kj
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Unit m3565x;
                m3565x = CameraFaceDetectFragmentBase.m3565x(cameraFaceDetectFragmentBase$retryScaleDownImage$3, obj);
                return m3565x;
            }
        });
    }

    /* renamed from: s */
    public final boolean m3570s() {
        boolean z;
        if (this.f104837o != null) {
            z = true;
        } else {
            z = false;
        }
        return z & this.f104836n;
    }

    public final void setAutoStart(boolean z) {
        this.f104844v = z;
    }

    public final void setDetectionAttempt(int i) {
        this.f104842t = i;
    }

    public final void setView(@NotNull CameraView cameraView, @NotNull FocusView focusView, @NotNull TextView noPermission) {
        Intrinsics.checkNotNullParameter(cameraView, "cameraView");
        Intrinsics.checkNotNullParameter(focusView, "focusView");
        Intrinsics.checkNotNullParameter(noPermission, "noPermission");
        this.f104831i = cameraView;
        if (cameraView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            cameraView = null;
        }
        cameraView.setVisibility(0);
        this.f104832j = focusView;
        this.f104833k = noPermission;
    }

    public abstract void showWarningNoFace();

    public final void startCamera() {
        if (m3570s()) {
            CameraHandler cameraHandler = this.f104837o;
            if (cameraHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraHandler");
                cameraHandler = null;
            }
            cameraHandler.start();
        }
    }

    public final void stopCamera() {
        if (m3570s()) {
            CameraHandler cameraHandler = this.f104837o;
            if (cameraHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraHandler");
                cameraHandler = null;
            }
            cameraHandler.stop();
        }
    }

    public final void takePhoto() {
        if (this.f104839q.isPlaying()) {
            this.f104839q.stop();
        }
        this.f104839q.start();
        CameraHandler cameraHandler = this.f104837o;
        if (cameraHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraHandler");
            cameraHandler = null;
        }
        cameraHandler.takePicture(processImage());
    }

    public abstract void takePhotoAfter(@NotNull Bitmap bitmap);

    @NotNull
    public final Function0<Unit> takePicture() {
        return new CameraFaceDetectFragmentBase$takePicture$1(this);
    }

    /* renamed from: u */
    public final void m3568u() {
        stopCamera();
        startCamera();
    }

    public abstract void visibleView(boolean z);

    /* renamed from: y */
    public final void m3564y() {
        AssetManager assets;
        try {
            AudioManager audioManager = this.f104840r;
            AssetFileDescriptor assetFileDescriptor = null;
            if (audioManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAudioManager");
                audioManager = null;
            }
            audioManager.setStreamVolume(3, 10, 0);
            if (this.f104839q.isPlaying()) {
                this.f104839q.stop();
                this.f104839q.release();
                this.f104839q = new MediaPlayer();
            }
            FragmentActivity activity = getActivity();
            if (activity != null && (assets = activity.getAssets()) != null) {
                assetFileDescriptor = assets.openFd(this.f104834l);
            }
            if (assetFileDescriptor != null) {
                this.f104839q.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                assetFileDescriptor.close();
            }
            this.f104839q.prepare();
        } catch (Exception e) {
            Timber.tag(TAG).mo1398e(e);
        }
    }
}