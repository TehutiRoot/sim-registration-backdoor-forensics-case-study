package p000;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: Xs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18782Xs1 implements TypeEvaluator {

    /* renamed from: a */
    public Rect f7604a;

    public C18782Xs1() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
        Rect rect3 = this.f7604a;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f7604a;
    }

    public C18782Xs1(Rect rect) {
        this.f7604a = rect;
    }
}
