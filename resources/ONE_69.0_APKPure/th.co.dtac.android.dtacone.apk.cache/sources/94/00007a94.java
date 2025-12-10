package ch.qos.logback.core.pattern.parser;

/* loaded from: classes.dex */
public class Node {

    /* renamed from: a */
    public final int f39985a;

    /* renamed from: b */
    public final Object f39986b;

    /* renamed from: c */
    public Node f39987c;

    public Node(int i, Object obj) {
        this.f39985a = i;
        this.f39986b = obj;
    }

    /* renamed from: a */
    public String m51427a() {
        if (this.f39987c != null) {
            return " -> " + this.f39987c;
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
            if (this.f39985a == node.f39985a && ((obj2 = this.f39986b) == null ? node.f39986b == null : obj2.equals(node.f39986b))) {
                Node node2 = this.f39987c;
                Node node3 = node.f39987c;
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
        return this.f39987c;
    }

    public int getType() {
        return this.f39985a;
    }

    public Object getValue() {
        return this.f39986b;
    }

    public int hashCode() {
        int i = this.f39985a * 31;
        Object obj = this.f39986b;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public void setNext(Node node) {
        this.f39987c = node;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f39985a != 0) {
            str = super.toString();
        } else {
            str = "LITERAL(" + this.f39986b + ")";
        }
        stringBuffer.append(str);
        stringBuffer.append(m51427a());
        return stringBuffer.toString();
    }
}