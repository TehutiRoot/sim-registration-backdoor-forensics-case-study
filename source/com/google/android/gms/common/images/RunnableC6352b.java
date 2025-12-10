package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.b */
/* loaded from: classes3.dex */
public final class RunnableC6352b implements Runnable {

    /* renamed from: a */
    public final Uri f45014a;

    /* renamed from: b */
    public final Bitmap f45015b;

    /* renamed from: c */
    public final CountDownLatch f45016c;

    /* renamed from: d */
    public final /* synthetic */ ImageManager f45017d;

    public RunnableC6352b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f45017d = imageManager;
        this.f45014a = uri;
        this.f45015b = bitmap;
        this.f45016c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        Map map2;
        zam zamVar;
        Map map3;
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        map = this.f45017d.f45001f;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.remove(this.f45014a);
        if (imageReceiver != null) {
            arrayList = imageReceiver.f45004b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = (zag) arrayList.get(i);
                Bitmap bitmap = this.f45015b;
                if (bitmap != null) {
                    zagVar.m48426b(this.f45017d.f44996a, bitmap, false);
                } else {
                    ImageManager imageManager = this.f45017d;
                    Uri uri = this.f45014a;
                    map2 = imageManager.f45002g;
                    map2.put(uri, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager2 = this.f45017d;
                    Context context = imageManager2.f44996a;
                    zamVar = imageManager2.f44999d;
                    zagVar.m48427a(context, zamVar, false);
                }
                if (!(zagVar instanceof zaf)) {
                    map3 = this.f45017d.f45000e;
                    map3.remove(zagVar);
                }
            }
        }
        this.f45016c.countDown();
        obj = ImageManager.f44993h;
        synchronized (obj) {
            hashSet = ImageManager.f44994i;
            hashSet.remove(this.f45014a);
        }
    }
}
