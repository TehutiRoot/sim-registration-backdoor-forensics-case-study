package p000;

import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.CompositeNode;
import ch.qos.logback.core.pattern.parser.Node;
import ch.qos.logback.core.pattern.parser.SimpleKeywordNode;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

/* renamed from: yu */
/* loaded from: classes.dex */
public class C17157yu extends ContextAwareBase {

    /* renamed from: c */
    public Converter f108926c;

    /* renamed from: d */
    public Converter f108927d;

    /* renamed from: e */
    public final Node f108928e;

    /* renamed from: f */
    public final Map f108929f;

    public C17157yu(Node node, Map map) {
        this.f108928e = node;
        this.f108929f = map;
    }

    /* renamed from: b */
    public final void m167b(Converter converter) {
        if (this.f108926c == null) {
            this.f108927d = converter;
            this.f108926c = converter;
            return;
        }
        this.f108927d.setNext(converter);
        this.f108927d = converter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ch.qos.logback.core.pattern.parser.Node] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ch.qos.logback.core.pattern.parser.Node] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ch.qos.logback.core.pattern.parser.Node] */
    /* renamed from: d */
    public Converter m166d() {
        Converter converter;
        this.f108927d = null;
        this.f108926c = null;
        for (?? r0 = this.f108928e; r0 != null; r0 = r0.f39989c) {
            int i = r0.f39987a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        CompositeNode compositeNode = r0;
                        CompositeConverter m165g = m165g(compositeNode);
                        if (m165g == null) {
                            addError("Failed to create converter for [%" + compositeNode.getValue() + "] keyword");
                            converter = new LiteralConverter("%PARSER_ERROR[" + compositeNode.getValue() + "]");
                        } else {
                            m165g.setFormattingInfo(compositeNode.getFormatInfo());
                            m165g.setOptionList(compositeNode.getOptions());
                            C17157yu c17157yu = new C17157yu(compositeNode.getChildNode(), this.f108929f);
                            c17157yu.setContext(this.context);
                            m165g.setChildConverter(c17157yu.m166d());
                            converter = m165g;
                        }
                    }
                } else {
                    SimpleKeywordNode simpleKeywordNode = r0;
                    DynamicConverter m164i = m164i(simpleKeywordNode);
                    if (m164i != null) {
                        m164i.setFormattingInfo(simpleKeywordNode.getFormatInfo());
                        m164i.setOptionList(simpleKeywordNode.getOptions());
                        converter = m164i;
                    } else {
                        Converter literalConverter = new LiteralConverter("%PARSER_ERROR[" + simpleKeywordNode.getValue() + "]");
                        addStatus(new ErrorStatus("[" + simpleKeywordNode.getValue() + "] is not a valid conversion word", this));
                        converter = literalConverter;
                    }
                }
                m167b(converter);
            } else {
                m167b(new LiteralConverter((String) r0.getValue()));
            }
        }
        return this.f108926c;
    }

    /* renamed from: g */
    public CompositeConverter m165g(CompositeNode compositeNode) {
        String str = (String) compositeNode.getValue();
        String str2 = (String) this.f108929f.get(str);
        if (str2 != null) {
            try {
                return (CompositeConverter) OptionHelper.instantiateByClassName(str2, CompositeConverter.class, this.context);
            } catch (Exception e) {
                addError("Failed to instantiate converter class [" + str2 + "] as a composite converter for keyword [" + str + "]", e);
                return null;
            }
        }
        addError("There is no conversion class registered for composite conversion word [" + str + "]");
        return null;
    }

    /* renamed from: i */
    public DynamicConverter m164i(SimpleKeywordNode simpleKeywordNode) {
        String str = (String) simpleKeywordNode.getValue();
        String str2 = (String) this.f108929f.get(str);
        if (str2 != null) {
            try {
                return (DynamicConverter) OptionHelper.instantiateByClassName(str2, DynamicConverter.class, this.context);
            } catch (Exception e) {
                addError("Failed to instantiate converter class [" + str2 + "] for keyword [" + str + "]", e);
                return null;
            }
        }
        addError("There is no conversion class registered for conversion word [" + str + "]");
        return null;
    }
}
