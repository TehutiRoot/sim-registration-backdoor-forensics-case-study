package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;

/* renamed from: s5 */
/* loaded from: classes.dex */
public class C13891s5 {

    /* renamed from: a */
    public final CompoundButton f79559a;

    /* renamed from: b */
    public ColorStateList f79560b = null;

    /* renamed from: c */
    public PorterDuff.Mode f79561c = null;

    /* renamed from: d */
    public boolean f79562d = false;

    /* renamed from: e */
    public boolean f79563e = false;

    /* renamed from: f */
    public boolean f79564f;

    public C13891s5(CompoundButton compoundButton) {
        this.f79559a = compoundButton;
    }

    /* renamed from: a */
    public void m22719a() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.f79559a);
        if (buttonDrawable != null) {
            if (this.f79562d || this.f79563e) {
                Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.f79562d) {
                    DrawableCompat.setTintList(mutate, this.f79560b);
                }
                if (this.f79563e) {
                    DrawableCompat.setTintMode(mutate, this.f79561c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f79559a.getDrawableState());
                }
                this.f79559a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m22717c() {
        return this.f79560b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m22716d() {
        return this.f79561c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:16:0x005c, B:18:0x0064, B:19:0x006f, B:21:0x0077, B:11:0x003f, B:13:0x0047, B:15:0x004f), top: B:29:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:16:0x005c, B:18:0x0064, B:19:0x006f, B:21:0x0077, B:11:0x003f, B:13:0x0047, B:15:0x004f), top: B:29:0x001f }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m22715e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f79559a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.CompoundButton
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f79559a
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.R.styleable.CompoundButton
            android.content.res.TypedArray r7 = r0.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CompoundButton r12 = r10.f79559a     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CompoundButton r12 = r10.f79559a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CompoundButton r11 = r10.f79559a     // Catch: java.lang.Throwable -> L3d
            int r12 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CompoundButton r11 = r10.f79559a     // Catch: java.lang.Throwable -> L3d
            int r12 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.getInt(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r12, r1)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.CompoundButtonCompat.setButtonTintMode(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.recycle()
            return
        L8c:
            r0.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C13891s5.m22715e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void m22714f() {
        if (this.f79564f) {
            this.f79564f = false;
            return;
        }
        this.f79564f = true;
        m22719a();
    }

    /* renamed from: g */
    public void m22713g(ColorStateList colorStateList) {
        this.f79560b = colorStateList;
        this.f79562d = true;
        m22719a();
    }

    /* renamed from: h */
    public void m22712h(PorterDuff.Mode mode) {
        this.f79561c = mode;
        this.f79563e = true;
        m22719a();
    }

    /* renamed from: b */
    public int m22718b(int i) {
        return i;
    }
}
