package coil.decode;

import coil.util.Utils;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m28850d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "mimeType", "", "supports", "(Lcoil/decode/ExifOrientationPolicy;Ljava/lang/String;)Z", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Set;", "RESPECT_PERFORMANCE_MIME_TYPES", "Lcoil/decode/ExifData;", "isSwapped", "(Lcoil/decode/ExifData;)Z", "isRotated", "coil-base_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ExifUtilsKt {

    /* renamed from: a */
    public static final Set f40487a = DG1.setOf((Object[]) new String[]{Utils.MIME_TYPE_JPEG, Utils.MIME_TYPE_WEBP, Utils.MIME_TYPE_HEIC, Utils.MIME_TYPE_HEIF});

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isRotated(@NotNull ExifData exifData) {
        if (exifData.getRotationDegrees() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean isSwapped(@NotNull ExifData exifData) {
        if (exifData.getRotationDegrees() != 90 && exifData.getRotationDegrees() != 270) {
            return false;
        }
        return true;
    }

    public static final boolean supports(@NotNull ExifOrientationPolicy exifOrientationPolicy, @Nullable String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[exifOrientationPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f40487a.contains(str)) {
            return false;
        }
        return true;
    }
}
