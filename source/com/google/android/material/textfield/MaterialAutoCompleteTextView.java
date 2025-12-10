package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes4.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e */
    public final ListPopupWindow f50997e;

    /* renamed from: f */
    public final AccessibilityManager f50998f;

    /* renamed from: g */
    public final Rect f50999g;

    /* renamed from: h */
    public final int f51000h;

    /* renamed from: i */
    public final float f51001i;

    /* renamed from: j */
    public int f51002j;

    /* renamed from: k */
    public ColorStateList f51003k;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    /* loaded from: classes4.dex */
    public class C7110a implements AdapterView.OnItemClickListener {
        public C7110a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Object item;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                item = materialAutoCompleteTextView.f50997e.getSelectedItem();
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.this.m43863j(item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f50997e.getSelectedView();
                    i = MaterialAutoCompleteTextView.this.f50997e.getSelectedItemPosition();
                    j = MaterialAutoCompleteTextView.this.f50997e.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f50997e.getListView(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f50997e.dismiss();
        }
    }

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$b */
    /* loaded from: classes4.dex */
    public class C7111b extends ArrayAdapter {

        /* renamed from: a */
        public ColorStateList f51005a;

        /* renamed from: b */
        public ColorStateList f51006b;

        public C7111b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            m43857f();
        }

        /* renamed from: a */
        public final ColorStateList m43862a() {
            if (m43860c() && m43859d()) {
                int[] iArr = {16843623, -16842919};
                int[] iArr2 = {16842913, -16842919};
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{MaterialColors.layer(MaterialAutoCompleteTextView.this.f51002j, MaterialAutoCompleteTextView.this.f51003k.getColorForState(iArr2, 0)), MaterialColors.layer(MaterialAutoCompleteTextView.this.f51002j, MaterialAutoCompleteTextView.this.f51003k.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f51002j});
            }
            return null;
        }

        /* renamed from: b */
        public final Drawable m43861b() {
            if (!m43860c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f51002j);
            if (this.f51006b != null) {
                DrawableCompat.setTintList(colorDrawable, this.f51005a);
                return new RippleDrawable(this.f51006b, colorDrawable, null);
            }
            return colorDrawable;
        }

        /* renamed from: c */
        public final boolean m43860c() {
            if (MaterialAutoCompleteTextView.this.f51002j != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m43859d() {
            if (MaterialAutoCompleteTextView.this.f51003k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final ColorStateList m43858e() {
            if (!m43859d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f51003k.getColorForState(iArr, 0), 0});
        }

        /* renamed from: f */
        public void m43857f() {
            this.f51006b = m43858e();
            this.f51005a = m43862a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = m43861b();
                } else {
                    drawable = null;
                }
                ViewCompat.setBackground(textView, drawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (m43866g()) {
            this.f50997e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    /* renamed from: f */
    public final TextInputLayout m43867f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m43866g() {
        AccessibilityManager accessibilityManager = this.f50998f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout m43867f = m43867f();
        if (m43867f != null && m43867f.isProvidingHint()) {
            return m43867f.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f51001i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f51002j;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f51003k;
    }

    /* renamed from: h */
    public final int m43865h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m43867f = m43867f();
        int i = 0;
        if (adapter == null || m43867f == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f50997e.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m43867f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable background = this.f50997e.getBackground();
        if (background != null) {
            background.getPadding(this.f50999g);
            Rect rect = this.f50999g;
            i2 += rect.left + rect.right;
        }
        return i2 + m43867f.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: i */
    public final void m43864i() {
        TextInputLayout m43867f = m43867f();
        if (m43867f != null) {
            m43867f.m43813h0();
        }
    }

    /* renamed from: j */
    public final void m43863j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m43867f = m43867f();
        if (m43867f != null && m43867f.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50997e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m43865h()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (m43866g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f50997e.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f50997e;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f50997e.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        m43864i();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f51002j = i;
        if (getAdapter() instanceof C7111b) {
            ((C7111b) getAdapter()).m43857f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f51003k = colorStateList;
        if (getAdapter() instanceof C7111b) {
            ((C7111b) getAdapter()).m43857f();
        }
    }

    public void setSimpleItems(@ArrayRes int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (m43866g()) {
            this.f50997e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new C7111b(getContext(), this.f51000h, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.f50999g = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialAutoCompleteTextView, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_android_inputType) && obtainStyledAttributes.getInt(R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f51000h = obtainStyledAttributes.getResourceId(R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, R.layout.mtrl_auto_complete_simple_item);
        this.f51001i = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialAutoCompleteTextView_android_popupElevation, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f51002j = obtainStyledAttributes.getColor(R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f51003k = MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f50998f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f50997e = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new C7110a());
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(obtainStyledAttributes.getResourceId(R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
