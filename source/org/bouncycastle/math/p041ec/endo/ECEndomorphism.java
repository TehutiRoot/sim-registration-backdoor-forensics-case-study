package org.bouncycastle.math.p041ec.endo;

import org.bouncycastle.math.p041ec.ECPointMap;

/* renamed from: org.bouncycastle.math.ec.endo.ECEndomorphism */
/* loaded from: classes6.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
