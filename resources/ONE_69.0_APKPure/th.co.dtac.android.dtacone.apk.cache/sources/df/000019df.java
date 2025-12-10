package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public abstract class AbstractC1931a {

    /* renamed from: android.support.v4.media.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1932a {
        /* renamed from: b */
        void mo64911b();

        /* renamed from: c */
        void mo64910c();

        /* renamed from: d */
        void mo64909d();
    }

    /* renamed from: android.support.v4.media.a$b */
    /* loaded from: classes.dex */
    public static class C1933b extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        public final InterfaceC1932a f8622a;

        public C1933b(InterfaceC1932a interfaceC1932a) {
            this.f8622a = interfaceC1932a;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f8622a.mo64910c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f8622a.mo64909d();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f8622a.mo64911b();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    /* loaded from: classes.dex */
    public static class C1934c {
        /* renamed from: a */
        public static Object m64908a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        /* renamed from: b */
        public static int m64907b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1935d {
        /* renamed from: a */
        void mo64906a(String str, List list);

        void onError(String str);
    }

    /* renamed from: android.support.v4.media.a$e */
    /* loaded from: classes.dex */
    public static class C1936e extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        public final InterfaceC1935d f8623a;

        public C1936e(InterfaceC1935d interfaceC1935d) {
            this.f8623a = interfaceC1935d;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List list) {
            this.f8623a.mo64906a(str, list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
            this.f8623a.onError(str);
        }
    }

    /* renamed from: a */
    public static void m64923a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static Object m64922b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* renamed from: c */
    public static Object m64921c(InterfaceC1932a interfaceC1932a) {
        return new C1933b(interfaceC1932a);
    }

    /* renamed from: d */
    public static Object m64920d(InterfaceC1935d interfaceC1935d) {
        return new C1936e(interfaceC1935d);
    }

    /* renamed from: e */
    public static void m64919e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: f */
    public static Bundle m64918f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: g */
    public static String m64917g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    /* renamed from: h */
    public static ComponentName m64916h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    /* renamed from: i */
    public static Object m64915i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: j */
    public static boolean m64914j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    /* renamed from: k */
    public static void m64913k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: l */
    public static void m64912l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}