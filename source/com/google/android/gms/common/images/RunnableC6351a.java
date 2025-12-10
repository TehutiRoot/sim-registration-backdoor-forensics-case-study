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
public final class RunnableC6351a implements Runnable {

    /* renamed from: a */
    public final zag f45012a;

    /* renamed from: b */
    public final /* synthetic */ ImageManager f45013b;

    public RunnableC6351a(ImageManager imageManager, zag zagVar) {
        this.f45013b = imageManager;
        this.f45012a = zagVar;
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
        map = this.f45013b.f45000e;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.get(this.f45012a);
        if (imageReceiver != null) {
            ImageManager imageManager = this.f45013b;
            zag zagVar = this.f45012a;
            map7 = imageManager.f45000e;
            map7.remove(zagVar);
            imageReceiver.m48430c(this.f45012a);
        }
        zag zagVar2 = this.f45012a;
        P82 p82 = zagVar2.f45020a;
        Uri uri = p82.f4657a;
        if (uri != null) {
            map2 = this.f45013b.f45002g;
            Long l = (Long) map2.get(uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < CoreConstants.MILLIS_IN_ONE_HOUR) {
                    zag zagVar3 = this.f45012a;
                    ImageManager imageManager2 = this.f45013b;
                    Context context = imageManager2.f44996a;
                    zamVar2 = imageManager2.f44999d;
                    zagVar3.m48427a(context, zamVar2, true);
                    return;
                }
                ImageManager imageManager3 = this.f45013b;
                Uri uri2 = p82.f4657a;
                map6 = imageManager3.f45002g;
                map6.remove(uri2);
            }
            this.f45012a.zaa(null, false, true, false);
            ImageManager imageManager4 = this.f45013b;
            Uri uri3 = p82.f4657a;
            map3 = imageManager4.f45001f;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) map3.get(uri3);
            if (imageReceiver2 == null) {
                ImageManager.ImageReceiver imageReceiver3 = new ImageManager.ImageReceiver(p82.f4657a);
                ImageManager imageManager5 = this.f45013b;
                Uri uri4 = p82.f4657a;
                map5 = imageManager5.f45001f;
                map5.put(uri4, imageReceiver3);
                imageReceiver2 = imageReceiver3;
            }
            imageReceiver2.m48431b(this.f45012a);
            zag zagVar4 = this.f45012a;
            if (!(zagVar4 instanceof zaf)) {
                map4 = this.f45013b.f45000e;
                map4.put(zagVar4, imageReceiver2);
            }
            obj = ImageManager.f44993h;
            synchronized (obj) {
                try {
                    hashSet = ImageManager.f44994i;
                    if (!hashSet.contains(p82.f4657a)) {
                        hashSet2 = ImageManager.f44994i;
                        hashSet2.add(p82.f4657a);
                        imageReceiver2.m48429d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        ImageManager imageManager6 = this.f45013b;
        Context context2 = imageManager6.f44996a;
        zamVar = imageManager6.f44999d;
        zagVar2.m48427a(context2, zamVar, true);
    }
}
