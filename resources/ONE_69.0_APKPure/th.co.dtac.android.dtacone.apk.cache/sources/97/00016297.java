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
public class C17170yu extends ContextAwareBase {

    /* renamed from: c */
    public Converter f109197c;

    /* renamed from: d */
    public Converter f109198d;

    /* renamed from: e */
    public final Node f109199e;

    /* renamed from: f */
    public final Map f109200f;

    public C17170yu(Node node, Map map) {
        this.f109199e = node;
        this.f109200f = map;
    }

    /* renamed from: b */
    public final void m228b(Converter converter) {
        if (this.f109197c == null) {
            this.f109198d = converter;
            this.f109197c = converter;
            return;
        }
        this.f109198d.setNext(converter);
        this.f109198d = converter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ch.qos.logback.core.pattern.parser.Node] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ch.qos.logback.core.pattern.parser.Node] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ch.qos.logback.core.pattern.parser.Node] */
    /* renamed from: d */
    public Converter m227d() {
        Converter converter;
        this.f109198d = null;
        this.f109197c = null;
        for (?? r0 = this.f109199e; r0 != null; r0 = r0.f39987c) {
            int i = r0.f39985a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        CompositeNode compositeNode = r0;
                        CompositeConverter m226g = m226g(compositeNode);
                        if (m226g == null) {
                            addError("Failed to create converter for [%" + compositeNode.getValue() + "] keyword");
                            converter = new LiteralConverter("%PARSER_ERROR[" + compositeNode.getValue() + "]");
                        } else {
                            m226g.setFormattingInfo(compositeNode.getFormatInfo());
                            m226g.setOptionList(compositeNode.getOptions());
                            C17170yu c17170yu = new C17170yu(compositeNode.getChildNode(), this.f109200f);
                            c17170yu.setContext(this.context);
                            m226g.setChildConverter(c17170yu.m227d());
                            converter = m226g;
                        }
                    }
                } else {
                    SimpleKeywordNode simpleKeywordNode = r0;
                    DynamicConverter m225i = m225i(simpleKeywordNode);
                    if (m225i != null) {
                        m225i.setFormattingInfo(simpleKeywordNode.getFormatInfo());
                        m225i.setOptionList(simpleKeywordNode.getOptions());
                        converter = m225i;
                    } else {
                        Converter literalConverter = new LiteralConverter("%PARSER_ERROR[" + simpleKeywordNode.getValue() + "]");
                        addStatus(new ErrorStatus("[" + simpleKeywordNode.getValue() + "] is not a valid conversion word", this));
                        converter = literalConverter;
                    }
                }
                m228b(converter);
            } else {
                m228b(new LiteralConverter((String) r0.getValue()));
            }
        }
        return this.f109197c;
    }

    /* renamed from: g */
    public CompositeConverter m226g(CompositeNode compositeNode) {
        String str = (String) compositeNode.getValue();
        String str2 = (String) this.f109200f.get(str);
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
    public DynamicConverter m225i(SimpleKeywordNode simpleKeywordNode) {
        String str = (String) simpleKeywordNode.getValue();
        String str2 = (String) this.f109200f.get(str);
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