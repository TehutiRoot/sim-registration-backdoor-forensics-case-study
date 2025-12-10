package p000;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;

/* renamed from: lj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20944lj0 extends AbstractC18819Yh1 {
    public C20944lj0(String str) {
        super(str);
    }

    @Override // p000.AbstractC18819Yh1
    /* renamed from: a */
    public List mo26421a(FileProvider fileProvider) {
        return m65322b(fileProvider, this.f7827a);
    }

    @Override // p000.AbstractC18819Yh1
    /* renamed from: c */
    public boolean mo26420c(File file) {
        return file.getName().equals(this.f7827a);
    }
}
