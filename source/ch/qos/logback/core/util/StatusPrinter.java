package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes.dex */
public class StatusPrinter {

    /* renamed from: a */
    public static PrintStream f40184a = System.out;

    /* renamed from: b */
    public static CachingDateFormatter f40185b = new CachingDateFormatter("HH:mm:ss,SSS");

    /* renamed from: a */
    public static void m51315a(StringBuilder sb, Throwable th2) {
        String[] convert;
        for (String str : ThrowableToStringArray.convert(th2)) {
            if (!str.startsWith(CoreConstants.CAUSED_BY)) {
                sb.append(Character.isDigit(str.charAt(0)) ? "\t... " : "\tat ");
            }
            sb.append(str);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    /* renamed from: b */
    public static void m51314b(StringBuilder sb, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            buildStr(sb, "", (Status) it.next());
        }
    }

    public static void buildStr(StringBuilder sb, String str, Status status) {
        StringBuilder sb2;
        String str2;
        if (status.hasChildren()) {
            sb2 = new StringBuilder();
            sb2.append(str);
            str2 = "+ ";
        } else {
            sb2 = new StringBuilder();
            sb2.append(str);
            str2 = "|-";
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        CachingDateFormatter cachingDateFormatter = f40185b;
        if (cachingDateFormatter != null) {
            sb.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        sb.append(sb3);
        sb.append(status);
        sb.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            m51315a(sb, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it = status.iterator();
            while (it.hasNext()) {
                buildStr(sb, str + "  ", it.next());
            }
        }
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void printIfErrorsOccured(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
                return;
            }
            return;
        }
        PrintStream printStream = f40184a;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void setPrintStream(PrintStream printStream) {
        f40184a = printStream;
    }

    public static void print(Context context, long j) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j);
            return;
        }
        PrintStream printStream = f40184a;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j) >= 1) {
                print(statusManager, j);
                return;
            }
            return;
        }
        PrintStream printStream = f40184a;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j) {
        StringBuilder sb = new StringBuilder();
        m51314b(sb, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j));
        f40184a.println(sb.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb = new StringBuilder();
        m51314b(sb, list);
        f40184a.println(sb.toString());
    }
}
