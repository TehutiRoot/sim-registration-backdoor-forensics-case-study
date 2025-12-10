package com.netcetera.threeds.sdk.infrastructure;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pf */
/* loaded from: classes5.dex */
public class C9679pf {
    public static final C9679pf ThreeDS2Service;
    public static final C9679pf ThreeDS2ServiceInstance;
    public static final C9679pf valueOf;
    private final Set<String> get;
    private final values values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.pf$3 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C96803 {
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
        valueOf = new C9679pf(valuesVar, new String[0]);
        ThreeDS2Service = new C9679pf(valuesVar, SchedulerSupport.NONE);
        ThreeDS2ServiceInstance = new C9679pf(values.WHITELIST, SchedulerSupport.NONE);
    }

    public C9679pf(values valuesVar, String... strArr) {
        if (valuesVar != null) {
            this.values = valuesVar;
            this.get = new HashSet(Arrays.asList(strArr));
            return;
        }
        throw new NullPointerException("ConstraintType cannot be null");
    }

    public void get(String str) throws C9720rp {
        int i = C96803.valueOf[this.values.ordinal()];
        if (i != 1) {
            if (i == 2 && this.get.contains(str)) {
                throw new C9720rp(OperatorName.SHOW_TEXT_LINE + str + "' is a blacklisted algorithm.");
            }
        } else if (this.get.contains(str)) {
        } else {
            throw new C9720rp(OperatorName.SHOW_TEXT_LINE + str + "' is not a whitelisted algorithm.");
        }
    }
}