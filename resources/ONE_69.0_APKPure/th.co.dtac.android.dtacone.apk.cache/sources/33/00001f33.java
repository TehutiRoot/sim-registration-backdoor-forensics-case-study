package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.impl.CameraFilters;
import androidx.camera.core.impl.Identifier;
import java.util.Collections;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: Mj
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            List m62916c;
            m62916c = CameraFilters.m62916c(list);
            return m62916c;
        }

        @Override // androidx.camera.core.CameraFilter
        public /* synthetic */ Identifier getIdentifier() {
            return AbstractC0817Lj.m67515a(this);
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: Nj
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            List emptyList;
            emptyList = Collections.emptyList();
            return emptyList;
        }

        @Override // androidx.camera.core.CameraFilter
        public /* synthetic */ Identifier getIdentifier() {
            return AbstractC0817Lj.m67515a(this);
        }
    };

    /* renamed from: c */
    public static /* synthetic */ List m62916c(List list) {
        return list;
    }
}