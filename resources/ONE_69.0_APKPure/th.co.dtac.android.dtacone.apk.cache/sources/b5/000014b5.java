package p000;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: Vi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18674Vi1 {

    /* renamed from: a */
    public String f7067a;

    public AbstractC18674Vi1(String str) {
        this.f7067a = str;
    }

    /* renamed from: a */
    public abstract List mo23449a(FileProvider fileProvider);

    /* renamed from: b */
    public List m65872b(FileProvider fileProvider, String str) {
        File[] listFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return Arrays.asList(listFiles);
    }

    /* renamed from: c */
    public abstract boolean mo23448c(File file);
}