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
    public final RemoteViews f42657d;

    /* renamed from: e */
    public final Context f42658e;

    /* renamed from: f */
    public final int f42659f;

    /* renamed from: g */
    public final String f42660g;

    /* renamed from: h */
    public final Notification f42661h;

    /* renamed from: i */
    public final int f42662i;

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    /* renamed from: a */
    private void m50015a(Bitmap bitmap) {
        this.f42657d.setImageViewBitmap(this.f42662i, bitmap);
        m50014b();
    }

    /* renamed from: b */
    private void m50014b() {
        ((NotificationManager) Preconditions.checkNotNull((NotificationManager) this.f42658e.getSystemService("notification"))).notify(this.f42660g, this.f42659f, this.f42661h);
    }

    @Override // com.bumptech.glide.request.target.Target
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onLoadCleared(@Nullable Drawable drawable) {
        m50015a(null);
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
        m50015a(bitmap);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.f42658e = (Context) Preconditions.checkNotNull(context, "Context must not be null!");
        this.f42661h = (Notification) Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.f42657d = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f42662i = i3;
        this.f42659f = i4;
        this.f42660g = str;
    }
}
