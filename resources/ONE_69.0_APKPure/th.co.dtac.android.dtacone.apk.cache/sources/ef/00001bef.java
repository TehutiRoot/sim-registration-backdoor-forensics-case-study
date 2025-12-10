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
    public MenuItemImpl f9387a;

    /* renamed from: b */
    public ImageView f9388b;

    /* renamed from: c */
    public RadioButton f9389c;

    /* renamed from: d */
    public TextView f9390d;

    /* renamed from: e */
    public CheckBox f9391e;

    /* renamed from: f */
    public TextView f9392f;

    /* renamed from: g */
    public ImageView f9393g;

    /* renamed from: h */
    public ImageView f9394h;

    /* renamed from: i */
    public LinearLayout f9395i;

    /* renamed from: j */
    public Drawable f9396j;

    /* renamed from: k */
    public int f9397k;

    /* renamed from: l */
    public Context f9398l;

    /* renamed from: m */
    public boolean f9399m;

    /* renamed from: n */
    public Drawable f9400n;

    /* renamed from: o */
    public boolean f9401o;

    /* renamed from: p */
    public LayoutInflater f9402p;

    /* renamed from: q */
    public boolean f9403q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f9402p == null) {
            this.f9402p = LayoutInflater.from(getContext());
        }
        return this.f9402p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f9393g;
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
    public final void m64407a(View view) {
        m64406b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f9394h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9394h.getLayoutParams();
            rect.top += this.f9394h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final void m64406b(View view, int i) {
        LinearLayout linearLayout = this.f9395i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    public final void m64405c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f9391e = checkBox;
        m64407a(checkBox);
    }

    /* renamed from: d */
    public final void m64404d() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f9388b = imageView;
        m64406b(imageView, 0);
    }

    /* renamed from: e */
    public final void m64403e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f9389c = radioButton;
        m64407a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f9387a;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.f9387a = menuItemImpl;
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(menuItemImpl.m64378e(this));
        setCheckable(menuItemImpl.isCheckable());
        setShortcut(menuItemImpl.m64374i(), menuItemImpl.m64380c());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.f9396j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f9390d = textView;
        int i = this.f9397k;
        if (i != -1) {
            textView.setTextAppearance(this.f9398l, i);
        }
        this.f9392f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f9393g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9400n);
        }
        this.f9394h = (ImageView) findViewById(R.id.group_divider);
        this.f9395i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f9388b != null && this.f9399m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9388b.getLayoutParams();
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
        if (!z && this.f9389c == null && this.f9391e == null) {
            return;
        }
        if (this.f9387a.isExclusiveCheckable()) {
            if (this.f9389c == null) {
                m64403e();
            }
            compoundButton = this.f9389c;
            view = this.f9391e;
        } else {
            if (this.f9391e == null) {
                m64405c();
            }
            compoundButton = this.f9391e;
            view = this.f9389c;
        }
        if (z) {
            compoundButton.setChecked(this.f9387a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f9391e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f9389c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f9387a.isExclusiveCheckable()) {
            if (this.f9389c == null) {
                m64403e();
            }
            compoundButton = this.f9389c;
        } else {
            if (this.f9391e == null) {
                m64405c();
            }
            compoundButton = this.f9391e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f9403q = z;
        this.f9399m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f9394h;
        if (imageView != null) {
            if (!this.f9401o && z) {
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
        if (!this.f9387a.shouldShowIcon() && !this.f9403q) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.f9399m) {
            return;
        }
        ImageView imageView = this.f9388b;
        if (imageView == null && drawable == null && !this.f9399m) {
            return;
        }
        if (imageView == null) {
            m64404d();
        }
        if (drawable == null && !this.f9399m) {
            this.f9388b.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f9388b;
        if (!z) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f9388b.getVisibility() != 0) {
            this.f9388b.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
        int i;
        if (z && this.f9387a.m64374i()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            this.f9392f.setText(this.f9387a.m64379d());
        }
        if (this.f9392f.getVisibility() != i) {
            this.f9392f.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f9390d.setText(charSequence);
            if (this.f9390d.getVisibility() != 0) {
                this.f9390d.setVisibility(0);
            }
        } else if (this.f9390d.getVisibility() != 8) {
            this.f9390d.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return this.f9403q;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MenuView, i, 0);
        this.f9396j = obtainStyledAttributes.getDrawable(R.styleable.MenuView_android_itemBackground);
        this.f9397k = obtainStyledAttributes.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f9399m = obtainStyledAttributes.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
        this.f9398l = context;
        this.f9400n = obtainStyledAttributes.getDrawable(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f9401o = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }
}