package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

@RequiresApi(21)
/* loaded from: classes.dex */
public class JpegMetadataCorrector {

    /* renamed from: a */
    public final IncorrectJpegMetadataQuirk f11460a;

    public JpegMetadataCorrector(@NonNull Quirks quirks) {
        this.f11460a = (IncorrectJpegMetadataQuirk) quirks.get(IncorrectJpegMetadataQuirk.class);
    }

    @NonNull
    public byte[] jpegImageToJpegByteArray(@NonNull ImageProxy imageProxy) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f11460a;
        if (incorrectJpegMetadataQuirk == null) {
            ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.capacity()];
            buffer.rewind();
            buffer.get(bArr);
            return bArr;
        }
        return incorrectJpegMetadataQuirk.jpegImageToJpegByteArray(imageProxy);
    }

    public boolean needCorrectJpegMetadata() {
        if (this.f11460a != null) {
            return true;
        }
        return false;
    }
}