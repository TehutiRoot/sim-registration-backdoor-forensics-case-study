package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompatApi23;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompatApi26 {

    /* renamed from: a */
    public static Field f36127a;

    /* loaded from: classes2.dex */
    public interface ServiceCompatProxy extends MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void onLoadChildren(String str, C4783b c4783b, Bundle bundle);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi26$a */
    /* loaded from: classes2.dex */
    public static class C4782a extends MediaBrowserServiceCompatApi23.C4781a {
        public C4782a(Context context, ServiceCompatProxy serviceCompatProxy) {
            super(context, serviceCompatProxy);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((ServiceCompatProxy) this.f36125a).onLoadChildren(str, new C4783b(result), bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi26$b */
    /* loaded from: classes2.dex */
    public static class C4783b {

        /* renamed from: a */
        public MediaBrowserService.Result f36128a;

        public C4783b(MediaBrowserService.Result result) {
            this.f36128a = result;
        }

        /* renamed from: a */
        public void m53961a() {
            this.f36128a.detach();
        }

        /* renamed from: b */
        public List m53960b(List list) {
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
        public void m53959c(List list, int i) {
            try {
                MediaBrowserServiceCompatApi26.f36127a.setInt(this.f36128a, i);
            } catch (IllegalAccessException e) {
                Log.w("MBSCompatApi26", e);
            }
            this.f36128a.sendResult(m53960b(list));
        }
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f36127a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }

    /* renamed from: a */
    public static Object m53964a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C4782a(context, serviceCompatProxy);
    }

    /* renamed from: b */
    public static Bundle m53963b(Object obj) {
        Bundle browserRootHints;
        browserRootHints = ((MediaBrowserService) obj).getBrowserRootHints();
        return browserRootHints;
    }

    /* renamed from: c */
    public static void m53962c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
