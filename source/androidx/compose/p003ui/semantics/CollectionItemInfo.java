package androidx.compose.p003ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/semantics/CollectionItemInfo;", "", "", "rowIndex", "rowSpan", "columnIndex", "columnSpan", "<init>", "(IIII)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getRowIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getRowSpan", OperatorName.CURVE_TO, "getColumnIndex", "d", "getColumnSpan", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.CollectionItemInfo */
/* loaded from: classes2.dex */
public final class CollectionItemInfo {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f30860a;

    /* renamed from: b */
    public final int f30861b;

    /* renamed from: c */
    public final int f30862c;

    /* renamed from: d */
    public final int f30863d;

    public CollectionItemInfo(int i, int i2, int i3, int i4) {
        this.f30860a = i;
        this.f30861b = i2;
        this.f30862c = i3;
        this.f30863d = i4;
    }

    public final int getColumnIndex() {
        return this.f30862c;
    }

    public final int getColumnSpan() {
        return this.f30863d;
    }

    public final int getRowIndex() {
        return this.f30860a;
    }

    public final int getRowSpan() {
        return this.f30861b;
    }
}
