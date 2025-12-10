package com.github.gcacace.signaturepad.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import com.github.gcacace.signaturepad.R;
import com.github.gcacace.signaturepad.utils.Bezier;
import com.github.gcacace.signaturepad.utils.ControlTimedPoints;
import com.github.gcacace.signaturepad.utils.SvgBuilder;
import com.github.gcacace.signaturepad.utils.TimedPoint;
import com.github.gcacace.signaturepad.view.ViewCompat;
import com.github.gcacace.signaturepad.view.ViewTreeObserverCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class SignaturePad extends View {

    /* renamed from: A */
    public Bitmap f43758A;

    /* renamed from: B */
    public Canvas f43759B;

    /* renamed from: C */
    public float f43760C;

    /* renamed from: D */
    public float f43761D;

    /* renamed from: E */
    public float f43762E;

    /* renamed from: F */
    public float f43763F;

    /* renamed from: a */
    public List f43764a;

    /* renamed from: b */
    public boolean f43765b;

    /* renamed from: c */
    public Boolean f43766c;

    /* renamed from: d */
    public float f43767d;

    /* renamed from: e */
    public float f43768e;

    /* renamed from: f */
    public float f43769f;

    /* renamed from: g */
    public float f43770g;

    /* renamed from: h */
    public RectF f43771h;

    /* renamed from: i */
    public Bitmap f43772i;

    /* renamed from: j */
    public final SvgBuilder f43773j;

    /* renamed from: k */
    public List f43774k;

    /* renamed from: l */
    public ControlTimedPoints f43775l;

    /* renamed from: m */
    public Bezier f43776m;

    /* renamed from: n */
    public int f43777n;

    /* renamed from: o */
    public int f43778o;

    /* renamed from: p */
    public float f43779p;

    /* renamed from: q */
    public OnSignedListener f43780q;

    /* renamed from: r */
    public boolean f43781r;

    /* renamed from: s */
    public long f43782s;

    /* renamed from: t */
    public int f43783t;

    /* renamed from: u */
    public final int f43784u;

    /* renamed from: v */
    public final int f43785v;

    /* renamed from: w */
    public final int f43786w;

    /* renamed from: x */
    public final float f43787x;

    /* renamed from: y */
    public final boolean f43788y;

    /* renamed from: z */
    public Paint f43789z;

    /* loaded from: classes3.dex */
    public interface OnSignedListener {
        void onClear();

        void onSigned();

        void onStartSigning();
    }

    /* renamed from: com.github.gcacace.signaturepad.views.SignaturePad$a */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC6180a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f43790a;

        public ViewTreeObserver$OnGlobalLayoutListenerC6180a(Bitmap bitmap) {
            SignaturePad.this = r1;
            this.f43790a = bitmap;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserverCompat.removeOnGlobalLayoutListener(SignaturePad.this.getViewTreeObserver(), this);
            SignaturePad.this.setSignatureBitmap(this.f43790a);
        }
    }

    public SignaturePad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43773j = new SvgBuilder();
        this.f43774k = new ArrayList();
        this.f43775l = new ControlTimedPoints();
        this.f43776m = new Bezier();
        this.f43784u = 2;
        this.f43785v = 5;
        this.f43786w = -16777216;
        this.f43787x = 0.9f;
        this.f43788y = false;
        this.f43789z = new Paint();
        this.f43758A = null;
        this.f43759B = null;
        this.f43760C = 0.0f;
        this.f43761D = 9999.0f;
        this.f43762E = 0.0f;
        this.f43763F = 9999.0f;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignaturePad, 0, 0);
        try {
            this.f43777n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SignaturePad_penMinWidth, m49264d(2.0f));
            this.f43778o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SignaturePad_penMaxWidth, m49264d(5.0f));
            this.f43789z.setColor(obtainStyledAttributes.getColor(R.styleable.SignaturePad_penColor, -16777216));
            this.f43779p = obtainStyledAttributes.getFloat(R.styleable.SignaturePad_velocityFilterWeight, 0.9f);
            this.f43781r = obtainStyledAttributes.getBoolean(R.styleable.SignaturePad_clearOnDoubleClick, false);
            obtainStyledAttributes.recycle();
            this.f43789z.setAntiAlias(true);
            this.f43789z.setStyle(Paint.Style.STROKE);
            this.f43789z.setStrokeCap(Paint.Cap.ROUND);
            this.f43789z.setStrokeJoin(Paint.Join.ROUND);
            this.f43771h = new RectF();
            clearView();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void setIsEmpty(boolean z) {
        this.f43765b = z;
        OnSignedListener onSignedListener = this.f43780q;
        if (onSignedListener != null) {
            if (z) {
                onSignedListener.onClear();
            } else {
                onSignedListener.onSigned();
            }
        }
    }

    /* renamed from: a */
    public final void m49267a(Bezier bezier, float f, float f2) {
        this.f43773j.append(bezier, (f + f2) / 2.0f);
        m49263e();
        float strokeWidth = this.f43789z.getStrokeWidth();
        float f3 = f2 - f;
        float floor = (float) Math.floor(bezier.length());
        int i = 0;
        while (true) {
            float f4 = i;
            if (f4 < floor) {
                float f5 = f4 / floor;
                float f6 = f5 * f5;
                float f7 = f6 * f5;
                float f8 = 1.0f - f5;
                float f9 = f8 * f8;
                float f10 = f9 * f8;
                TimedPoint timedPoint = bezier.startPoint;
                float f11 = f9 * 3.0f * f5;
                TimedPoint timedPoint2 = bezier.control1;
                float f12 = f8 * 3.0f * f6;
                TimedPoint timedPoint3 = bezier.control2;
                float f13 = (timedPoint.f43756x * f10) + (timedPoint2.f43756x * f11) + (timedPoint3.f43756x * f12);
                TimedPoint timedPoint4 = bezier.endPoint;
                float f14 = f13 + (timedPoint4.f43756x * f7);
                float f15 = (f10 * timedPoint.f43757y) + (f11 * timedPoint2.f43757y) + (f12 * timedPoint3.f43757y) + (timedPoint4.f43757y * f7);
                this.f43789z.setStrokeWidth(f + (f7 * f3));
                this.f43759B.drawPoint(f14, f15, this.f43789z);
                m49262f(f14, f15);
                i++;
            } else {
                this.f43789z.setStrokeWidth(strokeWidth);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m49266b(TimedPoint timedPoint) {
        this.f43764a.add(timedPoint);
        int size = this.f43764a.size();
        if (size > 3) {
            ControlTimedPoints m49265c = m49265c((TimedPoint) this.f43764a.get(0), (TimedPoint) this.f43764a.get(1), (TimedPoint) this.f43764a.get(2));
            TimedPoint timedPoint2 = m49265c.f43746c2;
            m49259i(m49265c.f43745c1);
            ControlTimedPoints m49265c2 = m49265c((TimedPoint) this.f43764a.get(1), (TimedPoint) this.f43764a.get(2), (TimedPoint) this.f43764a.get(3));
            TimedPoint timedPoint3 = m49265c2.f43745c1;
            m49259i(m49265c2.f43746c2);
            Bezier bezier = this.f43776m.set((TimedPoint) this.f43764a.get(1), timedPoint2, timedPoint3, (TimedPoint) this.f43764a.get(2));
            TimedPoint timedPoint4 = bezier.startPoint;
            TimedPoint timedPoint5 = bezier.endPoint;
            float f = this.f43760C;
            float f2 = timedPoint4.f43757y;
            if (f < f2) {
                this.f43760C = f2;
            }
            float f3 = this.f43761D;
            float f4 = timedPoint5.f43757y;
            float f5 = 0.0f;
            if (f3 > f4) {
                this.f43761D = f4;
                if (f4 < 0.0d) {
                    f4 = 0.0f;
                }
                this.f43761D = f4;
            }
            float f6 = this.f43762E;
            float f7 = timedPoint4.f43756x;
            if (f6 < f7) {
                this.f43762E = f7;
            }
            float f8 = this.f43763F;
            float f9 = timedPoint5.f43756x;
            if (f8 > f9) {
                this.f43763F = f9;
                if (f9 < 0.0d) {
                    f9 = 0.0f;
                }
                this.f43763F = f9;
            }
            float velocityFrom = timedPoint5.velocityFrom(timedPoint4);
            if (!Float.isNaN(velocityFrom)) {
                f5 = velocityFrom;
            }
            float f10 = this.f43779p;
            float f11 = (f5 * f10) + ((1.0f - f10) * this.f43769f);
            float m49257k = m49257k(f11);
            m49267a(bezier, this.f43770g, m49257k);
            this.f43769f = f11;
            this.f43770g = m49257k;
            m49259i((TimedPoint) this.f43764a.remove(0));
            m49259i(timedPoint2);
            m49259i(timedPoint3);
        } else if (size == 1) {
            TimedPoint timedPoint6 = (TimedPoint) this.f43764a.get(0);
            this.f43764a.add(m49261g(timedPoint6.f43756x, timedPoint6.f43757y));
        }
        this.f43766c = Boolean.TRUE;
    }

    /* renamed from: c */
    public final ControlTimedPoints m49265c(TimedPoint timedPoint, TimedPoint timedPoint2, TimedPoint timedPoint3) {
        float f = timedPoint.f43756x;
        float f2 = timedPoint2.f43756x;
        float f3 = f - f2;
        float f4 = timedPoint.f43757y;
        float f5 = timedPoint2.f43757y;
        float f6 = f4 - f5;
        float f7 = timedPoint3.f43756x;
        float f8 = f2 - f7;
        float f9 = timedPoint3.f43757y;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f5 + f9) / 2.0f;
        float sqrt = (float) Math.sqrt((f3 * f3) + (f6 * f6));
        float sqrt2 = (float) Math.sqrt((f8 * f8) + (f10 * f10));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = sqrt2 / (sqrt + sqrt2);
        if (Float.isNaN(f17)) {
            f17 = 0.0f;
        }
        float f18 = timedPoint2.f43756x - ((f15 * f17) + f13);
        float f19 = timedPoint2.f43757y - ((f16 * f17) + f14);
        return this.f43775l.set(m49261g(f11 + f18, f12 + f19), m49261g(f13 + f18, f14 + f19));
    }

    public void clear() {
        clearView();
        this.f43766c = Boolean.TRUE;
    }

    public void clearView() {
        this.f43761D = 9999.0f;
        this.f43763F = 9999.0f;
        this.f43762E = 0.0f;
        this.f43760C = 0.0f;
        this.f43773j.clear();
        this.f43764a = new ArrayList();
        this.f43769f = 0.0f;
        this.f43770g = (this.f43777n + this.f43778o) / 2;
        if (this.f43758A != null) {
            this.f43758A = null;
            m49263e();
        }
        setIsEmpty(true);
        invalidate();
    }

    /* renamed from: d */
    public final int m49264d(float f) {
        return Math.round(getContext().getResources().getDisplayMetrics().density * f);
    }

    /* renamed from: e */
    public final void m49263e() {
        if (this.f43758A == null) {
            this.f43758A = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f43759B = new Canvas(this.f43758A);
        }
    }

    /* renamed from: f */
    public final void m49262f(float f, float f2) {
        RectF rectF = this.f43771h;
        if (f < rectF.left) {
            rectF.left = f;
        } else if (f > rectF.right) {
            rectF.right = f;
        }
        if (f2 < rectF.top) {
            rectF.top = f2;
        } else if (f2 > rectF.bottom) {
            rectF.bottom = f2;
        }
    }

    /* renamed from: g */
    public final TimedPoint m49261g(float f, float f2) {
        TimedPoint timedPoint;
        int size = this.f43774k.size();
        if (size == 0) {
            timedPoint = new TimedPoint();
        } else {
            timedPoint = (TimedPoint) this.f43774k.remove(size - 1);
        }
        return timedPoint.set(f, f2);
    }

    public float getEndX() {
        return this.f43762E;
    }

    public float getEndY() {
        return this.f43760C;
    }

    public List<TimedPoint> getPoints() {
        return this.f43764a;
    }

    public Bitmap getSignatureBitmap() {
        Bitmap transparentSignatureBitmap = getTransparentSignatureBitmap();
        Bitmap createBitmap = Bitmap.createBitmap(transparentSignatureBitmap.getWidth(), transparentSignatureBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(transparentSignatureBitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public String getSignatureSvg() {
        return this.f43773j.build(getTransparentSignatureBitmap().getWidth(), getTransparentSignatureBitmap().getHeight());
    }

    public Bitmap getSignatureWithTransparentBitmap() {
        Bitmap transparentSignatureBitmap = getTransparentSignatureBitmap();
        Bitmap createBitmap = Bitmap.createBitmap(transparentSignatureBitmap.getWidth(), transparentSignatureBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(transparentSignatureBitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public float getStartX() {
        return this.f43763F;
    }

    public float getStartY() {
        return this.f43761D;
    }

    public Bitmap getTransparentSignatureBitmap() {
        m49263e();
        return this.f43758A;
    }

    /* renamed from: h */
    public final boolean m49260h() {
        if (this.f43781r) {
            if (this.f43782s != 0 && System.currentTimeMillis() - this.f43782s > 50) {
                this.f43783t = 0;
            }
            int i = this.f43783t + 1;
            this.f43783t = i;
            if (i == 1) {
                this.f43782s = System.currentTimeMillis();
            } else if (i == 2 && System.currentTimeMillis() - this.f43782s < 50) {
                clearView();
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m49259i(TimedPoint timedPoint) {
        this.f43774k.add(timedPoint);
    }

    public boolean isEmpty() {
        return this.f43765b;
    }

    /* renamed from: j */
    public final void m49258j(float f, float f2) {
        this.f43771h.left = Math.min(this.f43767d, f);
        this.f43771h.right = Math.max(this.f43767d, f);
        this.f43771h.top = Math.min(this.f43768e, f2);
        this.f43771h.bottom = Math.max(this.f43768e, f2);
    }

    /* renamed from: k */
    public final float m49257k(float f) {
        return Math.max(this.f43778o / (f + 1.0f), this.f43777n);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f43758A;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f43789z);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setSignatureBitmap((Bitmap) bundle.getParcelable("signatureBitmap"));
            this.f43772i = (Bitmap) bundle.getParcelable("signatureBitmap");
            parcelable = bundle.getParcelable("superState");
        }
        this.f43766c = Boolean.FALSE;
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        Boolean bool = this.f43766c;
        if (bool == null || bool.booleanValue()) {
            this.f43772i = getTransparentSignatureBitmap();
        }
        bundle.putParcelable("signatureBitmap", this.f43772i);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                m49258j(x, y);
                m49266b(m49261g(x, y));
                invalidate();
                return true;
            }
            m49258j(x, y);
            m49266b(m49261g(x, y));
            getParent().requestDisallowInterceptTouchEvent(true);
            setIsEmpty(false);
            invalidate();
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f43764a.clear();
        if (!m49260h()) {
            this.f43767d = x;
            this.f43768e = y;
            m49266b(m49261g(x, y));
            OnSignedListener onSignedListener = this.f43780q;
            if (onSignedListener != null) {
                onSignedListener.onStartSigning();
            }
            m49258j(x, y);
            m49266b(m49261g(x, y));
        }
        invalidate();
        return true;
    }

    public void setMaxWidth(float f) {
        this.f43778o = m49264d(f);
    }

    public void setMinWidth(float f) {
        this.f43777n = m49264d(f);
    }

    public void setOnSignedListener(OnSignedListener onSignedListener) {
        this.f43780q = onSignedListener;
    }

    public void setPenColor(int i) {
        this.f43789z.setColor(i);
    }

    public void setPenColorRes(int i) {
        try {
            ContextCompat.getColor(getContext(), i);
        } catch (Resources.NotFoundException unused) {
            setPenColor(Color.parseColor("#000000"));
        }
    }

    public void setSignatureBitmap(Bitmap bitmap) {
        if (ViewCompat.isLaidOut(this)) {
            clearView();
            m49263e();
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = getWidth();
            int height2 = getHeight();
            rectF.set(0.0f, 0.0f, width, height);
            rectF2.set(0.0f, 0.0f, width2, height2);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            new Canvas(this.f43758A).drawBitmap(bitmap, matrix, null);
            setIsEmpty(false);
            invalidate();
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC6180a(bitmap));
    }

    public void setVelocityFilterWeight(float f) {
        this.f43779p = f;
    }

    public Bitmap getTransparentSignatureBitmap(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!z) {
            return getTransparentSignatureBitmap();
        }
        m49263e();
        int height = this.f43758A.getHeight();
        int width = this.f43758A.getWidth();
        int i = Integer.MAX_VALUE;
        boolean z6 = false;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < width; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= height) {
                    z5 = false;
                    break;
                } else if (this.f43758A.getPixel(i3, i4) != 0) {
                    i2 = i3;
                    z6 = true;
                    z5 = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z5) {
                break;
            }
        }
        if (z6) {
            for (int i5 = 0; i5 < height; i5++) {
                int i6 = i2;
                while (true) {
                    if (i6 >= width) {
                        z4 = false;
                        break;
                    } else if (this.f43758A.getPixel(i6, i5) != 0) {
                        i = i5;
                        z4 = true;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (z4) {
                    break;
                }
            }
            int i7 = Integer.MIN_VALUE;
            int i8 = Integer.MIN_VALUE;
            for (int i9 = width - 1; i9 >= i2; i9--) {
                int i10 = i;
                while (true) {
                    if (i10 >= height) {
                        z3 = false;
                        break;
                    } else if (this.f43758A.getPixel(i9, i10) != 0) {
                        i8 = i9;
                        z3 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z3) {
                    break;
                }
            }
            for (int i11 = height - 1; i11 >= i; i11--) {
                int i12 = i2;
                while (true) {
                    if (i12 > i8) {
                        z2 = false;
                        break;
                    } else if (this.f43758A.getPixel(i12, i11) != 0) {
                        i7 = i11;
                        z2 = true;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (z2) {
                    break;
                }
            }
            return Bitmap.createBitmap(this.f43758A, i2, i, i8 - i2, i7 - i);
        }
        return null;
    }
}
