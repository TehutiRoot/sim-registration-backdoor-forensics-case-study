package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Properties;

/* loaded from: classes.dex */
public class ActionUtil {

    /* loaded from: classes.dex */
    public enum Scope {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    /* renamed from: ch.qos.logback.core.joran.action.ActionUtil$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5456a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39760a;

        static {
            int[] iArr = new int[Scope.values().length];
            f39760a = iArr;
            try {
                iArr[Scope.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39760a[Scope.CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39760a[Scope.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void setProperties(InterpretationContext interpretationContext, Properties properties, Scope scope) {
        int i = C5456a.f39760a[scope.ordinal()];
        if (i == 1) {
            interpretationContext.addSubstitutionProperties(properties);
        } else if (i == 2) {
            new ContextUtil(interpretationContext.getContext()).addProperties(properties);
        } else if (i != 3) {
        } else {
            OptionHelper.setSystemProperties(interpretationContext, properties);
        }
    }

    public static void setProperty(InterpretationContext interpretationContext, String str, String str2, Scope scope) {
        int i = C5456a.f39760a[scope.ordinal()];
        if (i == 1) {
            interpretationContext.addSubstitutionProperty(str, str2);
        } else if (i == 2) {
            interpretationContext.getContext().putProperty(str, str2);
        } else if (i != 3) {
        } else {
            OptionHelper.setSystemProperty(interpretationContext, str, str2);
        }
    }

    public static Scope stringToScope(String str) {
        Scope scope = Scope.SYSTEM;
        if (scope.toString().equalsIgnoreCase(str)) {
            return scope;
        }
        Scope scope2 = Scope.CONTEXT;
        return scope2.toString().equalsIgnoreCase(str) ? scope2 : Scope.LOCAL;
    }
}