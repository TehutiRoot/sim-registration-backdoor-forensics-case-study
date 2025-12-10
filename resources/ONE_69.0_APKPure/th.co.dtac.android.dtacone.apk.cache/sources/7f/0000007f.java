package p000;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: AX1 */
/* loaded from: classes2.dex */
public final class AX1 {

    /* renamed from: a */
    public final State f122a;

    /* renamed from: b */
    public final AX1 f123b;

    /* renamed from: c */
    public final Object f124c;

    public AX1(State resolveResult, AX1 ax1) {
        Intrinsics.checkNotNullParameter(resolveResult, "resolveResult");
        this.f122a = resolveResult;
        this.f123b = ax1;
        this.f124c = resolveResult.getValue();
    }

    /* renamed from: a */
    public final Typeface m69269a() {
        Object obj = this.f124c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* renamed from: b */
    public final boolean m69268b() {
        AX1 ax1;
        if (this.f122a.getValue() == this.f124c && ((ax1 = this.f123b) == null || !ax1.m69268b())) {
            return false;
        }
        return true;
    }
}