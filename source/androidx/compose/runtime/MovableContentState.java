package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "Landroidx/compose/runtime/SlotTable;", "slotTable", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MovableContentState {
    public static final int $stable = 8;

    /* renamed from: a */
    public final SlotTable f28351a;

    public MovableContentState(@NotNull SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        this.f28351a = slotTable;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.f28351a;
    }
}
