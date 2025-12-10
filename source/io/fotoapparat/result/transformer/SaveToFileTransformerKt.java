package io.fotoapparat.result.transformer;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.result.Photo;
import java.io.BufferedOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p023io.CloseableKt;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lio/fotoapparat/result/Photo;", "input", "Ljava/io/BufferedOutputStream;", "outputStream", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lio/fotoapparat/result/Photo;Ljava/io/BufferedOutputStream;)V", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SaveToFileTransformerKt {
    /* renamed from: a */
    public static final void m30481a(Photo photo, BufferedOutputStream bufferedOutputStream) {
        try {
            bufferedOutputStream.write(photo.encodedImage);
            bufferedOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedOutputStream, th2);
                throw th3;
            }
        }
    }
}
