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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u0002SRB«\u0003\u0012)\b\u0002\u0010\u0007\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0002\b\u0006\u0012)\b\u0002\u0010\n\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t¢\u0006\u0002\b\u0006\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\r¢\u0006\u0002\b\u0006\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u000f¢\u0006\u0002\b\u0006\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u0016\u0012)\b\u0002\u0010\u001a\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0002j\u0004\u0018\u0001`\u0019¢\u0006\u0002\b\u0006\u0012)\b\u0002\u0010\u001d\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0002j\u0004\u0018\u0001`\u001c¢\u0006\u0002\b\u0006\u0012)\b\u0002\u0010\u001f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u0006\u0012)\b\u0002\u0010\"\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u0006\u0012)\b\u0002\u0010#\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u0006¢\u0006\u0004\b$\u0010%J1\u0010&\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J1\u0010(\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b(\u0010'J+\u0010)\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\r¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b)\u0010'J+\u0010*\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u000f¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b*\u0010'J3\u0010+\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u0016HÆ\u0003¢\u0006\u0004\b+\u0010'J1\u0010,\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0002j\u0004\u0018\u0001`\u0019¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b,\u0010'J1\u0010-\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0002j\u0004\u0018\u0001`\u001c¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b-\u0010'J1\u0010.\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b.\u0010'J1\u0010/\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b/\u0010'J1\u00100\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b0\u0010'J´\u0003\u00101\u001a\u00020\u00002)\b\u0002\u0010\u0007\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0002\b\u00062)\b\u0002\u0010\n\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t¢\u0006\u0002\b\u00062#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\r¢\u0006\u0002\b\u00062#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u000f¢\u0006\u0002\b\u00062+\b\u0002\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u00162)\b\u0002\u0010\u001a\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0002j\u0004\u0018\u0001`\u0019¢\u0006\u0002\b\u00062)\b\u0002\u0010\u001d\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0002j\u0004\u0018\u0001`\u001c¢\u0006\u0002\b\u00062)\b\u0002\u0010\u001f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u00062)\b\u0002\u0010\"\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u00062)\b\u0002\u0010#\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u0006HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R;\u0010\u0007\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010'R;\u0010\n\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010'R5\u0010\u000e\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\r¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010'R5\u0010\u0010\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u000f¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010'R=\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010'R;\u0010\u001a\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0002j\u0004\u0018\u0001`\u0019¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010'R;\u0010\u001d\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0002j\u0004\u0018\u0001`\u001c¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010'R;\u0010\u001f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002j\u0004\u0018\u0001`\u001e¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010'R;\u0010\"\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010'R;\u0010#\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0002j\u0004\u0018\u0001`!¢\u0006\u0002\b\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010'¨\u0006T"}, m28850d2 = {"Lio/fotoapparat/configuration/UpdateConfiguration;", "Lio/fotoapparat/configuration/Configuration;", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "Lkotlin/ExtensionFunctionType;", "flashMode", "Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/selector/FocusModeSelector;", "focusMode", "Lkotlin/ranges/IntRange;", "", "Lio/fotoapparat/selector/QualitySelector;", "jpegQuality", "Lio/fotoapparat/selector/ExposureSelector;", "exposureCompensation", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "", "Lio/fotoapparat/util/FrameProcessor;", "frameProcessor", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "previewFpsRange", "Lio/fotoapparat/parameter/AntiBandingMode;", "Lio/fotoapparat/selector/AntiBandingModeSelector;", "antiBandingMode", "Lio/fotoapparat/selector/SensorSensitivitySelector;", "sensorSensitivity", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "previewResolution", "pictureResolution", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/UpdateConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function1;", "getFlashMode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFocusMode", OperatorName.CURVE_TO, "getJpegQuality", "d", "getExposureCompensation", "e", "getFrameProcessor", OperatorName.FILL_NON_ZERO, "getPreviewFpsRange", OperatorName.NON_STROKING_GRAY, "getAntiBandingMode", OperatorName.CLOSE_PATH, "getSensorSensitivity", "i", "getPreviewResolution", OperatorName.SET_LINE_JOINSTYLE, "getPictureResolution", "Companion", "Builder", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class UpdateConfiguration implements Configuration {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Function1 f62944a;

    /* renamed from: b */
    public final Function1 f62945b;

    /* renamed from: c */
    public final Function1 f62946c;

    /* renamed from: d */
    public final Function1 f62947d;

    /* renamed from: e */
    public final Function1 f62948e;

    /* renamed from: f */
    public final Function1 f62949f;

    /* renamed from: g */
    public final Function1 f62950g;

    /* renamed from: h */
    public final Function1 f62951h;

    /* renamed from: i */
    public final Function1 f62952i;

    /* renamed from: j */
    public final Function1 f62953j;

    @Metadata(m28851d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u000e\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004j\u0002`\r¢\u0006\u0002\b\b¢\u0006\u0004\b\u000e\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004j\u0002`\u0010¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u000bJ2\u0010\u0014\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004j\u0002`\u0013¢\u0006\u0002\b\b¢\u0006\u0004\b\u0014\u0010\u000bJ2\u0010\u0017\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0004j\u0002`\u0016¢\u0006\u0002\b\b¢\u0006\u0004\b\u0017\u0010\u000bJ,\u0010\u001a\u001a\u00020\u00002\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004j\u0002`\u0019¢\u0006\u0002\b\b¢\u0006\u0004\b\u001a\u0010\u000bJ,\u0010\u001c\u001a\u00020\u00002\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004j\u0002`\u001b¢\u0006\u0002\b\b¢\u0006\u0004\b\u001c\u0010\u000bJ2\u0010\u001f\u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004j\u0002`\u001e¢\u0006\u0002\b\b¢\u0006\u0004\b\u001f\u0010\u000bJ2\u0010 \u001a\u00020\u00002#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004j\u0002`\u001e¢\u0006\u0002\b\b¢\u0006\u0004\b \u0010\u000bJ8\u0010'\u001a\u00020\u00002)\u0010'\u001a%\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u0004j\u0004\u0018\u0001`&¢\u0006\u0004\b'\u0010\u000bJ\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m28850d2 = {"Lio/fotoapparat/configuration/UpdateConfiguration$Builder;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "Lkotlin/ExtensionFunctionType;", "selector", "flash", "(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/UpdateConfiguration$Builder;", "Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/selector/FocusModeSelector;", "focusMode", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "previewFpsRange", "", "Lio/fotoapparat/selector/SensorSensitivitySelector;", "sensorSensitivity", "Lio/fotoapparat/parameter/AntiBandingMode;", "Lio/fotoapparat/selector/AntiBandingModeSelector;", "antiBandingMode", "Lkotlin/ranges/IntRange;", "Lio/fotoapparat/selector/QualitySelector;", "jpegQuality", "Lio/fotoapparat/selector/ExposureSelector;", "exposureCompensation", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "previewResolution", "photoResolution", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "", "Lio/fotoapparat/util/FrameProcessor;", "frameProcessor", "Lio/fotoapparat/configuration/UpdateConfiguration;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lio/fotoapparat/configuration/UpdateConfiguration;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/configuration/UpdateConfiguration;", "configuration", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public UpdateConfiguration f62954a = new UpdateConfiguration(null, null, null, null, null, null, null, null, null, null, 1023, null);

        @NotNull
        public final Builder antiBandingMode(@NotNull Function1<? super Iterable<? extends AntiBandingMode>, ? extends AntiBandingMode> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, null, null, null, selector, null, null, null, 959, null);
            return this;
        }

        @NotNull
        public final UpdateConfiguration build() {
            return this.f62954a;
        }

        @NotNull
        public final Builder exposureCompensation(@NotNull Function1<? super IntRange, Integer> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, selector, null, null, null, null, null, null, 1015, null);
            return this;
        }

        @NotNull
        public final Builder flash(@NotNull Function1<? super Iterable<? extends Flash>, ? extends Flash> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, selector, null, null, null, null, null, null, null, null, null, 1022, null);
            return this;
        }

        @NotNull
        public final Builder focusMode(@NotNull Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, selector, null, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRABBING, null);
            return this;
        }

        @NotNull
        public final Builder frameProcessor(@Nullable Function1<? super Frame, Unit> function1) {
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, null, function1, null, null, null, null, null, 1007, null);
            return this;
        }

        @NotNull
        public final Builder jpegQuality(@NotNull Function1<? super IntRange, Integer> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, selector, null, null, null, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT, null);
            return this;
        }

        @NotNull
        public final Builder photoResolution(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, null, null, null, null, null, null, selector, FrameMetricsAggregator.EVERY_DURATION, null);
            return this;
        }

        @NotNull
        public final Builder previewFpsRange(@NotNull Function1<? super Iterable<FpsRange>, FpsRange> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, null, null, selector, null, null, null, null, 991, null);
            return this;
        }

        @NotNull
        public final Builder previewResolution(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, null, null, null, null, null, selector, null, 767, null);
            return this;
        }

        @NotNull
        public final Builder sensorSensitivity(@NotNull Function1<? super Iterable<Integer>, Integer> selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f62954a = UpdateConfiguration.copy$default(this.f62954a, null, null, null, null, null, null, null, selector, null, null, 895, null);
            return this;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/configuration/UpdateConfiguration$Companion;", "", "()V", "builder", "Lio/fotoapparat/configuration/UpdateConfiguration$Builder;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
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

        public Companion() {
        }
    }

    public UpdateConfiguration() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateConfiguration copy$default(UpdateConfiguration updateConfiguration, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, int i, Object obj) {
        return updateConfiguration.copy((i & 1) != 0 ? updateConfiguration.getFlashMode() : function1, (i & 2) != 0 ? updateConfiguration.getFocusMode() : function12, (i & 4) != 0 ? updateConfiguration.getJpegQuality() : function13, (i & 8) != 0 ? updateConfiguration.getExposureCompensation() : function14, (i & 16) != 0 ? updateConfiguration.getFrameProcessor() : function15, (i & 32) != 0 ? updateConfiguration.getPreviewFpsRange() : function16, (i & 64) != 0 ? updateConfiguration.getAntiBandingMode() : function17, (i & 128) != 0 ? updateConfiguration.getSensorSensitivity() : function18, (i & 256) != 0 ? updateConfiguration.getPreviewResolution() : function19, (i & 512) != 0 ? updateConfiguration.getPictureResolution() : function110);
    }

    @Nullable
    public final Function1<Iterable<? extends Flash>, Flash> component1() {
        return getFlashMode();
    }

    @Nullable
    public final Function1<Iterable<Resolution>, Resolution> component10() {
        return getPictureResolution();
    }

    @Nullable
    public final Function1<Iterable<? extends FocusMode>, FocusMode> component2() {
        return getFocusMode();
    }

    @Nullable
    public final Function1<IntRange, Integer> component3() {
        return getJpegQuality();
    }

    @Nullable
    public final Function1<IntRange, Integer> component4() {
        return getExposureCompensation();
    }

    @Nullable
    public final Function1<Frame, Unit> component5() {
        return getFrameProcessor();
    }

    @Nullable
    public final Function1<Iterable<FpsRange>, FpsRange> component6() {
        return getPreviewFpsRange();
    }

    @Nullable
    public final Function1<Iterable<? extends AntiBandingMode>, AntiBandingMode> component7() {
        return getAntiBandingMode();
    }

    @Nullable
    public final Function1<Iterable<Integer>, Integer> component8() {
        return getSensorSensitivity();
    }

    @Nullable
    public final Function1<Iterable<Resolution>, Resolution> component9() {
        return getPreviewResolution();
    }

    @NotNull
    public final UpdateConfiguration copy(@Nullable Function1<? super Iterable<? extends Flash>, ? extends Flash> function1, @Nullable Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> function12, @Nullable Function1<? super IntRange, Integer> function13, @Nullable Function1<? super IntRange, Integer> function14, @Nullable Function1<? super Frame, Unit> function15, @Nullable Function1<? super Iterable<FpsRange>, FpsRange> function16, @Nullable Function1<? super Iterable<? extends AntiBandingMode>, ? extends AntiBandingMode> function17, @Nullable Function1<? super Iterable<Integer>, Integer> function18, @Nullable Function1<? super Iterable<Resolution>, Resolution> function19, @Nullable Function1<? super Iterable<Resolution>, Resolution> function110) {
        return new UpdateConfiguration(function1, function12, function13, function14, function15, function16, function17, function18, function19, function110);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateConfiguration) {
            UpdateConfiguration updateConfiguration = (UpdateConfiguration) obj;
            return Intrinsics.areEqual(getFlashMode(), updateConfiguration.getFlashMode()) && Intrinsics.areEqual(getFocusMode(), updateConfiguration.getFocusMode()) && Intrinsics.areEqual(getJpegQuality(), updateConfiguration.getJpegQuality()) && Intrinsics.areEqual(getExposureCompensation(), updateConfiguration.getExposureCompensation()) && Intrinsics.areEqual(getFrameProcessor(), updateConfiguration.getFrameProcessor()) && Intrinsics.areEqual(getPreviewFpsRange(), updateConfiguration.getPreviewFpsRange()) && Intrinsics.areEqual(getAntiBandingMode(), updateConfiguration.getAntiBandingMode()) && Intrinsics.areEqual(getSensorSensitivity(), updateConfiguration.getSensorSensitivity()) && Intrinsics.areEqual(getPreviewResolution(), updateConfiguration.getPreviewResolution()) && Intrinsics.areEqual(getPictureResolution(), updateConfiguration.getPictureResolution());
        }
        return false;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<? extends AntiBandingMode>, AntiBandingMode> getAntiBandingMode() {
        return this.f62950g;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<IntRange, Integer> getExposureCompensation() {
        return this.f62947d;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<? extends Flash>, Flash> getFlashMode() {
        return this.f62944a;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<? extends FocusMode>, FocusMode> getFocusMode() {
        return this.f62945b;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Frame, Unit> getFrameProcessor() {
        return this.f62948e;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<IntRange, Integer> getJpegQuality() {
        return this.f62946c;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<Resolution>, Resolution> getPictureResolution() {
        return this.f62953j;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<FpsRange>, FpsRange> getPreviewFpsRange() {
        return this.f62949f;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<Resolution>, Resolution> getPreviewResolution() {
        return this.f62952i;
    }

    @Override // io.fotoapparat.configuration.Configuration
    @Nullable
    public Function1<Iterable<Integer>, Integer> getSensorSensitivity() {
        return this.f62951h;
    }

    public int hashCode() {
        return ((((((((((((((((((getFlashMode() == null ? 0 : getFlashMode().hashCode()) * 31) + (getFocusMode() == null ? 0 : getFocusMode().hashCode())) * 31) + (getJpegQuality() == null ? 0 : getJpegQuality().hashCode())) * 31) + (getExposureCompensation() == null ? 0 : getExposureCompensation().hashCode())) * 31) + (getFrameProcessor() == null ? 0 : getFrameProcessor().hashCode())) * 31) + (getPreviewFpsRange() == null ? 0 : getPreviewFpsRange().hashCode())) * 31) + (getAntiBandingMode() == null ? 0 : getAntiBandingMode().hashCode())) * 31) + (getSensorSensitivity() == null ? 0 : getSensorSensitivity().hashCode())) * 31) + (getPreviewResolution() == null ? 0 : getPreviewResolution().hashCode())) * 31) + (getPictureResolution() != null ? getPictureResolution().hashCode() : 0);
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
        Function1<Iterable<Resolution>, Resolution> previewResolution = getPreviewResolution();
        Function1<Iterable<Resolution>, Resolution> pictureResolution = getPictureResolution();
        return "UpdateConfiguration(flashMode=" + flashMode + ", focusMode=" + focusMode + ", jpegQuality=" + jpegQuality + ", exposureCompensation=" + exposureCompensation + ", frameProcessor=" + frameProcessor + ", previewFpsRange=" + previewFpsRange + ", antiBandingMode=" + antiBandingMode + ", sensorSensitivity=" + sensorSensitivity + ", previewResolution=" + previewResolution + ", pictureResolution=" + pictureResolution + ")";
    }

    public UpdateConfiguration(@Nullable Function1<? super Iterable<? extends Flash>, ? extends Flash> function1, @Nullable Function1<? super Iterable<? extends FocusMode>, ? extends FocusMode> function12, @Nullable Function1<? super IntRange, Integer> function13, @Nullable Function1<? super IntRange, Integer> function14, @Nullable Function1<? super Frame, Unit> function15, @Nullable Function1<? super Iterable<FpsRange>, FpsRange> function16, @Nullable Function1<? super Iterable<? extends AntiBandingMode>, ? extends AntiBandingMode> function17, @Nullable Function1<? super Iterable<Integer>, Integer> function18, @Nullable Function1<? super Iterable<Resolution>, Resolution> function19, @Nullable Function1<? super Iterable<Resolution>, Resolution> function110) {
        this.f62944a = function1;
        this.f62945b = function12;
        this.f62946c = function13;
        this.f62947d = function14;
        this.f62948e = function15;
        this.f62949f = function16;
        this.f62950g = function17;
        this.f62951h = function18;
        this.f62952i = function19;
        this.f62953j = function110;
    }

    public /* synthetic */ UpdateConfiguration(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15, (i & 32) != 0 ? null : function16, (i & 64) != 0 ? null : function17, (i & 128) != 0 ? null : function18, (i & 256) != 0 ? null : function19, (i & 512) == 0 ? function110 : null);
    }
}
