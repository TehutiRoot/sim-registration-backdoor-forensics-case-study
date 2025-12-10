package p000;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: DW1 */
/* loaded from: classes2.dex */
public final class DW1 {

    /* renamed from: a */
    public final State f1014a;

    /* renamed from: b */
    public final DW1 f1015b;

    /* renamed from: c */
    public final Object f1016c;

    public DW1(State resolveResult, DW1 dw1) {
        Intrinsics.checkNotNullParameter(resolveResult, "resolveResult");
        this.f1014a = resolveResult;
        this.f1015b = dw1;
        this.f1016c = resolveResult.getValue();
    }

    /* renamed from: a */
    public final Typeface m68655a() {
        Object obj = this.f1016c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* renamed from: b */
    public final boolean m68654b() {
        DW1 dw1;
        if (this.f1014a.getValue() == this.f1016c && ((dw1 = this.f1015b) == null || !dw1.m68654b())) {
            return false;
        }
        return true;
    }
}
