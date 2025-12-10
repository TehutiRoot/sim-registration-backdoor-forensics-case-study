package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Size;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a%\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, m28850d2 = {"Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JJ)F", OperatorName.CURVE_TO, "d", PDPageLabelRange.STYLE_LETTERS_LOWER, "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.ContentScaleKt */
/* loaded from: classes2.dex */
public final class ContentScaleKt {
    /* renamed from: a */
    public static final float m59587a(long j, long j2) {
        return Size.m71568getHeightimpl(j2) / Size.m71568getHeightimpl(j);
    }

    /* renamed from: access$computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m72807access$computeFillHeightiLBOSCw(long j, long j2) {
        return m59587a(j, j2);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m72808access$computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return m59586b(j, j2);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m72809access$computeFillMinDimensioniLBOSCw(long j, long j2) {
        return m59585c(j, j2);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m72810access$computeFillWidthiLBOSCw(long j, long j2) {
        return m59584d(j, j2);
    }

    /* renamed from: b */
    public static final float m59586b(long j, long j2) {
        return Math.max(m59584d(j, j2), m59587a(j, j2));
    }

    /* renamed from: c */
    public static final float m59585c(long j, long j2) {
        return Math.min(m59584d(j, j2), m59587a(j, j2));
    }

    /* renamed from: d */
    public static final float m59584d(long j, long j2) {
        return Size.m71571getWidthimpl(j2) / Size.m71571getWidthimpl(j);
    }
}
