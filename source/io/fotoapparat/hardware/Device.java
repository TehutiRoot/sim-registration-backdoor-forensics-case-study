package io.fotoapparat.hardware;

import android.hardware.Camera;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.characteristic.CameraInfoProviderKt;
import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.concurrent.CameraExecutor;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.configuration.Configuration;
import io.fotoapparat.exception.camera.UnsupportedLensException;
import io.fotoapparat.hardware.display.Display;
import io.fotoapparat.hardware.orientation.Orientation;
import io.fotoapparat.log.Logger;
import io.fotoapparat.parameter.ScaleType;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.preview.Frame;
import io.fotoapparat.view.CameraRenderer;
import io.fotoapparat.view.FocalPointSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012#\u0010\u0017\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012j\u0002`\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001c\u001a\u00020\u001b2#\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012j\u0002`\u0015¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u0013\u0010#\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J4\u0010-\u001a\u00020\u001e2#\u0010,\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012j\u0002`\u0015¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u0002062\u0006\u00105\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u00108J2\u0010>\u001a%\u0012\u0013\u0012\u001109¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0012j\u0004\u0018\u0001`=H\u0016¢\u0006\u0004\b>\u0010?J,\u0010@\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012j\u0002`\u0015¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b@\u0010?R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\"0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR3\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012j\u0002`\u0015¢\u0006\u0002\b\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\"0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, m28850d2 = {"Lio/fotoapparat/hardware/Device;", "", "Lio/fotoapparat/log/Logger;", "logger", "Lio/fotoapparat/hardware/display/Display;", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Lio/fotoapparat/parameter/ScaleType;", "scaleType", "Lio/fotoapparat/view/CameraRenderer;", "cameraRenderer", "Lio/fotoapparat/view/FocalPointSelector;", "focusPointSelector", "Lio/fotoapparat/concurrent/CameraExecutor;", "executor", "", "numberOfCameras", "Lio/fotoapparat/configuration/CameraConfiguration;", "initialConfiguration", "Lkotlin/Function1;", "", "Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/selector/LensPositionSelector;", "Lkotlin/ExtensionFunctionType;", "initialLensPositionSelector", "<init>", "(Lio/fotoapparat/log/Logger;Lio/fotoapparat/hardware/display/Display;Lio/fotoapparat/parameter/ScaleType;Lio/fotoapparat/view/CameraRenderer;Lio/fotoapparat/view/FocalPointSelector;Lio/fotoapparat/concurrent/CameraExecutor;ILio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;)V", "lensPositionSelector", "", "canSelectCamera", "(Lkotlin/jvm/functions/Function1;)Z", "", "selectCamera", "()V", "clearSelectedCamera", "Lio/fotoapparat/hardware/CameraDevice;", "awaitSelectedCamera", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectedCamera", "()Lio/fotoapparat/hardware/CameraDevice;", "hasSelectedCamera", "()Z", "Lio/fotoapparat/hardware/orientation/Orientation;", "getScreenOrientation", "()Lio/fotoapparat/hardware/orientation/Orientation;", "newLensPosition", "updateLensPositionSelector", "(Lkotlin/jvm/functions/Function1;)V", "Lio/fotoapparat/configuration/Configuration;", "newConfiguration", "updateConfiguration", "(Lio/fotoapparat/configuration/Configuration;)V", "getConfiguration", "()Lio/fotoapparat/configuration/CameraConfiguration;", "cameraDevice", "Lio/fotoapparat/parameter/camera/CameraParameters;", "getCameraParameters", "(Lio/fotoapparat/hardware/CameraDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "Lio/fotoapparat/util/FrameProcessor;", "getFrameProcessor", "()Lkotlin/jvm/functions/Function1;", "getLensPositionSelector", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/log/Logger;", "getLogger$fotoapparat_release", "()Lio/fotoapparat/log/Logger;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/hardware/display/Display;", OperatorName.CURVE_TO, "Lio/fotoapparat/parameter/ScaleType;", "getScaleType$fotoapparat_release", "()Lio/fotoapparat/parameter/ScaleType;", "d", "Lio/fotoapparat/view/CameraRenderer;", "getCameraRenderer$fotoapparat_release", "()Lio/fotoapparat/view/CameraRenderer;", "e", "Lio/fotoapparat/view/FocalPointSelector;", "getFocusPointSelector$fotoapparat_release", "()Lio/fotoapparat/view/FocalPointSelector;", OperatorName.FILL_NON_ZERO, "Lio/fotoapparat/concurrent/CameraExecutor;", "getExecutor$fotoapparat_release", "()Lio/fotoapparat/concurrent/CameraExecutor;", "", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "cameras", OperatorName.CLOSE_PATH, "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/CompletableDeferred;", "i", "Lkotlinx/coroutines/CompletableDeferred;", "selectedCameraDevice", OperatorName.SET_LINE_JOINSTYLE, "Lio/fotoapparat/configuration/CameraConfiguration;", "savedConfiguration", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device.kt\nio/fotoapparat/hardware/Device\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1549#2:198\n1620#2,3:199\n1#3:202\n*S KotlinDebug\n*F\n+ 1 Device.kt\nio/fotoapparat/hardware/Device\n*L\n38#1:198\n38#1:199,3\n*E\n"})
/* loaded from: classes5.dex */
public class Device {

    /* renamed from: a */
    public final Logger f62968a;

    /* renamed from: b */
    public final Display f62969b;

    /* renamed from: c */
    public final ScaleType f62970c;

    /* renamed from: d */
    public final CameraRenderer f62971d;

    /* renamed from: e */
    public final FocalPointSelector f62972e;

    /* renamed from: f */
    public final CameraExecutor f62973f;

    /* renamed from: g */
    public final List f62974g;

    /* renamed from: h */
    public Function1 f62975h;

    /* renamed from: i */
    public CompletableDeferred f62976i;

    /* renamed from: j */
    public CameraConfiguration f62977j;

    public Device(@NotNull Logger logger, @NotNull Display display, @NotNull ScaleType scaleType, @NotNull CameraRenderer cameraRenderer, @Nullable FocalPointSelector focalPointSelector, @NotNull CameraExecutor executor, int i, @NotNull CameraConfiguration initialConfiguration, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> initialLensPositionSelector) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraRenderer, "cameraRenderer");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(initialConfiguration, "initialConfiguration");
        Intrinsics.checkNotNullParameter(initialLensPositionSelector, "initialLensPositionSelector");
        this.f62968a = logger;
        this.f62969b = display;
        this.f62970c = scaleType;
        this.f62971d = cameraRenderer;
        this.f62972e = focalPointSelector;
        this.f62973f = executor;
        IntRange until = AbstractC11719c.until(0, i);
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(new CameraDevice(getLogger$fotoapparat_release(), CameraInfoProviderKt.getCharacteristics(((IntIterator) it).nextInt())));
        }
        this.f62974g = arrayList;
        this.f62975h = initialLensPositionSelector;
        this.f62976i = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.f62977j = CameraConfiguration.Companion.m74065default();
        updateLensPositionSelector(initialLensPositionSelector);
        this.f62977j = initialConfiguration;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m30537a(Device device2, Continuation continuation) {
        return device2.f62976i.await(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m30536b(io.fotoapparat.hardware.Device r4, io.fotoapparat.hardware.CameraDevice r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof io.fotoapparat.hardware.Device$getCameraParameters$1
            if (r0 == 0) goto L13
            r0 = r6
            io.fotoapparat.hardware.Device$getCameraParameters$1 r0 = (io.fotoapparat.hardware.Device$getCameraParameters$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.fotoapparat.hardware.Device$getCameraParameters$1 r0 = new io.fotoapparat.hardware.Device$getCameraParameters$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            io.fotoapparat.configuration.CameraConfiguration r4 = (io.fotoapparat.configuration.CameraConfiguration) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            io.fotoapparat.configuration.CameraConfiguration r4 = r4.f62977j
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r5.getCapabilities(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            io.fotoapparat.capability.Capabilities r6 = (io.fotoapparat.capability.Capabilities) r6
            io.fotoapparat.parameter.camera.CameraParameters r4 = io.fotoapparat.parameter.camera.provide.CameraParametersProviderKt.getCameraParameters(r6, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.hardware.Device.m30536b(io.fotoapparat.hardware.Device, io.fotoapparat.hardware.CameraDevice, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public Object awaitSelectedCamera(@NotNull Continuation<? super CameraDevice> continuation) {
        return m30537a(this, continuation);
    }

    public boolean canSelectCamera(@NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPositionSelector) {
        Intrinsics.checkNotNullParameter(lensPositionSelector, "lensPositionSelector");
        if (DeviceKt.selectCamera(this.f62974g, lensPositionSelector) != null) {
            return true;
        }
        return false;
    }

    public void clearSelectedCamera() {
        this.f62976i = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    @Nullable
    public Object getCameraParameters(@NotNull CameraDevice cameraDevice, @NotNull Continuation<? super CameraParameters> continuation) {
        return m30536b(this, cameraDevice, continuation);
    }

    @NotNull
    public CameraRenderer getCameraRenderer$fotoapparat_release() {
        return this.f62971d;
    }

    @NotNull
    public CameraConfiguration getConfiguration() {
        return this.f62977j;
    }

    @NotNull
    public final CameraExecutor getExecutor$fotoapparat_release() {
        return this.f62973f;
    }

    @Nullable
    public final FocalPointSelector getFocusPointSelector$fotoapparat_release() {
        return this.f62972e;
    }

    @Nullable
    public Function1<Frame, Unit> getFrameProcessor() {
        return this.f62977j.getFrameProcessor();
    }

    @NotNull
    public Function1<Iterable<? extends LensPosition>, LensPosition> getLensPositionSelector() {
        return this.f62975h;
    }

    @NotNull
    public Logger getLogger$fotoapparat_release() {
        return this.f62968a;
    }

    @NotNull
    public ScaleType getScaleType$fotoapparat_release() {
        return this.f62970c;
    }

    @NotNull
    public Orientation getScreenOrientation() {
        return this.f62969b.getOrientation();
    }

    @NotNull
    public CameraDevice getSelectedCamera() {
        try {
            return (CameraDevice) this.f62976i.getCompleted();
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Camera has not started!");
        }
    }

    public boolean hasSelectedCamera() {
        return this.f62976i.isCompleted();
    }

    public void selectCamera() {
        getLogger$fotoapparat_release().recordMethod();
        CameraDevice selectCamera = DeviceKt.selectCamera(this.f62974g, this.f62975h);
        if (selectCamera != null) {
            this.f62976i.complete(selectCamera);
        } else {
            this.f62976i.completeExceptionally(new UnsupportedLensException());
        }
    }

    public void updateConfiguration(@NotNull Configuration newConfiguration) {
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        getLogger$fotoapparat_release().recordMethod();
        this.f62977j = DeviceKt.updateConfiguration(this.f62977j, newConfiguration);
    }

    public void updateLensPositionSelector(@NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> newLensPosition) {
        Intrinsics.checkNotNullParameter(newLensPosition, "newLensPosition");
        getLogger$fotoapparat_release().recordMethod();
        this.f62975h = newLensPosition;
    }

    public /* synthetic */ Device(Logger logger, Display display, ScaleType scaleType, CameraRenderer cameraRenderer, FocalPointSelector focalPointSelector, CameraExecutor cameraExecutor, int i, CameraConfiguration cameraConfiguration, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, display, scaleType, cameraRenderer, focalPointSelector, cameraExecutor, (i2 & 64) != 0 ? Camera.getNumberOfCameras() : i, cameraConfiguration, function1);
    }
}
