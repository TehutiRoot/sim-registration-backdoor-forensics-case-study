package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;

/* loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";

    /* renamed from: d */
    public int f9876d;

    /* renamed from: e */
    public final MenuItem$OnMenuItemClickListenerC2246b f9877e;

    /* renamed from: f */
    public final Context f9878f;

    /* renamed from: g */
    public String f9879g;

    /* renamed from: h */
    public OnShareTargetSelectedListener f9880h;

    /* renamed from: i */
    public ActivityChooserModel.OnChooseActivityListener f9881i;

    /* loaded from: classes.dex */
    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.ShareActionProvider$a */
    /* loaded from: classes.dex */
    public class C2245a implements ActivityChooserModel.OnChooseActivityListener {
        public C2245a() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.f9880h;
            if (onShareTargetSelectedListener != null) {
                onShareTargetSelectedListener.onShareTargetSelected(shareActionProvider, intent);
                return false;
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ShareActionProvider$b */
    /* loaded from: classes.dex */
    public class MenuItem$OnMenuItemClickListenerC2246b implements MenuItem.OnMenuItemClickListener {
        public MenuItem$OnMenuItemClickListenerC2246b() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent m64395b = ActivityChooserModel.m64393d(shareActionProvider.f9878f, shareActionProvider.f9879g).m64395b(menuItem.getItemId());
            if (m64395b != null) {
                String action = m64395b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    ShareActionProvider.this.m64175b(m64395b);
                }
                ShareActionProvider.this.f9878f.startActivity(m64395b);
                return true;
            }
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f9876d = 4;
        this.f9877e = new MenuItem$OnMenuItemClickListenerC2246b();
        this.f9879g = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.f9878f = context;
    }

    /* renamed from: a */
    public final void m64176a() {
        if (this.f9880h == null) {
            return;
        }
        if (this.f9881i == null) {
            this.f9881i = new C2245a();
        }
        ActivityChooserModel.m64393d(this.f9878f, this.f9879g).m64380q(this.f9881i);
    }

    /* renamed from: b */
    public void m64175b(Intent intent) {
        intent.addFlags(134742016);
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f9878f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.m64393d(this.f9878f, this.f9879g));
        }
        TypedValue typedValue = new TypedValue();
        this.f9878f.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.getDrawable(this.f9878f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel m64393d = ActivityChooserModel.m64393d(this.f9878f, this.f9879g);
        PackageManager packageManager = this.f9878f.getPackageManager();
        int m64391f = m64393d.m64391f();
        int min = Math.min(m64391f, this.f9876d);
        for (int i = 0; i < min; i++) {
            ResolveInfo m64392e = m64393d.m64392e(i);
            subMenu.add(0, i, i, m64392e.loadLabel(packageManager)).setIcon(m64392e.loadIcon(packageManager)).setOnMenuItemClickListener(this.f9877e);
        }
        if (min < m64391f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f9878f.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < m64391f; i2++) {
                ResolveInfo m64392e2 = m64393d.m64392e(i2);
                addSubMenu.add(0, i2, i2, m64392e2.loadLabel(packageManager)).setIcon(m64392e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f9877e);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.f9880h = onShareTargetSelectedListener;
        m64176a();
    }

    public void setShareHistoryFileName(String str) {
        this.f9879g = str;
        m64176a();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                m64175b(intent);
            }
        }
        ActivityChooserModel.m64393d(this.f9878f, this.f9879g).m64381p(intent);
    }
}
