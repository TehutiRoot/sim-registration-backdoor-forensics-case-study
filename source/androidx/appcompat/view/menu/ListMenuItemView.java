package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public MenuItemImpl f9299a;

    /* renamed from: b */
    public ImageView f9300b;

    /* renamed from: c */
    public RadioButton f9301c;

    /* renamed from: d */
    public TextView f9302d;

    /* renamed from: e */
    public CheckBox f9303e;

    /* renamed from: f */
    public TextView f9304f;

    /* renamed from: g */
    public ImageView f9305g;

    /* renamed from: h */
    public ImageView f9306h;

    /* renamed from: i */
    public LinearLayout f9307i;

    /* renamed from: j */
    public Drawable f9308j;

    /* renamed from: k */
    public int f9309k;

    /* renamed from: l */
    public Context f9310l;

    /* renamed from: m */
    public boolean f9311m;

    /* renamed from: n */
    public Drawable f9312n;

    /* renamed from: o */
    public boolean f9313o;

    /* renamed from: p */
    public LayoutInflater f9314p;

    /* renamed from: q */
    public boolean f9315q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f9314p == null) {
            this.f9314p = LayoutInflater.from(getContext());
        }
        return this.f9314p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f9305g;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void m64456a(View view) {
        m64455b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f9306h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9306h.getLayoutParams();
            rect.top += this.f9306h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final void m64455b(View view, int i) {
        LinearLayout linearLayout = this.f9307i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    public final void m64454c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f9303e = checkBox;
        m64456a(checkBox);
    }

    /* renamed from: d */
    public final void m64453d() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f9300b = imageView;
        m64455b(imageView, 0);
    }

    /* renamed from: e */
    public final void m64452e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f9301c = radioButton;
        m64456a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f9299a;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.f9299a = menuItemImpl;
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(menuItemImpl.m64427e(this));
        setCheckable(menuItemImpl.isCheckable());
        setShortcut(menuItemImpl.m64423i(), menuItemImpl.m64429c());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.f9308j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f9302d = textView;
        int i = this.f9309k;
        if (i != -1) {
            textView.setTextAppearance(this.f9310l, i);
        }
        this.f9304f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f9305g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9312n);
        }
        this.f9306h = (ImageView) findViewById(R.id.group_divider);
        this.f9307i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f9300b != null && this.f9311m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9300b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f9301c == null && this.f9303e == null) {
            return;
        }
        if (this.f9299a.isExclusiveCheckable()) {
            if (this.f9301c == null) {
                m64452e();
            }
            compoundButton = this.f9301c;
            view = this.f9303e;
        } else {
            if (this.f9303e == null) {
                m64454c();
            }
            compoundButton = this.f9303e;
            view = this.f9301c;
        }
        if (z) {
            compoundButton.setChecked(this.f9299a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f9303e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f9301c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f9299a.isExclusiveCheckable()) {
            if (this.f9301c == null) {
                m64452e();
            }
            compoundButton = this.f9301c;
        } else {
            if (this.f9303e == null) {
                m64454c();
            }
            compoundButton = this.f9303e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f9315q = z;
        this.f9311m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f9306h;
        if (imageView != null) {
            if (!this.f9313o && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        boolean z;
        if (!this.f9299a.shouldShowIcon() && !this.f9315q) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.f9311m) {
            return;
        }
        ImageView imageView = this.f9300b;
        if (imageView == null && drawable == null && !this.f9311m) {
            return;
        }
        if (imageView == null) {
            m64453d();
        }
        if (drawable == null && !this.f9311m) {
            this.f9300b.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f9300b;
        if (!z) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f9300b.getVisibility() != 0) {
            this.f9300b.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
        int i;
        if (z && this.f9299a.m64423i()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            this.f9304f.setText(this.f9299a.m64428d());
        }
        if (this.f9304f.getVisibility() != i) {
            this.f9304f.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f9302d.setText(charSequence);
            if (this.f9302d.getVisibility() != 0) {
                this.f9302d.setVisibility(0);
            }
        } else if (this.f9302d.getVisibility() != 8) {
            this.f9302d.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return this.f9315q;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MenuView, i, 0);
        this.f9308j = obtainStyledAttributes.getDrawable(R.styleable.MenuView_android_itemBackground);
        this.f9309k = obtainStyledAttributes.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f9311m = obtainStyledAttributes.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
        this.f9310l = context;
        this.f9312n = obtainStyledAttributes.getDrawable(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f9313o = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }
}
