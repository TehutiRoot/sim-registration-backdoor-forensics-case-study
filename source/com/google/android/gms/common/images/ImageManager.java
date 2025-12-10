package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class ImageManager {

    /* renamed from: h */
    public static final Object f44993h = new Object();

    /* renamed from: i */
    public static final HashSet f44994i = new HashSet();

    /* renamed from: j */
    public static ImageManager f44995j;

    /* renamed from: a */
    public final Context f44996a;

    /* renamed from: b */
    public final Handler f44997b = new zau(Looper.getMainLooper());

    /* renamed from: c */
    public final ExecutorService f44998c = zat.zaa().zab(4, 2);

    /* renamed from: d */
    public final zam f44999d = new zam();

    /* renamed from: e */
    public final Map f45000e = new HashMap();

    /* renamed from: f */
    public final Map f45001f = new HashMap();

    /* renamed from: g */
    public final Map f45002g = new HashMap();

    @KeepName
    /* loaded from: classes3.dex */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        public final Uri f45003a;

        /* renamed from: b */
        public final ArrayList f45004b;

        public ImageReceiver(Uri uri) {
            super(new zau(Looper.getMainLooper()));
            this.f45003a = uri;
            this.f45004b = new ArrayList();
        }

        /* renamed from: b */
        public final void m48431b(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f45004b.add(zagVar);
        }

        /* renamed from: c */
        public final void m48430c(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f45004b.remove(zagVar);
        }

        /* renamed from: d */
        public final void m48429d() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.f45003a);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.f44996a.sendBroadcast(intent);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.f44998c.execute(new S72(imageManager, this.f45003a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* loaded from: classes3.dex */
    public interface OnImageLoadedListener {
        void onImageLoaded(@NonNull Uri uri, @Nullable Drawable drawable, boolean z);
    }

    public ImageManager(Context context, boolean z) {
        this.f44996a = context.getApplicationContext();
    }

    @NonNull
    public static ImageManager create(@NonNull Context context) {
        if (f44995j == null) {
            f44995j = new ImageManager(context, false);
        }
        return f44995j;
    }

    public void loadImage(@NonNull ImageView imageView, int i) {
        zaj(new zae(imageView, i));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new RunnableC6351a(this, zagVar).run();
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri, int i) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i;
        zaj(zaeVar);
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri, int i) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i;
        zaj(zafVar);
    }
}
