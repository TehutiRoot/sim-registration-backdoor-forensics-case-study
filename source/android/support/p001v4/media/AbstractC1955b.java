package android.support.p001v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public abstract class AbstractC1955b {

    /* renamed from: android.support.v4.media.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1956a {
        /* renamed from: a */
        void mo64952a(Parcel parcel);

        void onError(String str);
    }

    /* renamed from: android.support.v4.media.b$b */
    /* loaded from: classes.dex */
    public static class C1957b extends MediaBrowser.ItemCallback {

        /* renamed from: a */
        public final InterfaceC1956a f8536a;

        public C1957b(InterfaceC1956a interfaceC1956a) {
            this.f8536a = interfaceC1956a;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(String str) {
            this.f8536a.onError(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f8536a.mo64952a(null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f8536a.mo64952a(obtain);
        }
    }

    /* renamed from: a */
    public static Object m64954a(InterfaceC1956a interfaceC1956a) {
        return new C1957b(interfaceC1956a);
    }

    /* renamed from: b */
    public static void m64953b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, AbstractC22688vr0.m984a(obj2));
    }
}
