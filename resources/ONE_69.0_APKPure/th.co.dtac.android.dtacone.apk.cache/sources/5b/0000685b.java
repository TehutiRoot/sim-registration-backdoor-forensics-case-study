package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.view.GravityCompat;

/* loaded from: classes2.dex */
public class MotionLabel extends View implements FloatLayout {

    /* renamed from: A */
    public float f33249A;

    /* renamed from: B */
    public float f33250B;

    /* renamed from: C */
    public float f33251C;

    /* renamed from: D */
    public Drawable f33252D;

    /* renamed from: E */
    public Matrix f33253E;

    /* renamed from: F */
    public Bitmap f33254F;

    /* renamed from: G */
    public BitmapShader f33255G;

    /* renamed from: H */
    public Matrix f33256H;

    /* renamed from: I */
    public float f33257I;

    /* renamed from: J */
    public float f33258J;

    /* renamed from: K */
    public float f33259K;

    /* renamed from: L */
    public float f33260L;

    /* renamed from: M */
    public Paint f33261M;

    /* renamed from: N */
    public int f33262N;

    /* renamed from: O */
    public Rect f33263O;

    /* renamed from: P */
    public Paint f33264P;

    /* renamed from: Q */
    public float f33265Q;

    /* renamed from: R */
    public float f33266R;

    /* renamed from: S */
    public float f33267S;

    /* renamed from: T */
    public float f33268T;

    /* renamed from: U */
    public float f33269U;

    /* renamed from: a */
    public TextPaint f33270a;

    /* renamed from: b */
    public Path f33271b;

    /* renamed from: c */
    public int f33272c;

    /* renamed from: d */
    public int f33273d;

    /* renamed from: e */
    public boolean f33274e;

    /* renamed from: f */
    public float f33275f;

    /* renamed from: g */
    public float f33276g;

    /* renamed from: h */
    public ViewOutlineProvider f33277h;

    /* renamed from: i */
    public RectF f33278i;

    /* renamed from: j */
    public float f33279j;

    /* renamed from: k */
    public float f33280k;

    /* renamed from: l */
    public int f33281l;

    /* renamed from: m */
    public int f33282m;

    /* renamed from: n */
    public float f33283n;

    /* renamed from: o */
    public String f33284o;

    /* renamed from: p */
    public boolean f33285p;

    /* renamed from: q */
    public Rect f33286q;

    /* renamed from: r */
    public int f33287r;

    /* renamed from: s */
    public int f33288s;

    /* renamed from: t */
    public int f33289t;

    /* renamed from: u */
    public int f33290u;

    /* renamed from: v */
    public String f33291v;

    /* renamed from: w */
    public Layout f33292w;

    /* renamed from: x */
    public int f33293x;

    /* renamed from: y */
    public int f33294y;

    /* renamed from: z */
    public boolean f33295z;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    /* loaded from: classes2.dex */
    public class C3756a extends ViewOutlineProvider {
        public C3756a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f33275f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    /* loaded from: classes2.dex */
    public class C3757b extends ViewOutlineProvider {
        public C3757b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f33276g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f33270a = new TextPaint();
        this.f33271b = new Path();
        this.f33272c = 65535;
        this.f33273d = 65535;
        this.f33274e = false;
        this.f33275f = 0.0f;
        this.f33276g = Float.NaN;
        this.f33279j = 48.0f;
        this.f33280k = Float.NaN;
        this.f33283n = 0.0f;
        this.f33284o = "Hello World";
        this.f33285p = true;
        this.f33286q = new Rect();
        this.f33287r = 1;
        this.f33288s = 1;
        this.f33289t = 1;
        this.f33290u = 1;
        this.f33293x = 8388659;
        this.f33294y = 0;
        this.f33295z = false;
        this.f33257I = Float.NaN;
        this.f33258J = Float.NaN;
        this.f33259K = 0.0f;
        this.f33260L = 0.0f;
        this.f33261M = new Paint();
        this.f33262N = 0;
        this.f33266R = Float.NaN;
        this.f33267S = Float.NaN;
        this.f33268T = Float.NaN;
        this.f33269U = Float.NaN;
        m58105f(context, null);
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f33280k)) {
            f = 1.0f;
        } else {
            f = this.f33279j / this.f33280k;
        }
        TextPaint textPaint = this.f33270a;
        String str = this.f33284o;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f33250B)) {
            f2 = getMeasuredWidth();
        } else {
            f2 = this.f33250B;
        }
        return ((((f2 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.f33259K + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f33280k)) {
            f = 1.0f;
        } else {
            f = this.f33279j / this.f33280k;
        }
        Paint.FontMetrics fontMetrics = this.f33270a.getFontMetrics();
        if (Float.isNaN(this.f33251C)) {
            f2 = getMeasuredHeight();
        } else {
            f2 = this.f33251C;
        }
        float paddingTop = (f2 - getPaddingTop()) - getPaddingBottom();
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.f33260L)) / 2.0f) - (f * f4);
    }

    /* renamed from: c */
    public final void m58108c(float f, float f2, float f3, float f4) {
        if (this.f33256H == null) {
            return;
        }
        this.f33250B = f3 - f;
        this.f33251C = f4 - f2;
        m58100k();
    }

    /* renamed from: d */
    public Bitmap m58107d(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* renamed from: e */
    public void m58106e(float f) {
        if (!this.f33274e && f == 1.0f) {
            return;
        }
        this.f33271b.reset();
        String str = this.f33284o;
        int length = str.length();
        this.f33270a.getTextBounds(str, 0, length, this.f33286q);
        this.f33270a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f33271b);
        if (f != 1.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(Debug.getLoc());
            sb.append(" scale ");
            sb.append(f);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            this.f33271b.transform(matrix);
        }
        Rect rect = this.f33286q;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.f33285p = false;
    }

    /* renamed from: f */
    public final void m58105f(Context context, AttributeSet attributeSet) {
        m58103h(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == R.styleable.MotionLabel_android_fontFamily) {
                    this.f33291v = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MotionLabel_scaleFromTextSize) {
                    this.f33280k = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f33280k);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.f33279j = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f33279j);
                } else if (index == R.styleable.MotionLabel_android_textStyle) {
                    this.f33281l = obtainStyledAttributes.getInt(index, this.f33281l);
                } else if (index == R.styleable.MotionLabel_android_typeface) {
                    this.f33282m = obtainStyledAttributes.getInt(index, this.f33282m);
                } else if (index == R.styleable.MotionLabel_android_textColor) {
                    this.f33272c = obtainStyledAttributes.getColor(index, this.f33272c);
                } else if (index == R.styleable.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f33276g);
                    this.f33276g = dimension;
                    setRound(dimension);
                } else if (index == R.styleable.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f33275f);
                    this.f33275f = f;
                    setRoundPercent(f);
                } else if (index == R.styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.f33294y = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.MotionLabel_textOutlineColor) {
                    this.f33273d = obtainStyledAttributes.getInt(index, this.f33273d);
                    this.f33274e = true;
                } else if (index == R.styleable.MotionLabel_textOutlineThickness) {
                    this.f33283n = obtainStyledAttributes.getDimension(index, this.f33283n);
                    this.f33274e = true;
                } else if (index == R.styleable.MotionLabel_textBackground) {
                    this.f33252D = obtainStyledAttributes.getDrawable(index);
                    this.f33274e = true;
                } else if (index == R.styleable.MotionLabel_textBackgroundPanX) {
                    this.f33266R = obtainStyledAttributes.getFloat(index, this.f33266R);
                } else if (index == R.styleable.MotionLabel_textBackgroundPanY) {
                    this.f33267S = obtainStyledAttributes.getFloat(index, this.f33267S);
                } else if (index == R.styleable.MotionLabel_textPanX) {
                    this.f33259K = obtainStyledAttributes.getFloat(index, this.f33259K);
                } else if (index == R.styleable.MotionLabel_textPanY) {
                    this.f33260L = obtainStyledAttributes.getFloat(index, this.f33260L);
                } else if (index == R.styleable.MotionLabel_textBackgroundRotate) {
                    this.f33269U = obtainStyledAttributes.getFloat(index, this.f33269U);
                } else if (index == R.styleable.MotionLabel_textBackgroundZoom) {
                    this.f33268T = obtainStyledAttributes.getFloat(index, this.f33268T);
                } else if (index == R.styleable.MotionLabel_textureHeight) {
                    this.f33257I = obtainStyledAttributes.getDimension(index, this.f33257I);
                } else if (index == R.styleable.MotionLabel_textureWidth) {
                    this.f33258J = obtainStyledAttributes.getDimension(index, this.f33258J);
                } else if (index == R.styleable.MotionLabel_textureEffect) {
                    this.f33262N = obtainStyledAttributes.getInt(index, this.f33262N);
                }
            }
            obtainStyledAttributes.recycle();
        }
        m58101j();
        m58102i();
    }

    /* renamed from: g */
    public final void m58104g(String str, int i, int i2) {
        Typeface typeface;
        Typeface create;
        int i3;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i2);
            } else {
                create = Typeface.create(typeface, i2);
            }
            setTypeface(create);
            if (create != null) {
                i3 = create.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (~i3) & i2;
            TextPaint textPaint = this.f33270a;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f33270a;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f33270a.setFakeBoldText(false);
        this.f33270a.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public float getRound() {
        return this.f33276g;
    }

    public float getRoundPercent() {
        return this.f33275f;
    }

    public float getScaleFromTextSize() {
        return this.f33280k;
    }

    public float getTextBackgroundPanX() {
        return this.f33266R;
    }

    public float getTextBackgroundPanY() {
        return this.f33267S;
    }

    public float getTextBackgroundRotate() {
        return this.f33269U;
    }

    public float getTextBackgroundZoom() {
        return this.f33268T;
    }

    public int getTextOutlineColor() {
        return this.f33273d;
    }

    public float getTextPanX() {
        return this.f33259K;
    }

    public float getTextPanY() {
        return this.f33260L;
    }

    public float getTextureHeight() {
        return this.f33257I;
    }

    public float getTextureWidth() {
        return this.f33258J;
    }

    public Typeface getTypeface() {
        return this.f33270a.getTypeface();
    }

    /* renamed from: h */
    public final void m58103h(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f33270a;
        int i = typedValue.data;
        this.f33272c = i;
        textPaint.setColor(i);
    }

    /* renamed from: i */
    public void m58102i() {
        this.f33287r = getPaddingLeft();
        this.f33288s = getPaddingRight();
        this.f33289t = getPaddingTop();
        this.f33290u = getPaddingBottom();
        m58104g(this.f33291v, this.f33282m, this.f33281l);
        this.f33270a.setColor(this.f33272c);
        this.f33270a.setStrokeWidth(this.f33283n);
        this.f33270a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33270a.setFlags(128);
        setTextSize(this.f33279j);
        this.f33270a.setAntiAlias(true);
    }

    /* renamed from: j */
    public final void m58101j() {
        if (this.f33252D != null) {
            this.f33256H = new Matrix();
            int intrinsicWidth = this.f33252D.getIntrinsicWidth();
            int intrinsicHeight = this.f33252D.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f33258J)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f33258J;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f33257I)) {
                    i = (int) this.f33257I;
                }
                intrinsicHeight = i;
            }
            if (this.f33262N != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f33254F = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f33254F);
            this.f33252D.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f33252D.setFilterBitmap(true);
            this.f33252D.draw(canvas);
            if (this.f33262N != 0) {
                this.f33254F = m58107d(this.f33254F, 4);
            }
            Bitmap bitmap = this.f33254F;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f33255G = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: k */
    public final void m58100k() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (Float.isNaN(this.f33266R)) {
            f = 0.0f;
        } else {
            f = this.f33266R;
        }
        if (Float.isNaN(this.f33267S)) {
            f2 = 0.0f;
        } else {
            f2 = this.f33267S;
        }
        if (Float.isNaN(this.f33268T)) {
            f3 = 1.0f;
        } else {
            f3 = this.f33268T;
        }
        if (!Float.isNaN(this.f33269U)) {
            f7 = this.f33269U;
        }
        this.f33256H.reset();
        float width = this.f33254F.getWidth();
        float height = this.f33254F.getHeight();
        if (Float.isNaN(this.f33258J)) {
            f4 = this.f33250B;
        } else {
            f4 = this.f33258J;
        }
        if (Float.isNaN(this.f33257I)) {
            f5 = this.f33251C;
        } else {
            f5 = this.f33257I;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.f33256H.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.f33257I)) {
            f12 = this.f33257I / 2.0f;
        }
        if (!Float.isNaN(this.f33258J)) {
            f10 = this.f33258J / 2.0f;
        }
        this.f33256H.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.f33256H.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.f33255G.setLocalMatrix(this.f33256H);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f33280k);
        float f = isNaN ? 1.0f : this.f33279j / this.f33280k;
        this.f33250B = i3 - i;
        this.f33251C = i4 - i2;
        if (this.f33295z) {
            if (this.f33263O == null) {
                this.f33264P = new Paint();
                this.f33263O = new Rect();
                this.f33264P.set(this.f33270a);
                this.f33265Q = this.f33264P.getTextSize();
            }
            Paint paint = this.f33264P;
            String str = this.f33284o;
            paint.getTextBounds(str, 0, str.length(), this.f33263O);
            int width = this.f33263O.width();
            int height = (int) (this.f33263O.height() * 1.3f);
            float f2 = (this.f33250B - this.f33288s) - this.f33287r;
            float f3 = (this.f33251C - this.f33290u) - this.f33289t;
            if (isNaN) {
                float f4 = width;
                float f5 = height;
                if (f4 * f3 > f5 * f2) {
                    this.f33270a.setTextSize((this.f33265Q * f2) / f4);
                } else {
                    this.f33270a.setTextSize((this.f33265Q * f3) / f5);
                }
            } else {
                float f6 = width;
                float f7 = height;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f33274e || !isNaN) {
            m58108c(i, i2, i3, i4);
            m58106e(f);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.f33280k)) {
            f = 1.0f;
        } else {
            f = this.f33279j / this.f33280k;
        }
        super.onDraw(canvas);
        if (!this.f33274e && f == 1.0f) {
            float horizontalOffset = this.f33287r + getHorizontalOffset();
            canvas.drawText(this.f33284o, this.f33249A + horizontalOffset, this.f33289t + getVerticalOffset(), this.f33270a);
            return;
        }
        if (this.f33285p) {
            m58106e(f);
        }
        if (this.f33253E == null) {
            this.f33253E = new Matrix();
        }
        if (this.f33274e) {
            this.f33261M.set(this.f33270a);
            this.f33253E.reset();
            float horizontalOffset2 = this.f33287r + getHorizontalOffset();
            float verticalOffset = this.f33289t + getVerticalOffset();
            this.f33253E.postTranslate(horizontalOffset2, verticalOffset);
            this.f33253E.preScale(f, f);
            this.f33271b.transform(this.f33253E);
            if (this.f33255G != null) {
                this.f33270a.setFilterBitmap(true);
                this.f33270a.setShader(this.f33255G);
            } else {
                this.f33270a.setColor(this.f33272c);
            }
            this.f33270a.setStyle(Paint.Style.FILL);
            this.f33270a.setStrokeWidth(this.f33283n);
            canvas.drawPath(this.f33271b, this.f33270a);
            if (this.f33255G != null) {
                this.f33270a.setShader(null);
            }
            this.f33270a.setColor(this.f33273d);
            this.f33270a.setStyle(Paint.Style.STROKE);
            this.f33270a.setStrokeWidth(this.f33283n);
            canvas.drawPath(this.f33271b, this.f33270a);
            this.f33253E.reset();
            this.f33253E.postTranslate(-horizontalOffset2, -verticalOffset);
            this.f33271b.transform(this.f33253E);
            this.f33270a.set(this.f33261M);
            return;
        }
        float horizontalOffset3 = this.f33287r + getHorizontalOffset();
        float verticalOffset2 = this.f33289t + getVerticalOffset();
        this.f33253E.reset();
        this.f33253E.preTranslate(horizontalOffset3, verticalOffset2);
        this.f33271b.transform(this.f33253E);
        this.f33270a.setColor(this.f33272c);
        this.f33270a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33270a.setStrokeWidth(this.f33283n);
        canvas.drawPath(this.f33271b, this.f33270a);
        this.f33253E.reset();
        this.f33253E.preTranslate(-horizontalOffset3, -verticalOffset2);
        this.f33271b.transform(this.f33253E);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f33295z = false;
        this.f33287r = getPaddingLeft();
        this.f33288s = getPaddingRight();
        this.f33289t = getPaddingTop();
        this.f33290u = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f33294y != 0) {
                this.f33295z = true;
            }
        } else {
            TextPaint textPaint = this.f33270a;
            String str = this.f33284o;
            textPaint.getTextBounds(str, 0, str.length(), this.f33286q);
            if (mode != 1073741824) {
                size = (int) (this.f33286q.width() + 0.99999f);
            }
            size += this.f33287r + this.f33288s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f33270a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f33289t + this.f33290u + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i |= GravityCompat.START;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f33293x) {
            invalidate();
        }
        this.f33293x = i;
        int i2 = i & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f33260L = 0.0f;
            } else {
                this.f33260L = 1.0f;
            }
        } else {
            this.f33260L = -1.0f;
        }
        int i3 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f33259K = 0.0f;
                        return;
                    }
                }
            }
            this.f33259K = 1.0f;
            return;
        }
        this.f33259K = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33276g = f;
            float f2 = this.f33275f;
            this.f33275f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33276g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33276g = f;
        if (f != 0.0f) {
            if (this.f33271b == null) {
                this.f33271b = new Path();
            }
            if (this.f33278i == null) {
                this.f33278i = new RectF();
            }
            if (this.f33277h == null) {
                C3757b c3757b = new C3757b();
                this.f33277h = c3757b;
                setOutlineProvider(c3757b);
            }
            setClipToOutline(true);
            this.f33278i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33271b.reset();
            Path path = this.f33271b;
            RectF rectF = this.f33278i;
            float f3 = this.f33276g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z;
        if (this.f33275f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33275f = f;
        if (f != 0.0f) {
            if (this.f33271b == null) {
                this.f33271b = new Path();
            }
            if (this.f33278i == null) {
                this.f33278i = new RectF();
            }
            if (this.f33277h == null) {
                C3756a c3756a = new C3756a();
                this.f33277h = c3756a;
                setOutlineProvider(c3756a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33275f) / 2.0f;
            this.f33278i.set(0.0f, 0.0f, width, height);
            this.f33271b.reset();
            this.f33271b.addRoundRect(this.f33278i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f33280k = f;
    }

    public void setText(CharSequence charSequence) {
        this.f33284o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f33266R = f;
        m58100k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f33267S = f;
        m58100k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f33269U = f;
        m58100k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f33268T = f;
        m58100k();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f33272c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f33273d = i;
        this.f33274e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f33283n = f;
        this.f33274e = true;
        if (Float.isNaN(f)) {
            this.f33283n = 1.0f;
            this.f33274e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f33259K = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f33260L = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.f33279j = f;
        StringBuilder sb = new StringBuilder();
        sb.append(Debug.getLoc());
        sb.append("  ");
        sb.append(f);
        sb.append(" / ");
        sb.append(this.f33280k);
        TextPaint textPaint = this.f33270a;
        if (!Float.isNaN(this.f33280k)) {
            f = this.f33280k;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.f33280k)) {
            f2 = 1.0f;
        } else {
            f2 = this.f33279j / this.f33280k;
        }
        m58106e(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f33257I = f;
        m58100k();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f33258J = f;
        m58100k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f33270a.getTypeface() != typeface) {
            this.f33270a.setTypeface(typeface);
            if (this.f33292w != null) {
                this.f33292w = null;
                requestLayout();
                invalidate();
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f33249A = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f33250B = f5;
        float f6 = f4 - f2;
        this.f33251C = f6;
        m58108c(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f33295z) {
            if (this.f33263O == null) {
                this.f33264P = new Paint();
                this.f33263O = new Rect();
                this.f33264P.set(this.f33270a);
                this.f33265Q = this.f33264P.getTextSize();
            }
            this.f33250B = f5;
            this.f33251C = f6;
            Paint paint = this.f33264P;
            String str = this.f33284o;
            paint.getTextBounds(str, 0, str.length(), this.f33263O);
            float height = this.f33263O.height() * 1.3f;
            float f7 = (f5 - this.f33288s) - this.f33287r;
            float f8 = (f6 - this.f33290u) - this.f33289t;
            float width = this.f33263O.width();
            if (width * f8 > height * f7) {
                this.f33270a.setTextSize((this.f33265Q * f7) / width);
            } else {
                this.f33270a.setTextSize((this.f33265Q * f8) / height);
            }
            if (this.f33274e || !Float.isNaN(this.f33280k)) {
                m58106e(Float.isNaN(this.f33280k) ? 1.0f : this.f33279j / this.f33280k);
            }
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33270a = new TextPaint();
        this.f33271b = new Path();
        this.f33272c = 65535;
        this.f33273d = 65535;
        this.f33274e = false;
        this.f33275f = 0.0f;
        this.f33276g = Float.NaN;
        this.f33279j = 48.0f;
        this.f33280k = Float.NaN;
        this.f33283n = 0.0f;
        this.f33284o = "Hello World";
        this.f33285p = true;
        this.f33286q = new Rect();
        this.f33287r = 1;
        this.f33288s = 1;
        this.f33289t = 1;
        this.f33290u = 1;
        this.f33293x = 8388659;
        this.f33294y = 0;
        this.f33295z = false;
        this.f33257I = Float.NaN;
        this.f33258J = Float.NaN;
        this.f33259K = 0.0f;
        this.f33260L = 0.0f;
        this.f33261M = new Paint();
        this.f33262N = 0;
        this.f33266R = Float.NaN;
        this.f33267S = Float.NaN;
        this.f33268T = Float.NaN;
        this.f33269U = Float.NaN;
        m58105f(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33270a = new TextPaint();
        this.f33271b = new Path();
        this.f33272c = 65535;
        this.f33273d = 65535;
        this.f33274e = false;
        this.f33275f = 0.0f;
        this.f33276g = Float.NaN;
        this.f33279j = 48.0f;
        this.f33280k = Float.NaN;
        this.f33283n = 0.0f;
        this.f33284o = "Hello World";
        this.f33285p = true;
        this.f33286q = new Rect();
        this.f33287r = 1;
        this.f33288s = 1;
        this.f33289t = 1;
        this.f33290u = 1;
        this.f33293x = 8388659;
        this.f33294y = 0;
        this.f33295z = false;
        this.f33257I = Float.NaN;
        this.f33258J = Float.NaN;
        this.f33259K = 0.0f;
        this.f33260L = 0.0f;
        this.f33261M = new Paint();
        this.f33262N = 0;
        this.f33266R = Float.NaN;
        this.f33267S = Float.NaN;
        this.f33268T = Float.NaN;
        this.f33269U = Float.NaN;
        m58105f(context, attributeSet);
    }
}