package androidx.compose.p003ui.node;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m29142d2 = {"", "distance", "", "isInLayer", "LtJ;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FZ)J", "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.HitTestResultKt */
/* loaded from: classes2.dex */
public final class HitTestResultKt {
    /* renamed from: a */
    public static final long m59445a(float f, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return AbstractC13974tJ.m22707b((j & BodyPartID.bodyIdMax) | (floatToIntBits << 32));
    }
}