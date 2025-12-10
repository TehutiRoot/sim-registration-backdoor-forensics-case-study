package p000;

import androidx.camera.core.internal.IoConfig;
import java.util.concurrent.Executor;

/* renamed from: wg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC22896wg0 {
    /* renamed from: a */
    public static Executor m684a(IoConfig ioConfig) {
        return (Executor) ioConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR);
    }

    /* renamed from: b */
    public static Executor m683b(IoConfig ioConfig, Executor executor) {
        return (Executor) ioConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, executor);
    }
}