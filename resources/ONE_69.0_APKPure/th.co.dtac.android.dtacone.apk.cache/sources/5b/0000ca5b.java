package io.fotoapparat.hardware;

import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.configuration.Configuration;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.preview.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a=\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032#\u0010\u0004\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b¢\u0006\u0002\b\tH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¨\u0006\u000f"}, m29142d2 = {"selectCamera", "Lio/fotoapparat/hardware/CameraDevice;", "availableCameras", "", "lensPositionSelector", "Lkotlin/Function1;", "", "Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/selector/LensPositionSelector;", "Lkotlin/ExtensionFunctionType;", "updateConfiguration", "Lio/fotoapparat/configuration/CameraConfiguration;", "savedConfiguration", "newConfiguration", "Lio/fotoapparat/configuration/Configuration;", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device.kt\nio/fotoapparat/hardware/DeviceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1549#2:198\n1620#2,3:199\n1#3:202\n*S KotlinDebug\n*F\n+ 1 Device.kt\nio/fotoapparat/hardware/DeviceKt\n*L\n192#1:198\n192#1:199,3\n*E\n"})
/* loaded from: classes5.dex */
public final class DeviceKt {
    @Nullable
    public static final CameraDevice selectCamera(@NotNull List<? extends CameraDevice> availableCameras, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> lensPositionSelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(availableCameras, "availableCameras");
        Intrinsics.checkNotNullParameter(lensPositionSelector, "lensPositionSelector");
        List<? extends CameraDevice> list = availableCameras;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (CameraDevice cameraDevice : list) {
            arrayList.add(cameraDevice.getCharacteristics().getLensPosition());
        }
        LensPosition invoke = lensPositionSelector.invoke(CollectionsKt___CollectionsKt.toSet(arrayList));
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((CameraDevice) obj).getCharacteristics().getLensPosition(), invoke)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (CameraDevice) obj;
    }

    @NotNull
    public static final CameraConfiguration updateConfiguration(@NotNull CameraConfiguration savedConfiguration, @NotNull Configuration newConfiguration) {
        Function1<Iterable<Resolution>, Resolution> function1;
        Intrinsics.checkNotNullParameter(savedConfiguration, "savedConfiguration");
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        Function1<Iterable<? extends Flash>, Flash> flashMode = newConfiguration.getFlashMode();
        if (flashMode == null) {
            flashMode = savedConfiguration.getFlashMode();
        }
        Function1<Iterable<? extends Flash>, Flash> function12 = flashMode;
        Function1<Iterable<? extends FocusMode>, FocusMode> focusMode = newConfiguration.getFocusMode();
        if (focusMode == null) {
            focusMode = savedConfiguration.getFocusMode();
        }
        Function1<Iterable<? extends FocusMode>, FocusMode> function13 = focusMode;
        Function1<IntRange, Integer> exposureCompensation = newConfiguration.getExposureCompensation();
        if (exposureCompensation == null) {
            exposureCompensation = savedConfiguration.getExposureCompensation();
        }
        Function1<IntRange, Integer> function14 = exposureCompensation;
        Function1<Frame, Unit> frameProcessor = newConfiguration.getFrameProcessor();
        if (frameProcessor == null) {
            frameProcessor = savedConfiguration.getFrameProcessor();
        }
        Function1<Frame, Unit> function15 = frameProcessor;
        Function1<Iterable<FpsRange>, FpsRange> previewFpsRange = newConfiguration.getPreviewFpsRange();
        if (previewFpsRange == null) {
            previewFpsRange = savedConfiguration.getPreviewFpsRange();
        }
        Function1<Iterable<FpsRange>, FpsRange> function16 = previewFpsRange;
        Function1<Iterable<Integer>, Integer> sensorSensitivity = newConfiguration.getSensorSensitivity();
        if (sensorSensitivity == null) {
            sensorSensitivity = savedConfiguration.getSensorSensitivity();
        }
        Function1<Iterable<Integer>, Integer> function17 = sensorSensitivity;
        Function1<Iterable<Resolution>, Resolution> pictureResolution = newConfiguration.getPictureResolution();
        if (pictureResolution == null) {
            pictureResolution = savedConfiguration.getPictureResolution();
        }
        Function1<Iterable<Resolution>, Resolution> function18 = pictureResolution;
        Function1<Iterable<Resolution>, Resolution> previewResolution = newConfiguration.getPreviewResolution();
        if (previewResolution == null) {
            function1 = savedConfiguration.getPreviewResolution();
        } else {
            function1 = previewResolution;
        }
        return new CameraConfiguration(function12, function13, null, function14, function15, function16, null, function17, function18, function1, 68, null);
    }
}