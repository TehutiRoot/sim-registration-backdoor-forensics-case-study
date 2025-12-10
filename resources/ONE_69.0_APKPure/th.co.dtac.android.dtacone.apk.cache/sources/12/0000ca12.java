package io.fotoapparat;

import android.content.Context;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.concurrent.CameraExecutor;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.configuration.Configuration;
import io.fotoapparat.error.ErrorCallbacksKt;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.display.Display;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import io.fotoapparat.log.Logger;
import io.fotoapparat.log.LoggersKt;
import io.fotoapparat.parameter.ScaleType;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.result.FocusResult;
import io.fotoapparat.result.PendingResult;
import io.fotoapparat.result.PhotoResult;
import io.fotoapparat.selector.LensPositionSelectorsKt;
import io.fotoapparat.selector.SelectorsKt;
import io.fotoapparat.view.CameraRenderer;
import io.fotoapparat.view.FocalPointSelector;
import java.util.concurrent.Future;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Q2\u00020\u0001:\u0001QB\u008e\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012%\b\u0002\u0010\r\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bj\u0002`\u000b¢\u0006\u0002\b\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\bj\u0002`\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\f\u0012\u0004\u0012\u00020#0\"j\u0002`$¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\f\u0012\u0004\u0012\u00020'0\"j\u0002`(¢\u0006\u0004\b)\u0010&J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130,2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130,2\b\b\u0001\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b3\u00104J\u0013\u00106\u001a\b\u0012\u0004\u0012\u0002050\"¢\u0006\u0004\b6\u0010&J:\u00107\u001a\u00020\u00132#\u0010\r\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b7\u00108J2\u0010;\u001a\u00020:2#\u00109\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bj\u0002`\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\bj\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b=\u0010O¨\u0006R"}, m29142d2 = {"Lio/fotoapparat/Fotoapparat;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/fotoapparat/view/CameraRenderer;", Promotion.ACTION_VIEW, "Lio/fotoapparat/view/FocalPointSelector;", "focusView", "Lkotlin/Function1;", "", "Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/selector/LensPositionSelector;", "Lkotlin/ExtensionFunctionType;", "lensPosition", "Lio/fotoapparat/parameter/ScaleType;", "scaleType", "Lio/fotoapparat/configuration/CameraConfiguration;", "cameraConfiguration", "Lio/fotoapparat/exception/camera/CameraException;", "", "Lio/fotoapparat/error/CameraErrorCallback;", "cameraErrorCallback", "Lio/fotoapparat/concurrent/CameraExecutor;", "executor", "Lio/fotoapparat/log/Logger;", "logger", "<init>", "(Landroid/content/Context;Lio/fotoapparat/view/CameraRenderer;Lio/fotoapparat/view/FocalPointSelector;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/parameter/ScaleType;Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/concurrent/CameraExecutor;Lio/fotoapparat/log/Logger;)V", "start", "()V", "stop", "Lio/fotoapparat/result/PhotoResult;", "takePicture", "()Lio/fotoapparat/result/PhotoResult;", "Lio/fotoapparat/result/PendingResult;", "Lio/fotoapparat/capability/Capabilities;", "Lio/fotoapparat/result/CapabilitiesResult;", "getCapabilities", "()Lio/fotoapparat/result/PendingResult;", "Lio/fotoapparat/parameter/camera/CameraParameters;", "Lio/fotoapparat/result/ParametersResult;", "getCurrentParameters", "Lio/fotoapparat/configuration/Configuration;", "newConfiguration", "Ljava/util/concurrent/Future;", "updateConfiguration", "(Lio/fotoapparat/configuration/Configuration;)Ljava/util/concurrent/Future;", "", "zoomLevel", "setZoom", "(F)Ljava/util/concurrent/Future;", "autoFocus", "()Lio/fotoapparat/Fotoapparat;", "Lio/fotoapparat/result/FocusResult;", "focus", "switchTo", "(Lkotlin/jvm/functions/Function1;Lio/fotoapparat/configuration/CameraConfiguration;)V", "selector", "", "isAvailable", "(Lkotlin/jvm/functions/Function1;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/concurrent/CameraExecutor;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/log/Logger;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "mainThreadErrorCallback", "Lio/fotoapparat/hardware/display/Display;", "d", "Lio/fotoapparat/hardware/display/Display;", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Lio/fotoapparat/hardware/Device;", "e", "Lio/fotoapparat/hardware/Device;", "device", "Lio/fotoapparat/hardware/orientation/OrientationSensor;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", "()Lio/fotoapparat/hardware/orientation/OrientationSensor;", "orientationSensor", "Companion", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Fotoapparat {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: g */
    public static final CameraExecutor f62960g = new CameraExecutor(null, 1, null);

    /* renamed from: a */
    public final CameraExecutor f62961a;

    /* renamed from: b */
    public final Logger f62962b;

    /* renamed from: c */
    public final Function1 f62963c;

    /* renamed from: d */
    public final Display f62964d;

    /* renamed from: e */
    public final Device f62965e;

    /* renamed from: f */
    public final Lazy f62966f;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/exception/camera/CameraException;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: io.fotoapparat.Fotoapparat$1 */
    /* loaded from: classes5.dex */
    public static final class C104791 extends Lambda implements Function1<CameraException, Unit> {
        public static final C104791 INSTANCE = new C104791();

        public C104791() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull CameraException it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CameraException cameraException) {
            invoke2(cameraException);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lio/fotoapparat/Fotoapparat$Companion;", "", "()V", "EXECUTOR", "Lio/fotoapparat/concurrent/CameraExecutor;", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "Lio/fotoapparat/FotoapparatBuilder;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FotoapparatBuilder with(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new FotoapparatBuilder(context);
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view) {
        this(context, view, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @JvmStatic
    @NotNull
    public static final FotoapparatBuilder with(@NotNull Context context) {
        return Companion.with(context);
    }

    /* renamed from: a */
    public final OrientationSensor m30906a() {
        return (OrientationSensor) this.f62966f.getValue();
    }

    @NotNull
    public final Fotoapparat autoFocus() {
        this.f62962b.recordMethod();
        focus();
        return this;
    }

    @NotNull
    public final PendingResult<FocusResult> focus() {
        this.f62962b.recordMethod();
        return PendingResult.Companion.fromFuture$fotoapparat_release(this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$focus$future$1(this.f62965e))), this.f62962b);
    }

    @NotNull
    public final PendingResult<Capabilities> getCapabilities() {
        this.f62962b.recordMethod();
        return PendingResult.Companion.fromFuture$fotoapparat_release(this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$getCapabilities$future$1(this.f62965e))), this.f62962b);
    }

    @NotNull
    public final PendingResult<CameraParameters> getCurrentParameters() {
        this.f62962b.recordMethod();
        return PendingResult.Companion.fromFuture$fotoapparat_release(this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$getCurrentParameters$future$1(this.f62965e))), this.f62962b);
    }

    public final boolean isAvailable(@NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return this.f62965e.canSelectCamera(selector);
    }

    @NotNull
    public final Future<Unit> setZoom(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        return this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$setZoom$1(this, f)));
    }

    public final void start() {
        this.f62962b.recordMethod();
        this.f62961a.execute(new CameraExecutor.Operation(false, new Fotoapparat$start$1(this), 1, null));
    }

    public final void stop() {
        this.f62962b.recordMethod();
        this.f62961a.cancelTasks();
        this.f62961a.execute(new CameraExecutor.Operation(false, new Fotoapparat$stop$1(this), 1, null));
    }

    public final void switchTo(@NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition, @NotNull CameraConfiguration cameraConfiguration) {
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        this.f62962b.recordMethod();
        this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$switchTo$1(this, lensPosition, cameraConfiguration)));
    }

    @NotNull
    public final PhotoResult takePicture() {
        this.f62962b.recordMethod();
        return PhotoResult.Companion.fromFuture$fotoapparat_release(this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$takePicture$future$1(this.f62965e))), this.f62962b);
    }

    @NotNull
    public final Future<Unit> updateConfiguration(@NotNull Configuration newConfiguration) {
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        return this.f62961a.execute(new CameraExecutor.Operation(true, new Fotoapparat$updateConfiguration$1(this, newConfiguration)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector) {
        this(context, view, focalPointSelector, null, null, null, null, null, null, 504, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition) {
        this(context, view, focalPointSelector, lensPosition, null, null, null, null, null, 496, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition, @NotNull ScaleType scaleType) {
        this(context, view, focalPointSelector, lensPosition, scaleType, null, null, null, null, 480, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition, @NotNull ScaleType scaleType, @NotNull CameraConfiguration cameraConfiguration) {
        this(context, view, focalPointSelector, lensPosition, scaleType, cameraConfiguration, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition, @NotNull ScaleType scaleType, @NotNull CameraConfiguration cameraConfiguration, @NotNull Function1<? super CameraException, Unit> cameraErrorCallback) {
        this(context, view, focalPointSelector, lensPosition, scaleType, cameraConfiguration, cameraErrorCallback, null, null, 384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        Intrinsics.checkNotNullParameter(cameraErrorCallback, "cameraErrorCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition, @NotNull ScaleType scaleType, @NotNull CameraConfiguration cameraConfiguration, @NotNull Function1<? super CameraException, Unit> cameraErrorCallback, @NotNull CameraExecutor executor) {
        this(context, view, focalPointSelector, lensPosition, scaleType, cameraConfiguration, cameraErrorCallback, executor, null, 256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        Intrinsics.checkNotNullParameter(cameraErrorCallback, "cameraErrorCallback");
        Intrinsics.checkNotNullParameter(executor, "executor");
    }

    @JvmOverloads
    public Fotoapparat(@NotNull Context context, @NotNull CameraRenderer view, @Nullable FocalPointSelector focalPointSelector, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPosition, @NotNull ScaleType scaleType, @NotNull CameraConfiguration cameraConfiguration, @NotNull Function1<? super CameraException, Unit> cameraErrorCallback, @NotNull CameraExecutor executor, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        Intrinsics.checkNotNullParameter(cameraErrorCallback, "cameraErrorCallback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f62961a = executor;
        this.f62962b = logger;
        this.f62963c = ErrorCallbacksKt.onMainThread(cameraErrorCallback);
        Display display = new Display(context);
        this.f62964d = display;
        this.f62965e = new Device(logger, display, scaleType, view, focalPointSelector, executor, 0, cameraConfiguration, lensPosition, 64, null);
        this.f62966f = LazyKt__LazyJVMKt.lazy(new Fotoapparat$orientationSensor$2(context, this));
        logger.recordMethod();
    }

    public /* synthetic */ Fotoapparat(Context context, CameraRenderer cameraRenderer, FocalPointSelector focalPointSelector, Function1 function1, ScaleType scaleType, CameraConfiguration cameraConfiguration, Function1 function12, CameraExecutor cameraExecutor, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cameraRenderer, (i & 4) != 0 ? null : focalPointSelector, (i & 8) != 0 ? SelectorsKt.firstAvailable(LensPositionSelectorsKt.back(), LensPositionSelectorsKt.front(), LensPositionSelectorsKt.external()) : function1, (i & 16) != 0 ? ScaleType.CenterCrop : scaleType, (i & 32) != 0 ? CameraConfiguration.Companion.m74249default() : cameraConfiguration, (i & 64) != 0 ? C104791.INSTANCE : function12, (i & 128) != 0 ? f62960g : cameraExecutor, (i & 256) != 0 ? LoggersKt.none() : logger);
    }
}