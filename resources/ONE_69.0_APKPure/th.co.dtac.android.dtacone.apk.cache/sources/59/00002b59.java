package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Immutable
@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m29142d2 = {"Landroidx/compose/material/FabPlacement;", "", "", "isDocked", "", OneNadOutboundSearchFragment.POSITION_LEFT, "width", "height", "<init>", "(ZIII)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getLeft", "()I", OperatorName.CURVE_TO, "getWidth", "d", "getHeight", "material_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FabPlacement {

    /* renamed from: a */
    public final boolean f14570a;

    /* renamed from: b */
    public final int f14571b;

    /* renamed from: c */
    public final int f14572c;

    /* renamed from: d */
    public final int f14573d;

    public FabPlacement(boolean z, int i, int i2, int i3) {
        this.f14570a = z;
        this.f14571b = i;
        this.f14572c = i2;
        this.f14573d = i3;
    }

    public final int getHeight() {
        return this.f14573d;
    }

    public final int getLeft() {
        return this.f14571b;
    }

    public final int getWidth() {
        return this.f14572c;
    }

    public final boolean isDocked() {
        return this.f14570a;
    }
}