package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class KeyPosition extends AbstractC17794Ih0 {
    public static final String DRAWPATH = "drawPath";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;

    /* renamed from: f */
    public String f32734f = null;

    /* renamed from: g */
    public int f32735g = Key.UNSET;

    /* renamed from: h */
    public int f32736h = 0;

    /* renamed from: i */
    public float f32737i = Float.NaN;

    /* renamed from: j */
    public float f32738j = Float.NaN;

    /* renamed from: k */
    public float f32739k = Float.NaN;

    /* renamed from: l */
    public float f32740l = Float.NaN;

    /* renamed from: m */
    public float f32741m = Float.NaN;

    /* renamed from: n */
    public float f32742n = Float.NaN;

    /* renamed from: o */
    public int f32743o = 0;

    /* renamed from: p */
    public float f32744p = Float.NaN;

    /* renamed from: q */
    public float f32745q = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.KeyPosition$a */
    /* loaded from: classes2.dex */
    public static class C3746a {

        /* renamed from: a */
        public static SparseIntArray f32746a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f32746a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            f32746a.append(R.styleable.KeyPosition_framePosition, 2);
            f32746a.append(R.styleable.KeyPosition_transitionEasing, 3);
            f32746a.append(R.styleable.KeyPosition_curveFit, 4);
            f32746a.append(R.styleable.KeyPosition_drawPath, 5);
            f32746a.append(R.styleable.KeyPosition_percentX, 6);
            f32746a.append(R.styleable.KeyPosition_percentY, 7);
            f32746a.append(R.styleable.KeyPosition_keyPositionType, 9);
            f32746a.append(R.styleable.KeyPosition_sizePercent, 8);
            f32746a.append(R.styleable.KeyPosition_percentWidth, 11);
            f32746a.append(R.styleable.KeyPosition_percentHeight, 12);
            f32746a.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        /* renamed from: b */
        public static void m58452b(KeyPosition keyPosition, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f32746a.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyPosition.f32690b);
                            keyPosition.f32690b = resourceId;
                            if (resourceId == -1) {
                                keyPosition.f32691c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyPosition.f32691c = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.f32690b = typedArray.getResourceId(index, keyPosition.f32690b);
                            break;
                        }
                    case 2:
                        keyPosition.f32689a = typedArray.getInt(index, keyPosition.f32689a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            keyPosition.f32734f = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.f32734f = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        keyPosition.f2578e = typedArray.getInteger(index, keyPosition.f2578e);
                        break;
                    case 5:
                        keyPosition.f32736h = typedArray.getInt(index, keyPosition.f32736h);
                        break;
                    case 6:
                        keyPosition.f32739k = typedArray.getFloat(index, keyPosition.f32739k);
                        break;
                    case 7:
                        keyPosition.f32740l = typedArray.getFloat(index, keyPosition.f32740l);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, keyPosition.f32738j);
                        keyPosition.f32737i = f;
                        keyPosition.f32738j = f;
                        break;
                    case 9:
                        keyPosition.f32743o = typedArray.getInt(index, keyPosition.f32743o);
                        break;
                    case 10:
                        keyPosition.f32735g = typedArray.getInt(index, keyPosition.f32735g);
                        break;
                    case 11:
                        keyPosition.f32737i = typedArray.getFloat(index, keyPosition.f32737i);
                        break;
                    case 12:
                        keyPosition.f32738j = typedArray.getFloat(index, keyPosition.f32738j);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f32746a.get(index));
                        break;
                }
            }
            int i2 = keyPosition.f32689a;
        }
    }

    public KeyPosition() {
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyPosition keyPosition = (KeyPosition) key;
        this.f32734f = keyPosition.f32734f;
        this.f32735g = keyPosition.f32735g;
        this.f32736h = keyPosition.f32736h;
        this.f32737i = keyPosition.f32737i;
        this.f32738j = Float.NaN;
        this.f32739k = keyPosition.f32739k;
        this.f32740l = keyPosition.f32740l;
        this.f32741m = keyPosition.f32741m;
        this.f32742n = keyPosition.f32742n;
        this.f32744p = keyPosition.f32744p;
        this.f32745q = keyPosition.f32745q;
        return this;
    }

    /* renamed from: e */
    public final void m58460e(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = 0.0f;
        if (Float.isNaN(this.f32739k)) {
            f5 = 0.0f;
        } else {
            f5 = this.f32739k;
        }
        if (Float.isNaN(this.f32742n)) {
            f6 = 0.0f;
        } else {
            f6 = this.f32742n;
        }
        if (Float.isNaN(this.f32740l)) {
            f7 = 0.0f;
        } else {
            f7 = this.f32740l;
        }
        if (!Float.isNaN(this.f32741m)) {
            f10 = this.f32741m;
        }
        this.f32744p = (int) (f + (f5 * f8) + (f10 * f9));
        this.f32745q = (int) (f2 + (f8 * f6) + (f9 * f7));
    }

    /* renamed from: f */
    public final void m58459f(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f32739k;
        float f8 = this.f32740l;
        this.f32744p = f + (f5 * f7) + ((-f6) * f8);
        this.f32745q = f2 + (f6 * f7) + (f5 * f8);
    }

    /* renamed from: g */
    public void m58458g(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f32743o;
        if (i3 != 1) {
            if (i3 != 2) {
                m58460e(f, f2, f3, f4);
                return;
            } else {
                m58457h(i, i2);
                return;
            }
        }
        m58459f(f, f2, f3, f4);
    }

    /* renamed from: h */
    public final void m58457h(int i, int i2) {
        float f = this.f32739k;
        float f2 = 0;
        this.f32744p = (i * f) + f2;
        this.f32745q = (i2 * f) + f2;
    }

    /* renamed from: i */
    public void m58456i(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f - centerX) / centerX2;
                fArr[1] = (f2 - centerY) / centerY2;
                return;
            }
            fArr[1] = (f - centerX) / centerX2;
            fArr[0] = (f2 - centerY) / centerY2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - centerY) / centerY2;
    }

    @Override // p000.AbstractC17794Ih0
    public boolean intersects(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        m58458g(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        if (Math.abs(f - this.f32744p) < 20.0f && Math.abs(f2 - this.f32745q) < 20.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m58455j(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f8;
        fArr[1] = f7;
    }

    /* renamed from: k */
    public void m58454k(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f / width;
                fArr[1] = f2 / height;
                return;
            }
            fArr[1] = f / width;
            fArr[0] = f2 / height;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f / width;
        strArr[1] = "percentY";
        fArr[1] = f2 / height;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        C3746a.m58452b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition));
    }

    @Override // p000.AbstractC17794Ih0
    public void positionAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f32743o;
        if (i != 1) {
            if (i != 2) {
                m58456i(rectF, rectF2, f, f2, strArr, fArr);
                return;
            } else {
                m58454k(view, rectF, rectF2, f, f2, strArr, fArr);
                return;
            }
        }
        m58455j(rectF, rectF2, f, f2, strArr, fArr);
    }

    public void setType(int i) {
        this.f32743o = i;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f32734f = obj.toString();
                return;
            case 1:
                this.f32737i = m58534c(obj);
                return;
            case 2:
                this.f32738j = m58534c(obj);
                return;
            case 3:
                this.f32736h = m58533d(obj);
                return;
            case 4:
                float m58534c = m58534c(obj);
                this.f32737i = m58534c;
                this.f32738j = m58534c;
                return;
            case 5:
                this.f32739k = m58534c(obj);
                return;
            case 6:
                this.f32740l = m58534c(obj);
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyPosition().copy(this);
    }
}
