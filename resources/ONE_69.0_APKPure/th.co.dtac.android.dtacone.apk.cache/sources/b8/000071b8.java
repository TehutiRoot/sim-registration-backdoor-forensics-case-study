package androidx.media;

import android.media.VolumeProvider;

/* loaded from: classes2.dex */
public abstract class VolumeProviderCompatApi21 {

    /* loaded from: classes2.dex */
    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }

    /* renamed from: androidx.media.VolumeProviderCompatApi21$a */
    /* loaded from: classes2.dex */
    public static class C4776a extends VolumeProvider {

        /* renamed from: a */
        public final /* synthetic */ Delegate f36228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4776a(int i, int i2, int i3, Delegate delegate) {
            super(i, i2, i3);
            this.f36228a = delegate;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            this.f36228a.onAdjustVolume(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            this.f36228a.onSetVolumeTo(i);
        }
    }

    /* renamed from: a */
    public static Object m53909a(int i, int i2, int i3, Delegate delegate) {
        return new C4776a(i, i2, i3, delegate);
    }

    /* renamed from: b */
    public static void m53908b(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}