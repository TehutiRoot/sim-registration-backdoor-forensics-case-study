package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.compat.EncoderProfilesProxyCompat;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Camera2EncoderProfilesProvider implements EncoderProfilesProvider {

    /* renamed from: a */
    public final boolean f10365a;

    /* renamed from: b */
    public final String f10366b;

    /* renamed from: c */
    public final int f10367c;

    /* renamed from: d */
    public final Map f10368d = new HashMap();

    /* renamed from: androidx.camera.camera2.internal.Camera2EncoderProfilesProvider$a */
    /* loaded from: classes.dex */
    public static class C2354a {
        @DoNotInline
        /* renamed from: a */
        public static EncoderProfiles m63808a(String str, int i) {
            return CamcorderProfile.getAll(str, i);
        }
    }

    public Camera2EncoderProfilesProvider(@NonNull String str) {
        boolean z;
        int i;
        this.f10366b = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            Logger.m63223w("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.f10365a = z;
        this.f10367c = i;
    }

    /* renamed from: a */
    public final EncoderProfilesProxy m63810a(int i) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f10367c, i);
        } catch (RuntimeException e) {
            Logger.m63222w("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i, e);
            camcorderProfile = null;
        }
        if (camcorderProfile == null) {
            return null;
        }
        return EncoderProfilesProxyCompat.from(camcorderProfile);
    }

    /* renamed from: b */
    public final EncoderProfilesProxy m63809b(int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles m63808a = C2354a.m63808a(this.f10366b, i);
            if (m63808a == null) {
                return null;
            }
            if (DeviceQuirks.get(InvalidVideoProfilesQuirk.class) != null) {
                Logger.m63230d("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return EncoderProfilesProxyCompat.from(m63808a);
                } catch (NullPointerException e) {
                    Logger.m63222w("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e);
                }
            }
        }
        return m63810a(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i) {
        if (!this.f10365a || !CamcorderProfile.hasProfile(this.f10367c, i)) {
            return null;
        }
        if (this.f10368d.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) this.f10368d.get(Integer.valueOf(i));
        }
        EncoderProfilesProxy m63809b = m63809b(i);
        this.f10368d.put(Integer.valueOf(i), m63809b);
        return m63809b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (!this.f10365a) {
            return false;
        }
        return CamcorderProfile.hasProfile(this.f10367c, i);
    }
}
