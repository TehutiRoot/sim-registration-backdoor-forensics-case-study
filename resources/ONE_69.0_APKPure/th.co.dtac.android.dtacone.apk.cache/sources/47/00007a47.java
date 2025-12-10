package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class SimpleRuleStore extends ContextAwareBase implements RuleStore {

    /* renamed from: d */
    public static String f39825d = "*";

    /* renamed from: c */
    public HashMap f39826c = new HashMap();

    public SimpleRuleStore(Context context) {
        setContext(context);
    }

    @Override // ch.qos.logback.core.joran.spi.RuleStore
    public void addRule(ElementSelector elementSelector, Action action) {
        action.setContext(this.context);
        List list = (List) this.f39826c.get(elementSelector);
        if (list == null) {
            list = new ArrayList();
            this.f39826c.put(elementSelector, list);
        }
        list.add(action);
    }

    /* renamed from: b */
    public List m51488b(ElementPath elementPath) {
        for (ElementSelector elementSelector : this.f39826c.keySet()) {
            if (elementSelector.fullPathMatch(elementPath)) {
                return (List) this.f39826c.get(elementSelector);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m51487d(String str) {
        return f39825d.equals(str);
    }

    /* renamed from: g */
    public final boolean m51486g(ElementSelector elementSelector) {
        return elementSelector.size() > 1 && elementSelector.get(0).equals(f39825d);
    }

    /* renamed from: i */
    public List m51485i(ElementPath elementPath) {
        ElementSelector elementSelector = null;
        int i = 0;
        for (ElementSelector elementSelector2 : this.f39826c.keySet()) {
            String peekLast = elementSelector2.peekLast();
            String str = elementSelector2.size() > 1 ? elementSelector2.get(0) : null;
            if (m51487d(peekLast) && m51487d(str)) {
                List<String> copyOfPartList = elementSelector2.getCopyOfPartList();
                if (copyOfPartList.size() > 2) {
                    copyOfPartList.remove(0);
                    copyOfPartList.remove(copyOfPartList.size() - 1);
                }
                ElementSelector elementSelector3 = new ElementSelector(copyOfPartList);
                int size = elementSelector3.isContainedIn(elementPath) ? elementSelector3.size() : 0;
                if (size > i) {
                    elementSelector = elementSelector2;
                    i = size;
                }
            }
        }
        if (elementSelector != null) {
            return (List) this.f39826c.get(elementSelector);
        }
        return null;
    }

    /* renamed from: j */
    public List m51484j(ElementPath elementPath) {
        int prefixMatchLength;
        int i = 0;
        ElementSelector elementSelector = null;
        for (ElementSelector elementSelector2 : this.f39826c.keySet()) {
            if (m51487d(elementSelector2.peekLast()) && (prefixMatchLength = elementSelector2.getPrefixMatchLength(elementPath)) == elementSelector2.size() - 1 && prefixMatchLength > i) {
                elementSelector = elementSelector2;
                i = prefixMatchLength;
            }
        }
        if (elementSelector != null) {
            return (List) this.f39826c.get(elementSelector);
        }
        return null;
    }

    /* renamed from: k */
    public List m51483k(ElementPath elementPath) {
        int tailMatchLength;
        int i = 0;
        ElementSelector elementSelector = null;
        for (ElementSelector elementSelector2 : this.f39826c.keySet()) {
            if (m51486g(elementSelector2) && (tailMatchLength = elementSelector2.getTailMatchLength(elementPath)) > i) {
                elementSelector = elementSelector2;
                i = tailMatchLength;
            }
        }
        if (elementSelector != null) {
            return (List) this.f39826c.get(elementSelector);
        }
        return null;
    }

    @Override // ch.qos.logback.core.joran.spi.RuleStore
    public List<Action> matchActions(ElementPath elementPath) {
        List<Action> m51488b = m51488b(elementPath);
        if (m51488b != null) {
            return m51488b;
        }
        List<Action> m51483k = m51483k(elementPath);
        if (m51483k != null) {
            return m51483k;
        }
        List<Action> m51484j = m51484j(elementPath);
        if (m51484j != null) {
            return m51484j;
        }
        List<Action> m51485i = m51485i(elementPath);
        if (m51485i != null) {
            return m51485i;
        }
        return null;
    }

    public String toString() {
        return "SimpleRuleStore ( rules = " + this.f39826c + "   )";
    }

    @Override // ch.qos.logback.core.joran.spi.RuleStore
    public void addRule(ElementSelector elementSelector, String str) {
        Action action;
        try {
            action = (Action) OptionHelper.instantiateByClassName(str, Action.class, this.context);
        } catch (Exception e) {
            addError("Could not instantiate class [" + str + "]", e);
            action = null;
        }
        if (action != null) {
            addRule(elementSelector, action);
        }
    }
}