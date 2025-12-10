package io.fotoapparat.routine.photo;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.result.Photo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lio/fotoapparat/hardware/Device;", "Lio/fotoapparat/result/Photo;", "takePhoto", "(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/result/Photo;", "Lio/fotoapparat/hardware/CameraDevice;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lio/fotoapparat/hardware/CameraDevice;)V", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class TakePhotoRoutineKt {
    /* renamed from: a */
    public static final void m30480a(CameraDevice cameraDevice) {
        try {
            cameraDevice.startPreview();
        } catch (CameraException unused) {
        }
    }

    @NotNull
    public static final Photo takePhoto(@NotNull Device device2) {
        Object m66000b;
        Intrinsics.checkNotNullParameter(device2, "<this>");
        m66000b = AbstractC1475Uc.m66000b(null, new TakePhotoRoutineKt$takePhoto$1(device2, null), 1, null);
        return (Photo) m66000b;
    }
}
