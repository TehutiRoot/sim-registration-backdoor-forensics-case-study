package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.IntentCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ShareCompat {
    public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* loaded from: classes2.dex */
    public static class IntentBuilder {

        /* renamed from: a */
        public final Context f33795a;

        /* renamed from: b */
        public final Intent f33796b;

        /* renamed from: c */
        public CharSequence f33797c;

        /* renamed from: d */
        public ArrayList f33798d;

        /* renamed from: e */
        public ArrayList f33799e;

        /* renamed from: f */
        public ArrayList f33800f;

        /* renamed from: g */
        public ArrayList f33801g;

        public IntentBuilder(@NonNull Context context) {
            Activity activity;
            this.f33795a = (Context) Preconditions.checkNotNull(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f33796b = action;
            action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, context.getPackageName());
            action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f33796b.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
                this.f33796b.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
            }
        }

        @NonNull
        @Deprecated
        public static IntentBuilder from(@NonNull Activity activity) {
            return new IntentBuilder(activity);
        }

        /* renamed from: a */
        public final void m57575a(String str, ArrayList arrayList) {
            int i;
            String[] stringArrayExtra = this.f33796b.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i = stringArrayExtra.length;
            } else {
                i = 0;
            }
            String[] strArr = new String[arrayList.size() + i];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i);
            }
            this.f33796b.putExtra(str, strArr);
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String str) {
            if (this.f33800f == null) {
                this.f33800f = new ArrayList();
            }
            this.f33800f.add(str);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String str) {
            if (this.f33799e == null) {
                this.f33799e = new ArrayList();
            }
            this.f33799e.add(str);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String str) {
            if (this.f33798d == null) {
                this.f33798d = new ArrayList();
            }
            this.f33798d.add(str);
            return this;
        }

        @NonNull
        public IntentBuilder addStream(@NonNull Uri uri) {
            if (this.f33801g == null) {
                this.f33801g = new ArrayList();
            }
            this.f33801g.add(uri);
            return this;
        }

        /* renamed from: b */
        public final void m57574b(String str, String[] strArr) {
            int i;
            Intent intent = getIntent();
            String[] stringArrayExtra = intent.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i = stringArrayExtra.length;
            } else {
                i = 0;
            }
            String[] strArr2 = new String[strArr.length + i];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, i);
            }
            System.arraycopy(strArr, 0, strArr2, i, strArr.length);
            intent.putExtra(str, strArr2);
        }

        /* renamed from: c */
        public Context m57573c() {
            return this.f33795a;
        }

        @NonNull
        public Intent createChooserIntent() {
            return Intent.createChooser(getIntent(), this.f33797c);
        }

        @NonNull
        public Intent getIntent() {
            ArrayList arrayList = this.f33798d;
            if (arrayList != null) {
                m57575a("android.intent.extra.EMAIL", arrayList);
                this.f33798d = null;
            }
            ArrayList arrayList2 = this.f33799e;
            if (arrayList2 != null) {
                m57575a("android.intent.extra.CC", arrayList2);
                this.f33799e = null;
            }
            ArrayList arrayList3 = this.f33800f;
            if (arrayList3 != null) {
                m57575a("android.intent.extra.BCC", arrayList3);
                this.f33800f = null;
            }
            ArrayList arrayList4 = this.f33801g;
            if (arrayList4 != null && arrayList4.size() > 1) {
                this.f33796b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f33796b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f33801g);
                C3909a.m57571b(this.f33796b, this.f33801g);
            } else {
                this.f33796b.setAction("android.intent.action.SEND");
                ArrayList arrayList5 = this.f33801g;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.f33796b.putExtra("android.intent.extra.STREAM", (Parcelable) this.f33801g.get(0));
                    C3909a.m57571b(this.f33796b, this.f33801g);
                } else {
                    this.f33796b.removeExtra("android.intent.extra.STREAM");
                    C3909a.m57570c(this.f33796b);
                }
            }
            return this.f33796b;
        }

        @NonNull
        public IntentBuilder setChooserTitle(@Nullable CharSequence charSequence) {
            this.f33797c = charSequence;
            return this;
        }

        @NonNull
        public IntentBuilder setEmailBcc(@Nullable String[] strArr) {
            this.f33796b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder setEmailCc(@Nullable String[] strArr) {
            this.f33796b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder setEmailTo(@Nullable String[] strArr) {
            if (this.f33798d != null) {
                this.f33798d = null;
            }
            this.f33796b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder setHtmlText(@Nullable String str) {
            this.f33796b.putExtra(IntentCompat.EXTRA_HTML_TEXT, str);
            if (!this.f33796b.hasExtra("android.intent.extra.TEXT")) {
                setText(Html.fromHtml(str));
            }
            return this;
        }

        @NonNull
        public IntentBuilder setStream(@Nullable Uri uri) {
            this.f33801g = null;
            if (uri != null) {
                addStream(uri);
            }
            return this;
        }

        @NonNull
        public IntentBuilder setSubject(@Nullable String str) {
            this.f33796b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @NonNull
        public IntentBuilder setText(@Nullable CharSequence charSequence) {
            this.f33796b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @NonNull
        public IntentBuilder setType(@Nullable String str) {
            this.f33796b.setType(str);
            return this;
        }

        public void startChooser() {
            this.f33795a.startActivity(createChooserIntent());
        }

        @NonNull
        public IntentBuilder setChooserTitle(@StringRes int i) {
            return setChooserTitle(this.f33795a.getText(i));
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String[] strArr) {
            m57574b("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String[] strArr) {
            m57574b("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String[] strArr) {
            m57574b("android.intent.extra.EMAIL", strArr);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class IntentReader {

        /* renamed from: a */
        public final Context f33802a;

        /* renamed from: b */
        public final Intent f33803b;

        /* renamed from: c */
        public final String f33804c;

        /* renamed from: d */
        public final ComponentName f33805d;

        /* renamed from: e */
        public ArrayList f33806e;

        public IntentReader(@NonNull Activity activity) {
            this((Context) Preconditions.checkNotNull(activity), activity.getIntent());
        }

        @NonNull
        @Deprecated
        public static IntentReader from(@NonNull Activity activity) {
            return new IntentReader(activity);
        }

        @Nullable
        public ComponentName getCallingActivity() {
            return this.f33805d;
        }

        @Nullable
        public Drawable getCallingActivityIcon() {
            if (this.f33805d == null) {
                return null;
            }
            try {
                return this.f33802a.getPackageManager().getActivityIcon(this.f33805d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public Drawable getCallingApplicationIcon() {
            if (this.f33804c == null) {
                return null;
            }
            try {
                return this.f33802a.getPackageManager().getApplicationIcon(this.f33804c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public CharSequence getCallingApplicationLabel() {
            if (this.f33804c == null) {
                return null;
            }
            PackageManager packageManager = this.f33802a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f33804c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public String getCallingPackage() {
            return this.f33804c;
        }

        @Nullable
        public String[] getEmailBcc() {
            return this.f33803b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @Nullable
        public String[] getEmailCc() {
            return this.f33803b.getStringArrayExtra("android.intent.extra.CC");
        }

        @Nullable
        public String[] getEmailTo() {
            return this.f33803b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @Nullable
        public String getHtmlText() {
            String stringExtra = this.f33803b.getStringExtra(IntentCompat.EXTRA_HTML_TEXT);
            if (stringExtra == null) {
                CharSequence text = getText();
                if (text instanceof Spanned) {
                    return Html.toHtml((Spanned) text);
                }
                if (text != null) {
                    return C3909a.m57572a(text);
                }
                return stringExtra;
            }
            return stringExtra;
        }

        @Nullable
        public Uri getStream() {
            return (Uri) this.f33803b.getParcelableExtra("android.intent.extra.STREAM");
        }

        public int getStreamCount() {
            if (this.f33806e == null && isMultipleShare()) {
                this.f33806e = this.f33803b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.f33806e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.f33803b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @Nullable
        public String getSubject() {
            return this.f33803b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @Nullable
        public CharSequence getText() {
            return this.f33803b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @Nullable
        public String getType() {
            return this.f33803b.getType();
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f33803b.getAction());
        }

        public boolean isShareIntent() {
            String action = this.f33803b.getAction();
            if (!"android.intent.action.SEND".equals(action) && !"android.intent.action.SEND_MULTIPLE".equals(action)) {
                return false;
            }
            return true;
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.f33803b.getAction());
        }

        public IntentReader(@NonNull Context context, @NonNull Intent intent) {
            this.f33802a = (Context) Preconditions.checkNotNull(context);
            this.f33803b = (Intent) Preconditions.checkNotNull(intent);
            this.f33804c = ShareCompat.m57576b(intent);
            this.f33805d = ShareCompat.m57577a(intent);
        }

        @Nullable
        public Uri getStream(int i) {
            if (this.f33806e == null && isMultipleShare()) {
                this.f33806e = this.f33803b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.f33806e;
            if (arrayList != null) {
                return (Uri) arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.f33803b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + getStreamCount() + " index requested: " + i);
        }
    }

    /* renamed from: androidx.core.app.ShareCompat$a */
    /* loaded from: classes2.dex */
    public static class C3909a {
        @DoNotInline
        /* renamed from: a */
        public static String m57572a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57571b(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(IntentCompat.EXTRA_HTML_TEXT), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57570c(@NonNull Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* renamed from: a */
    public static ComponentName m57577a(Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        if (componentName == null) {
            return (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY_INTEROP);
        }
        return componentName;
    }

    /* renamed from: b */
    public static String m57576b(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_CALLING_PACKAGE);
        if (stringExtra == null) {
            return intent.getStringExtra(EXTRA_CALLING_PACKAGE_INTEROP);
        }
        return stringExtra;
    }

    @Deprecated
    public static void configureMenuItem(@NonNull MenuItem menuItem, @NonNull IntentBuilder intentBuilder) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(intentBuilder.m57573c());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(".sharecompat_" + intentBuilder.m57573c().getClass().getName());
        shareActionProvider.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider(shareActionProvider);
    }

    @Nullable
    public static ComponentName getCallingActivity(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return m57577a(intent);
        }
        return callingActivity;
    }

    @Nullable
    public static String getCallingPackage(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null && intent != null) {
            return m57576b(intent);
        }
        return callingPackage;
    }

    @Deprecated
    public static void configureMenuItem(@NonNull Menu menu, @IdRes int i, @NonNull IntentBuilder intentBuilder) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            configureMenuItem(findItem, intentBuilder);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
    }
}