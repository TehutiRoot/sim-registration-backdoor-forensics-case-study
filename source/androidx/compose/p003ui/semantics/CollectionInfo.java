package androidx.compose.p003ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/semantics/CollectionInfo;", "", "", "rowCount", "columnCount", "<init>", "(II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getRowCount", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getColumnCount", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.CollectionInfo */
/* loaded from: classes2.dex */
public final class CollectionInfo {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f30858a;

    /* renamed from: b */
    public final int f30859b;

    public CollectionInfo(int i, int i2) {
        this.f30858a = i;
        this.f30859b = i2;
    }

    public final int getColumnCount() {
        return this.f30859b;
    }

    public final int getRowCount() {
        return this.f30858a;
    }
}
