package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.JoranException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AbstractAppenderFactoryUsingJoran<E> implements AppenderFactory<E> {

    /* renamed from: a */
    public final List f40093a;
    protected String key;
    protected Map<String, String> parentPropertyMap;

    public AbstractAppenderFactoryUsingJoran(List<SaxEvent> list, String str, Map<String, String> map) {
        this.f40093a = m51373a(list);
        this.key = str;
        this.parentPropertyMap = map;
    }

    /* renamed from: a */
    public List m51373a(List list) {
        return list.subList(1, list.size() - 1);
    }

    @Override // ch.qos.logback.core.sift.AppenderFactory
    public Appender<E> buildAppender(Context context, String str) throws JoranException {
        SiftingJoranConfiguratorBase<E> siftingJoranConfigurator = getSiftingJoranConfigurator(str);
        siftingJoranConfigurator.setContext(context);
        siftingJoranConfigurator.doConfigure(this.f40093a);
        return siftingJoranConfigurator.getAppender();
    }

    public List<SaxEvent> getEventList() {
        return this.f40093a;
    }

    public abstract SiftingJoranConfiguratorBase<E> getSiftingJoranConfigurator(String str);
}
