package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: xr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23033xr1 extends ConstraintLayout {

    /* renamed from: x */
    public final Runnable f108522x;

    /* renamed from: y */
    public int f108523y;

    /* renamed from: z */
    public MaterialShapeDrawable f108524z;

    public AbstractC23033xr1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ViewCompat.setBackground(this, m389j());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i, 0);
        this.f108523y = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f108522x = new Runnable() { // from class: wr1
            {
                AbstractC23033xr1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23033xr1.this.mo384o();
            }
        };
        obtainStyledAttributes.recycle();
    }

    /* renamed from: n */
    public static boolean m385n(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        m383p();
    }

    /* renamed from: i */
    public final void m390i(List list, ConstraintSet constraintSet, int i) {
        Iterator it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(((View) it.next()).getId(), R.id.circle_center, i, f);
            f += 360.0f / list.size();
        }
    }

    /* renamed from: j */
    public final Drawable m389j() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f108524z = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.f108524z.setFillColor(ColorStateList.valueOf(-1));
        return this.f108524z;
    }

    /* renamed from: k */
    public int m388k(int i) {
        if (i == 2) {
            return Math.round(this.f108523y * 0.66f);
        }
        return this.f108523y;
    }

    /* renamed from: l */
    public int m387l() {
        return this.f108523y;
    }

    /* renamed from: m */
    public void mo386m(int i) {
        this.f108523y = i;
        mo384o();
    }

    /* renamed from: o */
    public void mo384o() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !m385n(childAt)) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            m390i((List) entry.getValue(), constraintSet, m388k(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo384o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m383p();
    }

    /* renamed from: p */
    public final void m383p() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f108522x);
            handler.post(this.f108522x);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f108524z.setFillColor(ColorStateList.valueOf(i));
    }
}
