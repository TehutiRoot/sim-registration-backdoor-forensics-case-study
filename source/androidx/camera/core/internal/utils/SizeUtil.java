package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.feitian.readerdk.Tool.C6150DK;
import com.zxy.tiny.core.CompressKit;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(320, C6150DK.ERROR_RECEIVE_LRC);
    public static final Size RESOLUTION_VGA = new Size(640, 480);
    public static final Size RESOLUTION_480P = new Size(720, 480);
    public static final Size RESOLUTION_720P = new Size(CompressKit.DEFAULT_MAX_COMPRESS_SIZE, 720);
    public static final Size RESOLUTION_1080P = new Size(1920, 1080);
    public static final Size RESOLUTION_1440P = new Size(1920, DateTimeConstants.MINUTES_PER_DAY);

    public static int getArea(@NonNull Size size) {
        return size.getWidth() * size.getHeight();
    }

    @Nullable
    public static Size getMaxSize(@NonNull List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    public static boolean isLongerInAnyEdge(@NonNull Size size, @NonNull Size size2) {
        if (size.getWidth() <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
            return false;
        }
        return true;
    }

    public static boolean isSmallerByArea(@NonNull Size size, @NonNull Size size2) {
        if (getArea(size) < getArea(size2)) {
            return true;
        }
        return false;
    }
}
