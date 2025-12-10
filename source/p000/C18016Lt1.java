package p000;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.function.Function;
import org.apache.commons.p028io.file.PathUtils;

/* renamed from: Lt1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C18016Lt1 implements Function, Serializable {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return PathUtils.getFileNameString((Path) obj);
    }
}
