package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionItem {

    /* renamed from: a */
    public final String f10107a;

    /* renamed from: b */
    public final PendingIntent f10108b;

    /* renamed from: c */
    public int f10109c;

    /* renamed from: d */
    public Uri f10110d;

    /* renamed from: e */
    public Runnable f10111e;

    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent, @DrawableRes int i) {
        this.f10107a = str;
        this.f10108b = pendingIntent;
        this.f10109c = i;
    }

    /* renamed from: a */
    public Runnable m64070a() {
        return this.f10111e;
    }

    @NonNull
    public PendingIntent getAction() {
        PendingIntent pendingIntent = this.f10108b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int getIconId() {
        return this.f10109c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Uri getIconUri() {
        return this.f10110d;
    }

    @NonNull
    public String getTitle() {
        return this.f10107a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent, @NonNull Uri uri) {
        this.f10107a = str;
        this.f10108b = pendingIntent;
        this.f10110d = uri;
    }

    public BrowserActionItem(String str, Runnable runnable) {
        this.f10107a = str;
        this.f10108b = null;
        this.f10111e = runnable;
    }

    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
