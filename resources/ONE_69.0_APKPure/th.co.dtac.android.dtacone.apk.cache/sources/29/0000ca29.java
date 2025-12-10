package io.fotoapparat.capability.provide;

import android.hardware.Camera;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.parameter.SupportedParameters;
import io.fotoapparat.parameter.Zoom;
import io.fotoapparat.parameter.camera.convert.ResolutionConverterKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\b*\u00020\u0007\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00010\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r*\f\u0012\b\u0012\u00060\u0011R\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Landroid/hardware/Camera;", "Lio/fotoapparat/capability/Capabilities;", "getCapabilities", "(Landroid/hardware/Camera;)Lio/fotoapparat/capability/Capabilities;", "Lio/fotoapparat/parameter/SupportedParameters;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lio/fotoapparat/parameter/SupportedParameters;)Lio/fotoapparat/capability/Capabilities;", "", "Parameter", StandardStructureTypes.CODE, "", "Lkotlin/Function1;", "converter", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;", "", "Landroid/hardware/Camera$Size;", "Lio/fotoapparat/parameter/Resolution;", OperatorName.CURVE_TO, "(Ljava/util/Collection;)Ljava/util/Set;", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCapabilitiesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapabilitiesProvider.kt\nio/fotoapparat/capability/provide/CapabilitiesProviderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1603#2,9:36\n1855#2:45\n1856#2:47\n1612#2:48\n1549#2:49\n1620#2,3:50\n1#3:46\n*S KotlinDebug\n*F\n+ 1 CapabilitiesProvider.kt\nio/fotoapparat/capability/provide/CapabilitiesProviderKt\n*L\n33#1:36,9\n33#1:45\n33#1:47\n33#1:48\n35#1:49\n35#1:50,3\n33#1:46\n*E\n"})
/* loaded from: classes5.dex */
public final class CapabilitiesProviderKt {
    /* renamed from: a */
    public static final Set m30904a(List list, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object invoke = function1.invoke(obj);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    /* renamed from: b */
    public static final Capabilities m30903b(SupportedParameters supportedParameters) {
        Zoom supportedZoom = supportedParameters.getSupportedZoom();
        Set m30904a = m30904a(supportedParameters.getFlashModes(), CapabilitiesProviderKt$getCapabilities$1.INSTANCE);
        Set m30904a2 = m30904a(supportedParameters.getFocusModes(), CapabilitiesProviderKt$getCapabilities$2.INSTANCE);
        int maxNumFocusAreas = supportedParameters.getMaxNumFocusAreas();
        return new Capabilities(supportedZoom, m30904a, m30904a2, supportedParameters.getSupportedSmoothZoom(), maxNumFocusAreas, supportedParameters.getMaxNumMeteringAreas(), supportedParameters.getJpegQualityRange(), supportedParameters.getExposureCompensationRange(), m30904a(supportedParameters.getSupportedPreviewFpsRanges(), CapabilitiesProviderKt$getCapabilities$4.INSTANCE), m30904a(supportedParameters.getSupportedAutoBandingModes(), CapabilitiesProviderKt$getCapabilities$3.INSTANCE), m30902c(supportedParameters.getPictureResolutions()), m30902c(supportedParameters.getPreviewResolutions()), CollectionsKt___CollectionsKt.toSet(supportedParameters.getSensorSensitivities()));
    }

    /* renamed from: c */
    public static final Set m30902c(Collection collection) {
        Collection<Camera.Size> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(collection2, 10));
        for (Camera.Size size : collection2) {
            arrayList.add(ResolutionConverterKt.toResolution(size));
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    @NotNull
    public static final Capabilities getCapabilities(@NotNull Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "<this>");
        Camera.Parameters parameters = camera.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "parameters");
        return m30903b(new SupportedParameters(parameters));
    }
}