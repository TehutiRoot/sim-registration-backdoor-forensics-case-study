package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes4.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* renamed from: i */
    public static final int f49899i = R.style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a */
    public Drawable f49900a;

    /* renamed from: b */
    public int f49901b;

    /* renamed from: c */
    public int f49902c;

    /* renamed from: d */
    public int f49903d;

    /* renamed from: e */
    public int f49904e;

    /* renamed from: f */
    public int f49905f;

    /* renamed from: g */
    public boolean f49906g;

    /* renamed from: h */
    public final Rect f49907h;

    public MaterialDividerItemDecoration(@NonNull Context context, int i) {
        this(context, null, i);
    }

    /* renamed from: a */
    public final void m44777a(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int i2 = i + this.f49904e;
        int i3 = height - this.f49905f;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (m44775c(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f49907h);
                int round = this.f49907h.right + Math.round(childAt.getTranslationX());
                this.f49900a.setBounds(round - this.f49901b, i2, round, i3);
                this.f49900a.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: b */
    public final void m44776b(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        int i2;
        int i3;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        boolean z = true;
        if (ViewCompat.getLayoutDirection(recyclerView) != 1) {
            z = false;
        }
        if (z) {
            i2 = this.f49905f;
        } else {
            i2 = this.f49904e;
        }
        int i4 = i + i2;
        if (z) {
            i3 = this.f49904e;
        } else {
            i3 = this.f49905f;
        }
        int i5 = width - i3;
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            if (m44775c(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f49907h);
                int round = this.f49907h.bottom + Math.round(childAt.getTranslationY());
                this.f49900a.setBounds(i4, round - this.f49901b, i5, round);
                this.f49900a.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: c */
    public final boolean m44775c(RecyclerView recyclerView, View view) {
        boolean z;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (childAdapterPosition == -1) {
            return false;
        }
        if ((z && !this.f49906g) || !shouldDrawDivider(childAdapterPosition, adapter)) {
            return false;
        }
        return true;
    }

    @ColorInt
    public int getDividerColor() {
        return this.f49902c;
    }

    @InterfaceC2037Px
    public int getDividerInsetEnd() {
        return this.f49905f;
    }

    @InterfaceC2037Px
    public int getDividerInsetStart() {
        return this.f49904e;
    }

    @InterfaceC2037Px
    public int getDividerThickness() {
        return this.f49901b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (m44775c(recyclerView, view)) {
            if (this.f49903d == 1) {
                rect.bottom = this.f49901b;
            } else {
                rect.right = this.f49901b;
            }
        }
    }

    public int getOrientation() {
        return this.f49903d;
    }

    public boolean isLastItemDecorated() {
        return this.f49906g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f49903d == 1) {
            m44776b(canvas, recyclerView);
        } else {
            m44777a(canvas, recyclerView);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        this.f49902c = i;
        Drawable wrap = DrawableCompat.wrap(this.f49900a);
        this.f49900a = wrap;
        DrawableCompat.setTint(wrap, i);
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i) {
        setDividerColor(ContextCompat.getColor(context, i));
    }

    public void setDividerInsetEnd(@InterfaceC2037Px int i) {
        this.f49905f = i;
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@InterfaceC2037Px int i) {
        this.f49904e = i;
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@InterfaceC2037Px int i) {
        this.f49901b = i;
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public void setLastItemDecorated(boolean z) {
        this.f49906g = z;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.f49903d = i;
    }

    public boolean shouldDrawDivider(int i, @Nullable RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.materialDividerStyle, i);
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this.f49907h = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i, f49899i, new int[0]);
        this.f49902c = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f49901b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f49904e = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f49905f = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f49906g = obtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.f49900a = new ShapeDrawable();
        setDividerColor(this.f49902c);
        setOrientation(i2);
    }
}