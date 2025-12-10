package kotlinx.coroutines.debug.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, m28850d2 = {"", "LWn0;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;)LWn0;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/Void;", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlinx/coroutines/internal/Symbol;", "REHASH", "LWn0;", "MARKED_NULL", OperatorName.CURVE_TO, "MARKED_TRUE", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ConcurrentWeakMapKt {

    /* renamed from: a */
    public static final Symbol f70725a = new Symbol("REHASH");

    /* renamed from: b */
    public static final C18707Wn0 f70726b = new C18707Wn0(null);

    /* renamed from: c */
    public static final C18707Wn0 f70727c = new C18707Wn0(Boolean.TRUE);

    /* renamed from: a */
    public static final C18707Wn0 m27105a(Object obj) {
        if (obj == null) {
            return f70726b;
        }
        if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
            return f70727c;
        }
        return new C18707Wn0(obj);
    }

    /* renamed from: b */
    public static final Void m27104b() {
        throw new UnsupportedOperationException("not implemented");
    }
}
