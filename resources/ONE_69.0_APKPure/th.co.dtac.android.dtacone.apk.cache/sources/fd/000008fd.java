package p000;

import androidx.camera.core.internal.ThreadConfig;
import java.util.concurrent.Executor;

/* renamed from: JT1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class JT1 {
    /* renamed from: a */
    public static Executor m67872a(ThreadConfig threadConfig) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
    }

    /* renamed from: b */
    public static Executor m67871b(ThreadConfig threadConfig, Executor executor) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
    }
}