package ch.qos.logback.core.joran.spi;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ElementPath {

    /* renamed from: a */
    public ArrayList f39805a;

    public ElementPath() {
        this.f39805a = new ArrayList();
    }

    /* renamed from: a */
    private boolean m51506a(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    public ElementPath duplicate() {
        ElementPath elementPath = new ElementPath();
        elementPath.f39805a.addAll(this.f39805a);
        return elementPath;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementPath)) {
            return false;
        }
        ElementPath elementPath = (ElementPath) obj;
        if (elementPath.size() != size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (!m51506a(get(i), elementPath.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String get(int i) {
        return (String) this.f39805a.get(i);
    }

    public List<String> getCopyOfPartList() {
        return new ArrayList(this.f39805a);
    }

    public String peekLast() {
        if (this.f39805a.isEmpty()) {
            return null;
        }
        return (String) this.f39805a.get(this.f39805a.size() - 1);
    }

    public void pop() {
        if (this.f39805a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f39805a;
        arrayList.remove(arrayList.size() - 1);
    }

    public void push(String str) {
        this.f39805a.add(str);
    }

    public int size() {
        return this.f39805a.size();
    }

    public String toStableString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f39805a.iterator();
        while (it.hasNext()) {
            sb.append("[");
            sb.append((String) it.next());
            sb.append("]");
        }
        return sb.toString();
    }

    public String toString() {
        return toStableString();
    }

    public ElementPath(String str) {
        String[] split;
        this.f39805a = new ArrayList();
        if (str == null || (split = str.split(RemoteSettings.FORWARD_SLASH_STRING)) == null) {
            return;
        }
        for (String str2 : split) {
            if (str2.length() > 0) {
                this.f39805a.add(str2);
            }
        }
    }

    public ElementPath(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.f39805a = arrayList;
        arrayList.addAll(list);
    }
}
