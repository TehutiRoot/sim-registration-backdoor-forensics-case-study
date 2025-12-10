package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";

    /* renamed from: e */
    public int f39608e = 0;

    /* renamed from: f */
    public int f39609f = 5;

    /* renamed from: g */
    public List f39610g = null;

    /* renamed from: h */
    public final int f39611h = 4;

    /* renamed from: i */
    public int f39612i = 0;

    /* renamed from: a */
    public final void m51602a(EventEvaluator eventEvaluator) {
        if (this.f39610g == null) {
            this.f39610g = new ArrayList();
        }
        this.f39610g.add(eventEvaluator);
    }

    /* renamed from: b */
    public final void m51601b() {
        StringBuilder sb;
        String str;
        int i;
        int i2 = this.f39608e;
        if (i2 < 0 || (i = this.f39609f) < 0) {
            sb = new StringBuilder();
            sb.append("Invalid depthStart/depthEnd range [");
            sb.append(this.f39608e);
            sb.append(", ");
            sb.append(this.f39609f);
            str = "] (negative values are not allowed)";
        } else if (i2 < i) {
            return;
        } else {
            sb = new StringBuilder();
            sb.append("Invalid depthEnd range [");
            sb.append(this.f39608e);
            sb.append(", ");
            sb.append(this.f39609f);
            str = "] (start greater or equal to end)";
        }
        sb.append(str);
        addError(sb.toString());
    }

    /* renamed from: c */
    public final boolean m51600c(String str) {
        return str.contains(getDefaultRangeDelimiter());
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        StringBuilder sb = new StringBuilder();
        if (this.f39610g != null) {
            for (int i = 0; i < this.f39610g.size(); i++) {
                EventEvaluator eventEvaluator = (EventEvaluator) this.f39610g.get(i);
                try {
                } catch (EvaluationException e) {
                    this.f39612i++;
                    if (this.f39612i < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e);
                    } else if (this.f39612i == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (!eventEvaluator.evaluate(iLoggingEvent)) {
                }
            }
            return "";
        }
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null) {
            int length = callerData.length;
            int i2 = this.f39608e;
            if (length > i2) {
                int i3 = this.f39609f;
                if (i3 >= callerData.length) {
                    i3 = callerData.length;
                }
                while (i2 < i3) {
                    sb.append(getCallerLinePrefix());
                    sb.append(i2);
                    sb.append("\t at ");
                    sb.append(callerData[i2]);
                    sb.append(CoreConstants.LINE_SEPARATOR);
                    i2++;
                }
                return sb.toString();
            }
        }
        return CallerData.CALLER_DATA_NA;
    }

    /* renamed from: d */
    public final String[] m51599d(String str) {
        return str.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    public String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    public String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        EventEvaluator eventEvaluator;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            return;
        }
        try {
            if (m51600c(firstOption)) {
                String[] m51599d = m51599d(firstOption);
                if (m51599d.length == 2) {
                    this.f39608e = Integer.parseInt(m51599d[0]);
                    this.f39609f = Integer.parseInt(m51599d[1]);
                    m51601b();
                } else {
                    addError("Failed to parse depth option as range [" + firstOption + "]");
                }
            } else {
                this.f39609f = Integer.parseInt(firstOption);
            }
        } catch (NumberFormatException e) {
            addError("Failed to parse depth option [" + firstOption + "]", e);
        }
        List<String> optionList = getOptionList();
        if (optionList == null || optionList.size() <= 1) {
            return;
        }
        int size = optionList.size();
        for (int i = 1; i < size; i++) {
            String str = optionList.get(i);
            Context context = getContext();
            if (context != null && (eventEvaluator = (EventEvaluator) ((Map) context.getObject(CoreConstants.EVALUATOR_MAP)).get(str)) != null) {
                m51602a(eventEvaluator);
            }
        }
    }
}
