package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.compat.params.a */
/* loaded from: classes.dex */
public class C2401a implements DynamicRangesCompat.InterfaceC2392a {

    /* renamed from: a */
    public final DynamicRangeProfiles f10510a;

    public C2401a(Object obj) {
        this.f10510a = (DynamicRangeProfiles) obj;
    }

    /* renamed from: d */
    public static Set m63653d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m63652e(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    public static DynamicRange m63652e(long j) {
        DynamicRange profileToDynamicRange = DynamicRangeConversions.profileToDynamicRange(j);
        return (DynamicRange) Preconditions.checkNotNull(profileToDynamicRange, "Dynamic range profile cannot be converted to a DynamicRange object: " + j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    /* renamed from: a */
    public Set mo63651a(DynamicRange dynamicRange) {
        boolean z;
        Long m63654c = m63654c(dynamicRange);
        if (m63654c != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "DynamicRange is not supported: " + dynamicRange);
        return m63653d(this.f10510a.getProfileCaptureRequestConstraints(m63654c.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    /* renamed from: b */
    public boolean mo63650b(DynamicRange dynamicRange) {
        boolean z;
        Long m63654c = m63654c(dynamicRange);
        if (m63654c != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "DynamicRange is not supported: " + dynamicRange);
        return this.f10510a.isExtraLatencyPresent(m63654c.longValue());
    }

    /* renamed from: c */
    public final Long m63654c(DynamicRange dynamicRange) {
        return DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, this.f10510a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    public Set getSupportedDynamicRanges() {
        return m63653d(this.f10510a.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2392a
    public DynamicRangeProfiles unwrap() {
        return this.f10510a;
    }
}
