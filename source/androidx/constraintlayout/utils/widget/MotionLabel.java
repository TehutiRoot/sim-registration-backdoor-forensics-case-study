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
    public float f33161A;

    /* renamed from: B */
    public float f33162B;

    /* renamed from: C */
    public float f33163C;

    /* renamed from: D */
    public Drawable f33164D;

    /* renamed from: E */
    public Matrix f33165E;

    /* renamed from: F */
    public Bitmap f33166F;

    /* renamed from: G */
    public BitmapShader f33167G;

    /* renamed from: H */
    public Matrix f33168H;

    /* renamed from: I */
    public float f33169I;

    /* renamed from: J */
    public float f33170J;

    /* renamed from: K */
    public float f33171K;

    /* renamed from: L */
    public float f33172L;

    /* renamed from: M */
    public Paint f33173M;

    /* renamed from: N */
    public int f33174N;

    /* renamed from: O */
    public Rect f33175O;

    /* renamed from: P */
    public Paint f33176P;

    /* renamed from: Q */
    public float f33177Q;

    /* renamed from: R */
    public float f33178R;

    /* renamed from: S */
    public float f33179S;

    /* renamed from: T */
    public float f33180T;

    /* renamed from: U */
    public float f33181U;

    /* renamed from: a */
    public TextPaint f33182a;

    /* renamed from: b */
    public Path f33183b;

    /* renamed from: c */
    public int f33184c;

    /* renamed from: d */
    public int f33185d;

    /* renamed from: e */
    public boolean f33186e;

    /* renamed from: f */
    public float f33187f;

    /* renamed from: g */
    public float f33188g;

    /* renamed from: h */
    public ViewOutlineProvider f33189h;

    /* renamed from: i */
    public RectF f33190i;

    /* renamed from: j */
    public float f33191j;

    /* renamed from: k */
    public float f33192k;

    /* renamed from: l */
    public int f33193l;

    /* renamed from: m */
    public int f33194m;

    /* renamed from: n */
    public float f33195n;

    /* renamed from: o */
    public String f33196o;

    /* renamed from: p */
    public boolean f33197p;

    /* renamed from: q */
    public Rect f33198q;

    /* renamed from: r */
    public int f33199r;

    /* renamed from: s */
    public int f33200s;

    /* renamed from: t */
    public int f33201t;

    /* renamed from: u */
    public int f33202u;

    /* renamed from: v */
    public String f33203v;

    /* renamed from: w */
    public Layout f33204w;

    /* renamed from: x */
    public int f33205x;

    /* renamed from: y */
    public int f33206y;

    /* renamed from: z */
    public boolean f33207z;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    /* loaded from: classes2.dex */
    public class C3774a extends ViewOutlineProvider {
        public C3774a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f33187f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    /* loaded from: classes2.dex */
    public class C3775b extends ViewOutlineProvider {
        public C3775b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f33188g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f33182a = new TextPaint();
        this.f33183b = new Path();
        this.f33184c = 65535;
        this.f33185d = 65535;
        this.f33186e = false;
        this.f33187f = 0.0f;
        this.f33188g = Float.NaN;
        this.f33191j = 48.0f;
        this.f33192k = Float.NaN;
        this.f33195n = 0.0f;
        this.f33196o = "Hello World";
        this.f33197p = true;
        this.f33198q = new Rect();
        this.f33199r = 1;
        this.f33200s = 1;
        this.f33201t = 1;
        this.f33202u = 1;
        this.f33205x = 8388659;
        this.f33206y = 0;
        this.f33207z = false;
        this.f33169I = Float.NaN;
        this.f33170J = Float.NaN;
        this.f33171K = 0.0f;
        this.f33172L = 0.0f;
        this.f33173M = new Paint();
        this.f33174N = 0;
        this.f33178R = Float.NaN;
        this.f33179S = Float.NaN;
        this.f33180T = Float.NaN;
        this.f33181U = Float.NaN;
        m58155f(context, null);
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f33192k)) {
            f = 1.0f;
        } else {
            f = this.f33191j / this.f33192k;
        }
        TextPaint textPaint = this.f33182a;
        String str = this.f33196o;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f33162B)) {
            f2 = getMeasuredWidth();
        } else {
            f2 = this.f33162B;
        }
        return ((((f2 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.f33171K + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f33192k)) {
            f = 1.0f;
        } else {
            f = this.f33191j / this.f33192k;
        }
        Paint.FontMetrics fontMetrics = this.f33182a.getFontMetrics();
        if (Float.isNaN(this.f33163C)) {
            f2 = getMeasuredHeight();
        } else {
            f2 = this.f33163C;
        }
        float paddingTop = (f2 - getPaddingTop()) - getPaddingBottom();
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.f33172L)) / 2.0f) - (f * f4);
    }

    /* renamed from: c */
    public final void m58158c(float f, float f2, float f3, float f4) {
        if (this.f33168H == null) {
            return;
        }
        this.f33162B = f3 - f;
        this.f33163C = f4 - f2;
        m58150k();
    }

    /* renamed from: d */
    public Bitmap m58157d(Bitmap bitmap, int i) {
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
    public void m58156e(float f) {
        if (!this.f33186e && f == 1.0f) {
            return;
        }
        this.f33183b.reset();
        String str = this.f33196o;
        int length = str.length();
        this.f33182a.getTextBounds(str, 0, length, this.f33198q);
        this.f33182a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f33183b);
        if (f != 1.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(Debug.getLoc());
            sb.append(" scale ");
            sb.append(f);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            this.f33183b.transform(matrix);
        }
        Rect rect = this.f33198q;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.f33197p = false;
    }

    /* renamed from: f */
    public final void m58155f(Context context, AttributeSet attributeSet) {
        m58153h(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == R.styleable.MotionLabel_android_fontFamily) {
                    this.f33203v = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MotionLabel_scaleFromTextSize) {
                    this.f33192k = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f33192k);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.f33191j = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f33191j);
                } else if (index == R.styleable.MotionLabel_android_textStyle) {
                    this.f33193l = obtainStyledAttributes.getInt(index, this.f33193l);
                } else if (index == R.styleable.MotionLabel_android_typeface) {
                    this.f33194m = obtainStyledAttributes.getInt(index, this.f33194m);
                } else if (index == R.styleable.MotionLabel_android_textColor) {
                    this.f33184c = obtainStyledAttributes.getColor(index, this.f33184c);
                } else if (index == R.styleable.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f33188g);
                    this.f33188g = dimension;
                    setRound(dimension);
                } else if (index == R.styleable.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f33187f);
                    this.f33187f = f;
                    setRoundPercent(f);
                } else if (index == R.styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.f33206y = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.MotionLabel_textOutlineColor) {
                    this.f33185d = obtainStyledAttributes.getInt(index, this.f33185d);
                    this.f33186e = true;
                } else if (index == R.styleable.MotionLabel_textOutlineThickness) {
                    this.f33195n = obtainStyledAttributes.getDimension(index, this.f33195n);
                    this.f33186e = true;
                } else if (index == R.styleable.MotionLabel_textBackground) {
                    this.f33164D = obtainStyledAttributes.getDrawable(index);
                    this.f33186e = true;
                } else if (index == R.styleable.MotionLabel_textBackgroundPanX) {
                    this.f33178R = obtainStyledAttributes.getFloat(index, this.f33178R);
                } else if (index == R.styleable.MotionLabel_textBackgroundPanY) {
                    this.f33179S = obtainStyledAttributes.getFloat(index, this.f33179S);
                } else if (index == R.styleable.MotionLabel_textPanX) {
                    this.f33171K = obtainStyledAttributes.getFloat(index, this.f33171K);
                } else if (index == R.styleable.MotionLabel_textPanY) {
                    this.f33172L = obtainStyledAttributes.getFloat(index, this.f33172L);
                } else if (index == R.styleable.MotionLabel_textBackgroundRotate) {
                    this.f33181U = obtainStyledAttributes.getFloat(index, this.f33181U);
                } else if (index == R.styleable.MotionLabel_textBackgroundZoom) {
                    this.f33180T = obtainStyledAttributes.getFloat(index, this.f33180T);
                } else if (index == R.styleable.MotionLabel_textureHeight) {
                    this.f33169I = obtainStyledAttributes.getDimension(index, this.f33169I);
                } else if (index == R.styleable.MotionLabel_textureWidth) {
                    this.f33170J = obtainStyledAttributes.getDimension(index, this.f33170J);
                } else if (index == R.styleable.MotionLabel_textureEffect) {
                    this.f33174N = obtainStyledAttributes.getInt(index, this.f33174N);
                }
            }
            obtainStyledAttributes.recycle();
        }
        m58151j();
        m58152i();
    }

    /* renamed from: g */
    public final void m58154g(String str, int i, int i2) {
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
            TextPaint textPaint = this.f33182a;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f33182a;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f33182a.setFakeBoldText(false);
        this.f33182a.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public float getRound() {
        return this.f33188g;
    }

    public float getRoundPercent() {
        return this.f33187f;
    }

    public float getScaleFromTextSize() {
        return this.f33192k;
    }

    public float getTextBackgroundPanX() {
        return this.f33178R;
    }

    public float getTextBackgroundPanY() {
        return this.f33179S;
    }

    public float getTextBackgroundRotate() {
        return this.f33181U;
    }

    public float getTextBackgroundZoom() {
        return this.f33180T;
    }

    public int getTextOutlineColor() {
        return this.f33185d;
    }

    public float getTextPanX() {
        return this.f33171K;
    }

    public float getTextPanY() {
        return this.f33172L;
    }

    public float getTextureHeight() {
        return this.f33169I;
    }

    public float getTextureWidth() {
        return this.f33170J;
    }

    public Typeface getTypeface() {
        return this.f33182a.getTypeface();
    }

    /* renamed from: h */
    public final void m58153h(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f33182a;
        int i = typedValue.data;
        this.f33184c = i;
        textPaint.setColor(i);
    }

    /* renamed from: i */
    public void m58152i() {
        this.f33199r = getPaddingLeft();
        this.f33200s = getPaddingRight();
        this.f33201t = getPaddingTop();
        this.f33202u = getPaddingBottom();
        m58154g(this.f33203v, this.f33194m, this.f33193l);
        this.f33182a.setColor(this.f33184c);
        this.f33182a.setStrokeWidth(this.f33195n);
        this.f33182a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33182a.setFlags(128);
        setTextSize(this.f33191j);
        this.f33182a.setAntiAlias(true);
    }

    /* renamed from: j */
    public final void m58151j() {
        if (this.f33164D != null) {
            this.f33168H = new Matrix();
            int intrinsicWidth = this.f33164D.getIntrinsicWidth();
            int intrinsicHeight = this.f33164D.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f33170J)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f33170J;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f33169I)) {
                    i = (int) this.f33169I;
                }
                intrinsicHeight = i;
            }
            if (this.f33174N != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f33166F = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f33166F);
            this.f33164D.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f33164D.setFilterBitmap(true);
            this.f33164D.draw(canvas);
            if (this.f33174N != 0) {
                this.f33166F = m58157d(this.f33166F, 4);
            }
            Bitmap bitmap = this.f33166F;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f33167G = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: k */
    public final void m58150k() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (Float.isNaN(this.f33178R)) {
            f = 0.0f;
        } else {
            f = this.f33178R;
        }
        if (Float.isNaN(this.f33179S)) {
            f2 = 0.0f;
        } else {
            f2 = this.f33179S;
        }
        if (Float.isNaN(this.f33180T)) {
            f3 = 1.0f;
        } else {
            f3 = this.f33180T;
        }
        if (!Float.isNaN(this.f33181U)) {
            f7 = this.f33181U;
        }
        this.f33168H.reset();
        float width = this.f33166F.getWidth();
        float height = this.f33166F.getHeight();
        if (Float.isNaN(this.f33170J)) {
            f4 = this.f33162B;
        } else {
            f4 = this.f33170J;
        }
        if (Float.isNaN(this.f33169I)) {
            f5 = this.f33163C;
        } else {
            f5 = this.f33169I;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.f33168H.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.f33169I)) {
            f12 = this.f33169I / 2.0f;
        }
        if (!Float.isNaN(this.f33170J)) {
            f10 = this.f33170J / 2.0f;
        }
        this.f33168H.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.f33168H.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.f33167G.setLocalMatrix(this.f33168H);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f33192k);
        float f = isNaN ? 1.0f : this.f33191j / this.f33192k;
        this.f33162B = i3 - i;
        this.f33163C = i4 - i2;
        if (this.f33207z) {
            if (this.f33175O == null) {
                this.f33176P = new Paint();
                this.f33175O = new Rect();
                this.f33176P.set(this.f33182a);
                this.f33177Q = this.f33176P.getTextSize();
            }
            Paint paint = this.f33176P;
            String str = this.f33196o;
            paint.getTextBounds(str, 0, str.length(), this.f33175O);
            int width = this.f33175O.width();
            int height = (int) (this.f33175O.height() * 1.3f);
            float f2 = (this.f33162B - this.f33200s) - this.f33199r;
            float f3 = (this.f33163C - this.f33202u) - this.f33201t;
            if (isNaN) {
                float f4 = width;
                float f5 = height;
                if (f4 * f3 > f5 * f2) {
                    this.f33182a.setTextSize((this.f33177Q * f2) / f4);
                } else {
                    this.f33182a.setTextSize((this.f33177Q * f3) / f5);
                }
            } else {
                float f6 = width;
                float f7 = height;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f33186e || !isNaN) {
            m58158c(i, i2, i3, i4);
            m58156e(f);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.f33192k)) {
            f = 1.0f;
        } else {
            f = this.f33191j / this.f33192k;
        }
        super.onDraw(canvas);
        if (!this.f33186e && f == 1.0f) {
            float horizontalOffset = this.f33199r + getHorizontalOffset();
            canvas.drawText(this.f33196o, this.f33161A + horizontalOffset, this.f33201t + getVerticalOffset(), this.f33182a);
            return;
        }
        if (this.f33197p) {
            m58156e(f);
        }
        if (this.f33165E == null) {
            this.f33165E = new Matrix();
        }
        if (this.f33186e) {
            this.f33173M.set(this.f33182a);
            this.f33165E.reset();
            float horizontalOffset2 = this.f33199r + getHorizontalOffset();
            float verticalOffset = this.f33201t + getVerticalOffset();
            this.f33165E.postTranslate(horizontalOffset2, verticalOffset);
            this.f33165E.preScale(f, f);
            this.f33183b.transform(this.f33165E);
            if (this.f33167G != null) {
                this.f33182a.setFilterBitmap(true);
                this.f33182a.setShader(this.f33167G);
            } else {
                this.f33182a.setColor(this.f33184c);
            }
            this.f33182a.setStyle(Paint.Style.FILL);
            this.f33182a.setStrokeWidth(this.f33195n);
            canvas.drawPath(this.f33183b, this.f33182a);
            if (this.f33167G != null) {
                this.f33182a.setShader(null);
            }
            this.f33182a.setColor(this.f33185d);
            this.f33182a.setStyle(Paint.Style.STROKE);
            this.f33182a.setStrokeWidth(this.f33195n);
            canvas.drawPath(this.f33183b, this.f33182a);
            this.f33165E.reset();
            this.f33165E.postTranslate(-horizontalOffset2, -verticalOffset);
            this.f33183b.transform(this.f33165E);
            this.f33182a.set(this.f33173M);
            return;
        }
        float horizontalOffset3 = this.f33199r + getHorizontalOffset();
        float verticalOffset2 = this.f33201t + getVerticalOffset();
        this.f33165E.reset();
        this.f33165E.preTranslate(horizontalOffset3, verticalOffset2);
        this.f33183b.transform(this.f33165E);
        this.f33182a.setColor(this.f33184c);
        this.f33182a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33182a.setStrokeWidth(this.f33195n);
        canvas.drawPath(this.f33183b, this.f33182a);
        this.f33165E.reset();
        this.f33165E.preTranslate(-horizontalOffset3, -verticalOffset2);
        this.f33183b.transform(this.f33165E);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f33207z = false;
        this.f33199r = getPaddingLeft();
        this.f33200s = getPaddingRight();
        this.f33201t = getPaddingTop();
        this.f33202u = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f33206y != 0) {
                this.f33207z = true;
            }
        } else {
            TextPaint textPaint = this.f33182a;
            String str = this.f33196o;
            textPaint.getTextBounds(str, 0, str.length(), this.f33198q);
            if (mode != 1073741824) {
                size = (int) (this.f33198q.width() + 0.99999f);
            }
            size += this.f33199r + this.f33200s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f33182a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f33201t + this.f33202u + fontMetricsInt;
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
        if (i != this.f33205x) {
            invalidate();
        }
        this.f33205x = i;
        int i2 = i & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f33172L = 0.0f;
            } else {
                this.f33172L = 1.0f;
            }
        } else {
            this.f33172L = -1.0f;
        }
        int i3 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f33171K = 0.0f;
                        return;
                    }
                }
            }
            this.f33171K = 1.0f;
            return;
        }
        this.f33171K = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33188g = f;
            float f2 = this.f33187f;
            this.f33187f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33188g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33188g = f;
        if (f != 0.0f) {
            if (this.f33183b == null) {
                this.f33183b = new Path();
            }
            if (this.f33190i == null) {
                this.f33190i = new RectF();
            }
            if (this.f33189h == null) {
                C3775b c3775b = new C3775b();
                this.f33189h = c3775b;
                setOutlineProvider(c3775b);
            }
            setClipToOutline(true);
            this.f33190i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33183b.reset();
            Path path = this.f33183b;
            RectF rectF = this.f33190i;
            float f3 = this.f33188g;
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
        if (this.f33187f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33187f = f;
        if (f != 0.0f) {
            if (this.f33183b == null) {
                this.f33183b = new Path();
            }
            if (this.f33190i == null) {
                this.f33190i = new RectF();
            }
            if (this.f33189h == null) {
                C3774a c3774a = new C3774a();
                this.f33189h = c3774a;
                setOutlineProvider(c3774a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33187f) / 2.0f;
            this.f33190i.set(0.0f, 0.0f, width, height);
            this.f33183b.reset();
            this.f33183b.addRoundRect(this.f33190i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f33192k = f;
    }

    public void setText(CharSequence charSequence) {
        this.f33196o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f33178R = f;
        m58150k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f33179S = f;
        m58150k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f33181U = f;
        m58150k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f33180T = f;
        m58150k();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f33184c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f33185d = i;
        this.f33186e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f33195n = f;
        this.f33186e = true;
        if (Float.isNaN(f)) {
            this.f33195n = 1.0f;
            this.f33186e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f33171K = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f33172L = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.f33191j = f;
        StringBuilder sb = new StringBuilder();
        sb.append(Debug.getLoc());
        sb.append("  ");
        sb.append(f);
        sb.append(" / ");
        sb.append(this.f33192k);
        TextPaint textPaint = this.f33182a;
        if (!Float.isNaN(this.f33192k)) {
            f = this.f33192k;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.f33192k)) {
            f2 = 1.0f;
        } else {
            f2 = this.f33191j / this.f33192k;
        }
        m58156e(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f33169I = f;
        m58150k();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f33170J = f;
        m58150k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f33182a.getTypeface() != typeface) {
            this.f33182a.setTypeface(typeface);
            if (this.f33204w != null) {
                this.f33204w = null;
                requestLayout();
                invalidate();
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f33161A = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f33162B = f5;
        float f6 = f4 - f2;
        this.f33163C = f6;
        m58158c(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f33207z) {
            if (this.f33175O == null) {
                this.f33176P = new Paint();
                this.f33175O = new Rect();
                this.f33176P.set(this.f33182a);
                this.f33177Q = this.f33176P.getTextSize();
            }
            this.f33162B = f5;
            this.f33163C = f6;
            Paint paint = this.f33176P;
            String str = this.f33196o;
            paint.getTextBounds(str, 0, str.length(), this.f33175O);
            float height = this.f33175O.height() * 1.3f;
            float f7 = (f5 - this.f33200s) - this.f33199r;
            float f8 = (f6 - this.f33202u) - this.f33201t;
            float width = this.f33175O.width();
            if (width * f8 > height * f7) {
                this.f33182a.setTextSize((this.f33177Q * f7) / width);
            } else {
                this.f33182a.setTextSize((this.f33177Q * f8) / height);
            }
            if (this.f33186e || !Float.isNaN(this.f33192k)) {
                m58156e(Float.isNaN(this.f33192k) ? 1.0f : this.f33191j / this.f33192k);
            }
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33182a = new TextPaint();
        this.f33183b = new Path();
        this.f33184c = 65535;
        this.f33185d = 65535;
        this.f33186e = false;
        this.f33187f = 0.0f;
        this.f33188g = Float.NaN;
        this.f33191j = 48.0f;
        this.f33192k = Float.NaN;
        this.f33195n = 0.0f;
        this.f33196o = "Hello World";
        this.f33197p = true;
        this.f33198q = new Rect();
        this.f33199r = 1;
        this.f33200s = 1;
        this.f33201t = 1;
        this.f33202u = 1;
        this.f33205x = 8388659;
        this.f33206y = 0;
        this.f33207z = false;
        this.f33169I = Float.NaN;
        this.f33170J = Float.NaN;
        this.f33171K = 0.0f;
        this.f33172L = 0.0f;
        this.f33173M = new Paint();
        this.f33174N = 0;
        this.f33178R = Float.NaN;
        this.f33179S = Float.NaN;
        this.f33180T = Float.NaN;
        this.f33181U = Float.NaN;
        m58155f(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33182a = new TextPaint();
        this.f33183b = new Path();
        this.f33184c = 65535;
        this.f33185d = 65535;
        this.f33186e = false;
        this.f33187f = 0.0f;
        this.f33188g = Float.NaN;
        this.f33191j = 48.0f;
        this.f33192k = Float.NaN;
        this.f33195n = 0.0f;
        this.f33196o = "Hello World";
        this.f33197p = true;
        this.f33198q = new Rect();
        this.f33199r = 1;
        this.f33200s = 1;
        this.f33201t = 1;
        this.f33202u = 1;
        this.f33205x = 8388659;
        this.f33206y = 0;
        this.f33207z = false;
        this.f33169I = Float.NaN;
        this.f33170J = Float.NaN;
        this.f33171K = 0.0f;
        this.f33172L = 0.0f;
        this.f33173M = new Paint();
        this.f33174N = 0;
        this.f33178R = Float.NaN;
        this.f33179S = Float.NaN;
        this.f33180T = Float.NaN;
        this.f33181U = Float.NaN;
        m58155f(context, attributeSet);
    }
}
