package com.netcetera.threeds.sdk.infrastructure;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pf */
/* loaded from: classes5.dex */
public class C9690pf {
    public static final C9690pf ThreeDS2Service;
    public static final C9690pf ThreeDS2ServiceInstance;
    public static final C9690pf valueOf;
    private final Set<String> get;
    private final values values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.pf$3 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C96913 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[values.values().length];
            valueOf = iArr;
            try {
                iArr[values.WHITELIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[values.BLACKLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.pf$values */
    /* loaded from: classes5.dex */
    public enum values {
        WHITELIST,
        BLACKLIST
    }

    static {
        values valuesVar = values.BLACKLIST;
        valueOf = new C9690pf(valuesVar, new String[0]);
        ThreeDS2Service = new C9690pf(valuesVar, SchedulerSupport.NONE);
        ThreeDS2ServiceInstance = new C9690pf(values.WHITELIST, SchedulerSupport.NONE);
    }

    public C9690pf(values valuesVar, String... strArr) {
        if (valuesVar != null) {
            this.values = valuesVar;
            this.get = new HashSet(Arrays.asList(strArr));
            return;
        }
        throw new NullPointerException("ConstraintType cannot be null");
    }

    public void get(String str) throws C9731rp {
        int i = C96913.valueOf[this.values.ordinal()];
        if (i != 1) {
            if (i == 2 && this.get.contains(str)) {
                throw new C9731rp(OperatorName.SHOW_TEXT_LINE + str + "' is a blacklisted algorithm.");
            }
        } else if (this.get.contains(str)) {
        } else {
            throw new C9731rp(OperatorName.SHOW_TEXT_LINE + str + "' is not a whitelisted algorithm.");
        }
    }
}
