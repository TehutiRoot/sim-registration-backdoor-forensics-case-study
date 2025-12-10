package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.compat.params.b */
/* loaded from: classes.dex */
public class C2402b implements DynamicRangesCompat.InterfaceC2392a {

    /* renamed from: a */
    public static final DynamicRangesCompat f10511a = new DynamicRangesCompat(new C2402b());

    /* renamed from: b */
    public static final Set f10512b = Collections.singleton(DynamicRange.SDR);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    /* renamed from: a */
    public Set mo63651a(DynamicRange dynamicRange) {
        boolean equals = DynamicRange.SDR.equals(dynamicRange);
        Preconditions.checkArgument(equals, "DynamicRange is not supported: " + dynamicRange);
        return f10512b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    /* renamed from: b */
    public boolean mo63650b(DynamicRange dynamicRange) {
        boolean equals = DynamicRange.SDR.equals(dynamicRange);
        Preconditions.checkArgument(equals, "DynamicRange is not supported: " + dynamicRange);
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    public Set getSupportedDynamicRanges() {
        return f10512b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    public DynamicRangeProfiles unwrap() {
        return null;
    }
}
