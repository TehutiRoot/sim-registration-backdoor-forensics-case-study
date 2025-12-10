package androidx.compose.p003ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m29142d2 = {"Landroidx/compose/ui/tooling/data/ContextCache;", "", "<init>", "()V", "", "clear", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "getContexts$ui_tooling_data_release", "()Ljava/util/Map;", "contexts", "ui-tooling-data_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.data.ContextCache */
/* loaded from: classes2.dex */
public final class ContextCache {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Map f31796a = new LinkedHashMap();

    public final void clear() {
        this.f31796a.clear();
    }

    @NotNull
    public final Map<String, Object> getContexts$ui_tooling_data_release() {
        return this.f31796a;
    }
}