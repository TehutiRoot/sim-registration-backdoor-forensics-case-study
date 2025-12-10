package p000;

import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: kX */
/* loaded from: classes.dex */
public class C11637kX {

    /* renamed from: a */
    public FileProvider f67987a;

    public C11637kX(FileProvider fileProvider) {
        this.f67987a = fileProvider;
    }

    /* renamed from: e */
    public static String m29195e(String str) {
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
    public static String m29192h(String str) {
        return str.replace("(?:\ufffe)?", "").replace("(?:\uffff)?", "");
    }

    /* renamed from: a */
    public List m29199a(String str) {
        List m29194f = m29194f(str);
        ArrayList arrayList = new ArrayList();
        m29198b(((AbstractC18674Vi1) m29194f.get(0)).mo23449a(this.f67987a), m29194f, 1, arrayList);
        return m29193g(arrayList);
    }

    /* renamed from: b */
    public final void m29198b(List list, List list2, int i, List list3) {
        if (i >= list2.size() - 1) {
            return;
        }
        AbstractC18674Vi1 abstractC18674Vi1 = (AbstractC18674Vi1) list2.get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (this.f67987a.isDirectory(file) && abstractC18674Vi1.mo23448c(file)) {
                list3.add(file);
                m29198b(Arrays.asList(this.f67987a.listFiles(file, null)), list2, i + 1, list3);
            }
        }
    }

    /* renamed from: c */
    public List m29197c(String str) {
        List m29194f = m29194f(str);
        return m29193g(m29196d(((AbstractC18674Vi1) m29194f.get(0)).mo23449a(this.f67987a), m29194f, 1));
    }

    /* renamed from: d */
    public final List m29196d(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        AbstractC18674Vi1 abstractC18674Vi1 = (AbstractC18674Vi1) list2.get(i);
        int size = list2.size() - 1;
        Iterator it = list.iterator();
        if (i >= size) {
            while (it.hasNext()) {
                File file = (File) it.next();
                if (abstractC18674Vi1.mo23448c(file)) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        while (it.hasNext()) {
            File file2 = (File) it.next();
            if (this.f67987a.isDirectory(file2) && abstractC18674Vi1.mo23448c(file2)) {
                arrayList.addAll(m29196d(Arrays.asList(this.f67987a.listFiles(file2, null)), list2, i + 1));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List m29194f(String str) {
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
                    arrayList.add(new C22040rj0(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new C17923Ju1(replace));
            } else {
                arrayList2.add(replace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C22040rj0(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List m29193g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }
}