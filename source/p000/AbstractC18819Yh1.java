package p000;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: Yh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18819Yh1 {

    /* renamed from: a */
    public String f7827a;

    public AbstractC18819Yh1(String str) {
        this.f7827a = str;
    }

    /* renamed from: a */
    public abstract List mo26421a(FileProvider fileProvider);

    /* renamed from: b */
    public List m65322b(FileProvider fileProvider, String str) {
        File[] listFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return Arrays.asList(listFiles);
    }

    /* renamed from: c */
    public abstract boolean mo26420c(File file);
}
