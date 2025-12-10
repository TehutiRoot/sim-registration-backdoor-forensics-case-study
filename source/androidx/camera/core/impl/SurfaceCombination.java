package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SurfaceCombination {

    /* renamed from: a */
    public final List f11210a = new ArrayList();

    /* renamed from: a */
    public static void m62906a(List list, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 < i2) {
                    if (i3 == iArr[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    iArr[i2] = i3;
                    m62906a(list, i, iArr, i2 + 1);
                    break;
                }
            }
        }
    }

    public boolean addSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.f11210a.add(surfaceConfig);
    }

    /* renamed from: b */
    public final List m62905b(int i) {
        ArrayList arrayList = new ArrayList();
        m62906a(arrayList, i, new int[i], 0);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        continue;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getOrderedSupportedSurfaceConfigList(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SurfaceConfig> r10) {
        /*
            r9 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            return r10
        Lc:
            int r0 = r10.size()
            java.util.List r1 = r9.f11210a
            int r1 = r1.size()
            r2 = 0
            if (r0 == r1) goto L1a
            return r2
        L1a:
            java.util.List r0 = r9.f11210a
            int r0 = r0.size()
            java.util.List r0 = r9.m62905b(r0)
            int r1 = r10.size()
            androidx.camera.core.impl.SurfaceConfig[] r1 = new androidx.camera.core.impl.SurfaceConfig[r1]
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L77
            java.lang.Object r3 = r0.next()
            int[] r3 = (int[]) r3
            r5 = 1
            r6 = 1
        L3d:
            java.util.List r7 = r9.f11210a
            int r7 = r7.size()
            if (r4 >= r7) goto L74
            r7 = r3[r4]
            int r8 = r10.size()
            if (r7 >= r8) goto L71
            java.util.List r7 = r9.f11210a
            java.lang.Object r7 = r7.get(r4)
            androidx.camera.core.impl.SurfaceConfig r7 = (androidx.camera.core.impl.SurfaceConfig) r7
            r8 = r3[r4]
            java.lang.Object r8 = r10.get(r8)
            androidx.camera.core.impl.SurfaceConfig r8 = (androidx.camera.core.impl.SurfaceConfig) r8
            boolean r7 = r7.isSupported(r8)
            r6 = r6 & r7
            if (r6 != 0) goto L65
            goto L74
        L65:
            r7 = r3[r4]
            java.util.List r8 = r9.f11210a
            java.lang.Object r8 = r8.get(r4)
            androidx.camera.core.impl.SurfaceConfig r8 = (androidx.camera.core.impl.SurfaceConfig) r8
            r1[r7] = r8
        L71:
            int r4 = r4 + 1
            goto L3d
        L74:
            if (r6 == 0) goto L2e
            r4 = 1
        L77:
            if (r4 == 0) goto L7d
            java.util.List r2 = java.util.Arrays.asList(r1)
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.SurfaceCombination.getOrderedSupportedSurfaceConfigList(java.util.List):java.util.List");
    }

    @NonNull
    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.f11210a;
    }

    public boolean removeSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.f11210a.remove(surfaceConfig);
    }
}
