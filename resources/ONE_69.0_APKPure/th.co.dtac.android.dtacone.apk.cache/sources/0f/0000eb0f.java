package p000;

import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC21249n72 {
    /* renamed from: a */
    public static void m26448a(WorkTagDao workTagDao, String id2, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            workTagDao.insert(new WorkTag((String) it.next(), id2));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m26447b(WorkTagDao workTagDao, String str, Set set) {
        m26448a(workTagDao, str, set);
    }
}