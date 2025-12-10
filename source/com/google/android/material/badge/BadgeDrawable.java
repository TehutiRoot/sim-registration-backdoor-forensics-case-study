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
import androidx.annotation.InterfaceC2055Px;
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
    public static final int f49045n = R.style.Widget_MaterialComponents_Badge;

    /* renamed from: o */
    public static final int f49046o = R.attr.badgeStyle;

    /* renamed from: a */
    public final WeakReference f49047a;

    /* renamed from: b */
    public final MaterialShapeDrawable f49048b;

    /* renamed from: c */
    public final TextDrawableHelper f49049c;

    /* renamed from: d */
    public final Rect f49050d;

    /* renamed from: e */
    public final BadgeState f49051e;

    /* renamed from: f */
    public float f49052f;

    /* renamed from: g */
    public float f49053g;

    /* renamed from: h */
    public int f49054h;

    /* renamed from: i */
    public float f49055i;

    /* renamed from: j */
    public float f49056j;

    /* renamed from: k */
    public float f49057k;

    /* renamed from: l */
    public WeakReference f49058l;

    /* renamed from: m */
    public WeakReference f49059m;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BadgeGravity {
    }

    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    /* loaded from: classes4.dex */
    public class RunnableC6808a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f49060a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f49061b;

        public RunnableC6808a(View view, FrameLayout frameLayout) {
            this.f49060a = view;
            this.f49061b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.updateBadgeCoordinates(this.f49060a, this.f49061b);
        }
    }

    public BadgeDrawable(Context context, int i, int i2, int i3, BadgeState.State state) {
        int m45825i;
        int m45826h;
        this.f49047a = new WeakReference(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.f49050d = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f49049c = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i, i2, i3, state);
        this.f49051e = badgeState;
        if (badgeState.m45809y()) {
            m45825i = badgeState.m45822l();
        } else {
            m45825i = badgeState.m45825i();
        }
        if (badgeState.m45809y()) {
            m45826h = badgeState.m45823k();
        } else {
            m45826h = badgeState.m45826h();
        }
        this.f49048b = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, m45825i, m45826h).build());
        m45863q();
    }

    /* renamed from: b */
    public static BadgeDrawable m45878b(Context context, BadgeState.State state) {
        return new BadgeDrawable(context, 0, f49046o, f49045n, state);
    }

    /* renamed from: c */
    private void m45877c(Canvas canvas) {
        Rect rect = new Rect();
        String m45876d = m45876d();
        this.f49049c.getTextPaint().getTextBounds(m45876d, 0, m45876d.length(), rect);
        canvas.drawText(m45876d, this.f49052f, this.f49053g + (rect.height() / 2), this.f49049c.getTextPaint());
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return new BadgeDrawable(context, 0, f49046o, f49045n, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        return new BadgeDrawable(context, i, f49046o, f49045n, null);
    }

    /* renamed from: u */
    public static void m45859u(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: a */
    public final void m45879a(Rect rect, View view) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!hasNumber()) {
            f = this.f49051e.f49065c;
        } else {
            f = this.f49051e.f49066d;
        }
        this.f49055i = f;
        if (f != -1.0f) {
            this.f49057k = f;
            this.f49056j = f;
        } else {
            if (!hasNumber()) {
                f2 = this.f49051e.f49068f;
            } else {
                f2 = this.f49051e.f49070h;
            }
            this.f49057k = Math.round(f2 / 2.0f);
            if (!hasNumber()) {
                f3 = this.f49051e.f49067e;
            } else {
                f3 = this.f49051e.f49069g;
            }
            this.f49056j = Math.round(f3 / 2.0f);
        }
        if (getNumber() > 9) {
            this.f49056j = Math.max(this.f49056j, (this.f49049c.getTextWidth(m45876d()) / 2.0f) + this.f49051e.f49071i);
        }
        int m45873g = m45873g();
        int m45827g = this.f49051e.m45827g();
        if (m45827g != 8388691 && m45827g != 8388693) {
            this.f49053g = rect.top + m45873g;
        } else {
            this.f49053g = rect.bottom - m45873g;
        }
        int m45874f = m45874f();
        int m45827g2 = this.f49051e.m45827g();
        if (m45827g2 != 8388659 && m45827g2 != 8388691) {
            if (ViewCompat.getLayoutDirection(view) == 0) {
                f5 = (rect.right + this.f49056j) - m45874f;
            } else {
                f5 = (rect.left - this.f49056j) + m45874f;
            }
            this.f49052f = f5;
            return;
        }
        if (ViewCompat.getLayoutDirection(view) == 0) {
            f4 = (rect.left - this.f49056j) + m45874f;
        } else {
            f4 = (rect.right + this.f49056j) - m45874f;
        }
        this.f49052f = f4;
    }

    public void clearNumber() {
        if (hasNumber()) {
            this.f49051e.m45833a();
            m45865o();
        }
    }

    /* renamed from: d */
    public final String m45876d() {
        if (getNumber() <= this.f49054h) {
            return NumberFormat.getInstance(this.f49051e.m45814t()).format(getNumber());
        }
        Context context = (Context) this.f49047a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f49051e.m45814t(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f49054h), Marker.ANY_NON_NULL_MARKER);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f49048b.draw(canvas);
            if (hasNumber()) {
                m45877c(canvas);
            }
        }
    }

    /* renamed from: e */
    public BadgeState.State m45875e() {
        return this.f49051e.m45813u();
    }

    /* renamed from: f */
    public final int m45874f() {
        int m45817q;
        int i;
        if (hasNumber()) {
            m45817q = this.f49051e.m45818p();
        } else {
            m45817q = this.f49051e.m45817q();
        }
        if (this.f49051e.f49074l == 1) {
            if (hasNumber()) {
                i = this.f49051e.f49073k;
            } else {
                i = this.f49051e.f49072j;
            }
            m45817q += i;
        }
        return m45817q + this.f49051e.m45831c();
    }

    /* renamed from: g */
    public final int m45873g() {
        int m45810x;
        if (hasNumber()) {
            m45810x = this.f49051e.m45811w();
        } else {
            m45810x = this.f49051e.m45810x();
        }
        if (this.f49051e.f49074l == 0) {
            m45810x -= Math.round(this.f49057k);
        }
        return m45810x + this.f49051e.m45830d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49051e.m45829e();
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.f49048b.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.f49051e.m45827g();
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.f49051e.m45814t();
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.f49049c.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (hasNumber()) {
            if (this.f49051e.m45819o() == 0 || (context = (Context) this.f49047a.get()) == null) {
                return null;
            }
            if (getNumber() <= this.f49054h) {
                return context.getResources().getQuantityString(this.f49051e.m45819o(), getNumber(), Integer.valueOf(getNumber()));
            }
            return context.getString(this.f49051e.m45821m(), Integer.valueOf(this.f49054h));
        }
        return this.f49051e.m45820n();
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference weakReference = this.f49059m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.f49051e.m45817q();
    }

    @InterfaceC2055Px
    public int getHorizontalOffsetWithText() {
        return this.f49051e.m45818p();
    }

    @InterfaceC2055Px
    public int getHorizontalOffsetWithoutText() {
        return this.f49051e.m45817q();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f49050d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f49050d.width();
    }

    public int getMaxCharacterCount() {
        return this.f49051e.m45816r();
    }

    public int getNumber() {
        if (hasNumber()) {
            return this.f49051e.m45815s();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int getVerticalOffset() {
        return this.f49051e.m45810x();
    }

    @InterfaceC2055Px
    public int getVerticalOffsetWithText() {
        return this.f49051e.m45811w();
    }

    @InterfaceC2055Px
    public int getVerticalOffsetWithoutText() {
        return this.f49051e.m45810x();
    }

    /* renamed from: h */
    public final void m45872h() {
        this.f49049c.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    public boolean hasNumber() {
        return this.f49051e.m45809y();
    }

    /* renamed from: i */
    public final void m45871i() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f49051e.m45828f());
        if (this.f49048b.getFillColor() != valueOf) {
            this.f49048b.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public final void m45870j() {
        FrameLayout frameLayout;
        WeakReference weakReference = this.f49058l;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.f49058l.get();
            WeakReference weakReference2 = this.f49059m;
            if (weakReference2 != null) {
                frameLayout = (FrameLayout) weakReference2.get();
            } else {
                frameLayout = null;
            }
            updateBadgeCoordinates(view, frameLayout);
        }
    }

    /* renamed from: k */
    public final void m45869k() {
        int m45825i;
        int m45826h;
        Context context = (Context) this.f49047a.get();
        if (context == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f49048b;
        if (this.f49051e.m45809y()) {
            m45825i = this.f49051e.m45822l();
        } else {
            m45825i = this.f49051e.m45825i();
        }
        if (this.f49051e.m45809y()) {
            m45826h = this.f49051e.m45823k();
        } else {
            m45826h = this.f49051e.m45826h();
        }
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, m45825i, m45826h).build());
        invalidateSelf();
    }

    /* renamed from: l */
    public final void m45868l() {
        TextAppearance textAppearance;
        Context context = (Context) this.f49047a.get();
        if (context == null || this.f49049c.getTextAppearance() == (textAppearance = new TextAppearance(context, this.f49051e.m45812v()))) {
            return;
        }
        this.f49049c.setTextAppearance(textAppearance, context);
        m45867m();
        m45858v();
        invalidateSelf();
    }

    /* renamed from: m */
    public final void m45867m() {
        this.f49049c.getTextPaint().setColor(this.f49051e.m45824j());
        invalidateSelf();
    }

    /* renamed from: n */
    public final void m45866n() {
        m45857w();
        this.f49049c.setTextWidthDirty(true);
        m45858v();
        invalidateSelf();
    }

    /* renamed from: o */
    public final void m45865o() {
        this.f49049c.setTextWidthDirty(true);
        m45869k();
        m45858v();
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
    public final void m45864p() {
        boolean m45808z = this.f49051e.m45808z();
        setVisible(m45808z, false);
        if (BadgeUtils.USE_COMPAT_PARENT && getCustomBadgeParent() != null && !m45808z) {
            ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
        }
    }

    /* renamed from: q */
    public final void m45863q() {
        m45869k();
        m45868l();
        m45866n();
        m45865o();
        m45872h();
        m45871i();
        m45867m();
        m45870j();
        m45858v();
        m45864p();
    }

    /* renamed from: r */
    public void m45862r(int i) {
        this.f49051e.m45855B(i);
        m45858v();
    }

    /* renamed from: s */
    public void m45861s(int i) {
        this.f49051e.m45854C(i);
        m45858v();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f49051e.m45853D(i);
        m45872h();
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.f49051e.m45852E(i);
        m45871i();
    }

    public void setBadgeGravity(int i) {
        if (this.f49051e.m45827g() != i) {
            this.f49051e.m45851F(i);
            m45870j();
        }
    }

    public void setBadgeNumberLocale(@NonNull Locale locale) {
        if (!locale.equals(this.f49051e.m45814t())) {
            this.f49051e.m45838S(locale);
            invalidateSelf();
        }
    }

    public void setBadgeTextColor(@ColorInt int i) {
        if (this.f49049c.getTextPaint().getColor() != i) {
            this.f49051e.m45848I(i);
            m45867m();
        }
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int i) {
        this.f49051e.m45846K(i);
        m45869k();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int i) {
        this.f49051e.m45847J(i);
        m45869k();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int i) {
        this.f49051e.m45849H(i);
        m45869k();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int i) {
        this.f49051e.m45850G(i);
        m45869k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i) {
        this.f49051e.m45845L(i);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.f49051e.m45844M(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i) {
        this.f49051e.m45843N(i);
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public void setHorizontalOffsetWithText(@InterfaceC2055Px int i) {
        this.f49051e.m45842O(i);
        m45858v();
    }

    public void setHorizontalOffsetWithoutText(@InterfaceC2055Px int i) {
        this.f49051e.m45841P(i);
        m45858v();
    }

    public void setMaxCharacterCount(int i) {
        if (this.f49051e.m45816r() != i) {
            this.f49051e.m45840Q(i);
            m45866n();
        }
    }

    public void setNumber(int i) {
        int max = Math.max(0, i);
        if (this.f49051e.m45815s() != max) {
            this.f49051e.m45839R(max);
            m45865o();
        }
    }

    public void setTextAppearance(@StyleRes int i) {
        this.f49051e.m45837T(i);
        m45868l();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public void setVerticalOffsetWithText(@InterfaceC2055Px int i) {
        this.f49051e.m45836U(i);
        m45858v();
    }

    public void setVerticalOffsetWithoutText(@InterfaceC2055Px int i) {
        this.f49051e.m45835V(i);
        m45858v();
    }

    public void setVisible(boolean z) {
        this.f49051e.m45834W(z);
        m45864p();
    }

    /* renamed from: t */
    public final void m45860t(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference weakReference = this.f49059m;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            m45859u(view);
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
            this.f49059m = new WeakReference(frameLayout);
            frameLayout.post(new RunnableC6808a(view, frameLayout));
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
    public final void m45858v() {
        View view;
        Context context = (Context) this.f49047a.get();
        WeakReference weakReference = this.f49058l;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f49050d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.f49059m;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || BadgeUtils.USE_COMPAT_PARENT) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m45879a(rect2, view);
            BadgeUtils.updateBadgeBounds(this.f49050d, this.f49052f, this.f49053g, this.f49056j, this.f49057k);
            float f = this.f49055i;
            if (f != -1.0f) {
                this.f49048b.setCornerSize(f);
            }
            if (!rect.equals(this.f49050d)) {
                this.f49048b.setBounds(this.f49050d);
            }
        }
    }

    /* renamed from: w */
    public final void m45857w() {
        this.f49054h = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f49058l = new WeakReference(view);
        boolean z = BadgeUtils.USE_COMPAT_PARENT;
        if (z && frameLayout == null) {
            m45860t(view);
        } else {
            this.f49059m = new WeakReference(frameLayout);
        }
        if (!z) {
            m45859u(view);
        }
        m45858v();
        invalidateSelf();
    }
}
