package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "", "hasSelection", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;J)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSelectionRegistrar", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSelectionRegistrar", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f14281a = CompositionLocalKt.compositionLocalOf$default(null, SelectionRegistrarKt$LocalSelectionRegistrar$1.INSTANCE, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return f14281a;
    }

    public static final boolean hasSelection(@Nullable SelectionRegistrar selectionRegistrar, long j) {
        Map<Long, Selection> subselections;
        if (selectionRegistrar != null && (subselections = selectionRegistrar.getSubselections()) != null) {
            return subselections.containsKey(Long.valueOf(j));
        }
        return false;
    }
}
