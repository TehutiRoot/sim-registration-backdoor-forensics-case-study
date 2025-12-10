package coil.util;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import coil.size.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m29142d2 = {"Lcoil/util/HardwareBitmapService;", "", "Lcoil/size/Size;", "size", "", "allowHardwareMainThread", "(Lcoil/size/Size;)Z", "allowHardwareWorkerThread", "()Z", "LCd0;", "Lcoil/util/LimitedFileDescriptorHardwareBitmapService;", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public interface HardwareBitmapService {
    @MainThread
    boolean allowHardwareMainThread(@NotNull Size size);

    @WorkerThread
    boolean allowHardwareWorkerThread();
}