package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f50076g = {16842912};

    /* renamed from: d */
    public boolean f50077d;

    /* renamed from: e */
    public boolean f50078e;

    /* renamed from: f */
    public boolean f50079f;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes4.dex */
    public class C6971a extends AccessibilityDelegateCompat {
        public C6971a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCheckable(CheckableImageButton.this.isCheckable());
            accessibilityNodeInfoCompat.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    /* loaded from: classes4.dex */
    public static class C6972b extends AbsSavedState {
        public static final Parcelable.Creator<C6972b> CREATOR = new C6973a();

        /* renamed from: b */
        public boolean f50081b;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        /* loaded from: classes4.dex */
        public class C6973a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6972b createFromParcel(Parcel parcel) {
                return new C6972b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C6972b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C6972b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C6972b[] newArray(int i) {
                return new C6972b[i];
            }
        }

        public C6972b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m44649a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f50081b = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f50081b ? 1 : 0);
        }

        public C6972b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m44649a(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.f50078e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f50077d;
    }

    public boolean isPressable() {
        return this.f50079f;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f50077d) {
            int[] iArr = f50076g;
            return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C6972b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6972b c6972b = (C6972b) parcelable;
        super.onRestoreInstanceState(c6972b.getSuperState());
        setChecked(c6972b.f50081b);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        C6972b c6972b = new C6972b(super.onSaveInstanceState());
        c6972b.f50081b = this.f50077d;
        return c6972b;
    }

    public void setCheckable(boolean z) {
        if (this.f50078e != z) {
            this.f50078e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f50078e && this.f50077d != z) {
            this.f50077d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f50079f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f50079f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f50077d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50078e = true;
        this.f50079f = true;
        ViewCompat.setAccessibilityDelegate(this, new C6971a());
    }
}
