package p000;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: Mt1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C18080Mt1 extends AbstractC18819Yh1 {

    /* renamed from: b */
    public Pattern f3942b;

    public C18080Mt1(String str) {
        super(str);
        this.f3942b = Pattern.compile(str);
    }

    @Override // p000.AbstractC18819Yh1
    /* renamed from: a */
    public List mo26421a(FileProvider fileProvider) {
        return m65322b(fileProvider, ".");
    }

    @Override // p000.AbstractC18819Yh1
    /* renamed from: c */
    public boolean mo26420c(File file) {
        return this.f3942b.matcher(file.getName()).find();
    }
}
