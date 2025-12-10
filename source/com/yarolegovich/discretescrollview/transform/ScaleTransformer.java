package com.yarolegovich.discretescrollview.transform;

import android.view.View;
import androidx.annotation.FloatRange;
import com.yarolegovich.discretescrollview.transform.Pivot;

/* loaded from: classes5.dex */
public class ScaleTransformer implements DiscreteScrollItemTransformer {

    /* renamed from: a */
    public Pivot f60905a = Pivot.EnumC9999X.CENTER.create();

    /* renamed from: b */
    public Pivot f60906b = Pivot.EnumC10003Y.CENTER.create();

    /* renamed from: c */
    public float f60907c = 0.8f;

    /* renamed from: d */
    public float f60908d = 0.2f;

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a */
        public ScaleTransformer f60909a = new ScaleTransformer();

        /* renamed from: b */
        public float f60910b = 1.0f;

        /* renamed from: a */
        public final void m32004a(Pivot pivot, int i) {
            if (pivot.getAxis() == i) {
                return;
            }
            throw new IllegalArgumentException("You passed a Pivot for wrong axis.");
        }

        public ScaleTransformer build() {
            ScaleTransformer scaleTransformer = this.f60909a;
            scaleTransformer.f60908d = this.f60910b - scaleTransformer.f60907c;
            return this.f60909a;
        }

        public Builder setMaxScale(@FloatRange(from = 0.01d) float f) {
            this.f60910b = f;
            return this;
        }

        public Builder setMinScale(@FloatRange(from = 0.01d) float f) {
            this.f60909a.f60907c = f;
            return this;
        }

        public Builder setPivotX(Pivot.EnumC9999X enumC9999X) {
            return setPivotX(enumC9999X.create());
        }

        public Builder setPivotY(Pivot.EnumC10003Y enumC10003Y) {
            return setPivotY(enumC10003Y.create());
        }

        public Builder setPivotX(Pivot pivot) {
            m32004a(pivot, 0);
            this.f60909a.f60905a = pivot;
            return this;
        }

        public Builder setPivotY(Pivot pivot) {
            m32004a(pivot, 1);
            this.f60909a.f60906b = pivot;
            return this;
        }
    }

    @Override // com.yarolegovich.discretescrollview.transform.DiscreteScrollItemTransformer
    public void transformItem(View view, float f) {
        this.f60905a.setOn(view);
        this.f60906b.setOn(view);
        float abs = this.f60907c + (this.f60908d * (1.0f - Math.abs(f)));
        view.setScaleX(abs);
        view.setScaleY(abs);
    }
}
