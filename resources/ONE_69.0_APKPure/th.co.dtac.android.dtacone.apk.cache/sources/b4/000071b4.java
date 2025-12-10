package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompatApi21;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;

    /* renamed from: a */
    public final int f36222a;

    /* renamed from: b */
    public final int f36223b;

    /* renamed from: c */
    public int f36224c;

    /* renamed from: d */
    public Callback f36225d;

    /* renamed from: e */
    public Object f36226e;

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface ControlType {
    }

    /* renamed from: androidx.media.VolumeProviderCompat$a */
    /* loaded from: classes2.dex */
    public class C4775a implements VolumeProviderCompatApi21.Delegate {
        public C4775a() {
        }

        @Override // androidx.media.VolumeProviderCompatApi21.Delegate
        public void onAdjustVolume(int i) {
            VolumeProviderCompat.this.onAdjustVolume(i);
        }

        @Override // androidx.media.VolumeProviderCompatApi21.Delegate
        public void onSetVolumeTo(int i) {
            VolumeProviderCompat.this.onSetVolumeTo(i);
        }
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this.f36222a = i;
        this.f36223b = i2;
        this.f36224c = i3;
    }

    public final int getCurrentVolume() {
        return this.f36224c;
    }

    public final int getMaxVolume() {
        return this.f36223b;
    }

    public final int getVolumeControl() {
        return this.f36222a;
    }

    public Object getVolumeProvider() {
        if (this.f36226e == null) {
            this.f36226e = VolumeProviderCompatApi21.m53909a(this.f36222a, this.f36223b, this.f36224c, new C4775a());
        }
        return this.f36226e;
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public void setCallback(Callback callback) {
        this.f36225d = callback;
    }

    public final void setCurrentVolume(int i) {
        this.f36224c = i;
        Object volumeProvider = getVolumeProvider();
        if (volumeProvider != null) {
            VolumeProviderCompatApi21.m53908b(volumeProvider, i);
        }
        Callback callback = this.f36225d;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }
}