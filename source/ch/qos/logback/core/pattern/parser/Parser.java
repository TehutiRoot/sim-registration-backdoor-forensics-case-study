package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.FormatInfo;
import ch.qos.logback.core.pattern.IdentityCompositeConverter;
import ch.qos.logback.core.pattern.ReplacingCompositeConverter;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Parser<E> extends ContextAwareBase {
    public static final Map<String, String> DEFAULT_COMPOSITE_CONVERTER_MAP;
    public static final String MISSING_RIGHT_PARENTHESIS = "http://logback.qos.ch/codes.html#missingRightParenthesis";
    public static final String REPLACE_CONVERTER_WORD = "replace";

    /* renamed from: c */
    public final List f39996c;

    /* renamed from: d */
    public int f39997d;

    static {
        HashMap hashMap = new HashMap();
        DEFAULT_COMPOSITE_CONVERTER_MAP = hashMap;
        hashMap.put(C22796wT1.f108010f.m834c().toString(), IdentityCompositeConverter.class.getName());
        hashMap.put(REPLACE_CONVERTER_WORD, ReplacingCompositeConverter.class.getName());
    }

    public Parser(String str) throws ScanException {
        this(str, new RegularEscapeUtil());
    }

    /* renamed from: b */
    public FormattingNode m51428b() {
        C22796wT1 m51420n = m51420n();
        m51421m(m51420n, "a LEFT_PARENTHESIS or KEYWORD");
        int m835b = m51420n.m835b();
        if (m835b != 1004) {
            if (m835b == 1005) {
                m51422l();
                return m51427d(m51420n.m834c().toString());
            }
            throw new IllegalStateException("Unexpected token " + m51420n);
        }
        return m51424j();
    }

    public Converter<E> compile(Node node, Map<String, String> map) {
        C17157yu c17157yu = new C17157yu(node, map);
        c17157yu.setContext(this.context);
        return c17157yu.m166d();
    }

    /* renamed from: d */
    public FormattingNode m51427d(String str) {
        CompositeNode compositeNode = new CompositeNode(str);
        compositeNode.setChildNode(m51426g());
        C22796wT1 m51419o = m51419o();
        if (m51419o != null && m51419o.m835b() == 41) {
            C22796wT1 m51420n = m51420n();
            if (m51420n != null && m51420n.m835b() == 1006) {
                compositeNode.setOptions(m51420n.m836a());
                m51422l();
            }
            return compositeNode;
        }
        String str2 = "Expecting RIGHT_PARENTHESIS token but got " + m51419o;
        addError(str2);
        addError("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
        throw new ScanException(str2);
    }

    /* renamed from: g */
    public Node m51426g() {
        Node m51423k = m51423k();
        if (m51423k == null) {
            return null;
        }
        Node m51425i = m51425i();
        if (m51425i != null) {
            m51423k.setNext(m51425i);
        }
        return m51423k;
    }

    /* renamed from: i */
    public Node m51425i() {
        if (m51420n() == null) {
            return null;
        }
        return m51426g();
    }

    /* renamed from: j */
    public FormattingNode m51424j() {
        SimpleKeywordNode simpleKeywordNode = new SimpleKeywordNode(m51419o().m834c());
        C22796wT1 m51420n = m51420n();
        if (m51420n != null && m51420n.m835b() == 1006) {
            simpleKeywordNode.setOptions(m51420n.m836a());
            m51422l();
        }
        return simpleKeywordNode;
    }

    /* renamed from: k */
    public Node m51423k() {
        C22796wT1 m51420n = m51420n();
        m51421m(m51420n, "a LITERAL or '%'");
        int m835b = m51420n.m835b();
        if (m835b != 37) {
            if (m835b != 1000) {
                return null;
            }
            m51422l();
            return new Node(0, m51420n.m834c());
        }
        m51422l();
        C22796wT1 m51420n2 = m51420n();
        m51421m(m51420n2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
        if (m51420n2.m835b() == 1002) {
            FormatInfo valueOf = FormatInfo.valueOf(m51420n2.m834c());
            m51422l();
            FormattingNode m51428b = m51428b();
            m51428b.setFormatInfo(valueOf);
            return m51428b;
        }
        return m51428b();
    }

    /* renamed from: l */
    public void m51422l() {
        this.f39997d++;
    }

    /* renamed from: m */
    public void m51421m(C22796wT1 c22796wT1, String str) {
        if (c22796wT1 != null) {
            return;
        }
        throw new IllegalStateException("All tokens consumed but was expecting " + str);
    }

    /* renamed from: n */
    public C22796wT1 m51420n() {
        if (this.f39997d < this.f39996c.size()) {
            return (C22796wT1) this.f39996c.get(this.f39997d);
        }
        return null;
    }

    /* renamed from: o */
    public C22796wT1 m51419o() {
        if (this.f39997d < this.f39996c.size()) {
            List list = this.f39996c;
            int i = this.f39997d;
            this.f39997d = i + 1;
            return (C22796wT1) list.get(i);
        }
        return null;
    }

    public Node parse() throws ScanException {
        return m51426g();
    }

    public Parser(String str, IEscapeUtil iEscapeUtil) throws ScanException {
        this.f39997d = 0;
        try {
            this.f39996c = new TokenStream(str, iEscapeUtil).m51411h();
        } catch (IllegalArgumentException e) {
            throw new ScanException("Failed to initialize Parser", e);
        }
    }
}
