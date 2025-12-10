package io.fotoapparat.routine.zoom;

import androidx.annotation.FloatRange;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exception.LevelOutOfRangeException;
import io.fotoapparat.hardware.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lio/fotoapparat/hardware/Device;", "", "zoomLevel", "", "updateZoomLevel", "(Lio/fotoapparat/hardware/Device;F)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)V", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class UpdateZoomLevelRoutineKt {
    /* renamed from: a */
    public static final void m30479a(float f) {
        if (0.0f <= f && f <= 1.0f) {
            return;
        }
        throw new LevelOutOfRangeException(f);
    }

    public static final void updateZoomLevel(@NotNull Device device2, @FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        AbstractC1475Uc.m66000b(null, new UpdateZoomLevelRoutineKt$updateZoomLevel$1(f, device2, null), 1, null);
    }
}
