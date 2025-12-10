package io.fotoapparat.preview;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00060\u0005R\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28850d2 = {"Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/hardware/Camera$Size;)I", "Landroid/hardware/Camera$Parameters;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/hardware/Camera$Parameters;)V", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PreviewStreamKt {
    /* renamed from: a */
    public static final int m30493a(Camera.Size size) {
        return ((size.width * size.height) * ImageFormat.getBitsPerPixel(17)) / 8;
    }

    /* renamed from: b */
    public static final void m30492b(Camera.Parameters parameters) {
        if (parameters.getPreviewFormat() == 17) {
            return;
        }
        throw new UnsupportedOperationException("Only NV21 preview format is supported");
    }
}
