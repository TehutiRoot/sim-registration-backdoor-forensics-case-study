package io.fotoapparat.configuration;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.AntiBandingMode;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.preview.Frame;
import io.fotoapparat.preview.FrameProcessor;
import io.fotoapparat.selector.AntiBandingModeSelectorsKt;
import io.fotoapparat.selector.ExposureCompensationSelectorsKt;
import io.fotoapparat.selector.FlashSelectorsKt;
import io.fotoapparat.selector.FocusModeSelectorsKt;
import io.fotoapparat.selector.JpegQualitySelectorsKt;
import io.fotoapparat.selector.PreviewFpsRangeSelectorsKt;
import io.fotoapparat.selector.ResolutionSelectorsKt;
import io.fotoapparat.selector.SelectorsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.apache.http.client.config.CookieSpecs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u008b\u0003\u0012%\b\u0002\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006\u0012%\b\u0002\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002j\u0002`\t¢\u0006\u0002\b\u0006\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\r¢\u0006\u0002\b\u0006\u0012\u001f\b\u0002\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\u000f¢\u0006\u0002\b\u0006\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u0016\u0012%\b\u0002\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0002j\u0002`\u0019¢\u0006\u0002\b\u0006\u0012%\b\u0002\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0002j\u0002`\u001c¢\u0006\u0002\b\u0006\u0012)\b\u0002\u0010\u001f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u0006\u0012%\b\u0002\u0010\"\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u0006\u0012%\b\u0002\u0010#\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u0006¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002j\u0002`\t¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b(\u0010'J'\u0010)\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\r¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b)\u0010'J'\u0010*\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\u000f¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b*\u0010'J3\u0010+\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u0016HÆ\u0003¢\u0006\u0004\b+\u0010'J-\u0010,\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0002j\u0002`\u0019¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b,\u0010'J-\u0010-\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0002j\u0002`\u001c¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b-\u0010'J1\u0010.\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b.\u0010'J-\u0010/\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b/\u0010'J-\u00100\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0094\u0003\u00101\u001a\u00020\u00002%\b\u0002\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u00062%\b\u0002\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002j\u0002`\t¢\u0006\u0002\b\u00062\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\r¢\u0006\u0002\b\u00062\u001f\b\u0002\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\u000f¢\u0006\u0002\b\u00062+\b\u0002\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u00162%\b\u0002\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0002j\u0002`\u0019¢\u0006\u0002\b\u00062%\b\u0002\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0002j\u0002`\u001c¢\u0006\u0002\b\u00062)\b\u0002\u0010\u001f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u00062%\b\u0002\u0010\"\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u00062%\b\u0002\u0010#\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u0006HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R7\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010'R7\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002j\u0002`\t¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010'R1\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\r¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010'R1\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002j\u0002`\u000f¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010'R=\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010'R7\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0002j\u0002`\u0019¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010'R7\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0002j\u0002`\u001c¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010'R;\u0010\u001f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010'R7\u0010\"\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010'R7\u0010#\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002j\u0002`!¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010'¨\u0006T"}, m28850d2 = {"Lio/fotoapparat/configuration/CameraConfiguration;", "Lio/fotoapparat/configuration/Configuration;", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "Lkotlin/ExtensionFunctionType;", "flashMode", "Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/selector/FocusModeSelector;", "focusMode", "Lkotlin/ranges/IntRange;", "", "Lio/fotoapparat/selector/QualitySelector;", "jpegQuality", "Lio/fotoapparat/selector/ExposureSelector;", "exposureCompensation", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "", "Lio/fotoapparat/util/FrameProcessor;", "frameProcessor", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "previewFpsRange", "Lio/fotoapparat/parameter/AntiBandingMode;", "Lio/fotoapparat/selector/AntiBandingModeSelector;", "antiBandingMode", "Lio/fotoapparat/selector/SensorSensitivitySelector;", "sensorSensitivity", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "pictureResolution", "previewResolution", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function1;", "getFlashMode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFocusMode", OperatorName.CURVE_TO, "getJpegQuality", "d", "getExposureCompensation", "e", "getFrameProcessor", OperatorName.FILL_NON_ZERO, "getPreviewFpsRange", OperatorName.NON_STROKING_GRAY, "getAntiBandingMode", OperatorName.CLOSE_PATH, "getSensorSensitivity", "i", "getPictureResolution", OperatorName.SET_LINE_JOINSTYLE, "getPreviewResolution", "Companion", "Builder", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class CameraConfiguration implements Configuration {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Function1 f62933a;

    /* renamed from: b */
    public final Function1 f62934b;

    /* renamed from: c */
    public final Function1 f62935c;

    /* renamed from: d */
    public final Function1 f62936d;

    /* renamed from: e */
    public final Function1 f62937e;

    /* renamed from: f */
    public final Function1 f62938f;

    /* renamed from: g */
    public final Function1 f62939g;

    /* renamed from: h */
    public final Function1 f62940h;

    /* renamed from: i */
    public final Function1 f62941i;

    /* renamed from: j */
    public final Function1 f62942j;

    @Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u000e\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004j\u0002`\r¢\u0006\u0002\b\b¢\u0006\u0004\b\u000e\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004j\u0002`\u0010¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u000bJ,\u0010\u0015\u001a\u00020\u00002\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004j\u0002`\u0014¢\u0006\u0002\b\b¢\u0006\u0004\b\u0015\u0010\u000bJ2\u0010\u0018\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004j\u0002`\u0017¢\u0006\u0002\b\b¢\u0006\u0004\b\u0018\u0010\u000bJ,\u0010\u001a\u001a\u00020\u00002\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004j\u0002`\u0019¢\u0006\u0002\b\b¢\u0006\u0004\b\u001a\u0010\u000bJ2\u0010\u001c\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004j\u0002`\u001b¢\u0006\u0002\b\b¢\u0006\u0004\b\u001c\u0010\u000bJ2\u0010\u001f\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004j\u0002`\u001e¢\u0006\u0002\b\b¢\u0006\u0004\b\u001f\u0010\u000bJ2\u0010 \u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004j\u0002`\u001e¢\u0006\u0002\b\b¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m28850d2 = {"Lio/fotoapparat/configuration/CameraConfiguration$Builder;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "Lkotlin/ExtensionFunctionType;", "selector", "flash", "(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;", "Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/selector/FocusModeSelector;", "focusMode", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "previewFpsRange", "Lkotlin/ranges/IntRange;", "", "Lio/fotoapparat/selector/ExposureSelector;", "exposureCompensation", "Lio/fotoapparat/parameter/AntiBandingMode;", "Lio/fotoapparat/selector/AntiBandingModeSelector;", "antiBandingMode", "Lio/fotoapparat/selector/QualitySelector;", "jpegQuality", "Lio/fotoapparat/selector/SensorSensitivitySelector;", "sensorSensitivity", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "previewResolution", "photoResolution", "Lio/fotoapparat/preview/FrameProcessor;", "frameProcessor", "(Lio/fotoapparat/preview/FrameProcessor;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;", "Lio/fotoapparat/configuration/CameraConfiguration;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lio/fotoapparat/configuration/CameraConfiguration;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/configuration/CameraConfiguration;", "cameraConfiguration", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCameraConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraConfiguration.kt\nio/fotoapparat/configuration/CameraConfiguration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public CameraConfiguration f62943a = CameraConfiguration.Companion.m74065default();

        @NotNull
        public final Builder antiBandingMode(@NotNull Function1<? super Iterable<? extends AntiBandingMode>, ? extends AntiBandingMode> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            CameraConfiguration.copy$default(this.f62943a, null, null, null, null, null, null, selector, null, null, null, 959, null);
            return this;
        }

        @NotNull
        public final CameraConfiguration build() {
            return this.f62943a;
        }

        @NotNull
        public final Builder exposureCompensation(@NotNull Function1<? super IntRange, Integer> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, null, null, null, selector, null, null, null, null, null, null, 1015, null);
            return this;
        }

        @NotNull
        public final Builder flash(@NotNull Function1<? super Iterable<? extends Flash>, ? extends Flash> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, selector, null, null, null, null, null, null, null, null, null, 1022, null);
            return this;
        }

        @NotNull
        public final Builder focusMode(@NotNull Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, null, selector, null, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRABBING, null);
            return this;
        }

        @NotNull
        public final Builder frameProcessor(@Nullable FrameProcessor frameProcessor) {
            CameraConfiguration$Builder$frameProcessor$1$1$1 cameraConfiguration$Builder$frameProcessor$1$1$1;
            CameraConfiguration cameraConfiguration = this.f62943a;
            if (frameProcessor != null) {
                cameraConfiguration$Builder$frameProcessor$1$1$1 = new CameraConfiguration$Builder$frameProcessor$1$1$1(frameProcessor);
            } else {
                cameraConfiguration$Builder$frameProcessor$1$1$1 = null;
            }
            this.f62943a = CameraConfiguration.copy$default(cameraConfiguration, null, null, null, null, cameraConfiguration$Builder$frameProcessor$1$1$1, null, null, null, null, null, 1007, null);
            return this;
        }

        @NotNull
        public final Builder jpegQuality(@NotNull Function1<? super IntRange, Integer> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            CameraConfiguration.copy$default(this.f62943a, null, null, selector, null, null, null, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT, null);
            return this;
        }

        @NotNull
        public final Builder photoResolution(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, null, null, null, null, null, null, null, null, selector, null, 767, null);
            return this;
        }

        @NotNull
        public final Builder previewFpsRange(@NotNull Function1<? super Iterable<FpsRange>, FpsRange> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, null, null, null, null, null, selector, null, null, null, null, 991, null);
            return this;
        }

        @NotNull
        public final Builder previewResolution(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, null, null, null, null, null, null, null, null, null, selector, FrameMetricsAggregator.EVERY_DURATION, null);
            return this;
        }

        @NotNull
        public final Builder sensorSensitivity(@NotNull Function1<? super Iterable<Integer>, Integer> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62943a = CameraConfiguration.copy$default(this.f62943a, null, null, null, null, null, null, null, selector, null, null, 895, null);
            return this;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, m28850d2 = {"Lio/fotoapparat/configuration/CameraConfiguration$Companion;", "", "()V", "builder", "Lio/fotoapparat/configuration/CameraConfiguration$Builder;", "default", "Lio/fotoapparat/configuration/CameraConfiguration;", CookieSpecs.STANDARD, "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        @JvmStatic
        @NotNull
        /* renamed from: default  reason: not valid java name */
        public final CameraConfiguration m74065default() {
            return new CameraConfiguration(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        @JvmStatic
        @NotNull
        public final CameraConfiguration standard() {
            return m74065default();
        }

        public Companion() {
        }
    }

    public CameraConfiguration() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraConfiguration copy$default(CameraConfiguration cameraConfiguration, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, int i, Object obj) {
        return cameraConfiguration.copy((i & 1) != 0 ? cameraConfiguration.getFlashMode() : function1, (i & 2) != 0 ? cameraConfiguration.getFocusMode() : function12, (i & 4) != 0 ? cameraConfiguration.getJpegQuality() : function13, (i & 8) != 0 ? cameraConfiguration.getExposureCompensation() : function14, (i & 16) != 0 ? cameraConfiguration.getFrameProcessor() : function15, (i & 32) != 0 ? cameraConfiguration.getPreviewFpsRange() : function16, (i & 64) != 0 ? cameraConfiguration.getAntiBandingMode() : function17, (i & 128) != 0 ? cameraConfiguration.getSensorSensitivity() : function18, (i & 256) != 0 ? cameraConfiguration.getPictureResolution() : function19, (i & 512) != 0 ? cameraConfiguration.getPreviewResolution() : function110);
    }

    @JvmStatic
    @NotNull
    /* renamed from: default  reason: not valid java name */
    public static final CameraConfiguration m74064default() {
        return Companion.m74065default();
    }

    @JvmStatic
    @NotNull
    public static final CameraConfiguration standard() {
        return Companion.standard();
    }

    @NotNull
    public final Function1<Iterable<? extends Flash>, Flash> component1() {
        return getFlashMode();
    }

    @NotNull
    public final Function1<Iterable<Resolution>, Resolution> component10() {
        return getPreviewResolution();
    }

    @NotNull
    public final Function1<Iterable<? extends FocusMode>, FocusMode> component2() {
        return getFocusMode();
    }

    @NotNull
    public final Function1<IntRange, Integer> component3() {
        return getJpegQuality();
    }

    @NotNull
    public final Function1<IntRange, Integer> component4() {
        return getExposureCompensation();
    }

    @Nullable
    public final Function1<Frame, Unit> component5() {
        return getFrameProcessor();
    }

    @NotNull
    public final Function1<Iterable<FpsRange>, FpsRange> component6() {
        return getPreviewFpsRange();
    }

    @NotNull
    public final Function1<Iterable<? extends AntiBandingMode>, AntiBandingMode> component7() {
        return getAntiBandingMode();
    }

    @Nullable
    public final Function1<Iterable<Integer>, Integer> component8() {
        return getSensorSensitivity();
    }

    @NotNull
    public final Function1<Iterable<Resolution>, Resolution> component9() {
        return getPictureResolution();
    }

    @NotNull
    public final CameraConfiguration copy(@NotNull Function1<? super Iterable<? extends Flash>, ? extends Flash> flashMode, @NotNull Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> focusMode, @NotNull Function1<? super IntRange, Integer> jpegQuality, @NotNull Function1<? super IntRange, Integer> exposureCompensation, @Nullable Function1<? super Frame, Unit> function1, @NotNull Function1<? super Iterable<FpsRange>, FpsRange> previewFpsRange, @NotNull Function1<? super Iterable<? extends AntiBandingMode>, ? extends AntiBandingMode> antiBandingMode, @Nullable Function1<? super Iterable<Integer>, Integer> function12, @NotNull Function1<? super Iterable<Resolution>, Resolution> pictureResolution, @NotNull Function1<? super Iterable<Resolution>, Resolution> previewResolution) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(jpegQuality, "jpegQuality");
        Intrinsics.checkNotNullParameter(exposureCompensation, "exposureCompensation");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        return new CameraConfiguration(flashMode, focusMode, jpegQuality, exposureCompensation, function1, previewFpsRange, antiBandingMode, function12, pictureResolution, previewResolution);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraConfiguration) {
            CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
            return Intrinsics.areEqual(getFlashMode(), cameraConfiguration.getFlashMode()) && Intrinsics.areEqual(getFocusMode(), cameraConfiguration.getFocusMode()) && Intrinsics.areEqual(getJpegQuality(), cameraConfiguration.getJpegQuality()) && Intrinsics.areEqual(getExposureCompensation(), cameraConfiguration.getExposureCompensation()) && Intrinsics.areEqual(getFrameProcessor(), cameraConfiguration.getFrameProcessor()) && Intrinsics.areEqual(getPreviewFpsRange(), cameraConfiguration.getPreviewFpsRange()) && Intrinsics.areEqual(getAntiBandingMode(), cameraConfiguration.getAntiBandingMode()) && Intrinsics.areEqual(getSensorSensitivity(), cameraConfiguration.getSensorSensitivity()) && Intrinsics.areEqual(getPictureResolution(), cameraConfiguration.getPictureResolution()) && Intrinsics.areEqual(getPreviewResolution(), cameraConfiguration.getPreviewResolution());
        }
        return false;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<Iterable<? extends AntiBandingMode>, AntiBandingMode> getAntiBandingMode() {
        return this.f62939g;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<IntRange, Integer> getExposureCompensation() {
        return this.f62936d;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<Iterable<? extends Flash>, Flash> getFlashMode() {
        return this.f62933a;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<Iterable<? extends FocusMode>, FocusMode> getFocusMode() {
        return this.f62934b;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Frame, Unit> getFrameProcessor() {
        return this.f62937e;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<IntRange, Integer> getJpegQuality() {
        return this.f62935c;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<Iterable<Resolution>, Resolution> getPictureResolution() {
        return this.f62941i;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<Iterable<FpsRange>, FpsRange> getPreviewFpsRange() {
        return this.f62938f;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @NotNull
    public Function1<Iterable<Resolution>, Resolution> getPreviewResolution() {
        return this.f62942j;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<Integer>, Integer> getSensorSensitivity() {
        return this.f62940h;
    }

    public int hashCode() {
        return (((((((((((((((((getFlashMode().hashCode() * 31) + getFocusMode().hashCode()) * 31) + getJpegQuality().hashCode()) * 31) + getExposureCompensation().hashCode()) * 31) + (getFrameProcessor() == null ? 0 : getFrameProcessor().hashCode())) * 31) + getPreviewFpsRange().hashCode()) * 31) + getAntiBandingMode().hashCode()) * 31) + (getSensorSensitivity() != null ? getSensorSensitivity().hashCode() : 0)) * 31) + getPictureResolution().hashCode()) * 31) + getPreviewResolution().hashCode();
    }

    @NotNull
    public String toString() {
        Function1<Iterable<? extends Flash>, Flash> flashMode = getFlashMode();
        Function1<Iterable<? extends FocusMode>, FocusMode> focusMode = getFocusMode();
        Function1<IntRange, Integer> jpegQuality = getJpegQuality();
        Function1<IntRange, Integer> exposureCompensation = getExposureCompensation();
        Function1<Frame, Unit> frameProcessor = getFrameProcessor();
        Function1<Iterable<FpsRange>, FpsRange> previewFpsRange = getPreviewFpsRange();
        Function1<Iterable<? extends AntiBandingMode>, AntiBandingMode> antiBandingMode = getAntiBandingMode();
        Function1<Iterable<Integer>, Integer> sensorSensitivity = getSensorSensitivity();
        Function1<Iterable<Resolution>, Resolution> pictureResolution = getPictureResolution();
        Function1<Iterable<Resolution>, Resolution> previewResolution = getPreviewResolution();
        return "CameraConfiguration(flashMode=" + flashMode + ", focusMode=" + focusMode + ", jpegQuality=" + jpegQuality + ", exposureCompensation=" + exposureCompensation + ", frameProcessor=" + frameProcessor + ", previewFpsRange=" + previewFpsRange + ", antiBandingMode=" + antiBandingMode + ", sensorSensitivity=" + sensorSensitivity + ", pictureResolution=" + pictureResolution + ", previewResolution=" + previewResolution + ")";
    }

    public CameraConfiguration(@NotNull Function1<? super Iterable<? extends Flash>, ? extends Flash> flashMode, @NotNull Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> focusMode, @NotNull Function1<? super IntRange, Integer> jpegQuality, @NotNull Function1<? super IntRange, Integer> exposureCompensation, @Nullable Function1<? super Frame, Unit> function1, @NotNull Function1<? super Iterable<FpsRange>, FpsRange> previewFpsRange, @NotNull Function1<? super Iterable<? extends AntiBandingMode>, ? extends AntiBandingMode> antiBandingMode, @Nullable Function1<? super Iterable<Integer>, Integer> function12, @NotNull Function1<? super Iterable<Resolution>, Resolution> pictureResolution, @NotNull Function1<? super Iterable<Resolution>, Resolution> previewResolution) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(jpegQuality, "jpegQuality");
        Intrinsics.checkNotNullParameter(exposureCompensation, "exposureCompensation");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        this.f62933a = flashMode;
        this.f62934b = focusMode;
        this.f62935c = jpegQuality;
        this.f62936d = exposureCompensation;
        this.f62937e = function1;
        this.f62938f = previewFpsRange;
        this.f62939g = antiBandingMode;
        this.f62940h = function12;
        this.f62941i = pictureResolution;
        this.f62942j = previewResolution;
    }

    public /* synthetic */ CameraConfiguration(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FlashSelectorsKt.off() : function1, (i & 2) != 0 ? SelectorsKt.firstAvailable(FocusModeSelectorsKt.continuousFocusPicture(), FocusModeSelectorsKt.autoFocus(), FocusModeSelectorsKt.fixed(), FocusModeSelectorsKt.infinity()) : function12, (i & 4) != 0 ? JpegQualitySelectorsKt.manualJpegQuality(90) : function13, (i & 8) != 0 ? ExposureCompensationSelectorsKt.manualExposure(0) : function14, (i & 16) != 0 ? null : function15, (i & 32) != 0 ? PreviewFpsRangeSelectorsKt.highestFps() : function16, (i & 64) != 0 ? SelectorsKt.firstAvailable(AntiBandingModeSelectorsKt.auto(), AntiBandingModeSelectorsKt.hz50(), AntiBandingModeSelectorsKt.hz60(), AntiBandingModeSelectorsKt.none()) : function17, (i & 128) == 0 ? function18 : null, (i & 256) != 0 ? ResolutionSelectorsKt.highestResolution() : function19, (i & 512) != 0 ? ResolutionSelectorsKt.highestResolution() : function110);
    }
}
