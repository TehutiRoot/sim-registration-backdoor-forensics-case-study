package p000;

import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: gX */
/* loaded from: classes.dex */
public class C10309gX {

    /* renamed from: a */
    public FileProvider f62188a;

    public C10309gX(FileProvider fileProvider) {
        this.f62188a = fileProvider;
    }

    /* renamed from: e */
    public static String m31101e(String str) {
        String str2 = File.separator;
        if (str.contains(str2)) {
            String[] split = str.split(str2);
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > 0) {
                    split[i] = "(?:\ufffe)?" + split[i] + "(?:\uffff)?";
                }
            }
            return TextUtils.join(File.separator, split);
        }
        return "(?:\ufffe)?" + str + "(?:\uffff)?";
    }

    /* renamed from: h */
    public static String m31098h(String str) {
        return str.replace("(?:\ufffe)?", "").replace("(?:\uffff)?", "");
    }

    /* renamed from: a */
    public List m31105a(String str) {
        List m31100f = m31100f(str);
        ArrayList arrayList = new ArrayList();
        m31104b(((AbstractC18819Yh1) m31100f.get(0)).mo26421a(this.f62188a), m31100f, 1, arrayList);
        return m31099g(arrayList);
    }

    /* renamed from: b */
    public final void m31104b(List list, List list2, int i, List list3) {
        if (i >= list2.size() - 1) {
            return;
        }
        AbstractC18819Yh1 abstractC18819Yh1 = (AbstractC18819Yh1) list2.get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (this.f62188a.isDirectory(file) && abstractC18819Yh1.mo26420c(file)) {
                list3.add(file);
                m31104b(Arrays.asList(this.f62188a.listFiles(file, null)), list2, i + 1, list3);
            }
        }
    }

    /* renamed from: c */
    public List m31103c(String str) {
        List m31100f = m31100f(str);
        return m31099g(m31102d(((AbstractC18819Yh1) m31100f.get(0)).mo26421a(this.f62188a), m31100f, 1));
    }

    /* renamed from: d */
    public final List m31102d(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        AbstractC18819Yh1 abstractC18819Yh1 = (AbstractC18819Yh1) list2.get(i);
        int size = list2.size() - 1;
        Iterator it = list.iterator();
        if (i >= size) {
            while (it.hasNext()) {
                File file = (File) it.next();
                if (abstractC18819Yh1.mo26420c(file)) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        while (it.hasNext()) {
            File file2 = (File) it.next();
            if (this.f62188a.isDirectory(file2) && abstractC18819Yh1.mo26420c(file2)) {
                arrayList.addAll(m31102d(Arrays.asList(this.f62188a.listFiles(file2, null)), list2, i + 1));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List m31100f(String str) {
        String[] split;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            if (str2.contains("(?:\ufffe)?") && str2.contains("(?:\uffff)?")) {
                z = true;
            } else {
                z = false;
            }
            String replace = str2.replace("(?:\ufffe)?", "").replace("(?:\uffff)?", "");
            if (z) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C20944lj0(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new C18080Mt1(replace));
            } else {
                arrayList2.add(replace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C20944lj0(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List m31099g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }
}
