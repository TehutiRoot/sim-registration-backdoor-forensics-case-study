package ch.qos.logback.core.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HardenedObjectInputStream extends ObjectInputStream {

    /* renamed from: b */
    public static final String[] f39863b = {"java.lang", "java.util"};

    /* renamed from: a */
    public final List f39864a;

    public HardenedObjectInputStream(InputStream inputStream, List<String> list) throws IOException {
        super(inputStream);
        ArrayList arrayList = new ArrayList();
        this.f39864a = arrayList;
        arrayList.addAll(list);
    }

    public void addToWhitelist(List<String> list) {
        this.f39864a.addAll(list);
    }

    /* renamed from: b */
    public final boolean m51457b(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f39863b;
            if (i >= strArr.length) {
                for (String str2 : this.f39864a) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
                return false;
            } else if (str.startsWith(strArr[i])) {
                return true;
            } else {
                i++;
            }
        }
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        if (m51457b(objectStreamClass.getName())) {
            return super.resolveClass(objectStreamClass);
        }
        throw new InvalidClassException("Unauthorized deserialization attempt", objectStreamClass.getName());
    }

    public HardenedObjectInputStream(InputStream inputStream, String[] strArr) throws IOException {
        super(inputStream);
        this.f39864a = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                this.f39864a.add(str);
            }
        }
    }
}
