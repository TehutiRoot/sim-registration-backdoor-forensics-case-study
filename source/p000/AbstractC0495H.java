package p000;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: H */
/* loaded from: classes6.dex */
public abstract class AbstractC0495H implements Comparator {
    public File[] sort(File... fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public List<File> sort(List<File> list) {
        if (list != null) {
            list.sort(this);
        }
        return list;
    }
}
