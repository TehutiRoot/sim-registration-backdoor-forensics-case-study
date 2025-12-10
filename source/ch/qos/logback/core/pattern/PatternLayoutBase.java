package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.StatusManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class PatternLayoutBase<E> extends LayoutBase<E> {

    /* renamed from: g */
    public Converter f39977g;

    /* renamed from: h */
    public String f39978h;

    /* renamed from: i */
    public Map f39979i = new HashMap();
    protected boolean outputPatternAsHeader = false;
    protected PostCompileProcessor<E> postCompileProcessor;

    public abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        Map map;
        HashMap hashMap = new HashMap();
        Map<String, String> defaultConverterMap = getDefaultConverterMap();
        if (defaultConverterMap != null) {
            hashMap.putAll(defaultConverterMap);
        }
        Context context = getContext();
        if (context != null && (map = (Map) context.getObject(CoreConstants.PATTERN_RULE_REGISTRY)) != null) {
            hashMap.putAll(map);
        }
        hashMap.putAll(this.f39979i);
        return hashMap;
    }

    public Map<String, String> getInstanceConverterMap() {
        return this.f39979i;
    }

    public String getPattern() {
        return this.f39978h;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        if (this.outputPatternAsHeader) {
            return getPresentationHeaderPrefix() + this.f39978h;
        }
        return super.getPresentationHeader();
    }

    public String getPresentationHeaderPrefix() {
        return "";
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public void setContextForConverters(Converter<E> converter) {
        ConverterUtil.setContextForConverters(getContext(), converter);
    }

    public void setOutputPatternAsHeader(boolean z) {
        this.outputPatternAsHeader = z;
    }

    public void setPattern(String str) {
        this.f39978h = str;
    }

    public void setPostCompileProcessor(PostCompileProcessor<E> postCompileProcessor) {
        this.postCompileProcessor = postCompileProcessor;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str = this.f39978h;
        if (str == null || str.length() == 0) {
            addError("Empty or null pattern.");
            return;
        }
        try {
            Parser parser = new Parser(this.f39978h);
            if (getContext() != null) {
                parser.setContext(getContext());
            }
            Converter<E> compile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.f39977g = compile;
            PostCompileProcessor<E> postCompileProcessor = this.postCompileProcessor;
            if (postCompileProcessor != null) {
                postCompileProcessor.process(this.context, compile);
            }
            ConverterUtil.setContextForConverters(getContext(), this.f39977g);
            ConverterUtil.startConverters(this.f39977g);
            super.start();
        } catch (ScanException e) {
            StatusManager statusManager = getContext().getStatusManager();
            statusManager.add(new ErrorStatus("Failed to parse pattern \"" + getPattern() + "\".", this, e));
        }
    }

    public String toString() {
        return getClass().getName() + "(\"" + getPattern() + "\")";
    }

    public String writeLoopOnConverters(E e) {
        StringBuilder sb = new StringBuilder(256);
        for (Converter converter = this.f39977g; converter != null; converter = converter.getNext()) {
            converter.write(sb, e);
        }
        return sb.toString();
    }
}
