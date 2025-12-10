package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Immutable
@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m29142d2 = {"Landroidx/compose/material3/FabPlacement;", "", "", OneNadOutboundSearchFragment.POSITION_LEFT, "width", "height", "<init>", "(III)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLeft", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getWidth", OperatorName.CURVE_TO, "getHeight", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FabPlacement {

    /* renamed from: a */
    public final int f25880a;

    /* renamed from: b */
    public final int f25881b;

    /* renamed from: c */
    public final int f25882c;

    public FabPlacement(int i, int i2, int i3) {
        this.f25880a = i;
        this.f25881b = i2;
        this.f25882c = i3;
    }

    public final int getHeight() {
        return this.f25882c;
    }

    public final int getLeft() {
        return this.f25880a;
    }

    public final int getWidth() {
        return this.f25881b;
    }
}