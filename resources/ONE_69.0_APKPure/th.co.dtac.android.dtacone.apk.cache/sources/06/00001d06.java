package androidx.browser.browseractions;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsIntent {
    public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_CUSTOM_ITEMS = 5;
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;

    /* renamed from: a */
    public final Intent f10202a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface BrowserActionsItemId {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface BrowserActionsUrlType {
    }

    public BrowserActionsIntent(Intent intent) {
        this.f10202a = intent;
    }

    /* renamed from: a */
    public static void m64020a(Context context, Intent intent, List list) {
        if (list != null && list.size() != 0) {
            int i = 0;
            if (list.size() == 1) {
                intent.setPackage(((ResolveInfo) list.get(0)).activityInfo.packageName);
            } else {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 65536);
                if (resolveActivity != null) {
                    String str = resolveActivity.activityInfo.packageName;
                    while (true) {
                        if (i >= list.size()) {
                            break;
                        } else if (str.equals(((ResolveInfo) list.get(i)).activityInfo.packageName)) {
                            intent.setPackage(str);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            ContextCompat.startActivity(context, intent, null);
            return;
        }
        m64019b(context, intent);
    }

    /* renamed from: b */
    public static void m64019b(Context context, Intent intent) {
        List<BrowserActionItem> list;
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(EXTRA_MENU_ITEMS);
        if (parcelableArrayListExtra != null) {
            list = parseBrowserActionItems(parcelableArrayListExtra);
        } else {
            list = null;
        }
        m64018c(context, data, list);
    }

    /* renamed from: c */
    public static void m64018c(Context context, Uri uri, List list) {
        new C0670Jc(context, uri, list).m67814e();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<ResolveInfo> getBrowserActionsIntentHandlers(@NonNull Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(ACTION_BROWSER_ACTIONS_OPEN, Uri.parse("https://www.example.com")), 131072);
    }

    @Nullable
    @Deprecated
    public static String getCreatorPackageName(@NonNull Intent intent) {
        return getUntrustedCreatorPackageName(intent);
    }

    @Nullable
    public static String getUntrustedCreatorPackageName(@NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(EXTRA_APP_ID);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    public static void launchIntent(@NonNull Context context, @NonNull Intent intent) {
        m64020a(context, intent, getBrowserActionsIntentHandlers(context));
    }

    public static void openBrowserAction(@NonNull Context context, @NonNull Uri uri) {
        launchIntent(context, new Builder(context, uri).build().getIntent());
    }

    @NonNull
    public static List<BrowserActionItem> parseBrowserActionItems(@NonNull ArrayList<Bundle> arrayList) {
        BrowserActionItem browserActionItem;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = arrayList.get(i);
            String string = bundle.getString(KEY_TITLE);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ACTION);
            int i2 = bundle.getInt(KEY_ICON_ID);
            Uri uri = (Uri) bundle.getParcelable("androidx.browser.browseractions.ICON_URI");
            if (!TextUtils.isEmpty(string) && pendingIntent != null) {
                if (i2 != 0) {
                    browserActionItem = new BrowserActionItem(string, pendingIntent, i2);
                } else {
                    browserActionItem = new BrowserActionItem(string, pendingIntent, uri);
                }
                arrayList2.add(browserActionItem);
            } else {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
        }
        return arrayList2;
    }

    @NonNull
    public Intent getIntent() {
        return this.f10202a;
    }

    public static void openBrowserAction(@NonNull Context context, @NonNull Uri uri, int i, @NonNull ArrayList<BrowserActionItem> arrayList, @NonNull PendingIntent pendingIntent) {
        launchIntent(context, new Builder(context, uri).setUrlType(i).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().getIntent());
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: b */
        public Context f10204b;

        /* renamed from: c */
        public Uri f10205c;

        /* renamed from: a */
        public final Intent f10203a = new Intent(BrowserActionsIntent.ACTION_BROWSER_ACTIONS_OPEN);

        /* renamed from: d */
        public int f10206d = 0;

        /* renamed from: e */
        public ArrayList f10207e = new ArrayList();

        /* renamed from: f */
        public PendingIntent f10208f = null;

        /* renamed from: g */
        public List f10209g = new ArrayList();

        public Builder(@NonNull Context context, @NonNull Uri uri) {
            this.f10204b = context;
            this.f10205c = uri;
        }

        /* renamed from: a */
        public final Bundle m64017a(BrowserActionItem browserActionItem) {
            Bundle bundle = new Bundle();
            bundle.putString(BrowserActionsIntent.KEY_TITLE, browserActionItem.getTitle());
            bundle.putParcelable(BrowserActionsIntent.KEY_ACTION, browserActionItem.getAction());
            if (browserActionItem.getIconId() != 0) {
                bundle.putInt(BrowserActionsIntent.KEY_ICON_ID, browserActionItem.getIconId());
            }
            if (browserActionItem.getIconUri() != null) {
                bundle.putParcelable("androidx.browser.browseractions.ICON_URI", browserActionItem.getIconUri());
            }
            return bundle;
        }

        @NonNull
        public BrowserActionsIntent build() {
            this.f10203a.setData(this.f10205c);
            this.f10203a.putExtra(BrowserActionsIntent.EXTRA_TYPE, this.f10206d);
            this.f10203a.putParcelableArrayListExtra(BrowserActionsIntent.EXTRA_MENU_ITEMS, this.f10207e);
            this.f10203a.putExtra(BrowserActionsIntent.EXTRA_APP_ID, PendingIntent.getActivity(this.f10204b, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f10208f;
            if (pendingIntent != null) {
                this.f10203a.putExtra(BrowserActionsIntent.EXTRA_SELECTED_ACTION_PENDING_INTENT, pendingIntent);
            }
            BrowserServiceFileProvider.grantReadPermission(this.f10203a, this.f10209g, this.f10204b);
            return new BrowserActionsIntent(this.f10203a);
        }

        @NonNull
        public Builder setCustomItems(@NonNull ArrayList<BrowserActionItem> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!TextUtils.isEmpty(arrayList.get(i).getTitle()) && arrayList.get(i).getAction() != null) {
                        this.f10207e.add(m64017a(arrayList.get(i)));
                        if (arrayList.get(i).getIconUri() != null) {
                            this.f10209g.add(arrayList.get(i).getIconUri());
                        }
                    } else {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @NonNull
        public Builder setOnItemSelectedAction(@NonNull PendingIntent pendingIntent) {
            this.f10208f = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setUrlType(int i) {
            this.f10206d = i;
            return this;
        }

        @NonNull
        public Builder setCustomItems(@NonNull BrowserActionItem... browserActionItemArr) {
            return setCustomItems(new ArrayList<>(Arrays.asList(browserActionItemArr)));
        }
    }
}