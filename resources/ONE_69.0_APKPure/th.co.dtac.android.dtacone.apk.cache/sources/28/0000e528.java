package kotlinx.coroutines.debug.internal;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m29142d2 = {"Lkotlinx/coroutines/debug/internal/AgentInstallationType;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "isInstalledStatically$kotlinx_coroutines_core", "()Z", "setInstalledStatically$kotlinx_coroutines_core", "(Z)V", "isInstalledStatically", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class AgentInstallationType {
    @NotNull
    public static final AgentInstallationType INSTANCE = new AgentInstallationType();

    /* renamed from: a */
    public static boolean f70739a;

    public final boolean isInstalledStatically$kotlinx_coroutines_core() {
        return f70739a;
    }

    public final void setInstalledStatically$kotlinx_coroutines_core(boolean z) {
        f70739a = z;
    }
}