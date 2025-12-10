package ch.qos.logback.core.subst;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class Node {

    /* renamed from: a */
    public Type f40135a;

    /* renamed from: b */
    public Object f40136b;

    /* renamed from: c */
    public Object f40137c;

    /* renamed from: d */
    public Node f40138d;

    /* loaded from: classes.dex */
    public enum Type {
        LITERAL,
        VARIABLE
    }

    /* renamed from: ch.qos.logback.core.subst.Node$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5497a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40139a;

        static {
            int[] iArr = new int[Type.values().length];
            f40139a = iArr;
            try {
                iArr[Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40139a[Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Node(Type type, Object obj) {
        this.f40135a = type;
        this.f40136b = obj;
    }

    /* renamed from: a */
    public void m51356a(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.f40138d;
            if (node3 == null) {
                node2.f40138d = node;
                return;
            }
            node2 = node3;
        }
    }

    /* renamed from: b */
    public void m51355b(Node node, StringBuilder sb) {
        while (node != null) {
            sb.append(node.toString());
            sb.append(" --> ");
            node = node.f40138d;
        }
        sb.append("null ");
    }

    public void dump() {
        PrintStream printStream = System.out;
        printStream.print(toString());
        printStream.print(" -> ");
        Node node = this.f40138d;
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
        if (this.f40135a != node.f40135a) {
            return false;
        }
        Object obj2 = this.f40136b;
        if (obj2 == null ? node.f40136b == null : obj2.equals(node.f40136b)) {
            Object obj3 = this.f40137c;
            if (obj3 == null ? node.f40137c == null : obj3.equals(node.f40137c)) {
                Node node2 = this.f40138d;
                Node node3 = node.f40138d;
                return node2 == null ? node3 == null : node2.equals(node3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Type type = this.f40135a;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj = this.f40136b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f40137c;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Node node = this.f40138d;
        return hashCode3 + (node != null ? node.hashCode() : 0);
    }

    public void setNext(Node node) {
        this.f40138d = node;
    }

    public String toString() {
        int i = C5497a.f40139a[this.f40135a.ordinal()];
        if (i == 1) {
            return "Node{type=" + this.f40135a + ", payload='" + this.f40136b + "'}";
        } else if (i != 2) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Object obj = this.f40137c;
            if (obj != null) {
                m51355b((Node) obj, sb2);
            }
            m51355b((Node) this.f40136b, sb);
            String str = "Node{type=" + this.f40135a + ", payload='" + sb.toString() + OperatorName.SHOW_TEXT_LINE;
            if (this.f40137c != null) {
                str = str + ", defaultPart=" + sb2.toString();
            }
            return str + '}';
        }
    }

    public Node(Type type, Object obj, Object obj2) {
        this.f40135a = type;
        this.f40136b = obj;
        this.f40137c = obj2;
    }
}
