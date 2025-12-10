package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes3.dex */
public class AppWidgetTarget extends CustomTarget<Bitmap> {

    /* renamed from: d */
    public final int[] f42626d;

    /* renamed from: e */
    public final ComponentName f42627e;

    /* renamed from: f */
    public final RemoteViews f42628f;

    /* renamed from: g */
    public final Context f42629g;

    /* renamed from: h */
    public final int f42630h;

    public AppWidgetTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length != 0) {
            this.f42629g = (Context) Preconditions.checkNotNull(context, "Context can not be null!");
            this.f42628f = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
            this.f42626d = (int[]) Preconditions.checkNotNull(iArr, "WidgetIds can not be null!");
            this.f42630h = i3;
            this.f42627e = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    /* renamed from: a */
    public final void m50037a(Bitmap bitmap) {
        this.f42628f.setImageViewBitmap(this.f42630h, bitmap);
        m50036b();
    }

    /* renamed from: b */
    public final void m50036b() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f42629g);
        ComponentName componentName = this.f42627e;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f42628f);
        } else {
            appWidgetManager.updateAppWidget(this.f42626d, this.f42628f);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
        m50037a(null);
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        m50037a(bitmap);
    }

    public AppWidgetTarget(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public AppWidgetTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.f42629g = (Context) Preconditions.checkNotNull(context, "Context can not be null!");
        this.f42628f = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f42627e = (ComponentName) Preconditions.checkNotNull(componentName, "ComponentName can not be null!");
        this.f42630h = i3;
        this.f42626d = null;
    }

    public AppWidgetTarget(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
