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
    public final ListPopupWindow f51009e;

    /* renamed from: f */
    public final AccessibilityManager f51010f;

    /* renamed from: g */
    public final Rect f51011g;

    /* renamed from: h */
    public final int f51012h;

    /* renamed from: i */
    public final float f51013i;

    /* renamed from: j */
    public int f51014j;

    /* renamed from: k */
    public ColorStateList f51015k;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    /* loaded from: classes4.dex */
    public class C7099a implements AdapterView.OnItemClickListener {
        public C7099a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Object item;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                item = materialAutoCompleteTextView.f51009e.getSelectedItem();
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.this.m43850j(item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f51009e.getSelectedView();
                    i = MaterialAutoCompleteTextView.this.f51009e.getSelectedItemPosition();
                    j = MaterialAutoCompleteTextView.this.f51009e.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f51009e.getListView(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f51009e.dismiss();
        }
    }

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$b */
    /* loaded from: classes4.dex */
    public class C7100b extends ArrayAdapter {

        /* renamed from: a */
        public ColorStateList f51017a;

        /* renamed from: b */
        public ColorStateList f51018b;

        public C7100b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            m43844f();
        }

        /* renamed from: a */
        public final ColorStateList m43849a() {
            if (m43847c() && m43846d()) {
                int[] iArr = {16843623, -16842919};
                int[] iArr2 = {16842913, -16842919};
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{MaterialColors.layer(MaterialAutoCompleteTextView.this.f51014j, MaterialAutoCompleteTextView.this.f51015k.getColorForState(iArr2, 0)), MaterialColors.layer(MaterialAutoCompleteTextView.this.f51014j, MaterialAutoCompleteTextView.this.f51015k.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f51014j});
            }
            return null;
        }

        /* renamed from: b */
        public final Drawable m43848b() {
            if (!m43847c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f51014j);
            if (this.f51018b != null) {
                DrawableCompat.setTintList(colorDrawable, this.f51017a);
                return new RippleDrawable(this.f51018b, colorDrawable, null);
            }
            return colorDrawable;
        }

        /* renamed from: c */
        public final boolean m43847c() {
            if (MaterialAutoCompleteTextView.this.f51014j != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m43846d() {
            if (MaterialAutoCompleteTextView.this.f51015k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final ColorStateList m43845e() {
            if (!m43846d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f51015k.getColorForState(iArr, 0), 0});
        }

        /* renamed from: f */
        public void m43844f() {
            this.f51018b = m43845e();
            this.f51017a = m43849a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = m43848b();
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
        if (m43853g()) {
            this.f51009e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    /* renamed from: f */
    public final TextInputLayout m43854f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m43853g() {
        AccessibilityManager accessibilityManager = this.f51010f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout m43854f = m43854f();
        if (m43854f != null && m43854f.isProvidingHint()) {
            return m43854f.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f51013i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f51014j;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f51015k;
    }

    /* renamed from: h */
    public final int m43852h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m43854f = m43854f();
        int i = 0;
        if (adapter == null || m43854f == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f51009e.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m43854f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable background = this.f51009e.getBackground();
        if (background != null) {
            background.getPadding(this.f51011g);
            Rect rect = this.f51011g;
            i2 += rect.left + rect.right;
        }
        return i2 + m43854f.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: i */
    public final void m43851i() {
        TextInputLayout m43854f = m43854f();
        if (m43854f != null) {
            m43854f.m43800h0();
        }
    }

    /* renamed from: j */
    public final void m43850j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m43854f = m43854f();
        if (m43854f != null && m43854f.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51009e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m43852h()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (m43853g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f51009e.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f51009e;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f51009e.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        m43851i();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f51014j = i;
        if (getAdapter() instanceof C7100b) {
            ((C7100b) getAdapter()).m43844f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f51015k = colorStateList;
        if (getAdapter() instanceof C7100b) {
            ((C7100b) getAdapter()).m43844f();
        }
    }

    public void setSimpleItems(@ArrayRes int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (m43853g()) {
            this.f51009e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new C7100b(getContext(), this.f51012h, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.f51011g = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialAutoCompleteTextView, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_android_inputType) && obtainStyledAttributes.getInt(R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f51012h = obtainStyledAttributes.getResourceId(R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, R.layout.mtrl_auto_complete_simple_item);
        this.f51013i = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialAutoCompleteTextView_android_popupElevation, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f51014j = obtainStyledAttributes.getColor(R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f51015k = MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f51010f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f51009e = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new C7099a());
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(obtainStyledAttributes.getResourceId(R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        obtainStyledAttributes.recycle();
    }
}