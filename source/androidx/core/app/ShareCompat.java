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
        public final Context f33707a;

        /* renamed from: b */
        public final Intent f33708b;

        /* renamed from: c */
        public CharSequence f33709c;

        /* renamed from: d */
        public ArrayList f33710d;

        /* renamed from: e */
        public ArrayList f33711e;

        /* renamed from: f */
        public ArrayList f33712f;

        /* renamed from: g */
        public ArrayList f33713g;

        public IntentBuilder(@NonNull Context context) {
            Activity activity;
            this.f33707a = (Context) Preconditions.checkNotNull(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f33708b = action;
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
                this.f33708b.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
                this.f33708b.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
            }
        }

        @NonNull
        @Deprecated
        public static IntentBuilder from(@NonNull Activity activity) {
            return new IntentBuilder(activity);
        }

        /* renamed from: a */
        public final void m57625a(String str, ArrayList arrayList) {
            int i;
            String[] stringArrayExtra = this.f33708b.getStringArrayExtra(str);
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
            this.f33708b.putExtra(str, strArr);
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String str) {
            if (this.f33712f == null) {
                this.f33712f = new ArrayList();
            }
            this.f33712f.add(str);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String str) {
            if (this.f33711e == null) {
                this.f33711e = new ArrayList();
            }
            this.f33711e.add(str);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String str) {
            if (this.f33710d == null) {
                this.f33710d = new ArrayList();
            }
            this.f33710d.add(str);
            return this;
        }

        @NonNull
        public IntentBuilder addStream(@NonNull Uri uri) {
            if (this.f33713g == null) {
                this.f33713g = new ArrayList();
            }
            this.f33713g.add(uri);
            return this;
        }

        /* renamed from: b */
        public final void m57624b(String str, String[] strArr) {
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
        public Context m57623c() {
            return this.f33707a;
        }

        @NonNull
        public Intent createChooserIntent() {
            return Intent.createChooser(getIntent(), this.f33709c);
        }

        @NonNull
        public Intent getIntent() {
            ArrayList arrayList = this.f33710d;
            if (arrayList != null) {
                m57625a("android.intent.extra.EMAIL", arrayList);
                this.f33710d = null;
            }
            ArrayList arrayList2 = this.f33711e;
            if (arrayList2 != null) {
                m57625a("android.intent.extra.CC", arrayList2);
                this.f33711e = null;
            }
            ArrayList arrayList3 = this.f33712f;
            if (arrayList3 != null) {
                m57625a("android.intent.extra.BCC", arrayList3);
                this.f33712f = null;
            }
            ArrayList arrayList4 = this.f33713g;
            if (arrayList4 != null && arrayList4.size() > 1) {
                this.f33708b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f33708b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f33713g);
                C3927a.m57621b(this.f33708b, this.f33713g);
            } else {
                this.f33708b.setAction("android.intent.action.SEND");
                ArrayList arrayList5 = this.f33713g;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.f33708b.putExtra("android.intent.extra.STREAM", (Parcelable) this.f33713g.get(0));
                    C3927a.m57621b(this.f33708b, this.f33713g);
                } else {
                    this.f33708b.removeExtra("android.intent.extra.STREAM");
                    C3927a.m57620c(this.f33708b);
                }
            }
            return this.f33708b;
        }

        @NonNull
        public IntentBuilder setChooserTitle(@Nullable CharSequence charSequence) {
            this.f33709c = charSequence;
            return this;
        }

        @NonNull
        public IntentBuilder setEmailBcc(@Nullable String[] strArr) {
            this.f33708b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder setEmailCc(@Nullable String[] strArr) {
            this.f33708b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder setEmailTo(@Nullable String[] strArr) {
            if (this.f33710d != null) {
                this.f33710d = null;
            }
            this.f33708b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder setHtmlText(@Nullable String str) {
            this.f33708b.putExtra(IntentCompat.EXTRA_HTML_TEXT, str);
            if (!this.f33708b.hasExtra("android.intent.extra.TEXT")) {
                setText(Html.fromHtml(str));
            }
            return this;
        }

        @NonNull
        public IntentBuilder setStream(@Nullable Uri uri) {
            this.f33713g = null;
            if (uri != null) {
                addStream(uri);
            }
            return this;
        }

        @NonNull
        public IntentBuilder setSubject(@Nullable String str) {
            this.f33708b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @NonNull
        public IntentBuilder setText(@Nullable CharSequence charSequence) {
            this.f33708b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @NonNull
        public IntentBuilder setType(@Nullable String str) {
            this.f33708b.setType(str);
            return this;
        }

        public void startChooser() {
            this.f33707a.startActivity(createChooserIntent());
        }

        @NonNull
        public IntentBuilder setChooserTitle(@StringRes int i) {
            return setChooserTitle(this.f33707a.getText(i));
        }

        @NonNull
        public IntentBuilder addEmailBcc(@NonNull String[] strArr) {
            m57624b("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailCc(@NonNull String[] strArr) {
            m57624b("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public IntentBuilder addEmailTo(@NonNull String[] strArr) {
            m57624b("android.intent.extra.EMAIL", strArr);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class IntentReader {

        /* renamed from: a */
        public final Context f33714a;

        /* renamed from: b */
        public final Intent f33715b;

        /* renamed from: c */
        public final String f33716c;

        /* renamed from: d */
        public final ComponentName f33717d;

        /* renamed from: e */
        public ArrayList f33718e;

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
            return this.f33717d;
        }

        @Nullable
        public Drawable getCallingActivityIcon() {
            if (this.f33717d == null) {
                return null;
            }
            try {
                return this.f33714a.getPackageManager().getActivityIcon(this.f33717d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public Drawable getCallingApplicationIcon() {
            if (this.f33716c == null) {
                return null;
            }
            try {
                return this.f33714a.getPackageManager().getApplicationIcon(this.f33716c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public CharSequence getCallingApplicationLabel() {
            if (this.f33716c == null) {
                return null;
            }
            PackageManager packageManager = this.f33714a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f33716c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public String getCallingPackage() {
            return this.f33716c;
        }

        @Nullable
        public String[] getEmailBcc() {
            return this.f33715b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @Nullable
        public String[] getEmailCc() {
            return this.f33715b.getStringArrayExtra("android.intent.extra.CC");
        }

        @Nullable
        public String[] getEmailTo() {
            return this.f33715b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @Nullable
        public String getHtmlText() {
            String stringExtra = this.f33715b.getStringExtra(IntentCompat.EXTRA_HTML_TEXT);
            if (stringExtra == null) {
                CharSequence text = getText();
                if (text instanceof Spanned) {
                    return Html.toHtml((Spanned) text);
                }
                if (text != null) {
                    return C3927a.m57622a(text);
                }
                return stringExtra;
            }
            return stringExtra;
        }

        @Nullable
        public Uri getStream() {
            return (Uri) this.f33715b.getParcelableExtra("android.intent.extra.STREAM");
        }

        public int getStreamCount() {
            if (this.f33718e == null && isMultipleShare()) {
                this.f33718e = this.f33715b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.f33718e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.f33715b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @Nullable
        public String getSubject() {
            return this.f33715b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @Nullable
        public CharSequence getText() {
            return this.f33715b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @Nullable
        public String getType() {
            return this.f33715b.getType();
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f33715b.getAction());
        }

        public boolean isShareIntent() {
            String action = this.f33715b.getAction();
            if (!"android.intent.action.SEND".equals(action) && !"android.intent.action.SEND_MULTIPLE".equals(action)) {
                return false;
            }
            return true;
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.f33715b.getAction());
        }

        public IntentReader(@NonNull Context context, @NonNull Intent intent) {
            this.f33714a = (Context) Preconditions.checkNotNull(context);
            this.f33715b = (Intent) Preconditions.checkNotNull(intent);
            this.f33716c = ShareCompat.m57626b(intent);
            this.f33717d = ShareCompat.m57627a(intent);
        }

        @Nullable
        public Uri getStream(int i) {
            if (this.f33718e == null && isMultipleShare()) {
                this.f33718e = this.f33715b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.f33718e;
            if (arrayList != null) {
                return (Uri) arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.f33715b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + getStreamCount() + " index requested: " + i);
        }
    }

    /* renamed from: androidx.core.app.ShareCompat$a */
    /* loaded from: classes2.dex */
    public static class C3927a {
        @DoNotInline
        /* renamed from: a */
        public static String m57622a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57621b(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
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
        public static void m57620c(@NonNull Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* renamed from: a */
    public static ComponentName m57627a(Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        if (componentName == null) {
            return (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY_INTEROP);
        }
        return componentName;
    }

    /* renamed from: b */
    public static String m57626b(Intent intent) {
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
            shareActionProvider = new ShareActionProvider(intentBuilder.m57623c());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(".sharecompat_" + intentBuilder.m57623c().getClass().getName());
        shareActionProvider.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider(shareActionProvider);
    }

    @Nullable
    public static ComponentName getCallingActivity(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return m57627a(intent);
        }
        return callingActivity;
    }

    @Nullable
    public static String getCallingPackage(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null && intent != null) {
            return m57626b(intent);
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
