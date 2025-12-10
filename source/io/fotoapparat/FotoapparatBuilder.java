package io.fotoapparat;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.error.CameraErrorListener;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.log.Logger;
import io.fotoapparat.log.LoggersKt;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.ScaleType;
import io.fotoapparat.preview.Frame;
import io.fotoapparat.preview.FrameProcessor;
import io.fotoapparat.selector.LensPositionSelectorsKt;
import io.fotoapparat.selector.SelectorsKt;
import io.fotoapparat.view.CameraRenderer;
import io.fotoapparat.view.FocusView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0011\u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0002`\u000e¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0019\u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000bj\u0002`\u0018¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0019\u0010\u0012J2\u0010\u001a\u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000bj\u0002`\u0018¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u001a\u0010\u0012J2\u0010\u001d\u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000bj\u0002`\u001c¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u001d\u0010\u0012J2\u0010 \u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000bj\u0002`\u001f¢\u0006\u0002\b\u000f¢\u0006\u0004\b \u0010\u0012J2\u0010#\u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\f\u0012\u0006\u0012\u0004\u0018\u00010!0\u000bj\u0002`\"¢\u0006\u0002\b\u000f¢\u0006\u0004\b#\u0010\u0012J2\u0010&\u001a\u00020\u00002#\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\f\u0012\u0006\u0012\u0004\u0018\u00010$0\u000bj\u0002`%¢\u0006\u0002\b\u000f¢\u0006\u0004\b&\u0010\u0012J,\u0010)\u001a\u00020\u00002\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010$0\u000bj\u0002`(¢\u0006\u0002\b\u000f¢\u0006\u0004\b)\u0010\u0012J,\u0010+\u001a\u00020\u00002\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010$0\u000bj\u0002`*¢\u0006\u0002\b\u000f¢\u0006\u0004\b+\u0010\u0012J4\u00102\u001a\u00020\u00002%\u00102\u001a!\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u0002000\u000bj\u0002`1¢\u0006\u0004\b2\u0010\u0012J\u0017\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000103¢\u0006\u0004\b2\u00104J\u0015\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J%\u0010:\u001a\u00020\u00002\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002000\u000bj\u0002`=¢\u0006\u0004\b:\u0010\u0012J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\b¢\u0006\u0004\bC\u0010DR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010ER?\u0010L\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0002`\u000e¢\u0006\u0002\b\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR2\u0010:\u001a\u0012\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002000\u000bj\u0002`=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010A\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006p"}, m28850d2 = {"Lio/fotoapparat/FotoapparatBuilder;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lio/fotoapparat/view/CameraRenderer;", "renderer", "Lio/fotoapparat/Fotoapparat;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lio/fotoapparat/view/CameraRenderer;)Lio/fotoapparat/Fotoapparat;", "Lkotlin/Function1;", "", "Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/selector/LensPositionSelector;", "Lkotlin/ExtensionFunctionType;", "selector", "lensPosition", "(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/FotoapparatBuilder;", "Lio/fotoapparat/parameter/ScaleType;", "scaleType", "previewScaleType", "(Lio/fotoapparat/parameter/ScaleType;)Lio/fotoapparat/FotoapparatBuilder;", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "photoResolution", "previewResolution", "Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/selector/FocusModeSelector;", "focusMode", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "flash", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "previewFpsRange", "", "Lio/fotoapparat/selector/SensorSensitivitySelector;", "sensorSensitivity", "Lkotlin/ranges/IntRange;", "Lio/fotoapparat/selector/QualitySelector;", "jpegQuality", "Lio/fotoapparat/selector/ExposureSelector;", "exposureCompensation", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "", "Lio/fotoapparat/util/FrameProcessor;", "frameProcessor", "Lio/fotoapparat/preview/FrameProcessor;", "(Lio/fotoapparat/preview/FrameProcessor;)Lio/fotoapparat/FotoapparatBuilder;", "Lio/fotoapparat/log/Logger;", "logger", "(Lio/fotoapparat/log/Logger;)Lio/fotoapparat/FotoapparatBuilder;", "Lio/fotoapparat/error/CameraErrorListener;", "callback", "cameraErrorCallback", "(Lio/fotoapparat/error/CameraErrorListener;)Lio/fotoapparat/FotoapparatBuilder;", "Lio/fotoapparat/exception/camera/CameraException;", "Lio/fotoapparat/error/CameraErrorCallback;", "into", "(Lio/fotoapparat/view/CameraRenderer;)Lio/fotoapparat/FotoapparatBuilder;", "Lio/fotoapparat/view/FocusView;", "focusView", "(Lio/fotoapparat/view/FocusView;)Lio/fotoapparat/FotoapparatBuilder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lio/fotoapparat/Fotoapparat;", "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getLensPositionSelector$fotoapparat_release", "()Lkotlin/jvm/functions/Function1;", "setLensPositionSelector$fotoapparat_release", "(Lkotlin/jvm/functions/Function1;)V", "lensPositionSelector", OperatorName.CURVE_TO, "getCameraErrorCallback$fotoapparat_release", "setCameraErrorCallback$fotoapparat_release", "d", "Lio/fotoapparat/view/CameraRenderer;", "getRenderer$fotoapparat_release", "()Lio/fotoapparat/view/CameraRenderer;", "setRenderer$fotoapparat_release", "(Lio/fotoapparat/view/CameraRenderer;)V", "e", "Lio/fotoapparat/view/FocusView;", "getFocusView$fotoapparat_release", "()Lio/fotoapparat/view/FocusView;", "setFocusView$fotoapparat_release", "(Lio/fotoapparat/view/FocusView;)V", OperatorName.FILL_NON_ZERO, "Lio/fotoapparat/parameter/ScaleType;", "getScaleType$fotoapparat_release", "()Lio/fotoapparat/parameter/ScaleType;", "setScaleType$fotoapparat_release", "(Lio/fotoapparat/parameter/ScaleType;)V", OperatorName.NON_STROKING_GRAY, "Lio/fotoapparat/log/Logger;", "getLogger$fotoapparat_release", "()Lio/fotoapparat/log/Logger;", "setLogger$fotoapparat_release", "(Lio/fotoapparat/log/Logger;)V", "Lio/fotoapparat/configuration/CameraConfiguration;", OperatorName.CLOSE_PATH, "Lio/fotoapparat/configuration/CameraConfiguration;", "getConfiguration$fotoapparat_release", "()Lio/fotoapparat/configuration/CameraConfiguration;", "setConfiguration$fotoapparat_release", "(Lio/fotoapparat/configuration/CameraConfiguration;)V", "configuration", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFotoapparatBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FotoapparatBuilder.kt\nio/fotoapparat/FotoapparatBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
/* loaded from: classes5.dex */
public final class FotoapparatBuilder {

    /* renamed from: a */
    public Context f62904a;

    /* renamed from: b */
    public Function1 f62905b;

    /* renamed from: c */
    public Function1 f62906c;

    /* renamed from: d */
    public CameraRenderer f62907d;

    /* renamed from: e */
    public FocusView f62908e;

    /* renamed from: f */
    public ScaleType f62909f;

    /* renamed from: g */
    public Logger f62910g;

    /* renamed from: h */
    public CameraConfiguration f62911h;

    public FotoapparatBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62904a = context;
        this.f62905b = SelectorsKt.firstAvailable(LensPositionSelectorsKt.back(), LensPositionSelectorsKt.front(), LensPositionSelectorsKt.external());
        this.f62906c = FotoapparatBuilder$cameraErrorCallback$1.INSTANCE;
        this.f62909f = ScaleType.CenterCrop;
        this.f62910g = LoggersKt.none();
        this.f62911h = CameraConfiguration.Companion.m74065default();
    }

    /* renamed from: a */
    public final Fotoapparat m30565a(CameraRenderer cameraRenderer) {
        if (cameraRenderer != null) {
            return new Fotoapparat(this.f62904a, cameraRenderer, this.f62908e, this.f62905b, this.f62909f, this.f62911h, this.f62906c, null, this.f62910g, 128, null);
        }
        throw new IllegalStateException("CameraRenderer is mandatory.");
    }

    @NotNull
    public final Fotoapparat build() {
        return m30565a(this.f62907d);
    }

    @NotNull
    public final FotoapparatBuilder cameraErrorCallback(@NotNull CameraErrorListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f62906c = new FotoapparatBuilder$cameraErrorCallback$2$1(callback);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder exposureCompensation(@NotNull Function1<? super IntRange, Integer> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, selector, null, null, null, null, null, null, 1015, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder flash(@NotNull Function1<? super Iterable<? extends Flash>, ? extends Flash> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, selector, null, null, null, null, null, null, null, null, null, 1022, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder focusMode(@NotNull Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, selector, null, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRABBING, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder focusView(@NotNull FocusView focusView) {
        Intrinsics.checkNotNullParameter(focusView, "focusView");
        this.f62908e = focusView;
        return this;
    }

    @NotNull
    public final FotoapparatBuilder frameProcessor(@NotNull Function1<? super Frame, Unit> frameProcessor) {
        Intrinsics.checkNotNullParameter(frameProcessor, "frameProcessor");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, null, frameProcessor, null, null, null, null, null, 1007, null);
        return this;
    }

    @NotNull
    public final Function1<CameraException, Unit> getCameraErrorCallback$fotoapparat_release() {
        return this.f62906c;
    }

    @NotNull
    public final CameraConfiguration getConfiguration$fotoapparat_release() {
        return this.f62911h;
    }

    @Nullable
    public final FocusView getFocusView$fotoapparat_release() {
        return this.f62908e;
    }

    @NotNull
    public final Function1<Iterable<? extends LensPosition>, LensPosition> getLensPositionSelector$fotoapparat_release() {
        return this.f62905b;
    }

    @NotNull
    public final Logger getLogger$fotoapparat_release() {
        return this.f62910g;
    }

    @Nullable
    public final CameraRenderer getRenderer$fotoapparat_release() {
        return this.f62907d;
    }

    @NotNull
    public final ScaleType getScaleType$fotoapparat_release() {
        return this.f62909f;
    }

    @NotNull
    public final FotoapparatBuilder into(@NotNull CameraRenderer renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f62907d = renderer;
        return this;
    }

    @NotNull
    public final FotoapparatBuilder jpegQuality(@NotNull Function1<? super IntRange, Integer> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, selector, null, null, null, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder lensPosition(@NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62905b = selector;
        return this;
    }

    @NotNull
    public final FotoapparatBuilder logger(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f62910g = logger;
        return this;
    }

    @NotNull
    public final FotoapparatBuilder photoResolution(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, null, null, null, null, null, selector, null, 767, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder previewFpsRange(@NotNull Function1<? super Iterable<FpsRange>, FpsRange> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, null, null, selector, null, null, null, null, 991, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder previewResolution(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, null, null, null, null, null, null, selector, FrameMetricsAggregator.EVERY_DURATION, null);
        return this;
    }

    @NotNull
    public final FotoapparatBuilder previewScaleType(@NotNull ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f62909f = scaleType;
        return this;
    }

    @NotNull
    public final FotoapparatBuilder sensorSensitivity(@NotNull Function1<? super Iterable<Integer>, Integer> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, null, null, null, null, selector, null, null, 895, null);
        return this;
    }

    public final void setCameraErrorCallback$fotoapparat_release(@NotNull Function1<? super CameraException, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f62906c = function1;
    }

    public final void setConfiguration$fotoapparat_release(@NotNull CameraConfiguration cameraConfiguration) {
        Intrinsics.checkNotNullParameter(cameraConfiguration, "<set-?>");
        this.f62911h = cameraConfiguration;
    }

    public final void setFocusView$fotoapparat_release(@Nullable FocusView focusView) {
        this.f62908e = focusView;
    }

    public final void setLensPositionSelector$fotoapparat_release(@NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f62905b = function1;
    }

    public final void setLogger$fotoapparat_release(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<set-?>");
        this.f62910g = logger;
    }

    public final void setRenderer$fotoapparat_release(@Nullable CameraRenderer cameraRenderer) {
        this.f62907d = cameraRenderer;
    }

    public final void setScaleType$fotoapparat_release(@NotNull ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "<set-?>");
        this.f62909f = scaleType;
    }

    @NotNull
    public final FotoapparatBuilder cameraErrorCallback(@NotNull Function1<? super CameraException, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f62906c = callback;
        return this;
    }

    @NotNull
    public final FotoapparatBuilder frameProcessor(@Nullable FrameProcessor frameProcessor) {
        this.f62911h = CameraConfiguration.copy$default(this.f62911h, null, null, null, null, frameProcessor != null ? new FotoapparatBuilder$frameProcessor$2$1$1(frameProcessor) : null, null, null, null, null, null, 1007, null);
        return this;
    }
}
