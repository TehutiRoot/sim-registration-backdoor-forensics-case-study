package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {

    /* renamed from: a */
    public final Map f10363a;

    /* renamed from: b */
    public final InterfaceC13944sh f10364b;

    /* renamed from: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager$a */
    /* loaded from: classes.dex */
    public class C2353a implements InterfaceC13944sh {
        @Override // p000.InterfaceC13944sh
        /* renamed from: a */
        public CamcorderProfile mo22562a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // p000.InterfaceC13944sh
        /* renamed from: b */
        public boolean mo22561b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2DeviceSurfaceManager(@NonNull Context context, @Nullable Object obj, @NonNull Set<String> set) throws CameraUnavailableException {
        this(context, new C2353a(), obj, set);
    }

    /* renamed from: a */
    public final void m63811a(Context context, CameraManagerCompat cameraManagerCompat, Set set) {
        Preconditions.checkNotNull(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f10363a.put(str, new C2429j(context, str, cameraManagerCompat, this.f10364b));
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @NonNull
    public Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecs(int i, @NonNull String str, @NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map) {
        Preconditions.checkArgument(!map.isEmpty(), "No new use cases to be bound.");
        C2429j c2429j = (C2429j) this.f10363a.get(str);
        if (c2429j != null) {
            return c2429j.m63397y(i, list, map);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @Nullable
    public SurfaceConfig transformSurfaceConfig(int i, @NonNull String str, int i2, @NonNull Size size) {
        C2429j c2429j = (C2429j) this.f10363a.get(str);
        if (c2429j != null) {
            return c2429j.m63425I(i, i2, size);
        }
        return null;
    }

    public Camera2DeviceSurfaceManager(Context context, InterfaceC13944sh interfaceC13944sh, Object obj, Set set) {
        CameraManagerCompat from;
        this.f10363a = new HashMap();
        Preconditions.checkNotNull(interfaceC13944sh);
        this.f10364b = interfaceC13944sh;
        if (obj instanceof CameraManagerCompat) {
            from = (CameraManagerCompat) obj;
        } else {
            from = CameraManagerCompat.from(context);
        }
        m63811a(context, from, set);
    }
}
