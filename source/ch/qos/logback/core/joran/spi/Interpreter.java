package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/* loaded from: classes.dex */
public class Interpreter {

    /* renamed from: j */
    public static List f39817j = new Vector(0);

    /* renamed from: a */
    public final RuleStore f39818a;

    /* renamed from: b */
    public final InterpretationContext f39819b;

    /* renamed from: d */
    public final C1907ag f39821d;

    /* renamed from: e */
    public ElementPath f39822e;

    /* renamed from: f */
    public Locator f39823f;

    /* renamed from: i */
    public ElementPath f39826i = null;

    /* renamed from: c */
    public final ArrayList f39820c = new ArrayList(3);

    /* renamed from: h */
    public Stack f39825h = new Stack();

    /* renamed from: g */
    public EventPlayer f39824g = new EventPlayer(this);

    public Interpreter(Context context, RuleStore ruleStore, ElementPath elementPath) {
        this.f39821d = new C1907ag(context, this);
        this.f39818a = ruleStore;
        this.f39819b = new InterpretationContext(context, this);
        this.f39822e = elementPath;
    }

    /* renamed from: a */
    public void m51502a(List list, String str, Attributes attributes) {
        C1907ag c1907ag;
        StringBuilder sb;
        String str2;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Action) it.next()).begin(this.f39819b, str, attributes);
            } catch (ActionException e) {
                e = e;
                this.f39826i = this.f39822e.duplicate();
                c1907ag = this.f39821d;
                sb = new StringBuilder();
                str2 = "ActionException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                c1907ag.addError(sb.toString(), e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f39826i = this.f39822e.duplicate();
                c1907ag = this.f39821d;
                sb = new StringBuilder();
                str2 = "RuntimeException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                c1907ag.addError(sb.toString(), e);
            }
        }
    }

    public void addImplicitAction(ImplicitAction implicitAction) {
        this.f39820c.add(implicitAction);
    }

    /* renamed from: b */
    public final void m51501b(List list, String str) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            try {
                action.body(this.f39819b, str);
            } catch (ActionException e) {
                C1907ag c1907ag = this.f39821d;
                c1907ag.addError("Exception in end() methd for action [" + action + "]", e);
            }
        }
    }

    /* renamed from: c */
    public final void m51500c(List list, String str) {
        C1907ag c1907ag;
        StringBuilder sb;
        String str2;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Action) it.next()).end(this.f39819b, str);
            } catch (ActionException e) {
                e = e;
                c1907ag = this.f39821d;
                sb = new StringBuilder();
                str2 = "ActionException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                c1907ag.addError(sb.toString(), e);
            } catch (RuntimeException e2) {
                e = e2;
                c1907ag = this.f39821d;
                sb = new StringBuilder();
                str2 = "RuntimeException in Action for tag [";
                sb.append(str2);
                sb.append(str);
                sb.append("]");
                c1907ag.addError(sb.toString(), e);
            }
        }
    }

    public void characters(BodyEvent bodyEvent) {
        setDocumentLocator(bodyEvent.locator);
        String text = bodyEvent.getText();
        List list = (List) this.f39825h.peek();
        if (text != null) {
            String trim = text.trim();
            if (trim.length() > 0) {
                m51501b(list, trim);
            }
        }
    }

    /* renamed from: d */
    public final void m51499d(String str, String str2, String str3) {
        List list = (List) this.f39825h.pop();
        ElementPath elementPath = this.f39826i;
        if (elementPath != null) {
            if (elementPath.equals(this.f39822e)) {
                this.f39826i = null;
            }
        } else if (list != f39817j) {
            m51500c(list, m51497f(str2, str3));
        }
        this.f39822e.pop();
    }

    /* renamed from: e */
    public List m51498e(ElementPath elementPath, Attributes attributes) {
        List<Action> matchActions = this.f39818a.matchActions(elementPath);
        return matchActions == null ? m51496g(elementPath, attributes, this.f39819b) : matchActions;
    }

    public void endElement(EndEvent endEvent) {
        setDocumentLocator(endEvent.locator);
        m51499d(endEvent.namespaceURI, endEvent.localName, endEvent.qName);
    }

    /* renamed from: f */
    public String m51497f(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    /* renamed from: g */
    public List m51496g(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        int size = this.f39820c.size();
        for (int i = 0; i < size; i++) {
            ImplicitAction implicitAction = (ImplicitAction) this.f39820c.get(i);
            if (implicitAction.isApplicable(elementPath, attributes, interpretationContext)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(implicitAction);
                return arrayList;
            }
        }
        return null;
    }

    public EventPlayer getEventPlayer() {
        return this.f39824g;
    }

    public InterpretationContext getExecutionContext() {
        return getInterpretationContext();
    }

    public InterpretationContext getInterpretationContext() {
        return this.f39819b;
    }

    public Locator getLocator() {
        return this.f39823f;
    }

    public RuleStore getRuleStore() {
        return this.f39818a;
    }

    /* renamed from: h */
    public final void m51495h() {
        this.f39825h.add(f39817j);
    }

    /* renamed from: i */
    public final void m51494i(String str, String str2, String str3, Attributes attributes) {
        String m51497f = m51497f(str2, str3);
        this.f39822e.push(m51497f);
        if (this.f39826i != null) {
            m51495h();
            return;
        }
        List m51498e = m51498e(this.f39822e, attributes);
        if (m51498e != null) {
            this.f39825h.add(m51498e);
            m51502a(m51498e, m51497f, attributes);
            return;
        }
        m51495h();
        this.f39821d.addError("no applicable action for [" + m51497f + "], current ElementPath  is [" + this.f39822e + "]");
    }

    public void setDocumentLocator(Locator locator) {
        this.f39823f = locator;
    }

    public void setInterpretationContextPropertiesMap(Map<String, String> map) {
        this.f39819b.m51503d(map);
    }

    public void startDocument() {
    }

    public void startElement(StartEvent startEvent) {
        setDocumentLocator(startEvent.getLocator());
        m51494i(startEvent.namespaceURI, startEvent.localName, startEvent.qName, startEvent.attributes);
    }
}
