package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public abstract class AbstractC1949a {

    /* renamed from: android.support.v4.media.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1950a {
        /* renamed from: b */
        void mo64960b();

        /* renamed from: c */
        void mo64959c();

        /* renamed from: d */
        void mo64958d();
    }

    /* renamed from: android.support.v4.media.a$b */
    /* loaded from: classes.dex */
    public static class C1951b extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        public final InterfaceC1950a f8534a;

        public C1951b(InterfaceC1950a interfaceC1950a) {
            this.f8534a = interfaceC1950a;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f8534a.mo64959c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f8534a.mo64958d();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f8534a.mo64960b();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    /* loaded from: classes.dex */
    public static class C1952c {
        /* renamed from: a */
        public static Object m64957a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        /* renamed from: b */
        public static int m64956b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1953d {
        /* renamed from: a */
        void mo64955a(String str, List list);

        void onError(String str);
    }

    /* renamed from: android.support.v4.media.a$e */
    /* loaded from: classes.dex */
    public static class C1954e extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        public final InterfaceC1953d f8535a;

        public C1954e(InterfaceC1953d interfaceC1953d) {
            this.f8535a = interfaceC1953d;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List list) {
            this.f8535a.mo64955a(str, list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
            this.f8535a.onError(str);
        }
    }

    /* renamed from: a */
    public static void m64972a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static Object m64971b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* renamed from: c */
    public static Object m64970c(InterfaceC1950a interfaceC1950a) {
        return new C1951b(interfaceC1950a);
    }

    /* renamed from: d */
    public static Object m64969d(InterfaceC1953d interfaceC1953d) {
        return new C1954e(interfaceC1953d);
    }

    /* renamed from: e */
    public static void m64968e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: f */
    public static Bundle m64967f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: g */
    public static String m64966g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    /* renamed from: h */
    public static ComponentName m64965h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    /* renamed from: i */
    public static Object m64964i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: j */
    public static boolean m64963j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    /* renamed from: k */
    public static void m64962k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: l */
    public static void m64961l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
