package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"qR1", "rR1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return AbstractC21823qR1.m23635a();
    }

    public static final int systemProp(@NotNull String str, int i, int i2, int i3) {
        return AbstractC21996rR1.m23512a(str, i, i2, i3);
    }

    public static final long systemProp(@NotNull String str, long j, long j2, long j3) {
        return AbstractC21996rR1.m23511b(str, j, j2, j3);
    }

    @Nullable
    public static final String systemProp(@NotNull String str) {
        return AbstractC21823qR1.m23634b(str);
    }

    @NotNull
    public static final String systemProp(@NotNull String str, @NotNull String str2) {
        return AbstractC21996rR1.m23510c(str, str2);
    }

    public static final boolean systemProp(@NotNull String str, boolean z) {
        return AbstractC21996rR1.m23509d(str, z);
    }
}