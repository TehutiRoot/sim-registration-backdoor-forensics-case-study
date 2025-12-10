package th.p047co.dtac.android.dtacone.util.appOne.image;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.FilesKt__FileReadWriteKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/appOne/image/ImageUtil;", "", "Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "compressImage", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "<init>", "(Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;Lth/co/dtac/android/dtacone/util/FileUtil;)V", "", "imageName", "type", "getImage", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getImageBase64", "(Ljava/lang/String;)Ljava/lang/String;", "", FirebaseAnalytics.Param.INDEX, "", "isFaceRecog", "getDocType", "(IZ)Ljava/lang/String;", "getPre2PostDocType", "getImageFileName", "getFileNameEncodeBase64", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "getCompressImage", "()Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.appOne.image.ImageUtil */
/* loaded from: classes8.dex */
public final class ImageUtil {
    public static final int $stable = 8;

    /* renamed from: a */
    public final CompressImage f87108a;

    /* renamed from: b */
    public final FileUtil f87109b;

    @Inject
    public ImageUtil(@NotNull CompressImage compressImage, @NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(compressImage, "compressImage");
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        this.f87108a = compressImage;
        this.f87109b = fileUtil;
    }

    @NotNull
    public final CompressImage getCompressImage() {
        return this.f87108a;
    }

    @NotNull
    public final String getDocType(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return "FACE_RECOG_CUST_CERTIFICATE";
            }
            if (i == 1) {
                return "FACE_RECOG_CUST_CAPTURE";
            }
        } else if (i == 0) {
            return "FACE_RECOG_CUST_CERTIFICATE";
        }
        return "DOC_APP_REQUIRED";
    }

    @NotNull
    public final String getFileNameEncodeBase64(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        String encodeToString = Base64.encodeToString(FilesKt__FileReadWriteKt.readBytes(this.f87108a.getFileByName(imageName, 80)), 2);
        return "data:image/jpeg;base64," + encodeToString;
    }

    @NotNull
    public final FileUtil getFileUtil() {
        return this.f87109b;
    }

    @NotNull
    public final String getImage(@NotNull String imageName, @NotNull String type) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f87109b.isFileExist(imageName)) {
            String encodeToString = Base64.encodeToString(FilesKt__FileReadWriteKt.readBytes(this.f87108a.getFileByName(imageName, 80)), 2);
            return "data:image/" + type + ";base64," + encodeToString;
        }
        return "";
    }

    @Nullable
    public final String getImageBase64(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return Base64.encodeToString(FilesKt__FileReadWriteKt.readBytes(this.f87108a.getFileByName(imageName, 80)), 2);
    }

    @NotNull
    public final String getImageFileName(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        String name = this.f87108a.getFileByName(imageName, 80).getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r5 != 1) goto L7;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getPre2PostDocType(int r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "FACE_RECOG_CUST_CERTIFICATE"
            java.lang.String r1 = "CUST_ID_CARD"
            java.lang.String r2 = "DOC_APP_REQUIRED"
            r3 = 1
            if (r6 != r3) goto L17
            if (r5 == 0) goto L1c
            if (r5 == r3) goto L15
            r6 = 2
            if (r5 == r6) goto L12
        L10:
            r0 = r2
            goto L1c
        L12:
            java.lang.String r0 = "FACE_RECOG_CUST_CAPTURE"
            goto L1c
        L15:
            r0 = r1
            goto L1c
        L17:
            if (r5 == 0) goto L1c
            if (r5 == r3) goto L15
            goto L10
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.util.appOne.image.ImageUtil.getPre2PostDocType(int, boolean):java.lang.String");
    }
}