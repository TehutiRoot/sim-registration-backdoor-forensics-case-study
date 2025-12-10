package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fR\"\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28850d2 = {"Landroidx/compose/runtime/Anchor;", "", "", "loc", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "slots", "toIndexFor", "(Landroidx/compose/runtime/SlotTable;)I", "Landroidx/compose/runtime/SlotWriter;", "writer", "(Landroidx/compose/runtime/SlotWriter;)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLocation$runtime_release", "()I", "setLocation$runtime_release", FirebaseAnalytics.Param.LOCATION, "", "getValid", "()Z", "valid", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Anchor {

    /* renamed from: a */
    public int f28190a;

    public Anchor(int i) {
        this.f28190a = i;
    }

    public final int getLocation$runtime_release() {
        return this.f28190a;
    }

    public final boolean getValid() {
        if (this.f28190a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void setLocation$runtime_release(int i) {
        this.f28190a = i;
    }

    public final int toIndexFor(@NotNull SlotTable slots) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        return slots.anchorIndex(this);
    }

    public final int toIndexFor(@NotNull SlotWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        return writer.anchorIndex(this);
    }
}
