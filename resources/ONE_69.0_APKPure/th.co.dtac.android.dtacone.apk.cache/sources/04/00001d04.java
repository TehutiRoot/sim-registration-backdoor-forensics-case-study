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
    public final String f10195a;

    /* renamed from: b */
    public final PendingIntent f10196b;

    /* renamed from: c */
    public int f10197c;

    /* renamed from: d */
    public Uri f10198d;

    /* renamed from: e */
    public Runnable f10199e;

    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent, @DrawableRes int i) {
        this.f10195a = str;
        this.f10196b = pendingIntent;
        this.f10197c = i;
    }

    /* renamed from: a */
    public Runnable m64021a() {
        return this.f10199e;
    }

    @NonNull
    public PendingIntent getAction() {
        PendingIntent pendingIntent = this.f10196b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int getIconId() {
        return this.f10197c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Uri getIconUri() {
        return this.f10198d;
    }

    @NonNull
    public String getTitle() {
        return this.f10195a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent, @NonNull Uri uri) {
        this.f10195a = str;
        this.f10196b = pendingIntent;
        this.f10198d = uri;
    }

    public BrowserActionItem(String str, Runnable runnable) {
        this.f10195a = str;
        this.f10196b = null;
        this.f10199e = runnable;
    }

    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}