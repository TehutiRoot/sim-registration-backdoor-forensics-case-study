package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* renamed from: tg */
/* loaded from: classes4.dex */
public final class C14017tg {

    /* renamed from: a */
    public final Rect f80180a;

    /* renamed from: b */
    public final ColorStateList f80181b;

    /* renamed from: c */
    public final ColorStateList f80182c;

    /* renamed from: d */
    public final ColorStateList f80183d;

    /* renamed from: e */
    public final int f80184e;

    /* renamed from: f */
    public final ShapeAppearanceModel f80185f;

    public C14017tg(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f80180a = rect;
        this.f80181b = colorStateList2;
        this.f80182c = colorStateList;
        this.f80183d = colorStateList3;
        this.f80184e = i;
        this.f80185f = shapeAppearanceModel;
    }

    /* renamed from: a */
    public static C14017tg m22383a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        obtainStyledAttributes.recycle();
        return new C14017tg(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, build, rect);
    }

    /* renamed from: b */
    public int m22382b() {
        return this.f80180a.bottom;
    }

    /* renamed from: c */
    public int m22381c() {
        return this.f80180a.top;
    }

    /* renamed from: d */
    public void m22380d(TextView textView) {
        m22379e(textView, null);
    }

    /* renamed from: e */
    public void m22379e(TextView textView, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f80185f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f80185f);
        if (colorStateList == null) {
            colorStateList = this.f80182c;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.f80184e, this.f80183d);
        textView.setTextColor(this.f80181b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f80181b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f80180a;
        ViewCompat.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
