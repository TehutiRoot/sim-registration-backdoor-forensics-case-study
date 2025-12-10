package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.feitian.readerdk.Tool.C6139DK;
import java.util.ArrayList;
import java.util.Comparator;

@RequiresApi(21)
/* loaded from: classes.dex */
public class SupportedRepeatingSurfaceSize {

    /* renamed from: b */
    public static final Size f10650b = new Size(320, C6139DK.ERROR_RECEIVE_LRC);

    /* renamed from: c */
    public static final Comparator f10651c = new CompareSizesByArea();

    /* renamed from: a */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f10652a = (RepeatingStreamConstraintForVideoRecordingQuirk) DeviceQuirks.get(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    @NonNull
    public Size[] getSupportedSizes(@NonNull Size[] sizeArr) {
        if (this.f10652a != null && RepeatingStreamConstraintForVideoRecordingQuirk.isHuaweiMate9()) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (f10651c.compare(size, f10650b) >= 0) {
                    arrayList.add(size);
                }
            }
            return (Size[]) arrayList.toArray(new Size[0]);
        }
        return sizeArr;
    }
}