package kotlin.p023io.path;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28850d2 = {"Ljava/nio/file/Path;", ClientCookie.PATH_ATTR, "", "Ljava/nio/file/LinkOption;", "linkOptions", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "LXh1;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(LXh1;)Z", "kotlin-stdlib-jdk7"}, m28849k = 2, m28848mv = {1, 9, 0})
/* renamed from: kotlin.io.path.PathTreeWalkKt */
/* loaded from: classes5.dex */
public final class PathTreeWalkKt {
    /* renamed from: a */
    public static final boolean m28748a(C18755Xh1 c18755Xh1) {
        boolean isSameFile;
        for (C18755Xh1 m65448c = c18755Xh1.m65448c(); m65448c != null; m65448c = m65448c.m65448c()) {
            if (m65448c.m65449b() == null || c18755Xh1.m65449b() == null) {
                try {
                    isSameFile = Files.isSameFile(m65448c.m65447d(), c18755Xh1.m65447d());
                    if (isSameFile) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (Intrinsics.areEqual(m65448c.m65449b(), c18755Xh1.m65449b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final Object m28747b(Path path, LinkOption[] linkOptionArr) {
        BasicFileAttributes readAttributes;
        Object fileKey;
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            readAttributes = Files.readAttributes(path, AbstractC20598ji1.m29148a(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            Intrinsics.checkNotNullExpressionValue(readAttributes, "readAttributes(...)");
            fileKey = readAttributes.fileKey();
            return fileKey;
        } catch (Throwable unused) {
            return null;
        }
    }
}
