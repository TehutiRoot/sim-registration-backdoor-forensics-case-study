package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"tQ1", "uQ1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return AbstractC22274tQ1.m22438a();
    }

    public static final int systemProp(@NotNull String str, int i, int i2, int i3) {
        return AbstractC22446uQ1.m1275a(str, i, i2, i3);
    }

    public static final long systemProp(@NotNull String str, long j, long j2, long j3) {
        return AbstractC22446uQ1.m1274b(str, j, j2, j3);
    }

    @Nullable
    public static final String systemProp(@NotNull String str) {
        return AbstractC22274tQ1.m22437b(str);
    }

    @NotNull
    public static final String systemProp(@NotNull String str, @NotNull String str2) {
        return AbstractC22446uQ1.m1273c(str, str2);
    }

    public static final boolean systemProp(@NotNull String str, boolean z) {
        return AbstractC22446uQ1.m1272d(str, z);
    }
}
