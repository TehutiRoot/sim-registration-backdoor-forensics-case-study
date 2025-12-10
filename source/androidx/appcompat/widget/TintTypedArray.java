package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class TintTypedArray {

    /* renamed from: a */
    public final Context f9948a;

    /* renamed from: b */
    public final TypedArray f9949b;

    /* renamed from: c */
    public TypedValue f9950c;

    /* renamed from: androidx.appcompat.widget.TintTypedArray$a */
    /* loaded from: classes.dex */
    public static class C2250a {
        @DoNotInline
        /* renamed from: a */
        public static int m64152a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m64151b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f9948a = context;
        this.f9949b = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i, boolean z) {
        return this.f9949b.getBoolean(i, z);
    }

    @RequiresApi(21)
    public int getChangingConfigurations() {
        return C2250a.m64152a(this.f9949b);
    }

    public int getColor(int i, int i2) {
        return this.f9949b.getColor(i, i2);
    }

    public ColorStateList getColorStateList(int i) {
        int resourceId;
        ColorStateList colorStateList;
        if (this.f9949b.hasValue(i) && (resourceId = this.f9949b.getResourceId(i, 0)) != 0 && (colorStateList = AppCompatResources.getColorStateList(this.f9948a, resourceId)) != null) {
            return colorStateList;
        }
        return this.f9949b.getColorStateList(i);
    }

    public float getDimension(int i, float f) {
        return this.f9949b.getDimension(i, f);
    }

    public int getDimensionPixelOffset(int i, int i2) {
        return this.f9949b.getDimensionPixelOffset(i, i2);
    }

    public int getDimensionPixelSize(int i, int i2) {
        return this.f9949b.getDimensionPixelSize(i, i2);
    }

    public Drawable getDrawable(int i) {
        int resourceId;
        if (this.f9949b.hasValue(i) && (resourceId = this.f9949b.getResourceId(i, 0)) != 0) {
            return AppCompatResources.getDrawable(this.f9948a, resourceId);
        }
        return this.f9949b.getDrawable(i);
    }

    public Drawable getDrawableIfKnown(int i) {
        int resourceId;
        if (this.f9949b.hasValue(i) && (resourceId = this.f9949b.getResourceId(i, 0)) != 0) {
            return AppCompatDrawableManager.get().m64358b(this.f9948a, resourceId, true);
        }
        return null;
    }

    public float getFloat(int i, float f) {
        return this.f9949b.getFloat(i, f);
    }

    @Nullable
    public Typeface getFont(@StyleableRes int i, int i2, @Nullable ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f9949b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f9950c == null) {
            this.f9950c = new TypedValue();
        }
        return ResourcesCompat.getFont(this.f9948a, resourceId, this.f9950c, i2, fontCallback);
    }

    public float getFraction(int i, int i2, int i3, float f) {
        return this.f9949b.getFraction(i, i2, i3, f);
    }

    public int getIndex(int i) {
        return this.f9949b.getIndex(i);
    }

    public int getIndexCount() {
        return this.f9949b.getIndexCount();
    }

    public int getInt(int i, int i2) {
        return this.f9949b.getInt(i, i2);
    }

    public int getInteger(int i, int i2) {
        return this.f9949b.getInteger(i, i2);
    }

    public int getLayoutDimension(int i, String str) {
        return this.f9949b.getLayoutDimension(i, str);
    }

    public String getNonResourceString(int i) {
        return this.f9949b.getNonResourceString(i);
    }

    public String getPositionDescription() {
        return this.f9949b.getPositionDescription();
    }

    public int getResourceId(int i, int i2) {
        return this.f9949b.getResourceId(i, i2);
    }

    public Resources getResources() {
        return this.f9949b.getResources();
    }

    public String getString(int i) {
        return this.f9949b.getString(i);
    }

    public CharSequence getText(int i) {
        return this.f9949b.getText(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f9949b.getTextArray(i);
    }

    public int getType(int i) {
        return C2250a.m64151b(this.f9949b, i);
    }

    public boolean getValue(int i, TypedValue typedValue) {
        return this.f9949b.getValue(i, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.f9949b;
    }

    public boolean hasValue(int i) {
        return this.f9949b.hasValue(i);
    }

    public int length() {
        return this.f9949b.length();
    }

    public TypedValue peekValue(int i) {
        return this.f9949b.peekValue(i);
    }

    public void recycle() {
        this.f9949b.recycle();
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int getLayoutDimension(int i, int i2) {
        return this.f9949b.getLayoutDimension(i, i2);
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i, iArr));
    }
}
