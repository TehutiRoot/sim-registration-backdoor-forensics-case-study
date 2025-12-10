package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.gms.common.images.a */
/* loaded from: classes3.dex */
public final class RunnableC6340a implements Runnable {

    /* renamed from: a */
    public final zag f45024a;

    /* renamed from: b */
    public final /* synthetic */ ImageManager f45025b;

    public RunnableC6340a(ImageManager imageManager, zag zagVar) {
        this.f45025b = imageManager;
        this.f45024a = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        zam zamVar;
        Map map2;
        Map map3;
        Object obj;
        HashSet hashSet;
        HashSet hashSet2;
        Map map4;
        Map map5;
        Map map6;
        zam zamVar2;
        Map map7;
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        map = this.f45025b.f45012e;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.get(this.f45024a);
        if (imageReceiver != null) {
            ImageManager imageManager = this.f45025b;
            zag zagVar = this.f45024a;
            map7 = imageManager.f45012e;
            map7.remove(zagVar);
            imageReceiver.m48427c(this.f45024a);
        }
        zag zagVar2 = this.f45024a;
        M92 m92 = zagVar2.f45032a;
        Uri uri = m92.f3820a;
        if (uri != null) {
            map2 = this.f45025b.f45014g;
            Long l = (Long) map2.get(uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < CoreConstants.MILLIS_IN_ONE_HOUR) {
                    zag zagVar3 = this.f45024a;
                    ImageManager imageManager2 = this.f45025b;
                    Context context = imageManager2.f45008a;
                    zamVar2 = imageManager2.f45011d;
                    zagVar3.m48424a(context, zamVar2, true);
                    return;
                }
                ImageManager imageManager3 = this.f45025b;
                Uri uri2 = m92.f3820a;
                map6 = imageManager3.f45014g;
                map6.remove(uri2);
            }
            this.f45024a.zaa(null, false, true, false);
            ImageManager imageManager4 = this.f45025b;
            Uri uri3 = m92.f3820a;
            map3 = imageManager4.f45013f;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) map3.get(uri3);
            if (imageReceiver2 == null) {
                ImageManager.ImageReceiver imageReceiver3 = new ImageManager.ImageReceiver(m92.f3820a);
                ImageManager imageManager5 = this.f45025b;
                Uri uri4 = m92.f3820a;
                map5 = imageManager5.f45013f;
                map5.put(uri4, imageReceiver3);
                imageReceiver2 = imageReceiver3;
            }
            imageReceiver2.m48428b(this.f45024a);
            zag zagVar4 = this.f45024a;
            if (!(zagVar4 instanceof zaf)) {
                map4 = this.f45025b.f45012e;
                map4.put(zagVar4, imageReceiver2);
            }
            obj = ImageManager.f45005h;
            synchronized (obj) {
                try {
                    hashSet = ImageManager.f45006i;
                    if (!hashSet.contains(m92.f3820a)) {
                        hashSet2 = ImageManager.f45006i;
                        hashSet2.add(m92.f3820a);
                        imageReceiver2.m48426d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        ImageManager imageManager6 = this.f45025b;
        Context context2 = imageManager6.f45008a;
        zamVar = imageManager6.f45011d;
        zagVar2.m48424a(context2, zamVar, true);
    }
}