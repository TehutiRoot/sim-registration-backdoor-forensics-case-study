package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class MockView extends View {

    /* renamed from: a */
    public Paint f33144a;

    /* renamed from: b */
    public Paint f33145b;

    /* renamed from: c */
    public Paint f33146c;

    /* renamed from: d */
    public boolean f33147d;

    /* renamed from: e */
    public boolean f33148e;

    /* renamed from: f */
    public Rect f33149f;

    /* renamed from: g */
    public int f33150g;

    /* renamed from: h */
    public int f33151h;

    /* renamed from: i */
    public int f33152i;

    /* renamed from: j */
    public int f33153j;
    protected String mText;

    public MockView(Context context) {
        super(context);
        this.f33144a = new Paint();
        this.f33145b = new Paint();
        this.f33146c = new Paint();
        this.f33147d = true;
        this.f33148e = true;
        this.mText = null;
        this.f33149f = new Rect();
        this.f33150g = Color.argb(255, 0, 0, 0);
        this.f33151h = Color.argb(255, 200, 200, 200);
        this.f33152i = Color.argb(255, 50, 50, 50);
        this.f33153j = 4;
        m58164a(context, null);
    }

    /* renamed from: a */
    private void m58164a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MockView_mock_label) {
                    this.mText = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MockView_mock_showDiagonals) {
                    this.f33147d = obtainStyledAttributes.getBoolean(index, this.f33147d);
                } else if (index == R.styleable.MockView_mock_diagonalsColor) {
                    this.f33150g = obtainStyledAttributes.getColor(index, this.f33150g);
                } else if (index == R.styleable.MockView_mock_labelBackgroundColor) {
                    this.f33152i = obtainStyledAttributes.getColor(index, this.f33152i);
                } else if (index == R.styleable.MockView_mock_labelColor) {
                    this.f33151h = obtainStyledAttributes.getColor(index, this.f33151h);
                } else if (index == R.styleable.MockView_mock_showLabel) {
                    this.f33148e = obtainStyledAttributes.getBoolean(index, this.f33148e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mText == null) {
            try {
                this.mText = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f33144a.setColor(this.f33150g);
        this.f33144a.setAntiAlias(true);
        this.f33145b.setColor(this.f33151h);
        this.f33145b.setAntiAlias(true);
        this.f33146c.setColor(this.f33152i);
        this.f33153j = Math.round(this.f33153j * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f33147d) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f33144a);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f33144a);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f33144a);
            canvas.drawLine(f, 0.0f, f, f2, this.f33144a);
            canvas.drawLine(f, f2, 0.0f, f2, this.f33144a);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f33144a);
        }
        String str = this.mText;
        if (str != null && this.f33148e) {
            this.f33145b.getTextBounds(str, 0, str.length(), this.f33149f);
            float width2 = (width - this.f33149f.width()) / 2.0f;
            float height2 = ((height - this.f33149f.height()) / 2.0f) + this.f33149f.height();
            this.f33149f.offset((int) width2, (int) height2);
            Rect rect = this.f33149f;
            int i = rect.left;
            int i2 = this.f33153j;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f33149f, this.f33146c);
            canvas.drawText(this.mText, width2, height2, this.f33145b);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33144a = new Paint();
        this.f33145b = new Paint();
        this.f33146c = new Paint();
        this.f33147d = true;
        this.f33148e = true;
        this.mText = null;
        this.f33149f = new Rect();
        this.f33150g = Color.argb(255, 0, 0, 0);
        this.f33151h = Color.argb(255, 200, 200, 200);
        this.f33152i = Color.argb(255, 50, 50, 50);
        this.f33153j = 4;
        m58164a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33144a = new Paint();
        this.f33145b = new Paint();
        this.f33146c = new Paint();
        this.f33147d = true;
        this.f33148e = true;
        this.mText = null;
        this.f33149f = new Rect();
        this.f33150g = Color.argb(255, 0, 0, 0);
        this.f33151h = Color.argb(255, 200, 200, 200);
        this.f33152i = Color.argb(255, 50, 50, 50);
        this.f33153j = 4;
        m58164a(context, attributeSet);
    }
}
