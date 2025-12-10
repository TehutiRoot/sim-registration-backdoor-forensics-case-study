package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.classic.spi.CallerData;

/* loaded from: classes2.dex */
public class Placeholder extends View {

    /* renamed from: a */
    public int f33359a;

    /* renamed from: b */
    public View f33360b;

    /* renamed from: c */
    public int f33361c;

    public Placeholder(Context context) {
        super(context);
        this.f33359a = -1;
        this.f33360b = null;
        this.f33361c = 4;
        m58048a(null);
    }

    /* renamed from: a */
    public final void m58048a(AttributeSet attributeSet) {
        super.setVisibility(this.f33361c);
        this.f33359a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.f33359a = obtainStyledAttributes.getResourceId(index, this.f33359a);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f33361c = obtainStyledAttributes.getInt(index, this.f33361c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f33360b;
    }

    public int getEmptyVisibility() {
        return this.f33361c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.f39639NA, 0, 1, rect);
            canvas.drawText(CallerData.f39639NA, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f33359a == i) {
            return;
        }
        View view = this.f33360b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f33360b.getLayoutParams()).f33262j = false;
            this.f33360b = null;
        }
        this.f33359a = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i) {
        this.f33361c = i;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.f33360b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f33360b.getLayoutParams();
        layoutParams2.f33274v.setVisibility(0);
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = layoutParams.f33274v.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (horizontalDimensionBehaviour != dimensionBehaviour) {
            layoutParams.f33274v.setWidth(layoutParams2.f33274v.getWidth());
        }
        if (layoutParams.f33274v.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            layoutParams.f33274v.setHeight(layoutParams2.f33274v.getHeight());
        }
        layoutParams2.f33274v.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.f33359a == -1 && !isInEditMode()) {
            setVisibility(this.f33361c);
        }
        View findViewById = constraintLayout.findViewById(this.f33359a);
        this.f33360b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f33262j = true;
            this.f33360b.setVisibility(0);
            setVisibility(0);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33359a = -1;
        this.f33360b = null;
        this.f33361c = 4;
        m58048a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33359a = -1;
        this.f33360b = null;
        this.f33361c = 4;
        m58048a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f33359a = -1;
        this.f33360b = null;
        this.f33361c = 4;
        m58048a(attributeSet);
    }
}
