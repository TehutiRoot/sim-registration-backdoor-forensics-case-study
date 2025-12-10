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
        C4778a onGetRoot(String str, int i, Bundle bundle);

        void onLoadChildren(String str, C4780c c4780c);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$a */
    /* loaded from: classes2.dex */
    public static class C4778a {

        /* renamed from: a */
        public final String f36123a;

        /* renamed from: b */
        public final Bundle f36124b;

        public C4778a(String str, Bundle bundle) {
            this.f36123a = str;
            this.f36124b = bundle;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$b */
    /* loaded from: classes2.dex */
    public static class C4779b extends MediaBrowserService {

        /* renamed from: a */
        public final ServiceCompatProxy f36125a;

        public C4779b(Context context, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.f36125a = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.ensureClassLoader(bundle);
            ServiceCompatProxy serviceCompatProxy = this.f36125a;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            C4778a onGetRoot = serviceCompatProxy.onGetRoot(str, i, bundle2);
            if (onGetRoot == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(onGetRoot.f36123a, onGetRoot.f36124b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result result) {
            this.f36125a.onLoadChildren(str, new C4780c(result));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi21$c */
    /* loaded from: classes2.dex */
    public static class C4780c {

        /* renamed from: a */
        public MediaBrowserService.Result f36126a;

        public C4780c(MediaBrowserService.Result result) {
            this.f36126a = result;
        }

        /* renamed from: a */
        public void m53968a() {
            this.f36126a.detach();
        }

        /* renamed from: b */
        public List m53967b(List list) {
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
        public void m53966c(Object obj) {
            if (obj instanceof List) {
                this.f36126a.sendResult(m53967b((List) obj));
            } else if (obj instanceof Parcel) {
                Parcel parcel = (Parcel) obj;
                parcel.setDataPosition(0);
                this.f36126a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f36126a.sendResult(null);
            }
        }
    }

    /* renamed from: a */
    public static Object m53973a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C4779b(context, serviceCompatProxy);
    }

    /* renamed from: b */
    public static void m53972b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    /* renamed from: c */
    public static IBinder m53971c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: d */
    public static void m53970d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: e */
    public static void m53969e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}
