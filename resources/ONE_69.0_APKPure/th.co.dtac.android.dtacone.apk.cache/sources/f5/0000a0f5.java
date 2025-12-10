package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    /* renamed from: n */
    public static final int f49057n = R.style.Widget_MaterialComponents_Badge;

    /* renamed from: o */
    public static final int f49058o = R.attr.badgeStyle;

    /* renamed from: a */
    public final WeakReference f49059a;

    /* renamed from: b */
    public final MaterialShapeDrawable f49060b;

    /* renamed from: c */
    public final TextDrawableHelper f49061c;

    /* renamed from: d */
    public final Rect f49062d;

    /* renamed from: e */
    public final BadgeState f49063e;

    /* renamed from: f */
    public float f49064f;

    /* renamed from: g */
    public float f49065g;

    /* renamed from: h */
    public int f49066h;

    /* renamed from: i */
    public float f49067i;

    /* renamed from: j */
    public float f49068j;

    /* renamed from: k */
    public float f49069k;

    /* renamed from: l */
    public WeakReference f49070l;

    /* renamed from: m */
    public WeakReference f49071m;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BadgeGravity {
    }

    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    /* loaded from: classes4.dex */
    public class RunnableC6797a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f49072a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f49073b;

        public RunnableC6797a(View view, FrameLayout frameLayout) {
            this.f49072a = view;
            this.f49073b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.updateBadgeCoordinates(this.f49072a, this.f49073b);
        }
    }

    public BadgeDrawable(Context context, int i, int i2, int i3, BadgeState.State state) {
        int m45801i;
        int m45802h;
        this.f49059a = new WeakReference(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.f49062d = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f49061c = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i, i2, i3, state);
        this.f49063e = badgeState;
        if (badgeState.m45785y()) {
            m45801i = badgeState.m45798l();
        } else {
            m45801i = badgeState.m45801i();
        }
        if (badgeState.m45785y()) {
            m45802h = badgeState.m45799k();
        } else {
            m45802h = badgeState.m45802h();
        }
        this.f49060b = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, m45801i, m45802h).build());
        m45839q();
    }

    /* renamed from: b */
    public static BadgeDrawable m45854b(Context context, BadgeState.State state) {
        return new BadgeDrawable(context, 0, f49058o, f49057n, state);
    }

    /* renamed from: c */
    private void m45853c(Canvas canvas) {
        Rect rect = new Rect();
        String m45852d = m45852d();
        this.f49061c.getTextPaint().getTextBounds(m45852d, 0, m45852d.length(), rect);
        canvas.drawText(m45852d, this.f49064f, this.f49065g + (rect.height() / 2), this.f49061c.getTextPaint());
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return new BadgeDrawable(context, 0, f49058o, f49057n, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        return new BadgeDrawable(context, i, f49058o, f49057n, null);
    }

    /* renamed from: u */
    public static void m45835u(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: a */
    public final void m45855a(Rect rect, View view) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!hasNumber()) {
            f = this.f49063e.f49077c;
        } else {
            f = this.f49063e.f49078d;
        }
        this.f49067i = f;
        if (f != -1.0f) {
            this.f49069k = f;
            this.f49068j = f;
        } else {
            if (!hasNumber()) {
                f2 = this.f49063e.f49080f;
            } else {
                f2 = this.f49063e.f49082h;
            }
            this.f49069k = Math.round(f2 / 2.0f);
            if (!hasNumber()) {
                f3 = this.f49063e.f49079e;
            } else {
                f3 = this.f49063e.f49081g;
            }
            this.f49068j = Math.round(f3 / 2.0f);
        }
        if (getNumber() > 9) {
            this.f49068j = Math.max(this.f49068j, (this.f49061c.getTextWidth(m45852d()) / 2.0f) + this.f49063e.f49083i);
        }
        int m45849g = m45849g();
        int m45803g = this.f49063e.m45803g();
        if (m45803g != 8388691 && m45803g != 8388693) {
            this.f49065g = rect.top + m45849g;
        } else {
            this.f49065g = rect.bottom - m45849g;
        }
        int m45850f = m45850f();
        int m45803g2 = this.f49063e.m45803g();
        if (m45803g2 != 8388659 && m45803g2 != 8388691) {
            if (ViewCompat.getLayoutDirection(view) == 0) {
                f5 = (rect.right + this.f49068j) - m45850f;
            } else {
                f5 = (rect.left - this.f49068j) + m45850f;
            }
            this.f49064f = f5;
            return;
        }
        if (ViewCompat.getLayoutDirection(view) == 0) {
            f4 = (rect.left - this.f49068j) + m45850f;
        } else {
            f4 = (rect.right + this.f49068j) - m45850f;
        }
        this.f49064f = f4;
    }

    public void clearNumber() {
        if (hasNumber()) {
            this.f49063e.m45809a();
            m45841o();
        }
    }

    /* renamed from: d */
    public final String m45852d() {
        if (getNumber() <= this.f49066h) {
            return NumberFormat.getInstance(this.f49063e.m45790t()).format(getNumber());
        }
        Context context = (Context) this.f49059a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f49063e.m45790t(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f49066h), Marker.ANY_NON_NULL_MARKER);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f49060b.draw(canvas);
            if (hasNumber()) {
                m45853c(canvas);
            }
        }
    }

    /* renamed from: e */
    public BadgeState.State m45851e() {
        return this.f49063e.m45789u();
    }

    /* renamed from: f */
    public final int m45850f() {
        int m45793q;
        int i;
        if (hasNumber()) {
            m45793q = this.f49063e.m45794p();
        } else {
            m45793q = this.f49063e.m45793q();
        }
        if (this.f49063e.f49086l == 1) {
            if (hasNumber()) {
                i = this.f49063e.f49085k;
            } else {
                i = this.f49063e.f49084j;
            }
            m45793q += i;
        }
        return m45793q + this.f49063e.m45807c();
    }

    /* renamed from: g */
    public final int m45849g() {
        int m45786x;
        if (hasNumber()) {
            m45786x = this.f49063e.m45787w();
        } else {
            m45786x = this.f49063e.m45786x();
        }
        if (this.f49063e.f49086l == 0) {
            m45786x -= Math.round(this.f49069k);
        }
        return m45786x + this.f49063e.m45806d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49063e.m45805e();
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.f49060b.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.f49063e.m45803g();
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.f49063e.m45790t();
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.f49061c.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (hasNumber()) {
            if (this.f49063e.m45795o() == 0 || (context = (Context) this.f49059a.get()) == null) {
                return null;
            }
            if (getNumber() <= this.f49066h) {
                return context.getResources().getQuantityString(this.f49063e.m45795o(), getNumber(), Integer.valueOf(getNumber()));
            }
            return context.getString(this.f49063e.m45797m(), Integer.valueOf(this.f49066h));
        }
        return this.f49063e.m45796n();
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference weakReference = this.f49071m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.f49063e.m45793q();
    }

    @InterfaceC2037Px
    public int getHorizontalOffsetWithText() {
        return this.f49063e.m45794p();
    }

    @InterfaceC2037Px
    public int getHorizontalOffsetWithoutText() {
        return this.f49063e.m45793q();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f49062d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f49062d.width();
    }

    public int getMaxCharacterCount() {
        return this.f49063e.m45792r();
    }

    public int getNumber() {
        if (hasNumber()) {
            return this.f49063e.m45791s();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int getVerticalOffset() {
        return this.f49063e.m45786x();
    }

    @InterfaceC2037Px
    public int getVerticalOffsetWithText() {
        return this.f49063e.m45787w();
    }

    @InterfaceC2037Px
    public int getVerticalOffsetWithoutText() {
        return this.f49063e.m45786x();
    }

    /* renamed from: h */
    public final void m45848h() {
        this.f49061c.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    public boolean hasNumber() {
        return this.f49063e.m45785y();
    }

    /* renamed from: i */
    public final void m45847i() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f49063e.m45804f());
        if (this.f49060b.getFillColor() != valueOf) {
            this.f49060b.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public final void m45846j() {
        FrameLayout frameLayout;
        WeakReference weakReference = this.f49070l;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.f49070l.get();
            WeakReference weakReference2 = this.f49071m;
            if (weakReference2 != null) {
                frameLayout = (FrameLayout) weakReference2.get();
            } else {
                frameLayout = null;
            }
            updateBadgeCoordinates(view, frameLayout);
        }
    }

    /* renamed from: k */
    public final void m45845k() {
        int m45801i;
        int m45802h;
        Context context = (Context) this.f49059a.get();
        if (context == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f49060b;
        if (this.f49063e.m45785y()) {
            m45801i = this.f49063e.m45798l();
        } else {
            m45801i = this.f49063e.m45801i();
        }
        if (this.f49063e.m45785y()) {
            m45802h = this.f49063e.m45799k();
        } else {
            m45802h = this.f49063e.m45802h();
        }
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, m45801i, m45802h).build());
        invalidateSelf();
    }

    /* renamed from: l */
    public final void m45844l() {
        TextAppearance textAppearance;
        Context context = (Context) this.f49059a.get();
        if (context == null || this.f49061c.getTextAppearance() == (textAppearance = new TextAppearance(context, this.f49063e.m45788v()))) {
            return;
        }
        this.f49061c.setTextAppearance(textAppearance, context);
        m45843m();
        m45834v();
        invalidateSelf();
    }

    /* renamed from: m */
    public final void m45843m() {
        this.f49061c.getTextPaint().setColor(this.f49063e.m45800j());
        invalidateSelf();
    }

    /* renamed from: n */
    public final void m45842n() {
        m45833w();
        this.f49061c.setTextWidthDirty(true);
        m45834v();
        invalidateSelf();
    }

    /* renamed from: o */
    public final void m45841o() {
        this.f49061c.setTextWidthDirty(true);
        m45845k();
        m45834v();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    /* renamed from: p */
    public final void m45840p() {
        boolean m45784z = this.f49063e.m45784z();
        setVisible(m45784z, false);
        if (BadgeUtils.USE_COMPAT_PARENT && getCustomBadgeParent() != null && !m45784z) {
            ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
        }
    }

    /* renamed from: q */
    public final void m45839q() {
        m45845k();
        m45844l();
        m45842n();
        m45841o();
        m45848h();
        m45847i();
        m45843m();
        m45846j();
        m45834v();
        m45840p();
    }

    /* renamed from: r */
    public void m45838r(int i) {
        this.f49063e.m45831B(i);
        m45834v();
    }

    /* renamed from: s */
    public void m45837s(int i) {
        this.f49063e.m45830C(i);
        m45834v();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f49063e.m45829D(i);
        m45848h();
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.f49063e.m45828E(i);
        m45847i();
    }

    public void setBadgeGravity(int i) {
        if (this.f49063e.m45803g() != i) {
            this.f49063e.m45827F(i);
            m45846j();
        }
    }

    public void setBadgeNumberLocale(@NonNull Locale locale) {
        if (!locale.equals(this.f49063e.m45790t())) {
            this.f49063e.m45814S(locale);
            invalidateSelf();
        }
    }

    public void setBadgeTextColor(@ColorInt int i) {
        if (this.f49061c.getTextPaint().getColor() != i) {
            this.f49063e.m45824I(i);
            m45843m();
        }
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int i) {
        this.f49063e.m45822K(i);
        m45845k();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int i) {
        this.f49063e.m45823J(i);
        m45845k();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int i) {
        this.f49063e.m45825H(i);
        m45845k();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int i) {
        this.f49063e.m45826G(i);
        m45845k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i) {
        this.f49063e.m45821L(i);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.f49063e.m45820M(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i) {
        this.f49063e.m45819N(i);
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public void setHorizontalOffsetWithText(@InterfaceC2037Px int i) {
        this.f49063e.m45818O(i);
        m45834v();
    }

    public void setHorizontalOffsetWithoutText(@InterfaceC2037Px int i) {
        this.f49063e.m45817P(i);
        m45834v();
    }

    public void setMaxCharacterCount(int i) {
        if (this.f49063e.m45792r() != i) {
            this.f49063e.m45816Q(i);
            m45842n();
        }
    }

    public void setNumber(int i) {
        int max = Math.max(0, i);
        if (this.f49063e.m45791s() != max) {
            this.f49063e.m45815R(max);
            m45841o();
        }
    }

    public void setTextAppearance(@StyleRes int i) {
        this.f49063e.m45813T(i);
        m45844l();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public void setVerticalOffsetWithText(@InterfaceC2037Px int i) {
        this.f49063e.m45812U(i);
        m45834v();
    }

    public void setVerticalOffsetWithoutText(@InterfaceC2037Px int i) {
        this.f49063e.m45811V(i);
        m45834v();
    }

    public void setVisible(boolean z) {
        this.f49063e.m45810W(z);
        m45840p();
    }

    /* renamed from: t */
    public final void m45836t(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference weakReference = this.f49071m;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            m45835u(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(R.id.mtrl_anchor_parent);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f49071m = new WeakReference(frameLayout);
            frameLayout.post(new RunnableC6797a(view, frameLayout));
        }
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    /* renamed from: v */
    public final void m45834v() {
        View view;
        Context context = (Context) this.f49059a.get();
        WeakReference weakReference = this.f49070l;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f49062d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.f49071m;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || BadgeUtils.USE_COMPAT_PARENT) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m45855a(rect2, view);
            BadgeUtils.updateBadgeBounds(this.f49062d, this.f49064f, this.f49065g, this.f49068j, this.f49069k);
            float f = this.f49067i;
            if (f != -1.0f) {
                this.f49060b.setCornerSize(f);
            }
            if (!rect.equals(this.f49062d)) {
                this.f49060b.setBounds(this.f49062d);
            }
        }
    }

    /* renamed from: w */
    public final void m45833w() {
        this.f49066h = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f49070l = new WeakReference(view);
        boolean z = BadgeUtils.USE_COMPAT_PARENT;
        if (z && frameLayout == null) {
            m45836t(view);
        } else {
            this.f49071m = new WeakReference(frameLayout);
        }
        if (!z) {
            m45835u(view);
        }
        m45834v();
        invalidateSelf();
    }
}