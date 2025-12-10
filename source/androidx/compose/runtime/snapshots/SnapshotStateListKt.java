package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\n¨\u0006\f"}, m28850d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/lang/Void;", "", FirebaseAnalytics.Param.INDEX, "size", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(II)V", "", "Ljava/lang/Object;", "sync", "runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SnapshotStateListKt {

    /* renamed from: a */
    public static final Object f28755a = new Object();

    /* renamed from: a */
    public static final Void m59898a() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* renamed from: b */
    public static final void m59897b(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
