package io.fotoapparat.exif;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exception.FileSaveException;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lio/fotoapparat/exif/ExifWriter;", "Lio/fotoapparat/exif/ExifOrientationWriter;", "<init>", "()V", "Ljava/io/File;", "file", "", "rotationDegrees", "", "writeExifOrientation", "(Ljava/io/File;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ExifWriter implements ExifOrientationWriter {
    @NotNull
    public static final ExifWriter INSTANCE = new ExifWriter();

    /* renamed from: a */
    public final int m30557a(int i) {
        int i2 = (360 - i) % 360;
        if (i2 != 90) {
            if (i2 != 180) {
                if (i2 != 270) {
                    return 1;
                }
                return 8;
            }
            return 3;
        }
        return 6;
    }

    @Override // io.fotoapparat.exif.ExifOrientationWriter
    public void writeExifOrientation(@NotNull File file, int i) throws FileSaveException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            ExifInterface exifInterface = new ExifInterface(file.getPath());
            exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(INSTANCE.m30557a(i)));
            exifInterface.saveAttributes();
        } catch (IOException e) {
            throw new FileSaveException(e);
        }
    }
}
