package ch.qos.logback.core.subst;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class Node {

    /* renamed from: a */
    public Type f40133a;

    /* renamed from: b */
    public Object f40134b;

    /* renamed from: c */
    public Object f40135c;

    /* renamed from: d */
    public Node f40136d;

    /* loaded from: classes.dex */
    public enum Type {
        LITERAL,
        VARIABLE
    }

    /* renamed from: ch.qos.logback.core.subst.Node$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5486a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40137a;

        static {
            int[] iArr = new int[Type.values().length];
            f40137a = iArr;
            try {
                iArr[Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40137a[Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Node(Type type, Object obj) {
        this.f40133a = type;
        this.f40134b = obj;
    }

    /* renamed from: a */
    public void m51351a(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.f40136d;
            if (node3 == null) {
                node2.f40136d = node;
                return;
            }
            node2 = node3;
        }
    }

    /* renamed from: b */
    public void m51350b(Node node, StringBuilder sb) {
        while (node != null) {
            sb.append(node.toString());
            sb.append(" --> ");
            node = node.f40136d;
        }
        sb.append("null ");
    }

    public void dump() {
        PrintStream printStream = System.out;
        printStream.print(toString());
        printStream.print(" -> ");
        Node node = this.f40136d;
        if (node != null) {
            node.dump();
        } else {
            printStream.print(" null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.f40133a != node.f40133a) {
            return false;
        }
        Object obj2 = this.f40134b;
        if (obj2 == null ? node.f40134b == null : obj2.equals(node.f40134b)) {
            Object obj3 = this.f40135c;
            if (obj3 == null ? node.f40135c == null : obj3.equals(node.f40135c)) {
                Node node2 = this.f40136d;
                Node node3 = node.f40136d;
                return node2 == null ? node3 == null : node2.equals(node3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Type type = this.f40133a;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj = this.f40134b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f40135c;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Node node = this.f40136d;
        return hashCode3 + (node != null ? node.hashCode() : 0);
    }

    public void setNext(Node node) {
        this.f40136d = node;
    }

    public String toString() {
        int i = C5486a.f40137a[this.f40133a.ordinal()];
        if (i == 1) {
            return "Node{type=" + this.f40133a + ", payload='" + this.f40134b + "'}";
        } else if (i != 2) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Object obj = this.f40135c;
            if (obj != null) {
                m51350b((Node) obj, sb2);
            }
            m51350b((Node) this.f40134b, sb);
            String str = "Node{type=" + this.f40133a + ", payload='" + sb.toString() + OperatorName.SHOW_TEXT_LINE;
            if (this.f40135c != null) {
                str = str + ", defaultPart=" + sb2.toString();
            }
            return str + '}';
        }
    }

    public Node(Type type, Object obj, Object obj2) {
        this.f40133a = type;
        this.f40134b = obj;
        this.f40135c = obj2;
    }
}