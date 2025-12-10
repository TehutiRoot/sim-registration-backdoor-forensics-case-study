package io.fotoapparat.hardware;

import android.hardware.Camera;
import android.media.MediaRecorder;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.capability.provide.CapabilitiesProviderKt;
import io.fotoapparat.characteristic.Characteristics;
import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.characteristic.LensPositionCharacteristicKt;
import io.fotoapparat.coroutines.AwaitBroadcastChannel;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.metering.FocalRequest;
import io.fotoapparat.hardware.orientation.Orientation;
import io.fotoapparat.hardware.orientation.OrientationResolverKt;
import io.fotoapparat.hardware.orientation.OrientationState;
import io.fotoapparat.log.Logger;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.preview.Frame;
import io.fotoapparat.preview.PreviewStream;
import io.fotoapparat.result.FocusResult;
import io.fotoapparat.result.Photo;
import io.fotoapparat.util.StringExtensionsKt;
import io.fotoapparat.view.Preview;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\"\u001a\u00020\b2)\u0010!\u001a%\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bj\u0004\u0018\u0001` H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\b2\b\b\u0001\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\nJ\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\b2\b\b\u0001\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b?\u0010+J\u0019\u0010@\u001a\u00020\b2\b\b\u0001\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b@\u0010+J\u001b\u0010C\u001a\u00060AR\u00020B*\u00060AR\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010E\u001a\u00060AR\u00020B*\u00060AR\u00020BH\u0002¢\u0006\u0004\bE\u0010DJ\u0013\u0010F\u001a\u00020,*\u00020BH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\b*\u00020B2\u0006\u00100\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020\b*\u00020BH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010RR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160T8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bF\u0010U\u0012\u0004\bV\u0010\nR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010d\u001a\b\u0018\u00010AR\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010fR\u0016\u0010h\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010fR\u0016\u0010i\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, m28850d2 = {"Lio/fotoapparat/hardware/CameraDevice;", "", "Lio/fotoapparat/log/Logger;", "logger", "Lio/fotoapparat/characteristic/Characteristics;", "characteristics", "<init>", "(Lio/fotoapparat/log/Logger;Lio/fotoapparat/characteristic/Characteristics;)V", "", PDWindowsLaunchParams.OPERATION_OPEN, "()V", "close", "startPreview", "stopPreview", "unlock", "lock", "Lio/fotoapparat/result/Photo;", "takePhoto", "()Lio/fotoapparat/result/Photo;", "Lio/fotoapparat/capability/Capabilities;", "getCapabilities", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/fotoapparat/parameter/camera/CameraParameters;", "getParameters", "cameraParameters", "updateParameters", "(Lio/fotoapparat/parameter/camera/CameraParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "Lio/fotoapparat/util/FrameProcessor;", "frameProcessor", "updateFrameProcessor", "(Lkotlin/jvm/functions/Function1;)V", "Lio/fotoapparat/hardware/orientation/OrientationState;", "orientationState", "setDisplayOrientation", "(Lio/fotoapparat/hardware/orientation/OrientationState;)V", "", "level", "setZoom", "(F)V", "Lio/fotoapparat/result/FocusResult;", "autoFocus", "()Lio/fotoapparat/result/FocusResult;", "Lio/fotoapparat/hardware/metering/FocalRequest;", "focalRequest", "setFocalPoint", "(Lio/fotoapparat/hardware/metering/FocalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearFocalPoint", "Lio/fotoapparat/view/Preview;", "preview", "setDisplaySurface", "(Lio/fotoapparat/view/Preview;)V", "Landroid/media/MediaRecorder;", "mediaRecorder", "attachRecordingCamera", "(Landroid/media/MediaRecorder;)V", "Lio/fotoapparat/parameter/Resolution;", "getPreviewResolution", "()Lio/fotoapparat/parameter/Resolution;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Parameters;", "i", "d", "(Landroid/hardware/Camera;)Lio/fotoapparat/result/FocusResult;", OperatorName.LINE_TO, "(Landroid/hardware/Camera;Lio/fotoapparat/hardware/metering/FocalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OperatorName.CURVE_TO, "(Landroid/hardware/Camera;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/log/Logger;", "Lio/fotoapparat/characteristic/Characteristics;", "getCharacteristics", "()Lio/fotoapparat/characteristic/Characteristics;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "capabilities", "Lio/fotoapparat/coroutines/AwaitBroadcastChannel;", "Lio/fotoapparat/coroutines/AwaitBroadcastChannel;", "getCameraParameters$annotations", "Lio/fotoapparat/preview/PreviewStream;", "e", "Lio/fotoapparat/preview/PreviewStream;", "previewStream", "Landroid/view/Surface;", OperatorName.FILL_NON_ZERO, "Landroid/view/Surface;", "surface", OperatorName.NON_STROKING_GRAY, "Landroid/hardware/Camera;", "camera", OperatorName.CLOSE_PATH, "Landroid/hardware/Camera$Parameters;", "cachedCameraParameters", "Lio/fotoapparat/hardware/orientation/Orientation;", "Lio/fotoapparat/hardware/orientation/Orientation;", "displayOrientation", "imageOrientation", "previewOrientation", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public class CameraDevice {

    /* renamed from: a */
    public final Logger f62957a;

    /* renamed from: b */
    public final Characteristics f62958b;

    /* renamed from: c */
    public final CompletableDeferred f62959c;

    /* renamed from: d */
    public final AwaitBroadcastChannel f62960d;

    /* renamed from: e */
    public PreviewStream f62961e;

    /* renamed from: f */
    public Surface f62962f;

    /* renamed from: g */
    public Camera f62963g;

    /* renamed from: h */
    public Camera.Parameters f62964h;

    /* renamed from: i */
    public Orientation f62965i;

    /* renamed from: j */
    public Orientation f62966j;

    /* renamed from: k */
    public Orientation f62967k;

    public CameraDevice(@NotNull Logger logger, @NotNull Characteristics characteristics) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.f62957a = logger;
        this.f62958b = characteristics;
        this.f62959c = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.f62960d = new AwaitBroadcastChannel(null, null, 3, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m30556a(CountDownLatch countDownLatch, boolean z, Camera camera) {
        m30552e(countDownLatch, z, camera);
    }

    /* renamed from: e */
    public static final void m30552e(CountDownLatch latch, boolean z, Camera camera) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    /* renamed from: f */
    public static /* synthetic */ Object m30551f(CameraDevice cameraDevice, Continuation continuation) {
        cameraDevice.f62957a.recordMethod();
        return cameraDevice.f62959c.await(continuation);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m30550g(CameraDevice cameraDevice, Continuation continuation) {
        cameraDevice.f62957a.recordMethod();
        return cameraDevice.f62960d.getValue(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m30549h(io.fotoapparat.hardware.CameraDevice r5, io.fotoapparat.hardware.metering.FocalRequest r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof io.fotoapparat.hardware.CameraDevice$setFocalPoint$1
            if (r0 == 0) goto L13
            r0 = r7
            io.fotoapparat.hardware.CameraDevice$setFocalPoint$1 r0 = (io.fotoapparat.hardware.CameraDevice$setFocalPoint$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.fotoapparat.hardware.CameraDevice$setFocalPoint$1 r0 = new io.fotoapparat.hardware.CameraDevice$setFocalPoint$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L78
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            io.fotoapparat.hardware.metering.FocalRequest r6 = (io.fotoapparat.hardware.metering.FocalRequest) r6
            java.lang.Object r5 = r0.L$0
            io.fotoapparat.hardware.CameraDevice r5 = (io.fotoapparat.hardware.CameraDevice) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L58
        L41:
            kotlin.ResultKt.throwOnFailure(r7)
            io.fotoapparat.log.Logger r7 = r5.f62957a
            r7.recordMethod()
            kotlinx.coroutines.CompletableDeferred r7 = r5.f62959c
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            io.fotoapparat.capability.Capabilities r7 = (io.fotoapparat.capability.Capabilities) r7
            boolean r7 = io.fotoapparat.hardware.CameraDeviceKt.access$canSetFocusingAreas(r7)
            if (r7 == 0) goto L7b
            android.hardware.Camera r7 = r5.f62963g
            r2 = 0
            if (r7 != 0) goto L6b
            java.lang.String r7 = "camera"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r7 = r2
        L6b:
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r5 = r5.m30545l(r7, r6, r0)
            if (r5 != r1) goto L78
            return r1
        L78:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L7b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.hardware.CameraDevice.m30549h(io.fotoapparat.hardware.CameraDevice, io.fotoapparat.hardware.metering.FocalRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m30544m(io.fotoapparat.hardware.CameraDevice r4, io.fotoapparat.parameter.camera.CameraParameters r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof io.fotoapparat.hardware.CameraDevice$updateParameters$1
            if (r0 == 0) goto L13
            r0 = r6
            io.fotoapparat.hardware.CameraDevice$updateParameters$1 r0 = (io.fotoapparat.hardware.CameraDevice$updateParameters$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.fotoapparat.hardware.CameraDevice$updateParameters$1 r0 = new io.fotoapparat.hardware.CameraDevice$updateParameters$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.fotoapparat.parameter.camera.CameraParameters r5 = (io.fotoapparat.parameter.camera.CameraParameters) r5
            java.lang.Object r4 = r0.L$0
            io.fotoapparat.hardware.CameraDevice r4 = (io.fotoapparat.hardware.CameraDevice) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L51
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            io.fotoapparat.log.Logger r6 = r4.f62957a
            r6.recordMethod()
            io.fotoapparat.coroutines.AwaitBroadcastChannel r6 = r4.f62960d
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.send(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            io.fotoapparat.log.Logger r6 = r4.f62957a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "New camera parameters are: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.log(r0)
            android.hardware.Camera$Parameters r6 = r4.f62964h
            if (r6 != 0) goto L79
            android.hardware.Camera r6 = r4.f62963g
            if (r6 != 0) goto L75
            java.lang.String r6 = "camera"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            r6 = 0
        L75:
            android.hardware.Camera$Parameters r6 = r6.getParameters()
        L79:
            java.lang.String r0 = "cachedCameraParameters ?: camera.parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            android.hardware.Camera$Parameters r5 = io.fotoapparat.parameter.camera.apply.CameraParametersApplicatorKt.applyInto(r5, r6)
            android.hardware.Camera$Parameters r5 = r4.m30555b(r5)
            r4.m30548i(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.hardware.CameraDevice.m30544m(io.fotoapparat.hardware.CameraDevice, io.fotoapparat.parameter.camera.CameraParameters, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void attachRecordingCamera(@NotNull MediaRecorder mediaRecorder) {
        Intrinsics.checkNotNullParameter(mediaRecorder, "mediaRecorder");
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        mediaRecorder.setCamera(camera);
    }

    @NotNull
    public FocusResult autoFocus() {
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        return m30553d(camera);
    }

    /* renamed from: b */
    public final Camera.Parameters m30555b(Camera.Parameters parameters) {
        this.f62964h = parameters;
        return parameters;
    }

    /* renamed from: c */
    public final void m30554c(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setMeteringAreas(null);
        parameters.setFocusAreas(null);
        camera.setParameters(parameters);
    }

    public void clearFocalPoint() {
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        m30554c(camera);
    }

    public void close() {
        this.f62957a.recordMethod();
        Surface surface = this.f62962f;
        Camera camera = null;
        if (surface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surface");
            surface = null;
        }
        surface.release();
        Camera camera2 = this.f62963g;
        if (camera2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
        } else {
            camera = camera2;
        }
        camera.release();
    }

    /* renamed from: d */
    public final FocusResult m30553d(Camera camera) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            camera.autoFocus(new Camera.AutoFocusCallback() { // from class: xj
                @Override // android.hardware.Camera.AutoFocusCallback
                public final void onAutoFocus(boolean z, Camera camera2) {
                    CameraDevice.m30556a(countDownLatch, z, camera2);
                }
            });
            try {
                countDownLatch.await(3L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            return FocusResult.Focused.INSTANCE;
        } catch (Exception e) {
            Logger logger = this.f62957a;
            int cameraId = this.f62958b.getCameraId();
            String message = e.getMessage();
            logger.log("Failed to perform autofocus using device " + cameraId + " e: " + message);
            return FocusResult.UnableToFocus.INSTANCE;
        }
    }

    @Nullable
    public Object getCapabilities(@NotNull Continuation<? super Capabilities> continuation) {
        return m30551f(this, continuation);
    }

    @NotNull
    public final Characteristics getCharacteristics() {
        return this.f62958b;
    }

    @Nullable
    public Object getParameters(@NotNull Continuation<? super CameraParameters> continuation) {
        return m30550g(this, continuation);
    }

    @NotNull
    public Resolution getPreviewResolution() {
        Resolution m30541c;
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        Orientation orientation = null;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        Orientation orientation2 = this.f62967k;
        if (orientation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewOrientation");
        } else {
            orientation = orientation2;
        }
        m30541c = CameraDeviceKt.m30541c(camera, orientation);
        this.f62957a.log("Preview resolution is: " + m30541c);
        return m30541c;
    }

    /* renamed from: i */
    public final Camera.Parameters m30548i(Camera.Parameters parameters) {
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        camera.setParameters(parameters);
        return parameters;
    }

    /* renamed from: j */
    public final void m30547j(float f) {
        try {
            m30546k(f);
        } catch (Exception e) {
            Logger logger = this.f62957a;
            String message = e.getMessage();
            logger.log("Unable to change zoom level to " + f + " e: " + message);
        }
    }

    /* renamed from: k */
    public final void m30546k(float f) {
        Camera.Parameters parameters = this.f62964h;
        if (parameters == null) {
            Camera camera = this.f62963g;
            if (camera == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
                camera = null;
            }
            parameters = camera.getParameters();
        }
        parameters.setZoom((int) (parameters.getMaxZoom() * f));
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(parameters, "cachedCameraParameters ?…el).toInt()\n            }");
        m30548i(m30555b(parameters));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m30545l(android.hardware.Camera r5, io.fotoapparat.hardware.metering.FocalRequest r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof io.fotoapparat.hardware.CameraDevice$updateFocusingAreas$1
            if (r0 == 0) goto L13
            r0 = r7
            io.fotoapparat.hardware.CameraDevice$updateFocusingAreas$1 r0 = (io.fotoapparat.hardware.CameraDevice$updateFocusingAreas$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.fotoapparat.hardware.CameraDevice$updateFocusingAreas$1 r0 = new io.fotoapparat.hardware.CameraDevice$updateFocusingAreas$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.L$3
            android.hardware.Camera r5 = (android.hardware.Camera) r5
            java.lang.Object r6 = r0.L$2
            android.hardware.Camera$Parameters r6 = (android.hardware.Camera.Parameters) r6
            java.lang.Object r1 = r0.L$1
            android.hardware.Camera$Parameters r1 = (android.hardware.Camera.Parameters) r1
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L77
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.ResultKt.throwOnFailure(r7)
            io.fotoapparat.hardware.orientation.Orientation r7 = r4.f62965i
            if (r7 != 0) goto L4e
            java.lang.String r7 = "displayOrientation"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r7 = 0
        L4e:
            int r7 = r7.getDegrees()
            io.fotoapparat.characteristic.Characteristics r2 = r4.f62958b
            boolean r2 = r2.isMirrored()
            java.util.List r6 = io.fotoapparat.hardware.metering.convert.FocalPointConverterKt.toFocusAreas(r6, r7, r2)
            android.hardware.Camera$Parameters r7 = r5.getParameters()
            kotlinx.coroutines.CompletableDeferred r2 = r4.f62959c
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r0 = r2.await(r0)
            if (r0 != r1) goto L73
            return r1
        L73:
            r1 = r7
            r7 = r0
            r0 = r6
            r6 = r1
        L77:
            io.fotoapparat.capability.Capabilities r7 = (io.fotoapparat.capability.Capabilities) r7
            int r2 = r7.getMaxMeteringAreas()
            if (r2 <= 0) goto L82
            r6.setMeteringAreas(r0)
        L82:
            int r2 = r7.getMaxFocusAreas()
            if (r2 <= 0) goto L9e
            java.util.Set r7 = r7.getFocusModes()
            io.fotoapparat.parameter.FocusMode$Auto r2 = io.fotoapparat.parameter.FocusMode.Auto.INSTANCE
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L9b
            java.lang.String r7 = io.fotoapparat.parameter.camera.convert.FocusModeConverterKt.toCode(r2)
            r6.setFocusMode(r7)
        L9b:
            r6.setFocusAreas(r0)
        L9e:
            r5.setParameters(r1)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.hardware.CameraDevice.m30545l(android.hardware.Camera, io.fotoapparat.hardware.metering.FocalRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void lock() {
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        camera.lock();
    }

    public void open() {
        this.f62957a.recordMethod();
        LensPosition lensPosition = this.f62958b.getLensPosition();
        int cameraId = LensPositionCharacteristicKt.toCameraId(lensPosition);
        try {
            Camera open = Camera.open(cameraId);
            Intrinsics.checkNotNullExpressionValue(open, "open(cameraId)");
            this.f62963g = open;
            CompletableDeferred completableDeferred = this.f62959c;
            Camera camera = null;
            if (open == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
                open = null;
            }
            completableDeferred.complete(CapabilitiesProviderKt.getCapabilities(open));
            Camera camera2 = this.f62963g;
            if (camera2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
            } else {
                camera = camera2;
            }
            this.f62961e = new PreviewStream(camera);
        } catch (RuntimeException e) {
            throw new CameraException("Failed to open camera with lens position: " + lensPosition + " and id: " + cameraId, e);
        }
    }

    public void setDisplayOrientation(@NotNull OrientationState orientationState) {
        String str;
        Intrinsics.checkNotNullParameter(orientationState, "orientationState");
        this.f62957a.recordMethod();
        this.f62966j = OrientationResolverKt.computeImageOrientation(orientationState.getDeviceOrientation(), this.f62958b.getCameraOrientation(), this.f62958b.isMirrored());
        this.f62965i = OrientationResolverKt.computeDisplayOrientation(orientationState.getScreenOrientation(), this.f62958b.getCameraOrientation(), this.f62958b.isMirrored());
        this.f62967k = OrientationResolverKt.computePreviewOrientation(orientationState.getScreenOrientation(), this.f62958b.getCameraOrientation(), this.f62958b.isMirrored());
        Logger logger = this.f62957a;
        String lineSeparator = StringExtensionsKt.getLineSeparator();
        Orientation screenOrientation = orientationState.getScreenOrientation();
        String lineSeparator2 = StringExtensionsKt.getLineSeparator();
        Orientation cameraOrientation = this.f62958b.getCameraOrientation();
        String lineSeparator3 = StringExtensionsKt.getLineSeparator();
        if (this.f62958b.isMirrored()) {
            str = "mirrored.";
        } else {
            str = "not mirrored.";
        }
        logger.log("Orientations: " + lineSeparator + "Screen orientation (preview) is: " + screenOrientation + ". " + lineSeparator2 + "Camera sensor orientation is always at: " + cameraOrientation + ". " + lineSeparator3 + "Camera is " + str);
        Logger logger2 = this.f62957a;
        String lineSeparator4 = StringExtensionsKt.getLineSeparator();
        Orientation orientation = this.f62966j;
        Orientation orientation2 = null;
        if (orientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageOrientation");
            orientation = null;
        }
        int degrees = orientation.getDegrees();
        String lineSeparator5 = StringExtensionsKt.getLineSeparator();
        Orientation orientation3 = this.f62965i;
        if (orientation3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("displayOrientation");
            orientation3 = null;
        }
        int degrees2 = orientation3.getDegrees();
        String lineSeparator6 = StringExtensionsKt.getLineSeparator();
        Orientation orientation4 = this.f62967k;
        if (orientation4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewOrientation");
            orientation4 = null;
        }
        logger2.log("Orientation adjustments: " + lineSeparator4 + "Image orientation will be adjusted by: " + degrees + " degrees. " + lineSeparator5 + "Display orientation will be adjusted by: " + degrees2 + " degrees. " + lineSeparator6 + "Preview orientation will be adjusted by: " + orientation4.getDegrees() + " degrees.");
        PreviewStream previewStream = this.f62961e;
        if (previewStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewStream");
            previewStream = null;
        }
        Orientation orientation5 = this.f62967k;
        if (orientation5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewOrientation");
            orientation5 = null;
        }
        previewStream.setFrameOrientation(orientation5);
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        Orientation orientation6 = this.f62965i;
        if (orientation6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("displayOrientation");
        } else {
            orientation2 = orientation6;
        }
        camera.setDisplayOrientation(orientation2.getDegrees());
    }

    public void setDisplaySurface(@NotNull Preview preview) throws IOException {
        Surface m30540d;
        Intrinsics.checkNotNullParameter(preview, "preview");
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        m30540d = CameraDeviceKt.m30540d(camera, preview);
        this.f62962f = m30540d;
    }

    @Nullable
    public Object setFocalPoint(@NotNull FocalRequest focalRequest, @NotNull Continuation<? super Unit> continuation) {
        return m30549h(this, focalRequest, continuation);
    }

    public void setZoom(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f62957a.recordMethod();
        m30547j(f);
    }

    public void startPreview() {
        this.f62957a.recordMethod();
        try {
            Camera camera = this.f62963g;
            if (camera == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
                camera = null;
            }
            camera.startPreview();
        } catch (RuntimeException e) {
            LensPosition lensPosition = this.f62958b.getLensPosition();
            int cameraId = this.f62958b.getCameraId();
            throw new CameraException("Failed to start preview for camera with lens position: " + lensPosition + " and id: " + cameraId, e);
        }
    }

    public void stopPreview() {
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        camera.stopPreview();
    }

    @NotNull
    public Photo takePhoto() {
        Photo m30539e;
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        Orientation orientation = null;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        Orientation orientation2 = this.f62966j;
        if (orientation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageOrientation");
        } else {
            orientation = orientation2;
        }
        m30539e = CameraDeviceKt.m30539e(camera, orientation.getDegrees());
        return m30539e;
    }

    public void unlock() {
        this.f62957a.recordMethod();
        Camera camera = this.f62963g;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        camera.unlock();
    }

    public void updateFrameProcessor(@Nullable Function1<? super Frame, Unit> function1) {
        this.f62957a.recordMethod();
        PreviewStream previewStream = this.f62961e;
        if (previewStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewStream");
            previewStream = null;
        }
        previewStream.updateProcessorSafely(function1);
    }

    @Nullable
    public Object updateParameters(@NotNull CameraParameters cameraParameters, @NotNull Continuation<? super Unit> continuation) {
        return m30544m(this, cameraParameters, continuation);
    }
}
