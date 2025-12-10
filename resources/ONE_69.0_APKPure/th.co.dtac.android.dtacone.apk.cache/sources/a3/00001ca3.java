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
    public int f9964d;

    /* renamed from: e */
    public final MenuItem$OnMenuItemClickListenerC2228b f9965e;

    /* renamed from: f */
    public final Context f9966f;

    /* renamed from: g */
    public String f9967g;

    /* renamed from: h */
    public OnShareTargetSelectedListener f9968h;

    /* renamed from: i */
    public ActivityChooserModel.OnChooseActivityListener f9969i;

    /* loaded from: classes.dex */
    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.ShareActionProvider$a */
    /* loaded from: classes.dex */
    public class C2227a implements ActivityChooserModel.OnChooseActivityListener {
        public C2227a() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.f9968h;
            if (onShareTargetSelectedListener != null) {
                onShareTargetSelectedListener.onShareTargetSelected(shareActionProvider, intent);
                return false;
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ShareActionProvider$b */
    /* loaded from: classes.dex */
    public class MenuItem$OnMenuItemClickListenerC2228b implements MenuItem.OnMenuItemClickListener {
        public MenuItem$OnMenuItemClickListenerC2228b() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent m64346b = ActivityChooserModel.m64344d(shareActionProvider.f9966f, shareActionProvider.f9967g).m64346b(menuItem.getItemId());
            if (m64346b != null) {
                String action = m64346b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    ShareActionProvider.this.m64126b(m64346b);
                }
                ShareActionProvider.this.f9966f.startActivity(m64346b);
                return true;
            }
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f9964d = 4;
        this.f9965e = new MenuItem$OnMenuItemClickListenerC2228b();
        this.f9967g = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.f9966f = context;
    }

    /* renamed from: a */
    public final void m64127a() {
        if (this.f9968h == null) {
            return;
        }
        if (this.f9969i == null) {
            this.f9969i = new C2227a();
        }
        ActivityChooserModel.m64344d(this.f9966f, this.f9967g).m64331q(this.f9969i);
    }

    /* renamed from: b */
    public void m64126b(Intent intent) {
        intent.addFlags(134742016);
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f9966f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.m64344d(this.f9966f, this.f9967g));
        }
        TypedValue typedValue = new TypedValue();
        this.f9966f.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.getDrawable(this.f9966f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel m64344d = ActivityChooserModel.m64344d(this.f9966f, this.f9967g);
        PackageManager packageManager = this.f9966f.getPackageManager();
        int m64342f = m64344d.m64342f();
        int min = Math.min(m64342f, this.f9964d);
        for (int i = 0; i < min; i++) {
            ResolveInfo m64343e = m64344d.m64343e(i);
            subMenu.add(0, i, i, m64343e.loadLabel(packageManager)).setIcon(m64343e.loadIcon(packageManager)).setOnMenuItemClickListener(this.f9965e);
        }
        if (min < m64342f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f9966f.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < m64342f; i2++) {
                ResolveInfo m64343e2 = m64344d.m64343e(i2);
                addSubMenu.add(0, i2, i2, m64343e2.loadLabel(packageManager)).setIcon(m64343e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f9965e);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.f9968h = onShareTargetSelectedListener;
        m64127a();
    }

    public void setShareHistoryFileName(String str) {
        this.f9967g = str;
        m64127a();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                m64126b(intent);
            }
        }
        ActivityChooserModel.m64344d(this.f9966f, this.f9967g).m64332p(intent);
    }
}