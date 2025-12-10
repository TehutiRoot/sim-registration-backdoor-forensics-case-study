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
    public final Node f40140a;

    /* renamed from: b */
    public final PropertyContainer f40141b;

    /* renamed from: c */
    public final PropertyContainer f40142c;

    /* renamed from: ch.qos.logback.core.subst.NodeToStringTransformer$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5498a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40143a;

        static {
            int[] iArr = new int[Node.Type.values().length];
            f40143a = iArr;
            try {
                iArr[Node.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40143a[Node.Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    /* renamed from: h */
    public static Node m51347h(String str) {
        return new Parser(new Tokenizer(str).m51330e()).parse();
    }

    public static String substituteVariable(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) throws ScanException {
        return new NodeToStringTransformer(m51347h(str), propertyContainer, propertyContainer2).transform();
    }

    /* renamed from: a */
    public final void m51354a(Node node, StringBuilder sb, Stack stack) {
        while (node != null) {
            int i = C5498a.f40143a[node.f40135a.ordinal()];
            if (i == 1) {
                m51351d(node, sb);
            } else if (i == 2) {
                m51350e(node, sb, stack);
            }
            node = node.f40138d;
        }
    }

    /* renamed from: b */
    public final String m51353b(Stack stack) {
        StringBuilder sb = new StringBuilder("Circular variable reference detected while parsing input [");
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            sb.append("${");
            sb.append(m51346i(node));
            sb.append("}");
            if (stack.lastElement() != node) {
                sb.append(" --> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public final boolean m51352c(Node node, Node node2) {
        Node.Type type = node.f40135a;
        if (type == null || type.equals(node2.f40135a)) {
            Object obj = node.f40136b;
            if (obj == null || obj.equals(node2.f40136b)) {
                Object obj2 = node.f40137c;
                return obj2 == null || obj2.equals(node2.f40137c);
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final void m51351d(Node node, StringBuilder sb) {
        sb.append((String) node.f40136b);
    }

    /* renamed from: e */
    public final void m51350e(Node node, StringBuilder sb, Stack stack) {
        boolean m51349f = m51349f(node, stack);
        stack.push(node);
        if (m51349f) {
            throw new IllegalArgumentException(m51353b(stack));
        }
        StringBuilder sb2 = new StringBuilder();
        m51354a((Node) node.f40136b, sb2, stack);
        String sb3 = sb2.toString();
        String m51348g = m51348g(sb3);
        if (m51348g != null) {
            m51354a(m51347h(m51348g), sb, stack);
            stack.pop();
            return;
        }
        Object obj = node.f40137c;
        if (obj != null) {
            StringBuilder sb4 = new StringBuilder();
            m51354a((Node) obj, sb4, stack);
            stack.pop();
            sb.append(sb4.toString());
            return;
        }
        sb.append(sb3 + CoreConstants.UNDEFINED_PROPERTY_SUFFIX);
        stack.pop();
    }

    /* renamed from: f */
    public final boolean m51349f(Node node, Stack stack) {
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            if (m51352c(node, (Node) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final String m51348g(String str) {
        String property;
        String property2 = this.f40141b.getProperty(str);
        if (property2 != null) {
            return property2;
        }
        PropertyContainer propertyContainer = this.f40142c;
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
    public final String m51346i(Node node) {
        return (String) ((Node) node.f40136b).f40136b;
    }

    public String transform() throws ScanException {
        StringBuilder sb = new StringBuilder();
        m51354a(this.f40140a, sb, new Stack());
        return sb.toString();
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        this.f40140a = node;
        this.f40141b = propertyContainer;
        this.f40142c = propertyContainer2;
    }
}
