package com.bumptech.glide.request.target;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes3.dex */
public class NotificationTarget extends CustomTarget<Bitmap> {

    /* renamed from: d */
    public final RemoteViews f42669d;

    /* renamed from: e */
    public final Context f42670e;

    /* renamed from: f */
    public final int f42671f;

    /* renamed from: g */
    public final String f42672g;

    /* renamed from: h */
    public final Notification f42673h;

    /* renamed from: i */
    public final int f42674i;

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    /* renamed from: a */
    private void m50012a(Bitmap bitmap) {
        this.f42669d.setImageViewBitmap(this.f42674i, bitmap);
        m50011b();
    }

    /* renamed from: b */
    private void m50011b() {
        ((NotificationManager) Preconditions.checkNotNull((NotificationManager) this.f42670e.getSystemService("notification"))).notify(this.f42672g, this.f42671f, this.f42673h);
    }

    @Override // com.bumptech.glide.request.target.Target
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onLoadCleared(@Nullable Drawable drawable) {
        m50012a(null);
    }

    @Override // com.bumptech.glide.request.target.Target
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        m50012a(bitmap);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.f42670e = (Context) Preconditions.checkNotNull(context, "Context must not be null!");
        this.f42673h = (Notification) Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.f42669d = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f42674i = i3;
        this.f42671f = i4;
        this.f42672g = str;
    }
}