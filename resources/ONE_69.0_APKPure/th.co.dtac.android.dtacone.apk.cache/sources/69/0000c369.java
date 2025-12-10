package com.yarolegovich.discretescrollview.transform;

import android.view.View;
import androidx.annotation.FloatRange;
import com.yarolegovich.discretescrollview.transform.Pivot;

/* loaded from: classes5.dex */
public class ScaleTransformer implements DiscreteScrollItemTransformer {

    /* renamed from: a */
    public Pivot f60917a = Pivot.EnumC9988X.CENTER.create();

    /* renamed from: b */
    public Pivot f60918b = Pivot.EnumC9992Y.CENTER.create();

    /* renamed from: c */
    public float f60919c = 0.8f;

    /* renamed from: d */
    public float f60920d = 0.2f;

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a */
        public ScaleTransformer f60921a = new ScaleTransformer();

        /* renamed from: b */
        public float f60922b = 1.0f;

        /* renamed from: a */
        public final void m31996a(Pivot pivot, int i) {
            if (pivot.getAxis() == i) {
                return;
            }
            throw new IllegalArgumentException("You passed a Pivot for wrong axis.");
        }

        public ScaleTransformer build() {
            ScaleTransformer scaleTransformer = this.f60921a;
            scaleTransformer.f60920d = this.f60922b - scaleTransformer.f60919c;
            return this.f60921a;
        }

        public Builder setMaxScale(@FloatRange(from = 0.01d) float f) {
            this.f60922b = f;
            return this;
        }

        public Builder setMinScale(@FloatRange(from = 0.01d) float f) {
            this.f60921a.f60919c = f;
            return this;
        }

        public Builder setPivotX(Pivot.EnumC9988X enumC9988X) {
            return setPivotX(enumC9988X.create());
        }

        public Builder setPivotY(Pivot.EnumC9992Y enumC9992Y) {
            return setPivotY(enumC9992Y.create());
        }

        public Builder setPivotX(Pivot pivot) {
            m31996a(pivot, 0);
            this.f60921a.f60917a = pivot;
            return this;
        }

        public Builder setPivotY(Pivot pivot) {
            m31996a(pivot, 1);
            this.f60921a.f60918b = pivot;
            return this;
        }
    }

    @Override // com.yarolegovich.discretescrollview.transform.DiscreteScrollItemTransformer
    public void transformItem(View view, float f) {
        this.f60917a.setOn(view);
        this.f60918b.setOn(view);
        float abs = this.f60919c + (this.f60920d * (1.0f - Math.abs(f)));
        view.setScaleX(abs);
        view.setScaleY(abs);
    }
}