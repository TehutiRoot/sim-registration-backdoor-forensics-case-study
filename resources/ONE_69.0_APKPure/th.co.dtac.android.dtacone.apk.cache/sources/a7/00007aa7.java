package ch.qos.logback.core.rolling;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.DefaultFileProvider;
import ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover;
import java.io.File;
import java.util.Date;

@NoAutoStart
/* loaded from: classes.dex */
public class DefaultTimeBasedFileNamingAndTriggeringPolicy<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {
    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            Date date = this.dateInCurrentPeriod;
            addInfo("Elapsed period: " + date);
            this.elapsedPeriodsFileName = this.tbrp.f40052g.convert(date);
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (super.isErrorFree()) {
            if (!this.tbrp.f40037c.hasIntegerTokenCOnverter()) {
                TimeBasedArchiveRemover timeBasedArchiveRemover = new TimeBasedArchiveRemover(this.tbrp.f40037c, this.f40051rc, new DefaultFileProvider());
                this.archiveRemover = timeBasedArchiveRemover;
                timeBasedArchiveRemover.setContext(this.context);
                this.started = true;
                return;
            }
            addError("Filename pattern [" + this.tbrp.f40037c + "] contains an integer token converter, i.e. %i, INCOMPATIBLE with this configuration. Remove it.");
        }
    }

    public String toString() {
        return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
    }
}