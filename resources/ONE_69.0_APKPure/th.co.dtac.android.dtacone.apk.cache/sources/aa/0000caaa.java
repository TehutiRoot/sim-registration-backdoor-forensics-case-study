package io.fotoapparat.parameter.camera.provide;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.exception.camera.InvalidConfigurationException;
import io.fotoapparat.exception.camera.UnsupportedConfigurationException;
import io.fotoapparat.parameter.AntiBandingMode;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Parameter;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.selector.AspectRatioSelectorsKt;
import io.fotoapparat.selector.SelectorsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aU\u0010\u000e\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t¢\u0006\u0002\b\f2\u0006\u0010\b\u001a\u00020\u00072#\u0010\r\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tj\u0002`\u000b¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0010*\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t¢\u0006\u0002\b\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0082\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0019\u001a\u00020\u0017*\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\tj\u0002`\u0018¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0082\u0004¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m29142d2 = {"Lio/fotoapparat/capability/Capabilities;", "capabilities", "Lio/fotoapparat/configuration/CameraConfiguration;", "cameraConfiguration", "Lio/fotoapparat/parameter/camera/CameraParameters;", "getCameraParameters", "(Lio/fotoapparat/capability/Capabilities;Lio/fotoapparat/configuration/CameraConfiguration;)Lio/fotoapparat/parameter/camera/CameraParameters;", "Lio/fotoapparat/parameter/Resolution;", "resolution", "Lkotlin/Function1;", "", "Lio/fotoapparat/selector/ResolutionSelector;", "Lkotlin/ExtensionFunctionType;", "original", OperatorName.CURVE_TO, "(Lio/fotoapparat/parameter/Resolution;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "", "", "supportedParameters", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/jvm/functions/Function1;Ljava/util/Set;)Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "", "Lio/fotoapparat/selector/QualitySelector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/IntRange;)I", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCameraParametersProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraParametersProvider.kt\nio/fotoapparat/parameter/camera/provide/CameraParametersProviderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n66#1,2:119\n106#1,4:121\n68#1:125\n81#1,9:126\n66#1,2:135\n106#1,4:137\n68#1:141\n81#1,9:142\n66#1,2:151\n106#1,4:153\n68#1:157\n81#1,9:158\n66#1,2:167\n106#1,4:169\n68#1:173\n81#1,9:174\n66#1,2:183\n106#1,4:185\n68#1:189\n81#1,9:190\n66#1,2:199\n106#1,4:201\n68#1:205\n81#1,9:206\n106#1,4:216\n81#1,9:220\n114#1,4:229\n93#1,9:233\n1#2:215\n*S KotlinDebug\n*F\n+ 1 CameraParametersProvider.kt\nio/fotoapparat/parameter/camera/provide/CameraParametersProviderKt\n*L\n24#1:119,2\n24#1:121,4\n24#1:125\n24#1:126,9\n31#1:135,2\n31#1:137,4\n31#1:141\n31#1:142,9\n32#1:151,2\n32#1:153,4\n32#1:157\n32#1:158,9\n35#1:167,2\n35#1:169,4\n35#1:173\n35#1:174,9\n36#1:183,2\n36#1:185,4\n36#1:189\n36#1:190,9\n38#1:199,2\n38#1:201,4\n38#1:205\n38#1:206,9\n67#1:216,4\n68#1:220,9\n73#1:229,4\n77#1:233,9\n*E\n"})
/* loaded from: classes5.dex */
public final class CameraParametersProviderKt {
    /* renamed from: a */
    public static final int m30851a(Function1 function1, IntRange intRange) {
        Comparable comparable = (Comparable) function1.invoke(intRange);
        if (comparable != null) {
            if (intRange.contains((IntRange) comparable)) {
                return ((Number) comparable).intValue();
            }
            throw new InvalidConfigurationException(comparable, Integer.class, intRange);
        }
        throw new UnsupportedConfigurationException("Jpeg quality", intRange);
    }

    /* renamed from: b */
    public static final Object m30850b(Function1 function1, Set set) {
        if (function1 != null) {
            return function1.invoke(set);
        }
        return null;
    }

    /* renamed from: c */
    public static final Function1 m30849c(Resolution resolution, Function1 function1) {
        return SelectorsKt.firstAvailable(SelectorsKt.filtered(AspectRatioSelectorsKt.aspectRatio$default(resolution.getAspectRatio(), function1, 0.0d, 4, null), new CameraParametersProviderKt$validPreviewSizeSelector$1(resolution)), function1);
    }

    @NotNull
    public static final CameraParameters getCameraParameters(@NotNull Capabilities capabilities, @NotNull CameraConfiguration cameraConfiguration) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        Function1<Iterable<Resolution>, Resolution> pictureResolution = cameraConfiguration.getPictureResolution();
        Set<Resolution> pictureResolutions = capabilities.getPictureResolutions();
        Resolution invoke = pictureResolution.invoke(pictureResolutions);
        if (invoke != null) {
            if (pictureResolutions.contains(invoke)) {
                Resolution resolution = invoke;
                Function1 m30849c = m30849c(resolution, cameraConfiguration.getPreviewResolution());
                Function1<Iterable<? extends Flash>, Flash> flashMode = cameraConfiguration.getFlashMode();
                Set<Flash> flashModes = capabilities.getFlashModes();
                Flash invoke2 = flashMode.invoke(flashModes);
                if (invoke2 != null) {
                    if (flashModes.contains(invoke2)) {
                        Flash flash = invoke2;
                        Function1<Iterable<? extends FocusMode>, FocusMode> focusMode = cameraConfiguration.getFocusMode();
                        Set<FocusMode> focusModes = capabilities.getFocusModes();
                        FocusMode invoke3 = focusMode.invoke(focusModes);
                        if (invoke3 != null) {
                            if (focusModes.contains(invoke3)) {
                                FocusMode focusMode2 = invoke3;
                                int m30851a = m30851a(cameraConfiguration.getJpegQuality(), capabilities.getJpegQualityRange());
                                int m30851a2 = m30851a(cameraConfiguration.getExposureCompensation(), capabilities.getExposureCompensationRange());
                                Function1<Iterable<FpsRange>, FpsRange> previewFpsRange = cameraConfiguration.getPreviewFpsRange();
                                Set<FpsRange> previewFpsRanges = capabilities.getPreviewFpsRanges();
                                FpsRange invoke4 = previewFpsRange.invoke(previewFpsRanges);
                                if (invoke4 != null) {
                                    if (previewFpsRanges.contains(invoke4)) {
                                        FpsRange fpsRange = invoke4;
                                        Function1<Iterable<? extends AntiBandingMode>, AntiBandingMode> antiBandingMode = cameraConfiguration.getAntiBandingMode();
                                        Set<AntiBandingMode> antiBandingModes = capabilities.getAntiBandingModes();
                                        AntiBandingMode invoke5 = antiBandingMode.invoke(antiBandingModes);
                                        if (invoke5 != null) {
                                            if (antiBandingModes.contains(invoke5)) {
                                                AntiBandingMode antiBandingMode2 = invoke5;
                                                Set<Resolution> previewResolutions = capabilities.getPreviewResolutions();
                                                Parameter parameter = (Parameter) m30849c.invoke(previewResolutions);
                                                if (parameter != null) {
                                                    if (previewResolutions.contains(parameter)) {
                                                        return new CameraParameters(flash, focusMode2, m30851a, m30851a2, fpsRange, antiBandingMode2, (Integer) m30850b(cameraConfiguration.getSensorSensitivity(), capabilities.getSensorSensitivities()), resolution, (Resolution) parameter);
                                                    }
                                                    throw new InvalidConfigurationException(parameter, Resolution.class, previewResolutions);
                                                }
                                                throw new UnsupportedConfigurationException(Resolution.class, previewResolutions);
                                            }
                                            throw new InvalidConfigurationException(invoke5, AntiBandingMode.class, antiBandingModes);
                                        }
                                        throw new UnsupportedConfigurationException(AntiBandingMode.class, antiBandingModes);
                                    }
                                    throw new InvalidConfigurationException(invoke4, FpsRange.class, previewFpsRanges);
                                }
                                throw new UnsupportedConfigurationException(FpsRange.class, previewFpsRanges);
                            }
                            throw new InvalidConfigurationException(invoke3, FocusMode.class, focusModes);
                        }
                        throw new UnsupportedConfigurationException(FocusMode.class, focusModes);
                    }
                    throw new InvalidConfigurationException(invoke2, Flash.class, flashModes);
                }
                throw new UnsupportedConfigurationException(Flash.class, flashModes);
            }
            throw new InvalidConfigurationException(invoke, Resolution.class, pictureResolutions);
        }
        throw new UnsupportedConfigurationException(Resolution.class, pictureResolutions);
    }
}