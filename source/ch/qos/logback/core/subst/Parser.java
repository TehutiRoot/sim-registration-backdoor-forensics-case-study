package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.subst.Token;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;

/* loaded from: classes.dex */
public class Parser {

    /* renamed from: a */
    public final List f40144a;

    /* renamed from: b */
    public int f40145b = 0;

    /* renamed from: ch.qos.logback.core.subst.Parser$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5499a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40146a;

        static {
            int[] iArr = new int[Token.Type.values().length];
            f40146a = iArr;
            try {
                iArr[Token.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40146a[Token.Type.CURLY_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40146a[Token.Type.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Parser(List<Token> list) {
        this.f40144a = list;
    }

    /* renamed from: a */
    public final Node m51345a() {
        Node m51344b = m51344b();
        if (m51337i(m51335k())) {
            m51340f();
            m51344b.m51356a(m51336j(CoreConstants.DEFAULT_VALUE_SEPARATOR));
            m51344b.m51356a(m51344b());
        }
        return m51344b;
    }

    /* renamed from: b */
    public final Node m51344b() {
        Node m51342d = m51342d();
        if (m51342d == null) {
            return null;
        }
        Node m51343c = m51343c();
        if (m51343c != null) {
            m51342d.m51356a(m51343c);
        }
        return m51342d;
    }

    /* renamed from: c */
    public final Node m51343c() {
        if (m51335k() == null) {
            return null;
        }
        return m51344b();
    }

    /* renamed from: d */
    public final Node m51342d() {
        Token m51335k = m51335k();
        int i = C5499a.f40146a[m51335k.f40147a.ordinal()];
        if (i == 1) {
            m51340f();
            return m51336j(m51335k.f40148b);
        } else if (i != 2) {
            if (i != 3) {
                return null;
            }
            m51340f();
            Node m51341e = m51341e();
            m51339g(m51335k());
            m51340f();
            return m51341e;
        } else {
            m51340f();
            Node m51345a = m51345a();
            m51339g(m51335k());
            m51340f();
            Node m51336j = m51336j(CoreConstants.LEFT_ACCOLADE);
            m51336j.m51356a(m51345a);
            m51336j.m51356a(m51336j(CoreConstants.RIGHT_ACCOLADE));
            return m51336j;
        }
    }

    /* renamed from: e */
    public final Node m51341e() {
        Node node = new Node(Node.Type.VARIABLE, m51344b());
        if (m51337i(m51335k())) {
            m51340f();
            node.f40137c = m51344b();
        }
        return node;
    }

    /* renamed from: f */
    public void m51340f() {
        this.f40145b++;
    }

    /* renamed from: g */
    public void m51339g(Token token) {
        m51338h(token, "}");
        if (token.f40147a != Token.Type.CURLY_RIGHT) {
            throw new ScanException("Expecting }");
        }
    }

    /* renamed from: h */
    public void m51338h(Token token, String str) {
        if (token != null) {
            return;
        }
        throw new IllegalArgumentException("All tokens consumed but was expecting \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    /* renamed from: i */
    public final boolean m51337i(Token token) {
        return token != null && token.f40147a == Token.Type.DEFAULT;
    }

    /* renamed from: j */
    public final Node m51336j(String str) {
        return new Node(Node.Type.LITERAL, str);
    }

    /* renamed from: k */
    public Token m51335k() {
        if (this.f40145b < this.f40144a.size()) {
            return (Token) this.f40144a.get(this.f40145b);
        }
        return null;
    }

    public Node parse() throws ScanException {
        List list = this.f40144a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return m51344b();
    }
}
