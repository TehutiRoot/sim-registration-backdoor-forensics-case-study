package org.apache.commons.p028io.file;

import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.file.DeleteOption;
import org.apache.commons.p028io.file.StandardDeleteOption;

/* renamed from: org.apache.commons.io.file.StandardDeleteOption */
/* loaded from: classes6.dex */
public enum StandardDeleteOption implements DeleteOption {
    OVERRIDE_READ_ONLY;

    /* renamed from: a */
    public static /* synthetic */ boolean m25262a(DeleteOption deleteOption) {
        return lambda$overrideReadOnly$0(deleteOption);
    }

    public static /* synthetic */ boolean lambda$overrideReadOnly$0(DeleteOption deleteOption) {
        if (OVERRIDE_READ_ONLY == deleteOption) {
            return true;
        }
        return false;
    }

    public static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        Stream of;
        boolean anyMatch;
        if (IOUtils.length(deleteOptionArr) != 0) {
            of = Stream.of((Object[]) deleteOptionArr);
            anyMatch = of.anyMatch(new Predicate() { // from class: HL1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return StandardDeleteOption.m25262a((DeleteOption) obj);
                }
            });
            return anyMatch;
        }
        return false;
    }
}
