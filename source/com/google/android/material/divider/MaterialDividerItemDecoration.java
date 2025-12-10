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
import androidx.annotation.InterfaceC2055Px;
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
    public static final int f49887i = R.style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a */
    public Drawable f49888a;

    /* renamed from: b */
    public int f49889b;

    /* renamed from: c */
    public int f49890c;

    /* renamed from: d */
    public int f49891d;

    /* renamed from: e */
    public int f49892e;

    /* renamed from: f */
    public int f49893f;

    /* renamed from: g */
    public boolean f49894g;

    /* renamed from: h */
    public final Rect f49895h;

    public MaterialDividerItemDecoration(@NonNull Context context, int i) {
        this(context, null, i);
    }

    /* renamed from: a */
    public final void m44801a(Canvas canvas, RecyclerView recyclerView) {
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
        int i2 = i + this.f49892e;
        int i3 = height - this.f49893f;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (m44799c(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f49895h);
                int round = this.f49895h.right + Math.round(childAt.getTranslationX());
                this.f49888a.setBounds(round - this.f49889b, i2, round, i3);
                this.f49888a.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: b */
    public final void m44800b(Canvas canvas, RecyclerView recyclerView) {
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
            i2 = this.f49893f;
        } else {
            i2 = this.f49892e;
        }
        int i4 = i + i2;
        if (z) {
            i3 = this.f49892e;
        } else {
            i3 = this.f49893f;
        }
        int i5 = width - i3;
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            if (m44799c(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f49895h);
                int round = this.f49895h.bottom + Math.round(childAt.getTranslationY());
                this.f49888a.setBounds(i4, round - this.f49889b, i5, round);
                this.f49888a.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: c */
    public final boolean m44799c(RecyclerView recyclerView, View view) {
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
        if ((z && !this.f49894g) || !shouldDrawDivider(childAdapterPosition, adapter)) {
            return false;
        }
        return true;
    }

    @ColorInt
    public int getDividerColor() {
        return this.f49890c;
    }

    @InterfaceC2055Px
    public int getDividerInsetEnd() {
        return this.f49893f;
    }

    @InterfaceC2055Px
    public int getDividerInsetStart() {
        return this.f49892e;
    }

    @InterfaceC2055Px
    public int getDividerThickness() {
        return this.f49889b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (m44799c(recyclerView, view)) {
            if (this.f49891d == 1) {
                rect.bottom = this.f49889b;
            } else {
                rect.right = this.f49889b;
            }
        }
    }

    public int getOrientation() {
        return this.f49891d;
    }

    public boolean isLastItemDecorated() {
        return this.f49894g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f49891d == 1) {
            m44800b(canvas, recyclerView);
        } else {
            m44801a(canvas, recyclerView);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        this.f49890c = i;
        Drawable wrap = DrawableCompat.wrap(this.f49888a);
        this.f49888a = wrap;
        DrawableCompat.setTint(wrap, i);
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i) {
        setDividerColor(ContextCompat.getColor(context, i));
    }

    public void setDividerInsetEnd(@InterfaceC2055Px int i) {
        this.f49893f = i;
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@InterfaceC2055Px int i) {
        this.f49892e = i;
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@InterfaceC2055Px int i) {
        this.f49889b = i;
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public void setLastItemDecorated(boolean z) {
        this.f49894g = z;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.f49891d = i;
    }

    public boolean shouldDrawDivider(int i, @Nullable RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.materialDividerStyle, i);
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this.f49895h = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i, f49887i, new int[0]);
        this.f49890c = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f49889b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f49892e = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f49893f = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f49894g = obtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.f49888a = new ShapeDrawable();
        setDividerColor(this.f49890c);
        setOrientation(i2);
    }
}
