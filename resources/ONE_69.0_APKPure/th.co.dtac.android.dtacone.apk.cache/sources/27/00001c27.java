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
    public final C2160f f9631a;

    /* renamed from: b */
    public final View$OnClickListenerC2161g f9632b;

    /* renamed from: c */
    public final View f9633c;

    /* renamed from: d */
    public final Drawable f9634d;

    /* renamed from: e */
    public final FrameLayout f9635e;

    /* renamed from: f */
    public final ImageView f9636f;

    /* renamed from: g */
    public final FrameLayout f9637g;

    /* renamed from: h */
    public final ImageView f9638h;

    /* renamed from: i */
    public final int f9639i;

    /* renamed from: j */
    public ActionProvider f9640j;

    /* renamed from: k */
    public final DataSetObserver f9641k;

    /* renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f9642l;

    /* renamed from: m */
    public ListPopupWindow f9643m;

    /* renamed from: n */
    public PopupWindow.OnDismissListener f9644n;

    /* renamed from: o */
    public boolean f9645o;

    /* renamed from: p */
    public int f9646p;

    /* renamed from: q */
    public boolean f9647q;

    /* renamed from: r */
    public int f9648r;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f9649a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f9649a);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    /* loaded from: classes.dex */
    public class C2155a extends DataSetObserver {
        public C2155a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f9631a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f9631a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2156b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2156b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.isShowingPopup()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                ActionProvider actionProvider = ActivityChooserView.this.f9640j;
                if (actionProvider != null) {
                    actionProvider.subUiVisibilityChanged(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    /* loaded from: classes.dex */
    public class C2157c extends View.AccessibilityDelegate {
        public C2157c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    /* loaded from: classes.dex */
    public class C2158d extends ForwardingListener {
        public C2158d(View view) {
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
    public class C2159e extends DataSetObserver {
        public C2159e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m64327b();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    /* loaded from: classes.dex */
    public class C2160f extends BaseAdapter {

        /* renamed from: a */
        public ActivityChooserModel f9655a;

        /* renamed from: b */
        public int f9656b = 4;

        /* renamed from: c */
        public boolean f9657c;

        /* renamed from: d */
        public boolean f9658d;

        /* renamed from: e */
        public boolean f9659e;

        public C2160f() {
        }

        /* renamed from: a */
        public int m64326a() {
            return this.f9655a.m64342f();
        }

        /* renamed from: b */
        public ActivityChooserModel m64325b() {
            return this.f9655a;
        }

        /* renamed from: c */
        public ResolveInfo m64324c() {
            return this.f9655a.m64340h();
        }

        /* renamed from: d */
        public int m64323d() {
            return this.f9655a.m64339i();
        }

        /* renamed from: e */
        public boolean m64322e() {
            return this.f9657c;
        }

        /* renamed from: f */
        public int m64321f() {
            int i = this.f9656b;
            this.f9656b = Integer.MAX_VALUE;
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
            this.f9656b = i;
            return i2;
        }

        /* renamed from: g */
        public void m64320g(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel m64325b = ActivityChooserView.this.f9631a.m64325b();
            if (m64325b != null && ActivityChooserView.this.isShown()) {
                m64325b.unregisterObserver(ActivityChooserView.this.f9641k);
            }
            this.f9655a = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.f9641k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int m64342f = this.f9655a.m64342f();
            if (!this.f9657c && this.f9655a.m64340h() != null) {
                m64342f--;
            }
            int min = Math.min(m64342f, this.f9656b);
            if (this.f9659e) {
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
            if (!this.f9657c && this.f9655a.m64340h() != null) {
                i++;
            }
            return this.f9655a.m64343e(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (this.f9659e && i == getCount() - 1) {
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
            if (this.f9657c && i == 0 && this.f9658d) {
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
        public void m64319h(int i) {
            if (this.f9656b != i) {
                this.f9656b = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: i */
        public void m64318i(boolean z, boolean z2) {
            if (this.f9657c != z || this.f9658d != z2) {
                this.f9657c = z;
                this.f9658d = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: j */
        public void m64317j(boolean z) {
            if (this.f9659e != z) {
                this.f9659e = z;
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2161g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public View$OnClickListenerC2161g() {
        }

        /* renamed from: a */
        public final void m64316a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f9644n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f9637g) {
                activityChooserView.dismissPopup();
                Intent m64346b = ActivityChooserView.this.f9631a.m64325b().m64346b(ActivityChooserView.this.f9631a.m64325b().m64341g(ActivityChooserView.this.f9631a.m64324c()));
                if (m64346b != null) {
                    m64346b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(m64346b);
                }
            } else if (view == activityChooserView.f9635e) {
                activityChooserView.f9645o = false;
                activityChooserView.m64328a(activityChooserView.f9646p);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m64316a();
            ActionProvider actionProvider = ActivityChooserView.this.f9640j;
            if (actionProvider != null) {
                actionProvider.subUiVisibilityChanged(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            int itemViewType = ((C2160f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.m64328a(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.dismissPopup();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f9645o) {
                if (i > 0) {
                    activityChooserView.f9631a.m64325b().m64333o(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.f9631a.m64322e()) {
                i++;
            }
            Intent m64346b = ActivityChooserView.this.f9631a.m64325b().m64346b(i);
            if (m64346b != null) {
                m64346b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(m64346b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f9637g) {
                if (activityChooserView.f9631a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f9645o = true;
                    activityChooserView2.m64328a(activityChooserView2.f9646p);
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
    public void m64328a(int i) {
        ?? r0;
        if (this.f9631a.m64325b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f9642l);
            if (this.f9637g.getVisibility() == 0) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            int m64326a = this.f9631a.m64326a();
            if (i != Integer.MAX_VALUE && m64326a > i + r0) {
                this.f9631a.m64317j(true);
                this.f9631a.m64319h(i - 1);
            } else {
                this.f9631a.m64317j(false);
                this.f9631a.m64319h(i);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.isShowing()) {
                if (!this.f9645o && r0 != 0) {
                    this.f9631a.m64318i(false, false);
                } else {
                    this.f9631a.m64318i(true, r0);
                }
                listPopupWindow.setContentWidth(Math.min(this.f9631a.m64321f(), this.f9639i));
                listPopupWindow.show();
                ActionProvider actionProvider = this.f9640j;
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
    public void m64327b() {
        if (this.f9631a.getCount() > 0) {
            this.f9635e.setEnabled(true);
        } else {
            this.f9635e.setEnabled(false);
        }
        int m64326a = this.f9631a.m64326a();
        int m64323d = this.f9631a.m64323d();
        if (m64326a != 1 && (m64326a <= 1 || m64323d <= 0)) {
            this.f9637g.setVisibility(8);
        } else {
            this.f9637g.setVisibility(0);
            ResolveInfo m64324c = this.f9631a.m64324c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f9638h.setImageDrawable(m64324c.loadIcon(packageManager));
            if (this.f9648r != 0) {
                this.f9637g.setContentDescription(getContext().getString(this.f9648r, m64324c.loadLabel(packageManager)));
            }
        }
        if (this.f9637g.getVisibility() == 0) {
            this.f9633c.setBackgroundDrawable(this.f9634d);
        } else {
            this.f9633c.setBackgroundDrawable(null);
        }
    }

    public boolean dismissPopup() {
        if (isShowingPopup()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f9642l);
                return true;
            }
            return true;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ActivityChooserModel getDataModel() {
        return this.f9631a.m64325b();
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f9643m == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f9643m = listPopupWindow;
            listPopupWindow.setAdapter(this.f9631a);
            this.f9643m.setAnchorView(this);
            this.f9643m.setModal(true);
            this.f9643m.setOnItemClickListener(this.f9632b);
            this.f9643m.setOnDismissListener(this.f9632b);
        }
        return this.f9643m;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel m64325b = this.f9631a.m64325b();
        if (m64325b != null) {
            m64325b.registerObserver(this.f9641k);
        }
        this.f9647q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel m64325b = this.f9631a.m64325b();
        if (m64325b != null) {
            m64325b.unregisterObserver(this.f9641k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9642l);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.f9647q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f9633c.layout(0, 0, i3 - i, i4 - i2);
        if (!isShowingPopup()) {
            dismissPopup();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f9633c;
        if (this.f9637g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        this.f9631a.m64320g(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f9648r = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f9636f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f9636f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f9646p = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f9644n = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(ActionProvider actionProvider) {
        this.f9640j = actionProvider;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.f9647q) {
            return false;
        }
        this.f9645o = false;
        m64328a(this.f9646p);
        return true;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9641k = new C2155a();
        this.f9642l = new ViewTreeObserver$OnGlobalLayoutListenerC2156b();
        this.f9646p = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActivityChooserView, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ActivityChooserView, attributeSet, obtainStyledAttributes, i, 0);
        this.f9646p = obtainStyledAttributes.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        View$OnClickListenerC2161g view$OnClickListenerC2161g = new View$OnClickListenerC2161g();
        this.f9632b = view$OnClickListenerC2161g;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.f9633c = findViewById;
        this.f9634d = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f9637g = frameLayout;
        frameLayout.setOnClickListener(view$OnClickListenerC2161g);
        frameLayout.setOnLongClickListener(view$OnClickListenerC2161g);
        this.f9638h = (ImageView) frameLayout.findViewById(R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(view$OnClickListenerC2161g);
        frameLayout2.setAccessibilityDelegate(new C2157c());
        frameLayout2.setOnTouchListener(new C2158d(frameLayout2));
        this.f9635e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.image);
        this.f9636f = imageView;
        imageView.setImageDrawable(drawable);
        C2160f c2160f = new C2160f();
        this.f9631a = c2160f;
        c2160f.registerDataSetObserver(new C2159e());
        Resources resources = context.getResources();
        this.f9639i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }
}