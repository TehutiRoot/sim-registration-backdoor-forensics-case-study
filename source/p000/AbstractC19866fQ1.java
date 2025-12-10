package p000;

import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fQ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC19866fQ1 {
    /* renamed from: a */
    public static SystemIdInfo m31306a(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return systemIdInfoDao.getSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    /* renamed from: b */
    public static void m31305b(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        systemIdInfoDao.removeSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }
}
