package p000;

import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cR1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC19401cR1 {
    /* renamed from: a */
    public static SystemIdInfo m51695a(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return systemIdInfoDao.getSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    /* renamed from: b */
    public static void m51694b(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        systemIdInfoDao.removeSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    /* renamed from: c */
    public static /* synthetic */ SystemIdInfo m51693c(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
        return m51695a(systemIdInfoDao, workGenerationalId);
    }

    /* renamed from: d */
    public static /* synthetic */ void m51692d(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
        m51694b(systemIdInfoDao, workGenerationalId);
    }
}