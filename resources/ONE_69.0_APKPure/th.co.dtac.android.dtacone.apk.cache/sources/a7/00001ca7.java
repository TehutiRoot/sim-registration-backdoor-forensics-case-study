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
    public static final Property f9972S = new C2229a(Float.class, "thumbPos");

    /* renamed from: T */
    public static final int[] f9973T = {16842912};

    /* renamed from: A */
    public int f9974A;

    /* renamed from: B */
    public int f9975B;

    /* renamed from: C */
    public int f9976C;

    /* renamed from: D */
    public int f9977D;

    /* renamed from: E */
    public int f9978E;

    /* renamed from: F */
    public int f9979F;

    /* renamed from: G */
    public int f9980G;

    /* renamed from: H */
    public boolean f9981H;

    /* renamed from: I */
    public final TextPaint f9982I;

    /* renamed from: J */
    public ColorStateList f9983J;

    /* renamed from: K */
    public Layout f9984K;

    /* renamed from: L */
    public Layout f9985L;

    /* renamed from: M */
    public TransformationMethod f9986M;

    /* renamed from: N */
    public ObjectAnimator f9987N;

    /* renamed from: O */
    public final C1414U5 f9988O;

    /* renamed from: P */
    public C0775L5 f9989P;

    /* renamed from: Q */
    public C2231c f9990Q;

    /* renamed from: R */
    public final Rect f9991R;

    /* renamed from: a */
    public Drawable f9992a;

    /* renamed from: b */
    public ColorStateList f9993b;

    /* renamed from: c */
    public PorterDuff.Mode f9994c;

    /* renamed from: d */
    public boolean f9995d;

    /* renamed from: e */
    public boolean f9996e;

    /* renamed from: f */
    public Drawable f9997f;

    /* renamed from: g */
    public ColorStateList f9998g;

    /* renamed from: h */
    public PorterDuff.Mode f9999h;

    /* renamed from: i */
    public boolean f10000i;

    /* renamed from: j */
    public boolean f10001j;

    /* renamed from: k */
    public int f10002k;

    /* renamed from: l */
    public int f10003l;

    /* renamed from: m */
    public int f10004m;

    /* renamed from: n */
    public boolean f10005n;

    /* renamed from: o */
    public CharSequence f10006o;

    /* renamed from: p */
    public CharSequence f10007p;

    /* renamed from: q */
    public CharSequence f10008q;

    /* renamed from: r */
    public CharSequence f10009r;

    /* renamed from: s */
    public boolean f10010s;

    /* renamed from: t */
    public int f10011t;

    /* renamed from: u */
    public int f10012u;

    /* renamed from: v */
    public float f10013v;

    /* renamed from: w */
    public float f10014w;

    /* renamed from: x */
    public VelocityTracker f10015x;

    /* renamed from: y */
    public int f10016y;

    /* renamed from: z */
    public float f10017z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    public class C2229a extends Property {
        public C2229a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f10017z);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    /* loaded from: classes.dex */
    public static class C2230b {
        @DoNotInline
        /* renamed from: a */
        public static void m64108a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    /* loaded from: classes.dex */
    public static class C2231c extends EmojiCompat.InitCallback {

        /* renamed from: a */
        public final Reference f10018a;

        public C2231c(SwitchCompat switchCompat) {
            this.f10018a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onFailed(Throwable th2) {
            SwitchCompat switchCompat = (SwitchCompat) this.f10018a.get();
            if (switchCompat != null) {
                switchCompat.m64116j();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            SwitchCompat switchCompat = (SwitchCompat) this.f10018a.get();
            if (switchCompat != null) {
                switchCompat.m64116j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static float m64120f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @NonNull
    private C0775L5 getEmojiTextViewHelper() {
        if (this.f9989P == null) {
            this.f9989P = new C0775L5(this);
        }
        return this.f9989P;
    }

    private boolean getTargetCheckedState() {
        if (this.f10017z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (ViewUtils.isLayoutRtl(this)) {
            f = 1.0f - this.f10017z;
        } else {
            f = this.f10017z;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f9997f;
        if (drawable != null) {
            Rect rect2 = this.f9991R;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f9992a;
            if (drawable2 != null) {
                rect = DrawableUtils.getOpticalBounds(drawable2);
            } else {
                rect = DrawableUtils.INSETS_NONE;
            }
            return ((((this.f9974A - this.f9976C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f10008q = charSequence;
        this.f10009r = m64119g(charSequence);
        this.f9985L = null;
        if (this.f10010s) {
            m64112n();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f10006o = charSequence;
        this.f10007p = m64119g(charSequence);
        this.f9984K = null;
        if (this.f10010s) {
            m64112n();
        }
    }

    /* renamed from: a */
    public final void m64125a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f9972S, f);
        this.f9987N = ofFloat;
        ofFloat.setDuration(250L);
        C2230b.m64108a(this.f9987N, true);
        this.f9987N.start();
    }

    /* renamed from: b */
    public final void m64124b() {
        Drawable drawable = this.f9992a;
        if (drawable != null) {
            if (this.f9995d || this.f9996e) {
                Drawable mutate = DrawableCompat.wrap(drawable).mutate();
                this.f9992a = mutate;
                if (this.f9995d) {
                    DrawableCompat.setTintList(mutate, this.f9993b);
                }
                if (this.f9996e) {
                    DrawableCompat.setTintMode(this.f9992a, this.f9994c);
                }
                if (this.f9992a.isStateful()) {
                    this.f9992a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m64123c() {
        Drawable drawable = this.f9997f;
        if (drawable != null) {
            if (this.f10000i || this.f10001j) {
                Drawable mutate = DrawableCompat.wrap(drawable).mutate();
                this.f9997f = mutate;
                if (this.f10000i) {
                    DrawableCompat.setTintList(mutate, this.f9998g);
                }
                if (this.f10001j) {
                    DrawableCompat.setTintMode(this.f9997f, this.f9999h);
                }
                if (this.f9997f.isStateful()) {
                    this.f9997f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m64122d() {
        ObjectAnimator objectAnimator = this.f9987N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f9991R;
        int i3 = this.f9977D;
        int i4 = this.f9978E;
        int i5 = this.f9979F;
        int i6 = this.f9980G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f9992a;
        if (drawable != null) {
            rect = DrawableUtils.getOpticalBounds(drawable);
        } else {
            rect = DrawableUtils.INSETS_NONE;
        }
        Drawable drawable2 = this.f9997f;
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
                    this.f9997f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f9997f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f9992a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f9976C + rect2.right;
            this.f9992a.setBounds(i15, i4, i16, i6);
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
        Drawable drawable = this.f9992a;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f, f2);
        }
        Drawable drawable2 = this.f9997f;
        if (drawable2 != null) {
            DrawableCompat.setHotspot(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9992a;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9997f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m64121e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final CharSequence m64119g(CharSequence charSequence) {
        TransformationMethod m67632f = getEmojiTextViewHelper().m67632f(this.f9986M);
        if (m67632f != null) {
            return m67632f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f9974A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f10004m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f9974A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f10004m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f10010s;
    }

    public boolean getSplitTrack() {
        return this.f10005n;
    }

    public int getSwitchMinWidth() {
        return this.f10003l;
    }

    public int getSwitchPadding() {
        return this.f10004m;
    }

    public CharSequence getTextOff() {
        return this.f10008q;
    }

    public CharSequence getTextOn() {
        return this.f10006o;
    }

    public Drawable getThumbDrawable() {
        return this.f9992a;
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public final float getThumbPosition() {
        return this.f10017z;
    }

    public int getThumbTextPadding() {
        return this.f10002k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f9993b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f9994c;
    }

    public Drawable getTrackDrawable() {
        return this.f9997f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f9998g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f9999h;
    }

    /* renamed from: h */
    public final boolean m64118h(float f, float f2) {
        if (this.f9992a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f9992a.getPadding(this.f9991R);
        int i = this.f9978E;
        int i2 = this.f10012u;
        int i3 = i - i2;
        int i4 = (this.f9977D + thumbOffset) - i2;
        Rect rect = this.f9991R;
        int i5 = this.f9976C + i4 + rect.left + rect.right + i2;
        int i6 = this.f9980G + i2;
        if (f <= i4 || f >= i5 || f2 <= i3 || f2 >= i6) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final Layout m64117i(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.f9982I;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m67636b();
    }

    /* renamed from: j */
    public void m64116j() {
        setTextOnInternal(this.f10006o);
        setTextOffInternal(this.f10008q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9992a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9997f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f9987N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f9987N.end();
            this.f9987N = null;
        }
    }

    /* renamed from: k */
    public final void m64115k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f10008q;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, charSequence);
        }
    }

    /* renamed from: l */
    public final void m64114l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f10006o;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_on);
            }
            ViewCompat.setStateDescription(this, charSequence);
        }
    }

    /* renamed from: m */
    public final void m64113m(int i, int i2) {
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
    public final void m64112n() {
        if (this.f9990Q == null && this.f9989P.m67636b() && EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                C2231c c2231c = new C2231c(this);
                this.f9990Q = c2231c;
                emojiCompat.registerInitCallback(c2231c);
            }
        }
    }

    /* renamed from: o */
    public final void m64111o(MotionEvent motionEvent) {
        boolean z;
        this.f10011t = 0;
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f10015x.computeCurrentVelocity(1000);
            float xVelocity = this.f10015x.getXVelocity();
            if (Math.abs(xVelocity) > this.f10016y) {
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
        m64121e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9973T);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f9991R;
        Drawable drawable = this.f9997f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f9978E;
        int i2 = this.f9980G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f9992a;
        if (drawable != null) {
            if (this.f10005n && drawable2 != null) {
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
            layout = this.f9984K;
        } else {
            layout = this.f9985L;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f9983J;
            if (colorStateList != null) {
                this.f9982I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f9982I.drawableState = drawableState;
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
                charSequence = this.f10006o;
            } else {
                charSequence = this.f10008q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(TokenParser.f74644SP);
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
        if (this.f9992a != null) {
            Rect rect = this.f9991R;
            Drawable drawable = this.f9997f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.f9992a);
            i5 = Math.max(0, opticalBounds.left - rect.left);
            i9 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            i5 = 0;
        }
        if (ViewUtils.isLayoutRtl(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f9974A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f9974A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i7 = this.f9975B;
            } else {
                i8 = getHeight() - getPaddingBottom();
                paddingTop = i8 - this.f9975B;
                this.f9977D = i6;
                this.f9978E = paddingTop;
                this.f9980G = i8;
                this.f9979F = width;
            }
        } else {
            i7 = this.f9975B;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        }
        i8 = i7 + paddingTop;
        this.f9977D = i6;
        this.f9978E = paddingTop;
        this.f9980G = i8;
        this.f9979F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f10010s) {
            if (this.f9984K == null) {
                this.f9984K = m64117i(this.f10007p);
            }
            if (this.f9985L == null) {
                this.f9985L = m64117i(this.f10009r);
            }
        }
        Rect rect = this.f9991R;
        Drawable drawable = this.f9992a;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f9992a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f9992a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.f10010s) {
            i5 = Math.max(this.f9984K.getWidth(), this.f9985L.getWidth()) + (this.f10002k * 2);
        } else {
            i5 = 0;
        }
        this.f9976C = Math.max(i5, i3);
        Drawable drawable2 = this.f9997f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f9997f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f9992a;
        if (drawable3 != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable3);
            i8 = Math.max(i8, opticalBounds.left);
            i9 = Math.max(i9, opticalBounds.right);
        }
        if (this.f9981H) {
            i6 = Math.max(this.f10003l, (this.f9976C * 2) + i8 + i9);
        } else {
            i6 = this.f10003l;
        }
        int max = Math.max(i7, i4);
        this.f9974A = i6;
        this.f9975B = max;
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
            charSequence = this.f10006o;
        } else {
            charSequence = this.f10008q;
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
            android.view.VelocityTracker r0 = r6.f10015x
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
            int r0 = r6.f10011t
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f10013v
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
            float r0 = r6.f10017z
            float r0 = r0 + r2
            float r0 = m64120f(r0, r4, r3)
            float r2 = r6.f10017z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f10013v = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f10013v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f10012u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f10014w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f10012u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f10011t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f10013v = r0
            r6.f10014w = r3
            return r1
        L8b:
            int r0 = r6.f10011t
            if (r0 != r2) goto L96
            r6.m64111o(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f10011t = r0
            android.view.VelocityTracker r0 = r6.f10015x
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.m64118h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f10011t = r1
            r6.f10013v = r0
            r6.f10014w = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m67634d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m64114l();
        } else {
            m64115k();
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            m64125a(isChecked);
            return;
        }
        m64122d();
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
        getEmojiTextViewHelper().m67633e(z);
        setTextOnInternal(this.f10006o);
        setTextOffInternal(this.f10008q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f9981H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m67637a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f10010s != z) {
            this.f10010s = z;
            requestLayout();
            if (z) {
                m64112n();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f10005n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f10003l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f10004m = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor);
        if (colorStateList != null) {
            this.f9983J = colorStateList;
        } else {
            this.f9983J = getTextColors();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            if (f != this.f9982I.getTextSize()) {
                this.f9982I.setTextSize(f);
                requestLayout();
            }
        }
        m64113m(obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, -1), obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, -1));
        if (obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false)) {
            this.f9986M = new AllCapsTransformationMethod(getContext());
        } else {
            this.f9986M = null;
        }
        setTextOnInternal(this.f10006o);
        setTextOffInternal(this.f10008q);
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
            this.f9982I.setFakeBoldText((i2 & 1) != 0);
            this.f9982I.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f9982I.setFakeBoldText(false);
        this.f9982I.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            m64115k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m64114l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9992a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9992a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f10017z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f10002k = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f9993b = colorStateList;
        this.f9995d = true;
        m64124b();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f9994c = mode;
        this.f9996e = true;
        m64124b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9997f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9997f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f9998g = colorStateList;
        this.f10000i = true;
        m64123c();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f9999h = mode;
        this.f10001j = true;
        m64123c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9992a && drawable != this.f9997f) {
            return false;
        }
        return true;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9993b = null;
        this.f9994c = null;
        this.f9995d = false;
        this.f9996e = false;
        this.f9998g = null;
        this.f9999h = null;
        this.f10000i = false;
        this.f10001j = false;
        this.f10015x = VelocityTracker.obtain();
        this.f9981H = true;
        this.f9991R = new Rect();
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f9982I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.SwitchCompat, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.SwitchCompat, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.SwitchCompat_android_thumb);
        this.f9992a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.SwitchCompat_track);
        this.f9997f = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(R.styleable.SwitchCompat_android_textOn));
        setTextOffInternal(obtainStyledAttributes.getText(R.styleable.SwitchCompat_android_textOff));
        this.f10010s = obtainStyledAttributes.getBoolean(R.styleable.SwitchCompat_showText, true);
        this.f10002k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f10003l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f10004m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_switchPadding, 0);
        this.f10005n = obtainStyledAttributes.getBoolean(R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.SwitchCompat_thumbTint);
        if (colorStateList != null) {
            this.f9993b = colorStateList;
            this.f9995d = true;
        }
        PorterDuff.Mode parseTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f9994c != parseTintMode) {
            this.f9994c = parseTintMode;
            this.f9996e = true;
        }
        if (this.f9995d || this.f9996e) {
            m64124b();
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(R.styleable.SwitchCompat_trackTint);
        if (colorStateList2 != null) {
            this.f9998g = colorStateList2;
            this.f10000i = true;
        }
        PorterDuff.Mode parseTintMode2 = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f9999h != parseTintMode2) {
            this.f9999h = parseTintMode2;
            this.f10001j = true;
        }
        if (this.f10000i || this.f10001j) {
            m64123c();
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        C1414U5 c1414u5 = new C1414U5(this);
        this.f9988O = c1414u5;
        c1414u5.m66256m(attributeSet, i);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10012u = viewConfiguration.getScaledTouchSlop();
        this.f10016y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m67635c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f9982I.getTypeface() == null || this.f9982I.getTypeface().equals(typeface)) && (this.f9982I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f9982I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}