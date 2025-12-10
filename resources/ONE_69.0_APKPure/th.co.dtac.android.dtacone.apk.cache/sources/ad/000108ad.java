package p000;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;

/* renamed from: rj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22040rj0 extends AbstractC18674Vi1 {
    public C22040rj0(String str) {
        super(str);
    }

    @Override // p000.AbstractC18674Vi1
    /* renamed from: a */
    public List mo23449a(FileProvider fileProvider) {
        return m65872b(fileProvider, this.f7067a);
    }

    @Override // p000.AbstractC18674Vi1
    /* renamed from: c */
    public boolean mo23448c(File file) {
        return file.getName().equals(this.f7067a);
    }
}