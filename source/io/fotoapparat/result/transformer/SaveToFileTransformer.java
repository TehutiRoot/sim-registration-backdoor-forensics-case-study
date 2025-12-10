package io.fotoapparat.result.transformer;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exception.FileSaveException;
import io.fotoapparat.exif.ExifOrientationWriter;
import io.fotoapparat.result.Photo;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Lio/fotoapparat/result/transformer/SaveToFileTransformer;", "Lkotlin/Function1;", "Lio/fotoapparat/result/Photo;", "", "Ljava/io/File;", "file", "Lio/fotoapparat/exif/ExifOrientationWriter;", "exifOrientationWriter", "<init>", "(Ljava/io/File;Lio/fotoapparat/exif/ExifOrientationWriter;)V", "input", "invoke", "(Lio/fotoapparat/result/Photo;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/io/File;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/exif/ExifOrientationWriter;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SaveToFileTransformer implements Function1<Photo, Unit> {

    /* renamed from: a */
    public final File f63042a;

    /* renamed from: b */
    public final ExifOrientationWriter f63043b;

    public SaveToFileTransformer(@NotNull File file, @NotNull ExifOrientationWriter exifOrientationWriter) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(exifOrientationWriter, "exifOrientationWriter");
        this.f63042a = file;
        this.f63043b = exifOrientationWriter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Photo photo) {
        invoke2(photo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull Photo input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            try {
                SaveToFileTransformerKt.m30481a(input, new BufferedOutputStream(new FileOutputStream(this.f63042a), 8192));
                this.f63043b.writeExifOrientation(this.f63042a, input.rotationDegrees);
            } catch (IOException e) {
                throw new FileSaveException(e);
            }
        } catch (FileNotFoundException e2) {
            throw new FileSaveException(e2);
        }
    }
}
