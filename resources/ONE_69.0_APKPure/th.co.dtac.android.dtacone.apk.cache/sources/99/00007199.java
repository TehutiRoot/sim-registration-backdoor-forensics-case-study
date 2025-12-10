package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompatApi21 {

    /* loaded from: classes2.dex */
    public interface ServiceCompatProxy {
        C4760a onGetRoot(String str, int i, Bundle bundle);

        void onLoadChildren(String str, C4762c c4762c);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$a */
    /* loaded from: classes2.dex */
    public static class C4760a {

        /* renamed from: a */
        public final String f36211a;

        /* renamed from: b */
        public final Bundle f36212b;

        public C4760a(String str, Bundle bundle) {
            this.f36211a = str;
            this.f36212b = bundle;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$b */
    /* loaded from: classes2.dex */
    public static class C4761b extends MediaBrowserService {

        /* renamed from: a */
        public final ServiceCompatProxy f36213a;

        public C4761b(Context context, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.f36213a = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.ensureClassLoader(bundle);
            ServiceCompatProxy serviceCompatProxy = this.f36213a;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            C4760a onGetRoot = serviceCompatProxy.onGetRoot(str, i, bundle2);
            if (onGetRoot == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(onGetRoot.f36211a, onGetRoot.f36212b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result result) {
            this.f36213a.onLoadChildren(str, new C4762c(result));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$c */
    /* loaded from: classes2.dex */
    public static class C4762c {

        /* renamed from: a */
        public MediaBrowserService.Result f36214a;

        public C4762c(MediaBrowserService.Result result) {
            this.f36214a = result;
        }

        /* renamed from: a */
        public void m53919a() {
            this.f36214a.detach();
        }

        /* renamed from: b */
        public List m53918b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* renamed from: c */
        public void m53917c(Object obj) {
            if (obj instanceof List) {
                this.f36214a.sendResult(m53918b((List) obj));
            } else if (obj instanceof Parcel) {
                Parcel parcel = (Parcel) obj;
                parcel.setDataPosition(0);
                this.f36214a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f36214a.sendResult(null);
            }
        }
    }

    /* renamed from: a */
    public static Object m53924a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C4761b(context, serviceCompatProxy);
    }

    /* renamed from: b */
    public static void m53923b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    /* renamed from: c */
    public static IBinder m53922c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: d */
    public static void m53921d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: e */
    public static void m53920e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}