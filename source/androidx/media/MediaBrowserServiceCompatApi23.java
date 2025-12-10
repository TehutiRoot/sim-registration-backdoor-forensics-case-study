package androidx.media;

import android.content.Context;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompatApi21;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompatApi23 {

    /* loaded from: classes2.dex */
    public interface ServiceCompatProxy extends MediaBrowserServiceCompatApi21.ServiceCompatProxy {
        void onLoadItem(String str, MediaBrowserServiceCompatApi21.C4780c c4780c);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompatApi23$a */
    /* loaded from: classes2.dex */
    public static class C4781a extends MediaBrowserServiceCompatApi21.C4779b {
        public C4781a(Context context, ServiceCompatProxy serviceCompatProxy) {
            super(context, serviceCompatProxy);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result result) {
            ((ServiceCompatProxy) this.f36125a).onLoadItem(str, new MediaBrowserServiceCompatApi21.C4780c(result));
        }
    }

    /* renamed from: a */
    public static Object m53965a(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new C4781a(context, serviceCompatProxy);
    }
}
