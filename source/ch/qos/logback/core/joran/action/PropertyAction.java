package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class PropertyAction extends Action {

    /* renamed from: c */
    public static String f39786c = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";

    /* renamed from: b */
    public boolean m51519b(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("resource"));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String str2;
        String subst;
        StringBuilder sb;
        String str3;
        StringBuilder sb2;
        String str4;
        if ("substitutionProperty".equals(str)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        ActionUtil.Scope stringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        if (!m51519b(attributes)) {
            if (!m51518d(attributes)) {
                if (m51517g(attributes)) {
                    ActionUtil.setProperty(interpretationContext, value, interpretationContext.subst(RegularEscapeUtil.basicEscape(value2).trim()), stringToScope);
                    return;
                }
                str2 = f39786c;
                addError(str2);
                return;
            }
            subst = interpretationContext.subst(attributes.getValue("resource"));
            URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(subst);
            if (resourceBySelfClassLoader == null) {
                sb2 = new StringBuilder();
                str4 = "Could not find resource [";
                sb2.append(str4);
                sb2.append(subst);
                sb2.append("].");
                str2 = sb2.toString();
                addError(str2);
                return;
            }
            try {
                m51516i(interpretationContext, resourceBySelfClassLoader.openStream(), stringToScope);
                return;
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder();
                str3 = "Could not read resource file [";
                sb.append(str3);
                sb.append(subst);
                sb.append("].");
                addError(sb.toString(), e);
            }
        }
        subst = interpretationContext.subst(attributes.getValue("file"));
        try {
            m51516i(interpretationContext, new FileInputStream(subst), stringToScope);
        } catch (FileNotFoundException unused) {
            sb2 = new StringBuilder();
            str4 = "Could not find properties file [";
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str3 = "Could not read properties file [";
            sb.append(str3);
            sb.append(subst);
            sb.append("].");
            addError(sb.toString(), e);
        }
    }

    /* renamed from: d */
    public boolean m51518d(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("resource")) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file"));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    /* renamed from: g */
    public boolean m51517g(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("name")) && !OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue("resource"));
    }

    /* renamed from: i */
    public void m51516i(InterpretationContext interpretationContext, InputStream inputStream, ActionUtil.Scope scope) {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        ActionUtil.setProperties(interpretationContext, properties, scope);
    }
}
