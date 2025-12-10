package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public class NodeToStringTransformer {

    /* renamed from: a */
    public final Node f40138a;

    /* renamed from: b */
    public final PropertyContainer f40139b;

    /* renamed from: c */
    public final PropertyContainer f40140c;

    /* renamed from: ch.qos.logback.core.subst.NodeToStringTransformer$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5487a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40141a;

        static {
            int[] iArr = new int[Node.Type.values().length];
            f40141a = iArr;
            try {
                iArr[Node.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40141a[Node.Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    /* renamed from: h */
    public static Node m51342h(String str) {
        return new Parser(new Tokenizer(str).m51325e()).parse();
    }

    public static String substituteVariable(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) throws ScanException {
        return new NodeToStringTransformer(m51342h(str), propertyContainer, propertyContainer2).transform();
    }

    /* renamed from: a */
    public final void m51349a(Node node, StringBuilder sb, Stack stack) {
        while (node != null) {
            int i = C5487a.f40141a[node.f40133a.ordinal()];
            if (i == 1) {
                m51346d(node, sb);
            } else if (i == 2) {
                m51345e(node, sb, stack);
            }
            node = node.f40136d;
        }
    }

    /* renamed from: b */
    public final String m51348b(Stack stack) {
        StringBuilder sb = new StringBuilder("Circular variable reference detected while parsing input [");
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            sb.append("${");
            sb.append(m51341i(node));
            sb.append("}");
            if (stack.lastElement() != node) {
                sb.append(" --> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public final boolean m51347c(Node node, Node node2) {
        Node.Type type = node.f40133a;
        if (type == null || type.equals(node2.f40133a)) {
            Object obj = node.f40134b;
            if (obj == null || obj.equals(node2.f40134b)) {
                Object obj2 = node.f40135c;
                return obj2 == null || obj2.equals(node2.f40135c);
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final void m51346d(Node node, StringBuilder sb) {
        sb.append((String) node.f40134b);
    }

    /* renamed from: e */
    public final void m51345e(Node node, StringBuilder sb, Stack stack) {
        boolean m51344f = m51344f(node, stack);
        stack.push(node);
        if (m51344f) {
            throw new IllegalArgumentException(m51348b(stack));
        }
        StringBuilder sb2 = new StringBuilder();
        m51349a((Node) node.f40134b, sb2, stack);
        String sb3 = sb2.toString();
        String m51343g = m51343g(sb3);
        if (m51343g != null) {
            m51349a(m51342h(m51343g), sb, stack);
            stack.pop();
            return;
        }
        Object obj = node.f40135c;
        if (obj != null) {
            StringBuilder sb4 = new StringBuilder();
            m51349a((Node) obj, sb4, stack);
            stack.pop();
            sb.append(sb4.toString());
            return;
        }
        sb.append(sb3 + CoreConstants.UNDEFINED_PROPERTY_SUFFIX);
        stack.pop();
    }

    /* renamed from: f */
    public final boolean m51344f(Node node, Stack stack) {
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            if (m51347c(node, (Node) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final String m51343g(String str) {
        String property;
        String property2 = this.f40139b.getProperty(str);
        if (property2 != null) {
            return property2;
        }
        PropertyContainer propertyContainer = this.f40140c;
        if (propertyContainer == null || (property = propertyContainer.getProperty(str)) == null) {
            String systemProperty = OptionHelper.getSystemProperty(str, null);
            if (systemProperty != null) {
                return systemProperty;
            }
            String env = OptionHelper.getEnv(str);
            if (env != null) {
                return env;
            }
            return null;
        }
        return property;
    }

    /* renamed from: i */
    public final String m51341i(Node node) {
        return (String) ((Node) node.f40134b).f40134b;
    }

    public String transform() throws ScanException {
        StringBuilder sb = new StringBuilder();
        m51349a(this.f40138a, sb, new Stack());
        return sb.toString();
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        this.f40138a = node;
        this.f40139b = propertyContainer;
        this.f40140c = propertyContainer2;
    }
}