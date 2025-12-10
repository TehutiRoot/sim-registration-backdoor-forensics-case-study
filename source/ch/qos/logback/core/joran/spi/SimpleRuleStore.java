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
    public static String f39827d = "*";

    /* renamed from: c */
    public HashMap f39828c = new HashMap();

    public SimpleRuleStore(Context context) {
        setContext(context);
    }

    @Override // ch.qos.logback.core.joran.spi.RuleStore
    public void addRule(ElementSelector elementSelector, Action action) {
        action.setContext(this.context);
        List list = (List) this.f39828c.get(elementSelector);
        if (list == null) {
            list = new ArrayList();
            this.f39828c.put(elementSelector, list);
        }
        list.add(action);
    }

    /* renamed from: b */
    public List m51493b(ElementPath elementPath) {
        for (ElementSelector elementSelector : this.f39828c.keySet()) {
            if (elementSelector.fullPathMatch(elementPath)) {
                return (List) this.f39828c.get(elementSelector);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m51492d(String str) {
        return f39827d.equals(str);
    }

    /* renamed from: g */
    public final boolean m51491g(ElementSelector elementSelector) {
        return elementSelector.size() > 1 && elementSelector.get(0).equals(f39827d);
    }

    /* renamed from: i */
    public List m51490i(ElementPath elementPath) {
        ElementSelector elementSelector = null;
        int i = 0;
        for (ElementSelector elementSelector2 : this.f39828c.keySet()) {
            String peekLast = elementSelector2.peekLast();
            String str = elementSelector2.size() > 1 ? elementSelector2.get(0) : null;
            if (m51492d(peekLast) && m51492d(str)) {
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
            return (List) this.f39828c.get(elementSelector);
        }
        return null;
    }

    /* renamed from: j */
    public List m51489j(ElementPath elementPath) {
        int prefixMatchLength;
        int i = 0;
        ElementSelector elementSelector = null;
        for (ElementSelector elementSelector2 : this.f39828c.keySet()) {
            if (m51492d(elementSelector2.peekLast()) && (prefixMatchLength = elementSelector2.getPrefixMatchLength(elementPath)) == elementSelector2.size() - 1 && prefixMatchLength > i) {
                elementSelector = elementSelector2;
                i = prefixMatchLength;
            }
        }
        if (elementSelector != null) {
            return (List) this.f39828c.get(elementSelector);
        }
        return null;
    }

    /* renamed from: k */
    public List m51488k(ElementPath elementPath) {
        int tailMatchLength;
        int i = 0;
        ElementSelector elementSelector = null;
        for (ElementSelector elementSelector2 : this.f39828c.keySet()) {
            if (m51491g(elementSelector2) && (tailMatchLength = elementSelector2.getTailMatchLength(elementPath)) > i) {
                elementSelector = elementSelector2;
                i = tailMatchLength;
            }
        }
        if (elementSelector != null) {
            return (List) this.f39828c.get(elementSelector);
        }
        return null;
    }

    @Override // ch.qos.logback.core.joran.spi.RuleStore
    public List<Action> matchActions(ElementPath elementPath) {
        List<Action> m51493b = m51493b(elementPath);
        if (m51493b != null) {
            return m51493b;
        }
        List<Action> m51488k = m51488k(elementPath);
        if (m51488k != null) {
            return m51488k;
        }
        List<Action> m51489j = m51489j(elementPath);
        if (m51489j != null) {
            return m51489j;
        }
        List<Action> m51490i = m51490i(elementPath);
        if (m51490i != null) {
            return m51490i;
        }
        return null;
    }

    public String toString() {
        return "SimpleRuleStore ( rules = " + this.f39828c + "   )";
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
