package android.support.p001v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.p001v4.media.AbstractC1949a;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.c */
/* loaded from: classes.dex */
public abstract class AbstractC1958c {

    /* renamed from: android.support.v4.media.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1959a extends AbstractC1949a.InterfaceC1953d {
        /* renamed from: b */
        void mo64948b(String str, Bundle bundle);

        /* renamed from: c */
        void mo64947c(String str, List list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.c$b */
    /* loaded from: classes.dex */
    public static class C1960b extends AbstractC1949a.C1954e {
        public C1960b(InterfaceC1959a interfaceC1959a) {
            super(interfaceC1959a);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List list, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((InterfaceC1959a) this.f8535a).mo64947c(str, list, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((InterfaceC1959a) this.f8535a).mo64948b(str, bundle);
        }
    }

    /* renamed from: a */
    public static Object m64951a(InterfaceC1959a interfaceC1959a) {
        return new C1960b(interfaceC1959a);
    }

    /* renamed from: b */
    public static void m64950b(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: c */
    public static void m64949c(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}
