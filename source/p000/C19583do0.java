package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* renamed from: do0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19583do0 {

    /* renamed from: u */
    public static final boolean f61294u;

    /* renamed from: v */
    public static final boolean f61295v;

    /* renamed from: a */
    public final MaterialButton f61296a;

    /* renamed from: b */
    public ShapeAppearanceModel f61297b;

    /* renamed from: c */
    public int f61298c;

    /* renamed from: d */
    public int f61299d;

    /* renamed from: e */
    public int f61300e;

    /* renamed from: f */
    public int f61301f;

    /* renamed from: g */
    public int f61302g;

    /* renamed from: h */
    public int f61303h;

    /* renamed from: i */
    public PorterDuff.Mode f61304i;

    /* renamed from: j */
    public ColorStateList f61305j;

    /* renamed from: k */
    public ColorStateList f61306k;

    /* renamed from: l */
    public ColorStateList f61307l;

    /* renamed from: m */
    public Drawable f61308m;

    /* renamed from: q */
    public boolean f61312q;

    /* renamed from: s */
    public LayerDrawable f61314s;

    /* renamed from: t */
    public int f61315t;

    /* renamed from: n */
    public boolean f61309n = false;

    /* renamed from: o */
    public boolean f61310o = false;

    /* renamed from: p */
    public boolean f61311p = false;

    /* renamed from: r */
    public boolean f61313r = true;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f61294u = true;
        if (i > 22) {
            z = false;
        }
        f61295v = z;
    }

    public C19583do0(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.f61296a = materialButton;
        this.f61297b = shapeAppearanceModel;
    }

    /* renamed from: A */
    public void m31729A(boolean z) {
        this.f61309n = z;
        m31719K();
    }

    /* renamed from: B */
    public void m31728B(ColorStateList colorStateList) {
        if (this.f61306k != colorStateList) {
            this.f61306k = colorStateList;
            m31719K();
        }
    }

    /* renamed from: C */
    public void m31727C(int i) {
        if (this.f61303h != i) {
            this.f61303h = i;
            m31719K();
        }
    }

    /* renamed from: D */
    public void m31726D(ColorStateList colorStateList) {
        if (this.f61305j != colorStateList) {
            this.f61305j = colorStateList;
            if (m31712f() != null) {
                DrawableCompat.setTintList(m31712f(), this.f61305j);
            }
        }
    }

    /* renamed from: E */
    public void m31725E(PorterDuff.Mode mode) {
        if (this.f61304i != mode) {
            this.f61304i = mode;
            if (m31712f() != null && this.f61304i != null) {
                DrawableCompat.setTintMode(m31712f(), this.f61304i);
            }
        }
    }

    /* renamed from: F */
    public void m31724F(boolean z) {
        this.f61313r = z;
    }

    /* renamed from: G */
    public final void m31723G(int i, int i2) {
        int paddingStart = ViewCompat.getPaddingStart(this.f61296a);
        int paddingTop = this.f61296a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f61296a);
        int paddingBottom = this.f61296a.getPaddingBottom();
        int i3 = this.f61300e;
        int i4 = this.f61301f;
        this.f61301f = i2;
        this.f61300e = i;
        if (!this.f61310o) {
            m31722H();
        }
        ViewCompat.setPaddingRelative(this.f61296a, paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: H */
    public final void m31722H() {
        this.f61296a.setInternalBackground(m31717a());
        MaterialShapeDrawable m31712f = m31712f();
        if (m31712f != null) {
            m31712f.setElevation(this.f61315t);
            m31712f.setState(this.f61296a.getDrawableState());
        }
    }

    /* renamed from: I */
    public final void m31721I(ShapeAppearanceModel shapeAppearanceModel) {
        if (f61295v && !this.f61310o) {
            int paddingStart = ViewCompat.getPaddingStart(this.f61296a);
            int paddingTop = this.f61296a.getPaddingTop();
            int paddingEnd = ViewCompat.getPaddingEnd(this.f61296a);
            int paddingBottom = this.f61296a.getPaddingBottom();
            m31722H();
            ViewCompat.setPaddingRelative(this.f61296a, paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (m31712f() != null) {
            m31712f().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (m31704n() != null) {
            m31704n().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (m31713e() != null) {
            m31713e().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: J */
    public void m31720J(int i, int i2) {
        Drawable drawable = this.f61308m;
        if (drawable != null) {
            drawable.setBounds(this.f61298c, this.f61300e, i2 - this.f61299d, i - this.f61301f);
        }
    }

    /* renamed from: K */
    public final void m31719K() {
        int i;
        MaterialShapeDrawable m31712f = m31712f();
        MaterialShapeDrawable m31704n = m31704n();
        if (m31712f != null) {
            m31712f.setStroke(this.f61303h, this.f61306k);
            if (m31704n != null) {
                float f = this.f61303h;
                if (this.f61309n) {
                    i = MaterialColors.getColor(this.f61296a, R.attr.colorSurface);
                } else {
                    i = 0;
                }
                m31704n.setStroke(f, i);
            }
        }
    }

    /* renamed from: L */
    public final InsetDrawable m31718L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f61298c, this.f61300e, this.f61299d, this.f61301f);
    }

    /* renamed from: a */
    public final Drawable m31717a() {
        int i;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f61297b);
        materialShapeDrawable.initializeElevationOverlay(this.f61296a.getContext());
        DrawableCompat.setTintList(materialShapeDrawable, this.f61305j);
        PorterDuff.Mode mode = this.f61304i;
        if (mode != null) {
            DrawableCompat.setTintMode(materialShapeDrawable, mode);
        }
        materialShapeDrawable.setStroke(this.f61303h, this.f61306k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f61297b);
        materialShapeDrawable2.setTint(0);
        float f = this.f61303h;
        if (this.f61309n) {
            i = MaterialColors.getColor(this.f61296a, R.attr.colorSurface);
        } else {
            i = 0;
        }
        materialShapeDrawable2.setStroke(f, i);
        if (f61294u) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f61297b);
            this.f61308m = materialShapeDrawable3;
            DrawableCompat.setTint(materialShapeDrawable3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f61307l), m31718L(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.f61308m);
            this.f61314s = rippleDrawable;
            return rippleDrawable;
        }
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f61297b);
        this.f61308m = rippleDrawableCompat;
        DrawableCompat.setTintList(rippleDrawableCompat, RippleUtils.sanitizeRippleDrawableColor(this.f61307l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.f61308m});
        this.f61314s = layerDrawable;
        return m31718L(layerDrawable);
    }

    /* renamed from: b */
    public int m31716b() {
        return this.f61302g;
    }

    /* renamed from: c */
    public int m31715c() {
        return this.f61301f;
    }

    /* renamed from: d */
    public int m31714d() {
        return this.f61300e;
    }

    /* renamed from: e */
    public Shapeable m31713e() {
        LayerDrawable layerDrawable = this.f61314s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f61314s.getNumberOfLayers() > 2) {
                return (Shapeable) this.f61314s.getDrawable(2);
            }
            return (Shapeable) this.f61314s.getDrawable(1);
        }
        return null;
    }

    /* renamed from: f */
    public MaterialShapeDrawable m31712f() {
        return m31711g(false);
    }

    /* renamed from: g */
    public final MaterialShapeDrawable m31711g(boolean z) {
        LayerDrawable layerDrawable = this.f61314s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f61294u) {
                return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f61314s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
            }
            return (MaterialShapeDrawable) this.f61314s.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    /* renamed from: h */
    public ColorStateList m31710h() {
        return this.f61307l;
    }

    /* renamed from: i */
    public ShapeAppearanceModel m31709i() {
        return this.f61297b;
    }

    /* renamed from: j */
    public ColorStateList m31708j() {
        return this.f61306k;
    }

    /* renamed from: k */
    public int m31707k() {
        return this.f61303h;
    }

    /* renamed from: l */
    public ColorStateList m31706l() {
        return this.f61305j;
    }

    /* renamed from: m */
    public PorterDuff.Mode m31705m() {
        return this.f61304i;
    }

    /* renamed from: n */
    public final MaterialShapeDrawable m31704n() {
        return m31711g(true);
    }

    /* renamed from: o */
    public boolean m31703o() {
        return this.f61310o;
    }

    /* renamed from: p */
    public boolean m31702p() {
        return this.f61312q;
    }

    /* renamed from: q */
    public boolean m31701q() {
        return this.f61313r;
    }

    /* renamed from: r */
    public void m31700r(TypedArray typedArray) {
        this.f61298c = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.f61299d = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.f61300e = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f61301f = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_cornerRadius, -1);
            this.f61302g = dimensionPixelSize;
            m31692z(this.f61297b.withCornerSize(dimensionPixelSize));
            this.f61311p = true;
        }
        this.f61303h = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.f61304i = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f61305j = MaterialResources.getColorStateList(this.f61296a.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.f61306k = MaterialResources.getColorStateList(this.f61296a.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.f61307l = MaterialResources.getColorStateList(this.f61296a.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.f61312q = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.f61315t = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.f61313r = typedArray.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = ViewCompat.getPaddingStart(this.f61296a);
        int paddingTop = this.f61296a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f61296a);
        int paddingBottom = this.f61296a.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            m31698t();
        } else {
            m31722H();
        }
        ViewCompat.setPaddingRelative(this.f61296a, paddingStart + this.f61298c, paddingTop + this.f61300e, paddingEnd + this.f61299d, paddingBottom + this.f61301f);
    }

    /* renamed from: s */
    public void m31699s(int i) {
        if (m31712f() != null) {
            m31712f().setTint(i);
        }
    }

    /* renamed from: t */
    public void m31698t() {
        this.f61310o = true;
        this.f61296a.setSupportBackgroundTintList(this.f61305j);
        this.f61296a.setSupportBackgroundTintMode(this.f61304i);
    }

    /* renamed from: u */
    public void m31697u(boolean z) {
        this.f61312q = z;
    }

    /* renamed from: v */
    public void m31696v(int i) {
        if (!this.f61311p || this.f61302g != i) {
            this.f61302g = i;
            this.f61311p = true;
            m31692z(this.f61297b.withCornerSize(i));
        }
    }

    /* renamed from: w */
    public void m31695w(int i) {
        m31723G(this.f61300e, i);
    }

    /* renamed from: x */
    public void m31694x(int i) {
        m31723G(i, this.f61301f);
    }

    /* renamed from: y */
    public void m31693y(ColorStateList colorStateList) {
        if (this.f61307l != colorStateList) {
            this.f61307l = colorStateList;
            boolean z = f61294u;
            if (z && (this.f61296a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f61296a.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            } else if (!z && (this.f61296a.getBackground() instanceof RippleDrawableCompat)) {
                ((RippleDrawableCompat) this.f61296a.getBackground()).setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    /* renamed from: z */
    public void m31692z(ShapeAppearanceModel shapeAppearanceModel) {
        this.f61297b = shapeAppearanceModel;
        m31721I(shapeAppearanceModel);
    }
}
