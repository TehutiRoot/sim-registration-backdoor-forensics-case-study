package ch.qos.logback.core.filter;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.FilterReply;

/* loaded from: classes.dex */
public class EvaluatorFilter<E> extends AbstractMatcherFilter<E> {

    /* renamed from: e */
    public EventEvaluator f39744e;

    @Override // ch.qos.logback.core.filter.Filter
    public FilterReply decide(E e) {
        if (isStarted() && this.f39744e.isStarted()) {
            try {
                return this.f39744e.evaluate(e) ? this.onMatch : this.onMismatch;
            } catch (EvaluationException e2) {
                addError("Evaluator " + this.f39744e.getName() + " threw an exception", e2);
                return FilterReply.NEUTRAL;
            }
        }
        return FilterReply.NEUTRAL;
    }

    public EventEvaluator<E> getEvaluator() {
        return this.f39744e;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.f39744e = eventEvaluator;
    }

    @Override // ch.qos.logback.core.filter.Filter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.f39744e != null) {
            super.start();
            return;
        }
        addError("No evaluator set for filter " + getName());
    }
}