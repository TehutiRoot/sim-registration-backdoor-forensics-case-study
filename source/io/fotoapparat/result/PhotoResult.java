package io.fotoapparat.result;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exif.ExifWriter;
import io.fotoapparat.log.Logger;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.result.transformer.BitmapPhotoTransformer;
import io.fotoapparat.result.transformer.ResolutionTransformersKt;
import io.fotoapparat.result.transformer.SaveToFileTransformer;
import java.io.File;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Lio/fotoapparat/result/PhotoResult;", "", "Lio/fotoapparat/result/PendingResult;", "Lio/fotoapparat/result/Photo;", "pendingResult", "<init>", "(Lio/fotoapparat/result/PendingResult;)V", "Lkotlin/Function1;", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/result/transformer/ResolutionTransformer;", "sizeTransformer", "Lio/fotoapparat/result/BitmapPhoto;", "toBitmap", "(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;", "Ljava/io/File;", "file", "", "saveToFile", "(Ljava/io/File;)Lio/fotoapparat/result/PendingResult;", "toPendingResult", "()Lio/fotoapparat/result/PendingResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/result/PendingResult;", "Companion", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PhotoResult {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final PendingResult f63040a;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, m28850d2 = {"Lio/fotoapparat/result/PhotoResult$Companion;", "", "()V", "fromFuture", "Lio/fotoapparat/result/PhotoResult;", "photoFuture", "Ljava/util/concurrent/Future;", "Lio/fotoapparat/result/Photo;", "logger", "Lio/fotoapparat/log/Logger;", "fromFuture$fotoapparat_release", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PhotoResult fromFuture$fotoapparat_release(@NotNull Future<Photo> photoFuture, @NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(photoFuture, "photoFuture");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new PhotoResult(PendingResult.Companion.fromFuture$fotoapparat_release(photoFuture, logger));
        }

        public Companion() {
        }
    }

    public PhotoResult(@NotNull PendingResult<Photo> pendingResult) {
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        this.f63040a = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingResult toBitmap$default(PhotoResult photoResult, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = ResolutionTransformersKt.originalResolution();
        }
        return photoResult.toBitmap(function1);
    }

    @NotNull
    public final PendingResult<Unit> saveToFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f63040a.transform(new SaveToFileTransformer(file, ExifWriter.INSTANCE));
    }

    @JvmOverloads
    @NotNull
    public final PendingResult<BitmapPhoto> toBitmap() {
        return toBitmap$default(this, null, 1, null);
    }

    @NotNull
    public final PendingResult<Photo> toPendingResult() {
        return this.f63040a;
    }

    @JvmOverloads
    @NotNull
    public final PendingResult<BitmapPhoto> toBitmap(@NotNull Function1<? super Resolution, Resolution> sizeTransformer) {
        Intrinsics.checkNotNullParameter(sizeTransformer, "sizeTransformer");
        return this.f63040a.transform(new BitmapPhotoTransformer(sizeTransformer));
    }
}
