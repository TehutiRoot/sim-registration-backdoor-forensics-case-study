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
public class C2383a implements DynamicRangesCompat.InterfaceC2374a {

    /* renamed from: a */
    public final DynamicRangeProfiles f10598a;

    public C2383a(Object obj) {
        this.f10598a = (DynamicRangeProfiles) obj;
    }

    /* renamed from: d */
    public static Set m63604d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m63603e(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    public static DynamicRange m63603e(long j) {
        DynamicRange profileToDynamicRange = DynamicRangeConversions.profileToDynamicRange(j);
        return (DynamicRange) Preconditions.checkNotNull(profileToDynamicRange, "Dynamic range profile cannot be converted to a DynamicRange object: " + j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2374a
    /* renamed from: a */
    public Set mo63602a(DynamicRange dynamicRange) {
        boolean z;
        Long m63605c = m63605c(dynamicRange);
        if (m63605c != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "DynamicRange is not supported: " + dynamicRange);
        return m63604d(this.f10598a.getProfileCaptureRequestConstraints(m63605c.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2374a
    /* renamed from: b */
    public boolean mo63601b(DynamicRange dynamicRange) {
        boolean z;
        Long m63605c = m63605c(dynamicRange);
        if (m63605c != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "DynamicRange is not supported: " + dynamicRange);
        return this.f10598a.isExtraLatencyPresent(m63605c.longValue());
    }

    /* renamed from: c */
    public final Long m63605c(DynamicRange dynamicRange) {
        return DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, this.f10598a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2374a
    public Set getSupportedDynamicRanges() {
        return m63604d(this.f10598a.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.InterfaceC2374a
    public DynamicRangeProfiles unwrap() {
        return this.f10598a;
    }
}