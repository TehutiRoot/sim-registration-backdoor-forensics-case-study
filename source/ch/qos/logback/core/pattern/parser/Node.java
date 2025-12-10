package ch.qos.logback.core.pattern.parser;

/* loaded from: classes.dex */
public class Node {

    /* renamed from: a */
    public final int f39987a;

    /* renamed from: b */
    public final Object f39988b;

    /* renamed from: c */
    public Node f39989c;

    public Node(int i, Object obj) {
        this.f39987a = i;
        this.f39988b = obj;
    }

    /* renamed from: a */
    public String m51432a() {
        if (this.f39989c != null) {
            return " -> " + this.f39989c;
        }
        return "";
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Node) {
            Node node = (Node) obj;
            if (this.f39987a == node.f39987a && ((obj2 = this.f39988b) == null ? node.f39988b == null : obj2.equals(node.f39988b))) {
                Node node2 = this.f39989c;
                Node node3 = node.f39989c;
                if (node2 != null) {
                    if (node2.equals(node3)) {
                        return true;
                    }
                } else if (node3 == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Node getNext() {
        return this.f39989c;
    }

    public int getType() {
        return this.f39987a;
    }

    public Object getValue() {
        return this.f39988b;
    }

    public int hashCode() {
        int i = this.f39987a * 31;
        Object obj = this.f39988b;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public void setNext(Node node) {
        this.f39989c = node;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f39987a != 0) {
            str = super.toString();
        } else {
            str = "LITERAL(" + this.f39988b + ")";
        }
        stringBuffer.append(str);
        stringBuffer.append(m51432a());
        return stringBuffer.toString();
    }
}
