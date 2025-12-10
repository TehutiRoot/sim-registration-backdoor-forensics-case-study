package th.p047co.dtac.android.dtacone.manager.compressor;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import id.zelory.compressor.Compressor;
import java.io.File;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "Lth/co/dtac/android/dtacone/manager/compressor/ICompressor;", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lid/zelory/compressor/Compressor;", "compressor", "<init>", "(Lth/co/dtac/android/dtacone/util/FileUtil;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lid/zelory/compressor/Compressor;)V", "", ClientCookie.PATH_ATTR, "", "quality", "Ljava/io/File;", "getFileByPath", "(Ljava/lang/String;I)Ljava/io/File;", "bitmapName", "getFileByName", "Landroid/graphics/Bitmap$CompressFormat;", "type", "(Ljava/lang/String;ILandroid/graphics/Bitmap$CompressFormat;)Ljava/io/File;", "filename", "", "isFileExist", "(Ljava/lang/String;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lid/zelory/compressor/Compressor;", "getCompressor", "()Lid/zelory/compressor/Compressor;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.compressor.CompressImage */
/* loaded from: classes7.dex */
public class CompressImage implements ICompressor {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FileUtil f84901a;

    /* renamed from: b */
    public final Rx2ThreadService f84902b;

    /* renamed from: c */
    public final Compressor f84903c;

    @Inject
    public CompressImage(@NotNull FileUtil fileUtil, @NotNull Rx2ThreadService threadService, @NotNull Compressor compressor) {
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        this.f84901a = fileUtil;
        this.f84902b = threadService;
        this.f84903c = compressor;
    }

    @NotNull
    public final Compressor getCompressor() {
        return this.f84903c;
    }

    @Override // th.p047co.dtac.android.dtacone.manager.compressor.ICompressor
    @NotNull
    public File getFileByName(@NotNull String bitmapName, int i) {
        Intrinsics.checkNotNullParameter(bitmapName, "bitmapName");
        Object blockingSingle = this.f84903c.setQuality(i).setCompressFormat(Bitmap.CompressFormat.JPEG).compressToFileAsFlowable(this.f84901a.getFileByName(bitmapName)).onBackpressureBuffer().compose(this.f84902b.applyFlowableBackground()).blockingSingle();
        Intrinsics.checkNotNullExpressionValue(blockingSingle, "compressor.setQuality(qu…        .blockingSingle()");
        return (File) blockingSingle;
    }

    @Override // th.p047co.dtac.android.dtacone.manager.compressor.ICompressor
    @NotNull
    public File getFileByPath(@NotNull String path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Object blockingSingle = this.f84903c.setQuality(i).setCompressFormat(Bitmap.CompressFormat.JPEG).compressToFileAsFlowable(new File(path)).onBackpressureBuffer().compose(this.f84902b.applyFlowableBackground()).blockingSingle();
        Intrinsics.checkNotNullExpressionValue(blockingSingle, "compressor.setQuality(qu…        .blockingSingle()");
        return (File) blockingSingle;
    }

    @NotNull
    public final FileUtil getFileUtil() {
        return this.f84901a;
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f84902b;
    }

    public final boolean isFileExist(@NotNull String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return this.f84901a.isFileExist(filename);
    }

    @Override // th.p047co.dtac.android.dtacone.manager.compressor.ICompressor
    @NotNull
    public File getFileByName(@NotNull String bitmapName, int i, @NotNull Bitmap.CompressFormat type) {
        Intrinsics.checkNotNullParameter(bitmapName, "bitmapName");
        Intrinsics.checkNotNullParameter(type, "type");
        Object blockingSingle = this.f84903c.setQuality(i).setCompressFormat(type).compressToFileAsFlowable(this.f84901a.getFileByName(bitmapName)).onBackpressureBuffer().compose(this.f84902b.applyFlowableBackground()).blockingSingle();
        Intrinsics.checkNotNullExpressionValue(blockingSingle, "compressor.setQuality(qu…        .blockingSingle()");
        return (File) blockingSingle;
    }
}
