package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {

    /* renamed from: a */
    public final C2178f f9543a;

    /* renamed from: b */
    public final View$OnClickListenerC2179g f9544b;

    /* renamed from: c */
    public final View f9545c;

    /* renamed from: d */
    public final Drawable f9546d;

    /* renamed from: e */
    public final FrameLayout f9547e;

    /* renamed from: f */
    public final ImageView f9548f;

    /* renamed from: g */
    public final FrameLayout f9549g;

    /* renamed from: h */
    public final ImageView f9550h;

    /* renamed from: i */
    public final int f9551i;

    /* renamed from: j */
    public ActionProvider f9552j;

    /* renamed from: k */
    public final DataSetObserver f9553k;

    /* renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f9554l;

    /* renamed from: m */
    public ListPopupWindow f9555m;

    /* renamed from: n */
    public PopupWindow.OnDismissListener f9556n;

    /* renamed from: o */
    public boolean f9557o;

    /* renamed from: p */
    public int f9558p;

    /* renamed from: q */
    public boolean f9559q;

    /* renamed from: r */
    public int f9560r;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f9561a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f9561a);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    /* loaded from: classes.dex */
    public class C2173a extends DataSetObserver {
        public C2173a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f9543a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f9543a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2174b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2174b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.isShowingPopup()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                ActionProvider actionProvider = ActivityChooserView.this.f9552j;
                if (actionProvider != null) {
                    actionProvider.subUiVisibilityChanged(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    /* loaded from: classes.dex */
    public class C2175c extends View.AccessibilityDelegate {
        public C2175c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    /* loaded from: classes.dex */
    public class C2176d extends ForwardingListener {
        public C2176d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu getPopup() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            ActivityChooserView.this.showPopup();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStopped() {
            ActivityChooserView.this.dismissPopup();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    /* loaded from: classes.dex */
    public class C2177e extends DataSetObserver {
        public C2177e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m64376b();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    /* loaded from: classes.dex */
    public class C2178f extends BaseAdapter {

        /* renamed from: a */
        public ActivityChooserModel f9567a;

        /* renamed from: b */
        public int f9568b = 4;

        /* renamed from: c */
        public boolean f9569c;

        /* renamed from: d */
        public boolean f9570d;

        /* renamed from: e */
        public boolean f9571e;

        public C2178f() {
        }

        /* renamed from: a */
        public int m64375a() {
            return this.f9567a.m64391f();
        }

        /* renamed from: b */
        public ActivityChooserModel m64374b() {
            return this.f9567a;
        }

        /* renamed from: c */
        public ResolveInfo m64373c() {
            return this.f9567a.m64389h();
        }

        /* renamed from: d */
        public int m64372d() {
            return this.f9567a.m64388i();
        }

        /* renamed from: e */
        public boolean m64371e() {
            return this.f9569c;
        }

        /* renamed from: f */
        public int m64370f() {
            int i = this.f9568b;
            this.f9568b = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f9568b = i;
            return i2;
        }

        /* renamed from: g */
        public void m64369g(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel m64374b = ActivityChooserView.this.f9543a.m64374b();
            if (m64374b != null && ActivityChooserView.this.isShown()) {
                m64374b.unregisterObserver(ActivityChooserView.this.f9553k);
            }
            this.f9567a = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.f9553k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int m64391f = this.f9567a.m64391f();
            if (!this.f9569c && this.f9567a.m64389h() != null) {
                m64391f--;
            }
            int min = Math.min(m64391f, this.f9568b);
            if (this.f9571e) {
                return min + 1;
            }
            return min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f9569c && this.f9567a.m64389h() != null) {
                i++;
            }
            return this.f9567a.m64392e(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (this.f9571e && i == getCount() - 1) {
                return 1;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != R.id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f9569c && i == 0 && this.f9570d) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: h */
        public void m64368h(int i) {
            if (this.f9568b != i) {
                this.f9568b = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: i */
        public void m64367i(boolean z, boolean z2) {
            if (this.f9569c != z || this.f9570d != z2) {
                this.f9569c = z;
                this.f9570d = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: j */
        public void m64366j(boolean z) {
            if (this.f9571e != z) {
                this.f9571e = z;
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2179g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public View$OnClickListenerC2179g() {
        }

        /* renamed from: a */
        public final void m64365a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f9556n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f9549g) {
                activityChooserView.dismissPopup();
                Intent m64395b = ActivityChooserView.this.f9543a.m64374b().m64395b(ActivityChooserView.this.f9543a.m64374b().m64390g(ActivityChooserView.this.f9543a.m64373c()));
                if (m64395b != null) {
                    m64395b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(m64395b);
                }
            } else if (view == activityChooserView.f9547e) {
                activityChooserView.f9557o = false;
                activityChooserView.m64377a(activityChooserView.f9558p);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m64365a();
            ActionProvider actionProvider = ActivityChooserView.this.f9552j;
            if (actionProvider != null) {
                actionProvider.subUiVisibilityChanged(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            int itemViewType = ((C2178f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.m64377a(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.dismissPopup();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f9557o) {
                if (i > 0) {
                    activityChooserView.f9543a.m64374b().m64382o(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.f9543a.m64371e()) {
                i++;
            }
            Intent m64395b = ActivityChooserView.this.f9543a.m64374b().m64395b(i);
            if (m64395b != null) {
                m64395b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(m64395b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f9549g) {
                if (activityChooserView.f9543a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f9557o = true;
                    activityChooserView2.m64377a(activityChooserView2.f9558p);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* renamed from: a */
    public void m64377a(int i) {
        ?? r0;
        if (this.f9543a.m64374b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f9554l);
            if (this.f9549g.getVisibility() == 0) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            int m64375a = this.f9543a.m64375a();
            if (i != Integer.MAX_VALUE && m64375a > i + r0) {
                this.f9543a.m64366j(true);
                this.f9543a.m64368h(i - 1);
            } else {
                this.f9543a.m64366j(false);
                this.f9543a.m64368h(i);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.isShowing()) {
                if (!this.f9557o && r0 != 0) {
                    this.f9543a.m64367i(false, false);
                } else {
                    this.f9543a.m64367i(true, r0);
                }
                listPopupWindow.setContentWidth(Math.min(this.f9543a.m64370f(), this.f9551i));
                listPopupWindow.show();
                ActionProvider actionProvider = this.f9552j;
                if (actionProvider != null) {
                    actionProvider.subUiVisibilityChanged(true);
                }
                listPopupWindow.getListView().setContentDescription(getContext().getString(R.string.abc_activitychooserview_choose_application));
                listPopupWindow.getListView().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: b */
    public void m64376b() {
        if (this.f9543a.getCount() > 0) {
            this.f9547e.setEnabled(true);
        } else {
            this.f9547e.setEnabled(false);
        }
        int m64375a = this.f9543a.m64375a();
        int m64372d = this.f9543a.m64372d();
        if (m64375a != 1 && (m64375a <= 1 || m64372d <= 0)) {
            this.f9549g.setVisibility(8);
        } else {
            this.f9549g.setVisibility(0);
            ResolveInfo m64373c = this.f9543a.m64373c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f9550h.setImageDrawable(m64373c.loadIcon(packageManager));
            if (this.f9560r != 0) {
                this.f9549g.setContentDescription(getContext().getString(this.f9560r, m64373c.loadLabel(packageManager)));
            }
        }
        if (this.f9549g.getVisibility() == 0) {
            this.f9545c.setBackgroundDrawable(this.f9546d);
        } else {
            this.f9545c.setBackgroundDrawable(null);
        }
    }

    public boolean dismissPopup() {
        if (isShowingPopup()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f9554l);
                return true;
            }
            return true;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ActivityChooserModel getDataModel() {
        return this.f9543a.m64374b();
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f9555m == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f9555m = listPopupWindow;
            listPopupWindow.setAdapter(this.f9543a);
            this.f9555m.setAnchorView(this);
            this.f9555m.setModal(true);
            this.f9555m.setOnItemClickListener(this.f9544b);
            this.f9555m.setOnDismissListener(this.f9544b);
        }
        return this.f9555m;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel m64374b = this.f9543a.m64374b();
        if (m64374b != null) {
            m64374b.registerObserver(this.f9553k);
        }
        this.f9559q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel m64374b = this.f9543a.m64374b();
        if (m64374b != null) {
            m64374b.unregisterObserver(this.f9553k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9554l);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.f9559q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f9545c.layout(0, 0, i3 - i, i4 - i2);
        if (!isShowingPopup()) {
            dismissPopup();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f9545c;
        if (this.f9549g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        this.f9543a.m64369g(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f9560r = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f9548f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f9548f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f9558p = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f9556n = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(ActionProvider actionProvider) {
        this.f9552j = actionProvider;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.f9559q) {
            return false;
        }
        this.f9557o = false;
        m64377a(this.f9558p);
        return true;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9553k = new C2173a();
        this.f9554l = new ViewTreeObserver$OnGlobalLayoutListenerC2174b();
        this.f9558p = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActivityChooserView, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ActivityChooserView, attributeSet, obtainStyledAttributes, i, 0);
        this.f9558p = obtainStyledAttributes.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        View$OnClickListenerC2179g view$OnClickListenerC2179g = new View$OnClickListenerC2179g();
        this.f9544b = view$OnClickListenerC2179g;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.f9545c = findViewById;
        this.f9546d = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f9549g = frameLayout;
        frameLayout.setOnClickListener(view$OnClickListenerC2179g);
        frameLayout.setOnLongClickListener(view$OnClickListenerC2179g);
        this.f9550h = (ImageView) frameLayout.findViewById(R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(view$OnClickListenerC2179g);
        frameLayout2.setAccessibilityDelegate(new C2175c());
        frameLayout2.setOnTouchListener(new C2176d(frameLayout2));
        this.f9547e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.image);
        this.f9548f = imageView;
        imageView.setImageDrawable(drawable);
        C2178f c2178f = new C2178f();
        this.f9543a = c2178f;
        c2178f.registerDataSetObserver(new C2177e());
        Resources resources = context.getResources();
        this.f9551i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }
}
