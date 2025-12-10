package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p003ui.geometry.Offset;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u0004HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m28850d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "Landroidx/compose/foundation/text/Handle;", "handle", "Landroidx/compose/ui/geometry/Offset;", "position", "<init>", "(Landroidx/compose/foundation/text/Handle;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/foundation/text/Handle;", "component2-F1C5BW0", "()J", "component2", "copy-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/Handle;", "getHandle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getPosition-F1C5BW0", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionHandleInfo {

    /* renamed from: a */
    public final Handle f14238a;

    /* renamed from: b */
    public final long f14239b;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j);
    }

    /* renamed from: copy-Uv8p0NA$default  reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m69847copyUv8p0NA$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            handle = selectionHandleInfo.f14238a;
        }
        if ((i & 2) != 0) {
            j = selectionHandleInfo.f14239b;
        }
        return selectionHandleInfo.m69849copyUv8p0NA(handle, j);
    }

    @NotNull
    public final Handle component1() {
        return this.f14238a;
    }

    /* renamed from: component2-F1C5BW0  reason: not valid java name */
    public final long m69848component2F1C5BW0() {
        return this.f14239b;
    }

    @NotNull
    /* renamed from: copy-Uv8p0NA  reason: not valid java name */
    public final SelectionHandleInfo m69849copyUv8p0NA(@NotNull Handle handle, long j) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        return new SelectionHandleInfo(handle, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectionHandleInfo) {
            SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
            return this.f14238a == selectionHandleInfo.f14238a && Offset.m71499equalsimpl0(this.f14239b, selectionHandleInfo.f14239b);
        }
        return false;
    }

    @NotNull
    public final Handle getHandle() {
        return this.f14238a;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m69850getPositionF1C5BW0() {
        return this.f14239b;
    }

    public int hashCode() {
        return (this.f14238a.hashCode() * 31) + Offset.m71504hashCodeimpl(this.f14239b);
    }

    @NotNull
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f14238a + ", position=" + ((Object) Offset.m71510toStringimpl(this.f14239b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SelectionHandleInfo(Handle handle, long j) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f14238a = handle;
        this.f14239b = j;
    }
}
