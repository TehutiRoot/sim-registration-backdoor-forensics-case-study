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
    public int f33447a;

    /* renamed from: b */
    public View f33448b;

    /* renamed from: c */
    public int f33449c;

    public Placeholder(Context context) {
        super(context);
        this.f33447a = -1;
        this.f33448b = null;
        this.f33449c = 4;
        m57998a(null);
    }

    /* renamed from: a */
    public final void m57998a(AttributeSet attributeSet) {
        super.setVisibility(this.f33449c);
        this.f33447a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.f33447a = obtainStyledAttributes.getResourceId(index, this.f33447a);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f33449c = obtainStyledAttributes.getInt(index, this.f33449c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f33448b;
    }

    public int getEmptyVisibility() {
        return this.f33449c;
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
            paint.getTextBounds(CallerData.f39637NA, 0, 1, rect);
            canvas.drawText(CallerData.f39637NA, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f33447a == i) {
            return;
        }
        View view = this.f33448b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f33448b.getLayoutParams()).f33350j = false;
            this.f33448b = null;
        }
        this.f33447a = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i) {
        this.f33449c = i;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.f33448b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f33448b.getLayoutParams();
        layoutParams2.f33362v.setVisibility(0);
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = layoutParams.f33362v.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (horizontalDimensionBehaviour != dimensionBehaviour) {
            layoutParams.f33362v.setWidth(layoutParams2.f33362v.getWidth());
        }
        if (layoutParams.f33362v.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            layoutParams.f33362v.setHeight(layoutParams2.f33362v.getHeight());
        }
        layoutParams2.f33362v.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.f33447a == -1 && !isInEditMode()) {
            setVisibility(this.f33449c);
        }
        View findViewById = constraintLayout.findViewById(this.f33447a);
        this.f33448b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f33350j = true;
            this.f33448b.setVisibility(0);
            setVisibility(0);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33447a = -1;
        this.f33448b = null;
        this.f33449c = 4;
        m57998a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33447a = -1;
        this.f33448b = null;
        this.f33449c = 4;
        m57998a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f33447a = -1;
        this.f33448b = null;
        this.f33449c = 4;
        m57998a(attributeSet);
    }
}