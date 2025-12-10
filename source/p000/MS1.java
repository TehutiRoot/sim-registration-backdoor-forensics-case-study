package p000;

import androidx.camera.core.internal.ThreadConfig;
import java.util.concurrent.Executor;

/* renamed from: MS1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class MS1 {
    /* renamed from: a */
    public static Executor m67382a(ThreadConfig threadConfig) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
    }

    /* renamed from: b */
    public static Executor m67381b(ThreadConfig threadConfig, Executor executor) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
    }
}
