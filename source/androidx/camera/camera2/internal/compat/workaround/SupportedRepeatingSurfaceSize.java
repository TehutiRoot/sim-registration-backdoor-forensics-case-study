package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.feitian.readerdk.Tool.C6150DK;
import java.util.ArrayList;
import java.util.Comparator;

@RequiresApi(21)
/* loaded from: classes.dex */
public class SupportedRepeatingSurfaceSize {

    /* renamed from: b */
    public static final Size f10562b = new Size(320, C6150DK.ERROR_RECEIVE_LRC);

    /* renamed from: c */
    public static final Comparator f10563c = new CompareSizesByArea();

    /* renamed from: a */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f10564a = (RepeatingStreamConstraintForVideoRecordingQuirk) DeviceQuirks.get(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    @NonNull
    public Size[] getSupportedSizes(@NonNull Size[] sizeArr) {
        if (this.f10564a != null && RepeatingStreamConstraintForVideoRecordingQuirk.isHuaweiMate9()) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (f10563c.compare(size, f10562b) >= 0) {
                    arrayList.add(size);
                }
            }
            return (Size[]) arrayList.toArray(new Size[0]);
        }
        return sizeArr;
    }
}
