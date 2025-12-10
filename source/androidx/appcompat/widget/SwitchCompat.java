package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.apache.http.message.TokenParser;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {

    /* renamed from: S */
    public static final Property f9884S = new C2247a(Float.class, "thumbPos");

    /* renamed from: T */
    public static final int[] f9885T = {16842912};

    /* renamed from: A */
    public int f9886A;

    /* renamed from: B */
    public int f9887B;

    /* renamed from: C */
    public int f9888C;

    /* renamed from: D */
    public int f9889D;

    /* renamed from: E */
    public int f9890E;

    /* renamed from: F */
    public int f9891F;

    /* renamed from: G */
    public int f9892G;

    /* renamed from: H */
    public boolean f9893H;

    /* renamed from: I */
    public final TextPaint f9894I;

    /* renamed from: J */
    public ColorStateList f9895J;

    /* renamed from: K */
    public Layout f9896K;

    /* renamed from: L */
    public Layout f9897L;

    /* renamed from: M */
    public TransformationMethod f9898M;

    /* renamed from: N */
    public ObjectAnimator f9899N;

    /* renamed from: O */
    public final C1432U5 f9900O;

    /* renamed from: P */
    public C0782L5 f9901P;

    /* renamed from: Q */
    public C2249c f9902Q;

    /* renamed from: R */
    public final Rect f9903R;

    /* renamed from: a */
    public Drawable f9904a;

    /* renamed from: b */
    public ColorStateList f9905b;

    /* renamed from: c */
    public PorterDuff.Mode f9906c;

    /* renamed from: d */
    public boolean f9907d;

    /* renamed from: e */
    public boolean f9908e;

    /* renamed from: f */
    public Drawable f9909f;

    /* renamed from: g */
    public ColorStateList f9910g;

    /* renamed from: h */
    public PorterDuff.Mode f9911h;

    /* renamed from: i */
    public boolean f9912i;

    /* renamed from: j */
    public boolean f9913j;

    /* renamed from: k */
    public int f9914k;

    /* renamed from: l */
    public int f9915l;

    /* renamed from: m */
    public int f9916m;

    /* renamed from: n */
    public boolean f9917n;

    /* renamed from: o */
    public CharSequence f9918o;

    /* renamed from: p */
    public CharSequence f9919p;

    /* renamed from: q */
    public CharSequence f9920q;

    /* renamed from: r */
    public CharSequence f9921r;

    /* renamed from: s */
    public boolean f9922s;

    /* renamed from: t */
    public int f9923t;

    /* renamed from: u */
    public int f9924u;

    /* renamed from: v */
    public float f9925v;

    /* renamed from: w */
    public float f9926w;

    /* renamed from: x */
    public VelocityTracker f9927x;

    /* renamed from: y */
    public int f9928y;

    /* renamed from: z */
    public float f9929z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    public class C2247a extends Property {
        public C2247a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f9929z);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    /* loaded from: classes.dex */
    public static class C2248b {
        @DoNotInline
        /* renamed from: a */
        public static void m64157a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    /* loaded from: classes.dex */
    public static class C2249c extends EmojiCompat.InitCallback {

        /* renamed from: a */
        public final Reference f9930a;

        public C2249c(SwitchCompat switchCompat) {
            this.f9930a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onFailed(Throwable th2) {
            SwitchCompat switchCompat = (SwitchCompat) this.f9930a.get();
            if (switchCompat != null) {
                switchCompat.m64165j();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            SwitchCompat switchCompat = (SwitchCompat) this.f9930a.get();
            if (switchCompat != null) {
                switchCompat.m64165j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static float m64169f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @NonNull
    private C0782L5 getEmojiTextViewHelper() {
        if (this.f9901P == null) {
            this.f9901P = new C0782L5(this);
        }
        return this.f9901P;
    }

    private boolean getTargetCheckedState() {
        if (this.f9929z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (ViewUtils.isLayoutRtl(this)) {
            f = 1.0f - this.f9929z;
        } else {
            f = this.f9929z;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f9909f;
        if (drawable != null) {
            Rect rect2 = this.f9903R;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f9904a;
            if (drawable2 != null) {
                rect = DrawableUtils.getOpticalBounds(drawable2);
            } else {
                rect = DrawableUtils.INSETS_NONE;
            }
            return ((((this.f9886A - this.f9888C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f9920q = charSequence;
        this.f9921r = m64168g(charSequence);
        this.f9897L = null;
        if (this.f9922s) {
            m64161n();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f9918o = charSequence;
        this.f9919p = m64168g(charSequence);
        this.f9896K = null;
        if (this.f9922s) {
            m64161n();
        }
    }

    /* renamed from: a */
    public final void m64174a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f9884S, f);
        this.f9899N = ofFloat;
        ofFloat.setDuration(250L);
        C2248b.m64157a(this.f9899N, true);
        this.f9899N.start();
    }

    /* renamed from: b */
    public final void m64173b() {
        Drawable drawable = this.f9904a;
        if (drawable != null) {
            if (this.f9907d || this.f9908e) {
                Drawable mutate = DrawableCompat.wrap(drawable).mutate();
                this.f9904a = mutate;
                if (this.f9907d) {
                    DrawableCompat.setTintList(mutate, this.f9905b);
                }
                if (this.f9908e) {
                    DrawableCompat.setTintMode(this.f9904a, this.f9906c);
                }
                if (this.f9904a.isStateful()) {
                    this.f9904a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m64172c() {
        Drawable drawable = this.f9909f;
        if (drawable != null) {
            if (this.f9912i || this.f9913j) {
                Drawable mutate = DrawableCompat.wrap(drawable).mutate();
                this.f9909f = mutate;
                if (this.f9912i) {
                    DrawableCompat.setTintList(mutate, this.f9910g);
                }
                if (this.f9913j) {
                    DrawableCompat.setTintMode(this.f9909f, this.f9911h);
                }
                if (this.f9909f.isStateful()) {
                    this.f9909f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m64171d() {
        ObjectAnimator objectAnimator = this.f9899N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f9903R;
        int i3 = this.f9889D;
        int i4 = this.f9890E;
        int i5 = this.f9891F;
        int i6 = this.f9892G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f9904a;
        if (drawable != null) {
            rect = DrawableUtils.getOpticalBounds(drawable);
        } else {
            rect = DrawableUtils.INSETS_NONE;
        }
        Drawable drawable2 = this.f9909f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f9909f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f9909f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f9904a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f9888C + rect2.right;
            this.f9904a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f9904a;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f, f2);
        }
        Drawable drawable2 = this.f9909f;
        if (drawable2 != null) {
            DrawableCompat.setHotspot(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9904a;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9909f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m64170e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final CharSequence m64168g(CharSequence charSequence) {
        TransformationMethod m67549f = getEmojiTextViewHelper().m67549f(this.f9898M);
        if (m67549f != null) {
            return m67549f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f9886A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f9916m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f9886A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f9916m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f9922s;
    }

    public boolean getSplitTrack() {
        return this.f9917n;
    }

    public int getSwitchMinWidth() {
        return this.f9915l;
    }

    public int getSwitchPadding() {
        return this.f9916m;
    }

    public CharSequence getTextOff() {
        return this.f9920q;
    }

    public CharSequence getTextOn() {
        return this.f9918o;
    }

    public Drawable getThumbDrawable() {
        return this.f9904a;
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public final float getThumbPosition() {
        return this.f9929z;
    }

    public int getThumbTextPadding() {
        return this.f9914k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f9905b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f9906c;
    }

    public Drawable getTrackDrawable() {
        return this.f9909f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f9910g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f9911h;
    }

    /* renamed from: h */
    public final boolean m64167h(float f, float f2) {
        if (this.f9904a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f9904a.getPadding(this.f9903R);
        int i = this.f9890E;
        int i2 = this.f9924u;
        int i3 = i - i2;
        int i4 = (this.f9889D + thumbOffset) - i2;
        Rect rect = this.f9903R;
        int i5 = this.f9888C + i4 + rect.left + rect.right + i2;
        int i6 = this.f9892G + i2;
        if (f <= i4 || f >= i5 || f2 <= i3 || f2 >= i6) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final Layout m64166i(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.f9894I;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m67553b();
    }

    /* renamed from: j */
    public void m64165j() {
        setTextOnInternal(this.f9918o);
        setTextOffInternal(this.f9920q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9904a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9909f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f9899N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f9899N.end();
            this.f9899N = null;
        }
    }

    /* renamed from: k */
    public final void m64164k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f9920q;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, charSequence);
        }
    }

    /* renamed from: l */
    public final void m64163l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f9918o;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_on);
            }
            ViewCompat.setStateDescription(this, charSequence);
        }
    }

    /* renamed from: m */
    public final void m64162m(int i, int i2) {
        Typeface typeface;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        setSwitchTypeface(typeface, i2);
    }

    /* renamed from: n */
    public final void m64161n() {
        if (this.f9902Q == null && this.f9901P.m67553b() && EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                C2249c c2249c = new C2249c(this);
                this.f9902Q = c2249c;
                emojiCompat.registerInitCallback(c2249c);
            }
        }
    }

    /* renamed from: o */
    public final void m64160o(MotionEvent motionEvent) {
        boolean z;
        this.f9923t = 0;
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f9927x.computeCurrentVelocity(1000);
            float xVelocity = this.f9927x.getXVelocity();
            if (Math.abs(xVelocity) > this.f9928y) {
                if (!ViewUtils.isLayoutRtl(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
            } else {
                z2 = getTargetCheckedState();
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        m64170e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9885T);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f9903R;
        Drawable drawable = this.f9909f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f9890E;
        int i2 = this.f9892G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f9904a;
        if (drawable != null) {
            if (this.f9917n && drawable2 != null) {
                Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f9896K;
        } else {
            layout = this.f9897L;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f9895J;
            if (colorStateList != null) {
                this.f9894I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f9894I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f9918o;
            } else {
                charSequence = this.f9920q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(TokenParser.f74560SP);
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f9904a != null) {
            Rect rect = this.f9903R;
            Drawable drawable = this.f9909f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.f9904a);
            i5 = Math.max(0, opticalBounds.left - rect.left);
            i9 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            i5 = 0;
        }
        if (ViewUtils.isLayoutRtl(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f9886A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f9886A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i7 = this.f9887B;
            } else {
                i8 = getHeight() - getPaddingBottom();
                paddingTop = i8 - this.f9887B;
                this.f9889D = i6;
                this.f9890E = paddingTop;
                this.f9892G = i8;
                this.f9891F = width;
            }
        } else {
            i7 = this.f9887B;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        }
        i8 = i7 + paddingTop;
        this.f9889D = i6;
        this.f9890E = paddingTop;
        this.f9892G = i8;
        this.f9891F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f9922s) {
            if (this.f9896K == null) {
                this.f9896K = m64166i(this.f9919p);
            }
            if (this.f9897L == null) {
                this.f9897L = m64166i(this.f9921r);
            }
        }
        Rect rect = this.f9903R;
        Drawable drawable = this.f9904a;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f9904a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f9904a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.f9922s) {
            i5 = Math.max(this.f9896K.getWidth(), this.f9897L.getWidth()) + (this.f9914k * 2);
        } else {
            i5 = 0;
        }
        this.f9888C = Math.max(i5, i3);
        Drawable drawable2 = this.f9909f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f9909f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f9904a;
        if (drawable3 != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable3);
            i8 = Math.max(i8, opticalBounds.left);
            i9 = Math.max(i9, opticalBounds.right);
        }
        if (this.f9893H) {
            i6 = Math.max(this.f9915l, (this.f9888C * 2) + i8 + i9);
        } else {
            i6 = this.f9915l;
        }
        int max = Math.max(i7, i4);
        this.f9886A = i6;
        this.f9887B = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f9918o;
        } else {
            charSequence = this.f9920q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f9927x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f9923t
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f9925v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.f9929z
            float r0 = r0 + r2
            float r0 = m64169f(r0, r4, r3)
            float r2 = r6.f9929z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f9925v = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f9925v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f9924u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f9926w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f9924u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f9923t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f9925v = r0
            r6.f9926w = r3
            return r1
        L8b:
            int r0 = r6.f9923t
            if (r0 != r2) goto L96
            r6.m64160o(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f9923t = r0
            android.view.VelocityTracker r0 = r6.f9927x
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.m64167h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f9923t = r1
            r6.f9925v = r0
            r6.f9926w = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m67551d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m64163l();
        } else {
            m64164k();
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            m64174a(isChecked);
            return;
        }
        m64171d();
        if (isChecked) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m67550e(z);
        setTextOnInternal(this.f9918o);
        setTextOffInternal(this.f9920q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f9893H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m67554a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f9922s != z) {
            this.f9922s = z;
            requestLayout();
            if (z) {
                m64161n();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f9917n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f9915l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f9916m = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor);
        if (colorStateList != null) {
            this.f9895J = colorStateList;
        } else {
            this.f9895J = getTextColors();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            if (f != this.f9894I.getTextSize()) {
                this.f9894I.setTextSize(f);
                requestLayout();
            }
        }
        m64162m(obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, -1), obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, -1));
        if (obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false)) {
            this.f9898M = new AllCapsTransformationMethod(getContext());
        } else {
            this.f9898M = null;
        }
        setTextOnInternal(this.f9918o);
        setTextOffInternal(this.f9920q);
        obtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            this.f9894I.setFakeBoldText((i2 & 1) != 0);
            this.f9894I.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f9894I.setFakeBoldText(false);
        this.f9894I.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            m64164k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m64163l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9904a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9904a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f9929z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f9914k = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f9905b = colorStateList;
        this.f9907d = true;
        m64173b();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f9906c = mode;
        this.f9908e = true;
        m64173b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9909f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9909f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f9910g = colorStateList;
        this.f9912i = true;
        m64172c();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f9911h = mode;
        this.f9913j = true;
        m64172c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9904a && drawable != this.f9909f) {
            return false;
        }
        return true;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9905b = null;
        this.f9906c = null;
        this.f9907d = false;
        this.f9908e = false;
        this.f9910g = null;
        this.f9911h = null;
        this.f9912i = false;
        this.f9913j = false;
        this.f9927x = VelocityTracker.obtain();
        this.f9893H = true;
        this.f9903R = new Rect();
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f9894I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.SwitchCompat, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.SwitchCompat, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.SwitchCompat_android_thumb);
        this.f9904a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.SwitchCompat_track);
        this.f9909f = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(R.styleable.SwitchCompat_android_textOn));
        setTextOffInternal(obtainStyledAttributes.getText(R.styleable.SwitchCompat_android_textOff));
        this.f9922s = obtainStyledAttributes.getBoolean(R.styleable.SwitchCompat_showText, true);
        this.f9914k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f9915l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f9916m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_switchPadding, 0);
        this.f9917n = obtainStyledAttributes.getBoolean(R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.SwitchCompat_thumbTint);
        if (colorStateList != null) {
            this.f9905b = colorStateList;
            this.f9907d = true;
        }
        PorterDuff.Mode parseTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f9906c != parseTintMode) {
            this.f9906c = parseTintMode;
            this.f9908e = true;
        }
        if (this.f9907d || this.f9908e) {
            m64173b();
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(R.styleable.SwitchCompat_trackTint);
        if (colorStateList2 != null) {
            this.f9910g = colorStateList2;
            this.f9912i = true;
        }
        PorterDuff.Mode parseTintMode2 = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f9911h != parseTintMode2) {
            this.f9911h = parseTintMode2;
            this.f9913j = true;
        }
        if (this.f9912i || this.f9913j) {
            m64172c();
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        C1432U5 c1432u5 = new C1432U5(this);
        this.f9900O = c1432u5;
        c1432u5.m66115m(attributeSet, i);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f9924u = viewConfiguration.getScaledTouchSlop();
        this.f9928y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m67552c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f9894I.getTypeface() == null || this.f9894I.getTypeface().equals(typeface)) && (this.f9894I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f9894I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
