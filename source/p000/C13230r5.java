package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;

/* renamed from: r5 */
/* loaded from: classes.dex */
public class C13230r5 {

    /* renamed from: a */
    public final CheckedTextView f77160a;

    /* renamed from: b */
    public ColorStateList f77161b = null;

    /* renamed from: c */
    public PorterDuff.Mode f77162c = null;

    /* renamed from: d */
    public boolean f77163d = false;

    /* renamed from: e */
    public boolean f77164e = false;

    /* renamed from: f */
    public boolean f77165f;

    public C13230r5(CheckedTextView checkedTextView) {
        this.f77160a = checkedTextView;
    }

    /* renamed from: a */
    public void m23367a() {
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.f77160a);
        if (checkMarkDrawable != null) {
            if (this.f77163d || this.f77164e) {
                Drawable mutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.f77163d) {
                    DrawableCompat.setTintList(mutate, this.f77161b);
                }
                if (this.f77164e) {
                    DrawableCompat.setTintMode(mutate, this.f77162c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f77160a.getDrawableState());
                }
                this.f77160a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m23366b() {
        return this.f77161b;
    }

    /* renamed from: c */
    public PorterDuff.Mode m23365c() {
        return this.f77162c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:16:0x005c, B:18:0x0064, B:19:0x006f, B:21:0x0077, B:11:0x003f, B:13:0x0047, B:15:0x004f), top: B:29:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:16:0x005c, B:18:0x0064, B:19:0x006f, B:21:0x0077, B:11:0x003f, B:13:0x0047, B:15:0x004f), top: B:29:0x001f }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23364d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f77160a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.CheckedTextView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f77160a
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.R.styleable.CheckedTextView
            android.content.res.TypedArray r7 = r0.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CheckedTextView r12 = r10.f77160a     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CheckedTextView r12 = r10.f77160a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CheckedTextView r11 = r10.f77160a     // Catch: java.lang.Throwable -> L3d
            int r12 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CheckedTextView r11 = r10.f77160a     // Catch: java.lang.Throwable -> L3d
            int r12 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.getInt(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r12, r1)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.recycle()
            return
        L8c:
            r0.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C13230r5.m23364d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void m23363e() {
        if (this.f77165f) {
            this.f77165f = false;
            return;
        }
        this.f77165f = true;
        m23367a();
    }

    /* renamed from: f */
    public void m23362f(ColorStateList colorStateList) {
        this.f77161b = colorStateList;
        this.f77163d = true;
        m23367a();
    }

    /* renamed from: g */
    public void m23361g(PorterDuff.Mode mode) {
        this.f77162c = mode;
        this.f77164e = true;
        m23367a();
    }
}
