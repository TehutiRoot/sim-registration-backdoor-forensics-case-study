package kotlinx.coroutines;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006\"\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006\"\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m28850d2 = {"", "boxIncomplete", "(Ljava/lang/Object;)Ljava/lang/Object;", "unboxState", "Lkotlinx/coroutines/internal/Symbol;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_ALREADY", "COMPLETING_WAITING_CHILDREN", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "COMPLETING_RETRY", OperatorName.CURVE_TO, "TOO_LATE_TO_CANCEL", "d", "SEALED", "LnR;", "e", "LnR;", "EMPTY_NEW", OperatorName.FILL_NON_ZERO, "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class JobSupportKt {

    /* renamed from: a */
    public static final Symbol f70633a = new Symbol("COMPLETING_ALREADY");
    @JvmField
    @NotNull
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");

    /* renamed from: b */
    public static final Symbol f70634b = new Symbol("COMPLETING_RETRY");

    /* renamed from: c */
    public static final Symbol f70635c = new Symbol("TOO_LATE_TO_CANCEL");

    /* renamed from: d */
    public static final Symbol f70636d = new Symbol("SEALED");

    /* renamed from: e */
    public static final C12358nR f70637e = new C12358nR(false);

    /* renamed from: f */
    public static final C12358nR f70638f = new C12358nR(true);

    @Nullable
    public static final Object boxIncomplete(@Nullable Object obj) {
        if (obj instanceof Incomplete) {
            return new C18742Xd0((Incomplete) obj);
        }
        return obj;
    }

    @Nullable
    public static final Object unboxState(@Nullable Object obj) {
        C18742Xd0 c18742Xd0;
        Incomplete incomplete;
        if (obj instanceof C18742Xd0) {
            c18742Xd0 = (C18742Xd0) obj;
        } else {
            c18742Xd0 = null;
        }
        if (c18742Xd0 != null && (incomplete = c18742Xd0.f7535a) != null) {
            return incomplete;
        }
        return obj;
    }
}
