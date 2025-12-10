package p000;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: Ju1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17923Ju1 extends AbstractC18674Vi1 {

    /* renamed from: b */
    public Pattern f3162b;

    public C17923Ju1(String str) {
        super(str);
        this.f3162b = Pattern.compile(str);
    }

    @Override // p000.AbstractC18674Vi1
    /* renamed from: a */
    public List mo23449a(FileProvider fileProvider) {
        return m65872b(fileProvider, ".");
    }

    @Override // p000.AbstractC18674Vi1
    /* renamed from: c */
    public boolean mo23448c(File file) {
        return this.f3162b.matcher(file.getName()).find();
    }
}